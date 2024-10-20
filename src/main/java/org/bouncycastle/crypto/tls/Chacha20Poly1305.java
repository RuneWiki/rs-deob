package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.engines.ChaCha7539Engine;
import org.bouncycastle.crypto.macs.Poly1305;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class Chacha20Poly1305 implements TlsCipher {

    public TlsContext context;

    public ChaCha7539Engine encryptCipher;

    public ChaCha7539Engine decryptCipher;

    public byte[] encryptIV;

    public byte[] decryptIV;

    public static final byte[] ZEROES = new byte[15];

    public KeyParameter generateRecordMACKey(StreamCipher arg0) {
        byte[] var2 = new byte[64];
        arg0.processBytes(var2, 0, var2.length, var2, 0);
        KeyParameter var3 = new KeyParameter(var2, 0, 32);
        Arrays.fill((byte[]) var2, (byte) 0);
        return var3;
    }

    public void updateRecordMACLength(Mac arg0, int arg1) {
        byte[] var3 = Pack.longToLittleEndian((long) arg1 & 0xFFFFFFFFL);
        arg0.update(var3, 0, var3.length);
    }

    public byte[] getAdditionalData(long arg0, short arg1, int arg2) throws IOException {
        byte[] var5 = new byte[13];
        TlsUtils.writeUint64(arg0, var5, 0);
        TlsUtils.writeUint8((short) arg1, var5, 8);
        TlsUtils.writeVersion(this.context.getServerVersion(), var5, 9);
        TlsUtils.writeUint16(arg2, var5, 11);
        return var5;
    }

    public Chacha20Poly1305(TlsContext arg0) throws IOException {
        if (!TlsUtils.isTLSv12(arg0)) {
            throw new TlsFatalAlert((short) 80);
        }
        this.context = arg0;
        byte var2 = 32;
        byte var3 = 12;
        int var4 = var2 * 2 + var3 * 2;
        byte[] var5 = TlsUtils.calculateKeyBlock(arg0, var4);
        byte var6 = 0;
        KeyParameter var7 = new KeyParameter(var5, var6, var2);
        int var8 = var2 + var6;
        KeyParameter var9 = new KeyParameter(var5, var8, var2);
        int var10 = var2 + var8;
        byte[] var11 = Arrays.copyOfRange(var5, var10, var3 + var10);
        int var12 = var3 + var10;
        byte[] var13 = Arrays.copyOfRange(var5, var12, var3 + var12);
        int var14 = var3 + var12;
        if (var4 != var14) {
            throw new TlsFatalAlert((short) 80);
        }
        this.encryptCipher = new ChaCha7539Engine();
        this.decryptCipher = new ChaCha7539Engine();
        KeyParameter var15;
        KeyParameter var16;
        if (arg0.isServer()) {
            var15 = var9;
            var16 = var7;
            this.encryptIV = var13;
            this.decryptIV = var11;
        } else {
            var15 = var7;
            var16 = var9;
            this.encryptIV = var11;
            this.decryptIV = var13;
        }
        this.encryptCipher.init(true, new ParametersWithIV(var15, this.encryptIV));
        this.decryptCipher.init(false, new ParametersWithIV(var16, this.decryptIV));
    }

    public KeyParameter initRecord(StreamCipher arg0, boolean arg1, long arg2, byte[] arg3) {
        byte[] var6 = this.calculateNonce(arg2, arg3);
        arg0.init(arg1, new ParametersWithIV((CipherParameters) null, var6));
        return this.generateRecordMACKey(arg0);
    }

    public byte[] calculateNonce(long arg0, byte[] arg1) {
        byte[] var4 = new byte[12];
        TlsUtils.writeUint64(arg0, var4, 4);
        for (int var5 = 0; var5 < 12; var5++) {
            var4[var5] ^= arg1[var5];
        }
        return var4;
    }

    public int getPlaintextLimit(int arg0) {
        return arg0 - 16;
    }

    public byte[] calculateRecordMAC(KeyParameter arg0, byte[] arg1, byte[] arg2, int arg3, int arg4) {
        Poly1305 var6 = new Poly1305();
        var6.init(arg0);
        this.updateRecordMACText(var6, arg1, 0, arg1.length);
        this.updateRecordMACText(var6, arg2, arg3, arg4);
        this.updateRecordMACLength(var6, arg1.length);
        this.updateRecordMACLength(var6, arg4);
        byte[] var7 = new byte[var6.getMacSize()];
        var6.doFinal(var7, 0);
        return var7;
    }

    public byte[] decodeCiphertext(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        if (this.getPlaintextLimit(arg4) < 0) {
            throw new TlsFatalAlert((short) 50);
        }
        KeyParameter var7 = this.initRecord(this.decryptCipher, false, arg0, this.decryptIV);
        int var8 = arg4 - 16;
        byte[] var9 = this.getAdditionalData(arg0, arg1, var8);
        byte[] var10 = this.calculateRecordMAC(var7, var9, arg2, arg3, var8);
        byte[] var11 = Arrays.copyOfRange(arg2, arg3 + var8, arg3 + arg4);
        if (!Arrays.constantTimeAreEqual(var10, var11)) {
            throw new TlsFatalAlert((short) 20);
        }
        byte[] var12 = new byte[var8];
        this.decryptCipher.processBytes(arg2, arg3, var8, var12, 0);
        return var12;
    }

    public void updateRecordMACText(Mac arg0, byte[] arg1, int arg2, int arg3) {
        arg0.update(arg1, arg2, arg3);
        int var5 = arg3 % 16;
        if (var5 != 0) {
            arg0.update(ZEROES, 0, 16 - var5);
        }
    }

    public byte[] encodePlaintext(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        KeyParameter var7 = this.initRecord(this.encryptCipher, true, arg0, this.encryptIV);
        byte[] var8 = new byte[arg4 + 16];
        this.encryptCipher.processBytes(arg2, arg3, arg4, var8, 0);
        byte[] var9 = this.getAdditionalData(arg0, arg1, arg4);
        byte[] var10 = this.calculateRecordMAC(var7, var9, var8, 0, arg4);
        System.arraycopy(var10, 0, var8, arg4, var10.length);
        return var8;
    }
}
