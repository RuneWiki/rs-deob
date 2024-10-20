package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public class SHA384Digest extends LongDigest {

    public static final int DIGEST_LENGTH = 48;

    public void reset() {
        super.reset();
        this.H1 = -3766243637369397544L;
        this.H2 = 7105036623409894663L;
        this.H3 = -7973340178411365097L;
        this.H4 = 1526699215303891257L;
        this.H5 = 7436329637833083697L;
        this.H6 = -8163818279084223215L;
        this.H7 = -2662702644619276377L;
        this.H8 = 5167115440072839076L;
    }

    public SHA384Digest() {
    }

    public SHA384Digest(byte[] arg0) {
        this.restoreState(arg0);
    }

    public String getAlgorithmName() {
        return "SHA-384";
    }

    public int getDigestSize() {
        return 48;
    }

    public void reset(Memoable arg0) {
        SHA384Digest var2 = (SHA384Digest) arg0;
        super.copyIn(var2);
    }

    public Memoable copy() {
        return new SHA384Digest(this);
    }

    public SHA384Digest(SHA384Digest arg0) {
        super(arg0);
    }

    public int doFinal(byte[] arg0, int arg1) {
        this.finish();
        Pack.longToBigEndian(this.H1, arg0, arg1);
        Pack.longToBigEndian(this.H2, arg0, arg1 + 8);
        Pack.longToBigEndian(this.H3, arg0, arg1 + 16);
        Pack.longToBigEndian(this.H4, arg0, arg1 + 24);
        Pack.longToBigEndian(this.H5, arg0, arg1 + 32);
        Pack.longToBigEndian(this.H6, arg0, arg1 + 40);
        this.reset();
        return 48;
    }

    public byte[] getEncodedState() {
        byte[] var1 = new byte[this.getEncodedStateSize()];
        super.populateState(var1);
        return var1;
    }
}
