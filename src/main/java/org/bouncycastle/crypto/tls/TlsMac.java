package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.digests.LongDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

public class TlsMac {

    public TlsContext context;

    public byte[] secret;

    public int digestBlockSize;

    public int digestOverhead;

    public Mac mac;

    public int macLength;

    public TlsMac(TlsContext arg0, Digest arg1, byte[] arg2, int arg3, int arg4) {
        this.context = arg0;
        KeyParameter var6 = new KeyParameter(arg2, arg3, arg4);
        this.secret = Arrays.clone(var6.getKey());
        if (arg1 instanceof LongDigest) {
            this.digestBlockSize = 128;
            this.digestOverhead = 16;
        } else {
            this.digestBlockSize = 64;
            this.digestOverhead = 8;
        }
        if (TlsUtils.isSSL(arg0)) {
            this.mac = new SSL3Mac(arg1);
            if (arg1.getDigestSize() == 20) {
                this.digestOverhead = 4;
            }
        } else {
            this.mac = new HMac(arg1);
        }
        this.mac.init(var6);
        this.macLength = this.mac.getMacSize();
        if (arg0.getSecurityParameters().truncatedHMac) {
            this.macLength = Math.min(this.macLength, 10);
        }
    }

    public byte[] getMACSecret() {
        return this.secret;
    }

    public int getSize() {
        return this.macLength;
    }

    public byte[] calculateMac(long arg0, short arg1, byte[] arg2, int arg3, int arg4) {
        ProtocolVersion var7 = this.context.getServerVersion();
        boolean var8 = var7.isSSL();
        byte[] var9 = new byte[var8 ? 11 : 13];
        TlsUtils.writeUint64(arg0, var9, 0);
        TlsUtils.writeUint8((short) arg1, var9, 8);
        if (!var8) {
            TlsUtils.writeVersion(var7, var9, 9);
        }
        TlsUtils.writeUint16(arg4, var9, var9.length - 2);
        this.mac.update(var9, 0, var9.length);
        this.mac.update(arg2, arg3, arg4);
        byte[] var10 = new byte[this.mac.getMacSize()];
        this.mac.doFinal(var10, 0);
        return this.truncate(var10);
    }

    public byte[] calculateMacConstantTime(long arg0, short arg1, byte[] arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        byte[] var9 = this.calculateMac(arg0, arg1, arg2, arg3, arg4);
        int var10 = TlsUtils.isSSL(this.context) ? 11 : 13;
        int var11 = this.getDigestBlockCount(arg5 + var10) - this.getDigestBlockCount(arg4 + var10);
        while (true) {
            var11--;
            if (var11 < 0) {
                this.mac.update(arg6[0]);
                this.mac.reset();
                return var9;
            }
            this.mac.update(arg6, 0, this.digestBlockSize);
        }
    }

    public int getDigestBlockCount(int arg0) {
        return (this.digestOverhead + arg0) / this.digestBlockSize;
    }

    public byte[] truncate(byte[] arg0) {
        return arg0.length <= this.macLength ? arg0 : Arrays.copyOf(arg0, this.macLength);
    }
}
