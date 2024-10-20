package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public class SHA512Digest extends LongDigest {

    public static final int DIGEST_LENGTH = 64;

    public void reset(Memoable arg0) {
        SHA512Digest var2 = (SHA512Digest) arg0;
        this.copyIn(var2);
    }

    public int doFinal(byte[] arg0, int arg1) {
        this.finish();
        Pack.longToBigEndian(this.H1, arg0, arg1);
        Pack.longToBigEndian(this.H2, arg0, arg1 + 8);
        Pack.longToBigEndian(this.H3, arg0, arg1 + 16);
        Pack.longToBigEndian(this.H4, arg0, arg1 + 24);
        Pack.longToBigEndian(this.H5, arg0, arg1 + 32);
        Pack.longToBigEndian(this.H6, arg0, arg1 + 40);
        Pack.longToBigEndian(this.H7, arg0, arg1 + 48);
        Pack.longToBigEndian(this.H8, arg0, arg1 + 56);
        this.reset();
        return 64;
    }

    public Memoable copy() {
        return new SHA512Digest(this);
    }

    public String getAlgorithmName() {
        return "SHA-512";
    }

    public SHA512Digest(SHA512Digest arg0) {
        super(arg0);
    }

    public SHA512Digest(byte[] arg0) {
        this.restoreState(arg0);
    }

    public void reset() {
        super.reset();
        this.H1 = 7640891576956012808L;
        this.H2 = -4942790177534073029L;
        this.H3 = 4354685564936845355L;
        this.H4 = -6534734903238641935L;
        this.H5 = 5840696475078001361L;
        this.H6 = -7276294671716946913L;
        this.H7 = 2270897969802886507L;
        this.H8 = 6620516959819538809L;
    }

    public SHA512Digest() {
    }

    public int getDigestSize() {
        return 64;
    }

    public byte[] getEncodedState() {
        byte[] var1 = new byte[this.getEncodedStateSize()];
        super.populateState(var1);
        return var1;
    }
}
