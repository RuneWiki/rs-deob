package org.bouncycastle.crypto.macs;

import java.util.Hashtable;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Memoable;

public class HMac implements Mac {

    public Digest digest;

    public int digestSize;

    public int blockLength;

    public byte[] inputPad;

    public byte[] outputBuf;

    public static Hashtable blockLengths = new Hashtable();

    public static final byte IPAD = 54;

    public static final byte OPAD = 92;

    public Memoable ipadState;

    public Memoable opadState;

    public void init(CipherParameters arg0) {
        this.digest.reset();
        byte[] var2 = ((KeyParameter) arg0).getKey();
        int var3 = var2.length;
        if (var3 > this.blockLength) {
            this.digest.update(var2, 0, var3);
            this.digest.doFinal(this.inputPad, 0);
            var3 = this.digestSize;
        } else {
            System.arraycopy(var2, 0, this.inputPad, 0, var3);
        }
        for (int var4 = var3; var4 < this.inputPad.length; var4++) {
            this.inputPad[var4] = 0;
        }
        System.arraycopy(this.inputPad, 0, this.outputBuf, 0, this.blockLength);
        xorPad(this.inputPad, this.blockLength, (byte) 54);
        xorPad(this.outputBuf, this.blockLength, (byte) 92);
        if (this.digest instanceof Memoable) {
            this.opadState = ((Memoable) this.digest).copy();
            ((Digest) this.opadState).update(this.outputBuf, 0, this.blockLength);
        }
        this.digest.update(this.inputPad, 0, this.inputPad.length);
        if (this.digest instanceof Memoable) {
            this.ipadState = ((Memoable) this.digest).copy();
        }
    }

    public HMac(Digest arg0) {
        this(arg0, getByteLength(arg0));
    }

    public HMac(Digest arg0, int arg1) {
        this.digest = arg0;
        this.digestSize = arg0.getDigestSize();
        this.blockLength = arg1;
        this.inputPad = new byte[this.blockLength];
        this.outputBuf = new byte[this.digestSize + this.blockLength];
    }

    public String getAlgorithmName() {
        return this.digest.getAlgorithmName() + "/HMAC";
    }

    public Digest getUnderlyingDigest() {
        return this.digest;
    }

    public static void xorPad(byte[] arg0, int arg1, byte arg2) {
        for (int var3 = 0; var3 < arg1; var3++) {
            arg0[var3] ^= arg2;
        }
    }

    public int getMacSize() {
        return this.digestSize;
    }

    public void update(byte arg0) {
        this.digest.update(arg0);
    }

    public static int getByteLength(Digest arg0) {
        if (arg0 instanceof ExtendedDigest) {
            return ((ExtendedDigest) arg0).getByteLength();
        }
        Integer var1 = (Integer) blockLengths.get(arg0.getAlgorithmName());
        if (var1 == null) {
            throw new IllegalArgumentException("unknown digest passed: " + arg0.getAlgorithmName());
        }
        return var1;
    }

    public void update(byte[] arg0, int arg1, int arg2) {
        this.digest.update(arg0, arg1, arg2);
    }

    public int doFinal(byte[] arg0, int arg1) {
        this.digest.doFinal(this.outputBuf, this.blockLength);
        if (this.opadState == null) {
            this.digest.update(this.outputBuf, 0, this.outputBuf.length);
        } else {
            ((Memoable) this.digest).reset(this.opadState);
            this.digest.update(this.outputBuf, this.blockLength, this.digest.getDigestSize());
        }
        int var3 = this.digest.doFinal(arg0, arg1);
        for (int var4 = this.blockLength; var4 < this.outputBuf.length; var4++) {
            this.outputBuf[var4] = 0;
        }
        if (this.ipadState == null) {
            this.digest.update(this.inputPad, 0, this.inputPad.length);
        } else {
            ((Memoable) this.digest).reset(this.ipadState);
        }
        return var3;
    }

    public void reset() {
        this.digest.reset();
        this.digest.update(this.inputPad, 0, this.inputPad.length);
    }

    static {
        blockLengths.put("GOST3411", Integers.valueOf(32));
        blockLengths.put("MD2", Integers.valueOf(16));
        blockLengths.put("MD4", Integers.valueOf(64));
        blockLengths.put("MD5", Integers.valueOf(64));
        blockLengths.put("RIPEMD128", Integers.valueOf(64));
        blockLengths.put("RIPEMD160", Integers.valueOf(64));
        blockLengths.put("SHA-1", Integers.valueOf(64));
        blockLengths.put("SHA-224", Integers.valueOf(64));
        blockLengths.put("SHA-256", Integers.valueOf(64));
        blockLengths.put("SHA-384", Integers.valueOf(128));
        blockLengths.put("SHA-512", Integers.valueOf(128));
        blockLengths.put("Tiger", Integers.valueOf(64));
        blockLengths.put("Whirlpool", Integers.valueOf(64));
    }
}
