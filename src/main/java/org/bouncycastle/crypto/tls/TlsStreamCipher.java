package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

public class TlsStreamCipher implements TlsCipher {

    public TlsContext context;

    public boolean usesNonce;

    public StreamCipher encryptCipher;

    public StreamCipher decryptCipher;

    public TlsMac writeMac;

    public TlsMac readMac;

    public void updateIV(StreamCipher arg0, boolean arg1, long arg2) {
        byte[] var5 = new byte[8];
        TlsUtils.writeUint64(arg2, var5, 0);
        arg0.init(arg1, new ParametersWithIV((CipherParameters) null, var5));
    }

    public byte[] encodePlaintext(long arg0, short arg1, byte[] arg2, int arg3, int arg4) {
        if (this.usesNonce) {
            this.updateIV(this.encryptCipher, true, arg0);
        }
        byte[] var7 = new byte[arg4 + this.writeMac.getSize()];
        this.encryptCipher.processBytes(arg2, arg3, arg4, var7, 0);
        byte[] var8 = this.writeMac.calculateMac(arg0, arg1, arg2, arg3, arg4);
        this.encryptCipher.processBytes(var8, 0, var8.length, var7, arg4);
        return var7;
    }

    public TlsStreamCipher(TlsContext arg0, StreamCipher arg1, StreamCipher arg2, Digest arg3, Digest arg4, int arg5, boolean arg6) throws IOException {
        boolean var8 = arg0.isServer();
        this.context = arg0;
        this.usesNonce = arg6;
        this.encryptCipher = arg1;
        this.decryptCipher = arg2;
        int var9 = arg5 * 2 + arg3.getDigestSize() + arg4.getDigestSize();
        byte[] var10 = TlsUtils.calculateKeyBlock(arg0, var9);
        byte var11 = 0;
        TlsMac var12 = new TlsMac(arg0, arg3, var10, var11, arg3.getDigestSize());
        int var13 = var11 + arg3.getDigestSize();
        TlsMac var14 = new TlsMac(arg0, arg4, var10, var13, arg4.getDigestSize());
        int var15 = var13 + arg4.getDigestSize();
        KeyParameter var16 = new KeyParameter(var10, var15, arg5);
        int var17 = arg5 + var15;
        KeyParameter var18 = new KeyParameter(var10, var17, arg5);
        int var19 = arg5 + var17;
        if (var9 != var19) {
            throw new TlsFatalAlert((short) 80);
        }
        Object var20;
        Object var21;
        if (var8) {
            this.writeMac = var14;
            this.readMac = var12;
            this.encryptCipher = arg2;
            this.decryptCipher = arg1;
            var20 = var18;
            var21 = var16;
        } else {
            this.writeMac = var12;
            this.readMac = var14;
            this.encryptCipher = arg1;
            this.decryptCipher = arg2;
            var20 = var16;
            var21 = var18;
        }
        if (arg6) {
            byte[] var22 = new byte[8];
            var20 = new ParametersWithIV((CipherParameters) var20, var22);
            var21 = new ParametersWithIV((CipherParameters) var21, var22);
        }
        this.encryptCipher.init(true, (CipherParameters) var20);
        this.decryptCipher.init(false, (CipherParameters) var21);
    }

    public byte[] decodeCiphertext(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        if (this.usesNonce) {
            this.updateIV(this.decryptCipher, false, arg0);
        }
        int var7 = this.readMac.getSize();
        if (arg4 < var7) {
            throw new TlsFatalAlert((short) 50);
        }
        int var8 = arg4 - var7;
        byte[] var9 = new byte[arg4];
        this.decryptCipher.processBytes(arg2, arg3, arg4, var9, 0);
        this.checkMAC(arg0, arg1, var9, var8, arg4, var9, 0, var8);
        return Arrays.copyOfRange((byte[]) var9, 0, var8);
    }

    public void checkMAC(long arg0, short arg1, byte[] arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7) throws IOException {
        byte[] var10 = Arrays.copyOfRange(arg2, arg3, arg4);
        byte[] var11 = this.readMac.calculateMac(arg0, arg1, arg5, arg6, arg7);
        if (!Arrays.constantTimeAreEqual(var10, var11)) {
            throw new TlsFatalAlert((short) 20);
        }
    }

    public int getPlaintextLimit(int arg0) {
        return arg0 - this.writeMac.getSize();
    }
}
