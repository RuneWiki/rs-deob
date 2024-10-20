package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

public class TlsAEADCipher implements TlsCipher {

    public int nonceMode;

    public int record_iv_length;

    public TlsContext context;

    public int macSize;

    public AEADBlockCipher encryptCipher;

    public AEADBlockCipher decryptCipher;

    public byte[] encryptImplicitNonce;

    public byte[] decryptImplicitNonce;

    public static final int NONCE_DRAFT_CHACHA20_POLY1305 = 2;

    public static final int NONCE_RFC5288 = 1;

    public byte[] decodeCiphertext(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        if (this.getPlaintextLimit(arg4) < 0) {
            throw new TlsFatalAlert((short) 50);
        }
        byte[] var7;
        var7 = new byte[this.decryptImplicitNonce.length + this.record_iv_length];
        label33: switch(this.nonceMode) {
            case 1:
                System.arraycopy(this.decryptImplicitNonce, 0, var7, 0, this.decryptImplicitNonce.length);
                System.arraycopy(arg2, arg3, var7, var7.length - this.record_iv_length, this.record_iv_length);
                break;
            case 2:
                TlsUtils.writeUint64(arg0, var7, var7.length - 8);
                int var8 = 0;
                while (true) {
                    if (var8 >= this.decryptImplicitNonce.length) {
                        break label33;
                    }
                    var7[var8] ^= this.decryptImplicitNonce[var8];
                    var8++;
                }
            default:
                throw new TlsFatalAlert((short) 80);
        }
        int var9 = this.record_iv_length + arg3;
        int var10 = arg4 - this.record_iv_length;
        int var11 = this.decryptCipher.getOutputSize(var10);
        byte[] var12 = new byte[var11];
        byte var13 = 0;
        byte[] var14 = this.getAdditionalData(arg0, arg1, var11);
        AEADParameters var15 = new AEADParameters((KeyParameter) null, this.macSize * 8, var7, var14);
        int var17;
        try {
            this.decryptCipher.init(false, var15);
            int var16 = var13 + this.decryptCipher.processBytes(arg2, var9, var10, var12, var13);
            var17 = var16 + this.decryptCipher.doFinal(var12, var16);
        } catch (Exception var19) {
            throw new TlsFatalAlert((short) 20, var19);
        }
        if (var12.length != var17) {
            throw new TlsFatalAlert((short) 80);
        }
        return var12;
    }

    public TlsAEADCipher(TlsContext arg0, AEADBlockCipher arg1, AEADBlockCipher arg2, int arg3, int arg4) throws IOException {
        this(arg0, arg1, arg2, arg3, arg4, 1);
    }

    public int getPlaintextLimit(int arg0) {
        return arg0 - this.macSize - this.record_iv_length;
    }

    public byte[] encodePlaintext(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        byte[] var7;
        var7 = new byte[this.encryptImplicitNonce.length + this.record_iv_length];
        label34: switch(this.nonceMode) {
            case 1:
                System.arraycopy(this.encryptImplicitNonce, 0, var7, 0, this.encryptImplicitNonce.length);
                TlsUtils.writeUint64(arg0, var7, this.encryptImplicitNonce.length);
                break;
            case 2:
                TlsUtils.writeUint64(arg0, var7, var7.length - 8);
                int var8 = 0;
                while (true) {
                    if (var8 >= this.encryptImplicitNonce.length) {
                        break label34;
                    }
                    var7[var8] ^= this.encryptImplicitNonce[var8];
                    var8++;
                }
            default:
                throw new TlsFatalAlert((short) 80);
        }
        int var9 = arg3;
        int var10 = arg4;
        int var11 = this.encryptCipher.getOutputSize(arg4);
        byte[] var12 = new byte[this.record_iv_length + var11];
        if (this.record_iv_length != 0) {
            System.arraycopy(var7, var7.length - this.record_iv_length, var12, 0, this.record_iv_length);
        }
        int var13 = this.record_iv_length;
        byte[] var14 = this.getAdditionalData(arg0, arg1, arg4);
        AEADParameters var15 = new AEADParameters((KeyParameter) null, this.macSize * 8, var7, var14);
        int var17;
        try {
            this.encryptCipher.init(true, var15);
            int var16 = var13 + this.encryptCipher.processBytes(arg2, var9, var10, var12, var13);
            var17 = var16 + this.encryptCipher.doFinal(var12, var16);
        } catch (Exception var19) {
            throw new TlsFatalAlert((short) 80, var19);
        }
        if (var12.length != var17) {
            throw new TlsFatalAlert((short) 80);
        }
        return var12;
    }

    public TlsAEADCipher(TlsContext arg0, AEADBlockCipher arg1, AEADBlockCipher arg2, int arg3, int arg4, int arg5) throws IOException {
        if (!TlsUtils.isTLSv12(arg0)) {
            throw new TlsFatalAlert((short) 80);
        }
        this.nonceMode = arg5;
        byte var7;
        switch(arg5) {
            case 1:
                var7 = 4;
                this.record_iv_length = 8;
                break;
            case 2:
                var7 = 12;
                this.record_iv_length = 0;
                break;
            default:
                throw new TlsFatalAlert((short) 80);
        }
        this.context = arg0;
        this.macSize = arg4;
        int var8 = arg3 * 2 + var7 * 2;
        byte[] var9 = TlsUtils.calculateKeyBlock(arg0, var8);
        byte var10 = 0;
        KeyParameter var11 = new KeyParameter(var9, var10, arg3);
        int var12 = arg3 + var10;
        KeyParameter var13 = new KeyParameter(var9, var12, arg3);
        int var14 = arg3 + var12;
        byte[] var15 = Arrays.copyOfRange(var9, var14, var7 + var14);
        int var16 = var7 + var14;
        byte[] var17 = Arrays.copyOfRange(var9, var16, var7 + var16);
        int var18 = var7 + var16;
        if (var8 != var18) {
            throw new TlsFatalAlert((short) 80);
        }
        KeyParameter var19;
        KeyParameter var20;
        if (arg0.isServer()) {
            this.encryptCipher = arg2;
            this.decryptCipher = arg1;
            this.encryptImplicitNonce = var17;
            this.decryptImplicitNonce = var15;
            var19 = var13;
            var20 = var11;
        } else {
            this.encryptCipher = arg1;
            this.decryptCipher = arg2;
            this.encryptImplicitNonce = var15;
            this.decryptImplicitNonce = var17;
            var19 = var11;
            var20 = var13;
        }
        byte[] var21 = new byte[this.record_iv_length + var7];
        this.encryptCipher.init(true, new AEADParameters(var19, arg4 * 8, var21));
        this.decryptCipher.init(false, new AEADParameters(var20, arg4 * 8, var21));
    }

    public byte[] getAdditionalData(long arg0, short arg1, int arg2) throws IOException {
        byte[] var5 = new byte[13];
        TlsUtils.writeUint64(arg0, var5, 0);
        TlsUtils.writeUint8((short) arg1, var5, 8);
        TlsUtils.writeVersion(this.context.getServerVersion(), var5, 9);
        TlsUtils.writeUint16(arg2, var5, 11);
        return var5;
    }
}
