package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;

public class TlsNullCipher implements TlsCipher {

    public TlsContext context;

    public TlsMac writeMac;

    public TlsMac readMac;

    public int getPlaintextLimit(int arg0) {
        int var2 = arg0;
        if (this.writeMac != null) {
            var2 = arg0 - this.writeMac.getSize();
        }
        return var2;
    }

    public byte[] encodePlaintext(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        if (this.writeMac == null) {
            return Arrays.copyOfRange(arg2, arg3, arg3 + arg4);
        }
        byte[] var7 = this.writeMac.calculateMac(arg0, arg1, arg2, arg3, arg4);
        byte[] var8 = new byte[var7.length + arg4];
        System.arraycopy(arg2, arg3, var8, 0, arg4);
        System.arraycopy(var7, 0, var8, arg4, var7.length);
        return var8;
    }

    public TlsNullCipher(TlsContext arg0, Digest arg1, Digest arg2) throws IOException {
        if (arg1 == null != (arg2 == null)) {
            throw new TlsFatalAlert((short) 80);
        }
        this.context = arg0;
        TlsMac var4 = null;
        TlsMac var5 = null;
        if (arg1 != null) {
            int var6 = arg1.getDigestSize() + arg2.getDigestSize();
            byte[] var7 = TlsUtils.calculateKeyBlock(arg0, var6);
            byte var8 = 0;
            var4 = new TlsMac(arg0, arg1, var7, var8, arg1.getDigestSize());
            int var9 = var8 + arg1.getDigestSize();
            var5 = new TlsMac(arg0, arg2, var7, var9, arg2.getDigestSize());
            int var10 = var9 + arg2.getDigestSize();
            if (var6 != var10) {
                throw new TlsFatalAlert((short) 80);
            }
        }
        if (arg0.isServer()) {
            this.writeMac = var5;
            this.readMac = var4;
        } else {
            this.writeMac = var4;
            this.readMac = var5;
        }
    }

    public TlsNullCipher(TlsContext arg0) {
        this.context = arg0;
        this.writeMac = null;
        this.readMac = null;
    }

    public byte[] decodeCiphertext(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        if (this.readMac == null) {
            return Arrays.copyOfRange(arg2, arg3, arg3 + arg4);
        }
        int var7 = this.readMac.getSize();
        if (arg4 < var7) {
            throw new TlsFatalAlert((short) 50);
        }
        int var8 = arg4 - var7;
        byte[] var9 = Arrays.copyOfRange(arg2, arg3 + var8, arg3 + arg4);
        byte[] var10 = this.readMac.calculateMac(arg0, arg1, arg2, arg3, var8);
        if (!Arrays.constantTimeAreEqual(var9, var10)) {
            throw new TlsFatalAlert((short) 20);
        }
        return Arrays.copyOfRange(arg2, arg3, arg3 + var8);
    }
}
