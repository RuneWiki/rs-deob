package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public class SHA1Digest extends GeneralDigest implements EncodableDigest {

    public int[] X = new int[80];

    public int H1;

    public int H2;

    public int H3;

    public int H4;

    public int H5;

    public int xOff;

    public static final int DIGEST_LENGTH = 20;

    public static final int Y1 = 1518500249;

    public static final int Y2 = 1859775393;

    public static final int Y3 = -1894007588;

    public static final int Y4 = -899497514;

    public byte[] getEncodedState() {
        byte[] var1 = new byte[this.xOff * 4 + 40];
        super.populateState(var1);
        Pack.intToBigEndian(this.H1, var1, 16);
        Pack.intToBigEndian(this.H2, var1, 20);
        Pack.intToBigEndian(this.H3, var1, 24);
        Pack.intToBigEndian(this.H4, var1, 28);
        Pack.intToBigEndian(this.H5, var1, 32);
        Pack.intToBigEndian(this.xOff, var1, 36);
        for (int var2 = 0; var2 != this.xOff; var2++) {
            Pack.intToBigEndian(this.X[var2], var1, var2 * 4 + 40);
        }
        return var1;
    }

    public SHA1Digest(SHA1Digest arg0) {
        super((GeneralDigest) arg0);
        this.copyIn(arg0);
    }

    public SHA1Digest(byte[] arg0) {
        super(arg0);
        this.H1 = Pack.bigEndianToInt(arg0, 16) * 8641793 * 1732584193;
        this.H2 = Pack.bigEndianToInt(arg0, 20) * 1425160889 * -271733879;
        this.H3 = Pack.bigEndianToInt(arg0, 24);
        this.H4 = Pack.bigEndianToInt(arg0, 28);
        this.H5 = Pack.bigEndianToInt(arg0, 32);
        this.xOff = Pack.bigEndianToInt(arg0, 36);
        for (int var2 = 0; var2 != this.xOff; var2++) {
            this.X[var2] = Pack.bigEndianToInt(arg0, var2 * 4 + 40);
        }
    }

    public int h(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
    }

    public String getAlgorithmName() {
        return "SHA-1";
    }

    public int getDigestSize() {
        return 20;
    }

    public void processWord(byte[] arg0, int arg1) {
        int var3 = arg0[arg1] << 24;
        int var7 = arg1 + 1;
        int var4 = var3 | (arg0[var7] & 0xFF) << 16;
        int var8 = var7 + 1;
        int var5 = var4 | (arg0[var8] & 0xFF) << 8;
        int var9 = var8 + 1;
        int var6 = var5 | arg0[var9] & 0xFF;
        this.X[this.xOff] = var6;
        if (++this.xOff == 16) {
            this.processBlock();
        }
    }

    public int doFinal(byte[] arg0, int arg1) {
        this.finish();
        Pack.intToBigEndian(this.H1, arg0, arg1);
        Pack.intToBigEndian(this.H2, arg0, arg1 + 4);
        Pack.intToBigEndian(this.H3, arg0, arg1 + 8);
        Pack.intToBigEndian(this.H4, arg0, arg1 + 12);
        Pack.intToBigEndian(this.H5, arg0, arg1 + 16);
        this.reset();
        return 20;
    }

    public SHA1Digest() {
        this.reset();
    }

    public void reset() {
        super.reset();
        this.H1 = 1732584193;
        this.H2 = -271733879;
        this.H3 = -1732584194;
        this.H4 = 271733878;
        this.H5 = -1009589776;
        this.xOff = 0;
        for (int var1 = 0; var1 != this.X.length; var1++) {
            this.X[var1] = 0;
        }
    }

    public int f(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | ~arg0 & arg2;
    }

    public void processLength(long arg0) {
        if (this.xOff > 14) {
            this.processBlock();
        }
        this.X[14] = (int) (arg0 >>> 32);
        this.X[15] = (int) (arg0 & 0xFFFFFFFFFFFFFFFFL);
    }

    public int g(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | arg0 & arg2 | arg1 & arg2;
    }

    public void reset(Memoable arg0) {
        SHA1Digest var2 = (SHA1Digest) arg0;
        super.copyIn(var2);
        this.copyIn(var2);
    }

    public Memoable copy() {
        return new SHA1Digest(this);
    }

    public void processBlock() {
        for (int var1 = 16; var1 < 80; var1++) {
            int var2 = this.X[var1 - 3] ^ this.X[var1 - 8] ^ this.X[var1 - 14] ^ this.X[var1 - 16];
            this.X[var1] = var2 << 1 | var2 >>> 31;
        }
        int var3 = this.H1;
        int var4 = this.H2;
        int var5 = this.H3;
        int var6 = this.H4;
        int var7 = this.H5;
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            int var10 = var7 + (var3 << 5 | var3 >>> 27) + this.f(var4, var5, var6) + this.X[var8++] + 1518500249;
            int var11 = var4 << 30 | var4 >>> 2;
            int var12 = var6 + (var10 << 5 | var10 >>> 27) + this.f(var3, var11, var5) + this.X[var8++] + 1518500249;
            int var13 = var3 << 30 | var3 >>> 2;
            int var14 = var5 + (var12 << 5 | var12 >>> 27) + this.f(var10, var13, var11) + this.X[var8++] + 1518500249;
            var7 = var10 << 30 | var10 >>> 2;
            var4 = var11 + (var14 << 5 | var14 >>> 27) + this.f(var12, var7, var13) + this.X[var8++] + 1518500249;
            var6 = var12 << 30 | var12 >>> 2;
            var3 = var13 + (var4 << 5 | var4 >>> 27) + this.f(var14, var6, var7) + this.X[var8++] + 1518500249;
            var5 = var14 << 30 | var14 >>> 2;
        }
        for (int var15 = 0; var15 < 4; var15++) {
            int var16 = var7 + (var3 << 5 | var3 >>> 27) + this.h(var4, var5, var6) + this.X[var8++] + 1859775393;
            int var17 = var4 << 30 | var4 >>> 2;
            int var18 = var6 + (var16 << 5 | var16 >>> 27) + this.h(var3, var17, var5) + this.X[var8++] + 1859775393;
            int var19 = var3 << 30 | var3 >>> 2;
            int var20 = var5 + (var18 << 5 | var18 >>> 27) + this.h(var16, var19, var17) + this.X[var8++] + 1859775393;
            var7 = var16 << 30 | var16 >>> 2;
            var4 = var17 + (var20 << 5 | var20 >>> 27) + this.h(var18, var7, var19) + this.X[var8++] + 1859775393;
            var6 = var18 << 30 | var18 >>> 2;
            var3 = var19 + (var4 << 5 | var4 >>> 27) + this.h(var20, var6, var7) + this.X[var8++] + 1859775393;
            var5 = var20 << 30 | var20 >>> 2;
        }
        for (int var21 = 0; var21 < 4; var21++) {
            int var22 = var7 + (var3 << 5 | var3 >>> 27) + this.g(var4, var5, var6) + this.X[var8++] + -1894007588;
            int var23 = var4 << 30 | var4 >>> 2;
            int var24 = var6 + (var22 << 5 | var22 >>> 27) + this.g(var3, var23, var5) + this.X[var8++] + -1894007588;
            int var25 = var3 << 30 | var3 >>> 2;
            int var26 = var5 + (var24 << 5 | var24 >>> 27) + this.g(var22, var25, var23) + this.X[var8++] + -1894007588;
            var7 = var22 << 30 | var22 >>> 2;
            var4 = var23 + (var26 << 5 | var26 >>> 27) + this.g(var24, var7, var25) + this.X[var8++] + -1894007588;
            var6 = var24 << 30 | var24 >>> 2;
            var3 = var25 + (var4 << 5 | var4 >>> 27) + this.g(var26, var6, var7) + this.X[var8++] + -1894007588;
            var5 = var26 << 30 | var26 >>> 2;
        }
        for (int var27 = 0; var27 <= 3; var27++) {
            int var28 = var7 + (var3 << 5 | var3 >>> 27) + this.h(var4, var5, var6) + this.X[var8++] + -899497514;
            int var29 = var4 << 30 | var4 >>> 2;
            int var30 = var6 + (var28 << 5 | var28 >>> 27) + this.h(var3, var29, var5) + this.X[var8++] + -899497514;
            int var31 = var3 << 30 | var3 >>> 2;
            int var32 = var5 + (var30 << 5 | var30 >>> 27) + this.h(var28, var31, var29) + this.X[var8++] + -899497514;
            var7 = var28 << 30 | var28 >>> 2;
            var4 = var29 + (var32 << 5 | var32 >>> 27) + this.h(var30, var7, var31) + this.X[var8++] + -899497514;
            var6 = var30 << 30 | var30 >>> 2;
            var3 = var31 + (var4 << 5 | var4 >>> 27) + this.h(var32, var6, var7) + this.X[var8++] + -899497514;
            var5 = var32 << 30 | var32 >>> 2;
        }
        this.H1 += var3;
        this.H2 += var4;
        this.H3 += var5;
        this.H4 += var6;
        this.H5 += var7;
        this.xOff = 0;
        for (int var33 = 0; var33 < 16; var33++) {
            this.X[var33] = 0;
        }
    }

    public void copyIn(SHA1Digest arg0) {
        this.H1 = arg0.H1;
        this.H2 = arg0.H2;
        this.H3 = arg0.H3;
        this.H4 = arg0.H4;
        this.H5 = arg0.H5;
        System.arraycopy(arg0.X, 0, this.X, 0, arg0.X.length);
        this.xOff = arg0.xOff;
    }
}
