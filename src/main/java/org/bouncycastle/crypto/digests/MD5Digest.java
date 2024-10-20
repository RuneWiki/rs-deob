package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public class MD5Digest extends GeneralDigest implements EncodableDigest {

    public int[] X = new int[16];

    public int H1;

    public int H2;

    public int H3;

    public int H4;

    public int xOff;

    public static final int DIGEST_LENGTH = 16;

    public static final int S11 = 7;

    public static final int S12 = 12;

    public static final int S13 = 17;

    public static final int S14 = 22;

    public static final int S21 = 5;

    public static final int S22 = 9;

    public static final int S23 = 14;

    public static final int S24 = 20;

    public static final int S31 = 4;

    public static final int S32 = 11;

    public static final int S33 = 16;

    public static final int S34 = 23;

    public static final int S41 = 6;

    public static final int S42 = 10;

    public static final int S43 = 15;

    public static final int S44 = 21;

    public MD5Digest() {
        this.reset();
    }

    public MD5Digest(byte[] arg0) {
        super(arg0);
        this.H1 = Pack.bigEndianToInt(arg0, 16) * 8641793 * 1732584193;
        this.H2 = Pack.bigEndianToInt(arg0, 20) * 1425160889 * -271733879;
        this.H3 = Pack.bigEndianToInt(arg0, 24);
        this.H4 = Pack.bigEndianToInt(arg0, 28);
        this.xOff = Pack.bigEndianToInt(arg0, 32);
        for (int var2 = 0; var2 != this.xOff; var2++) {
            this.X[var2] = Pack.bigEndianToInt(arg0, var2 * 4 + 36);
        }
    }

    public String getAlgorithmName() {
        return "MD5";
    }

    public MD5Digest(MD5Digest arg0) {
        super((GeneralDigest) arg0);
        this.copyIn(arg0);
    }

    public int G(int arg0, int arg1, int arg2) {
        return arg0 & arg2 | arg1 & ~arg2;
    }

    public Memoable copy() {
        return new MD5Digest(this);
    }

    public void processWord(byte[] arg0, int arg1) {
        this.X[this.xOff++] = arg0[arg1] & 0xFF | (arg0[arg1 + 1] & 0xFF) << 8 | (arg0[arg1 + 2] & 0xFF) << 16 | (arg0[arg1 + 3] & 0xFF) << 24;
        if (this.xOff == 16) {
            this.processBlock();
        }
    }

    public int rotateLeft(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> 32 - arg1;
    }

    public void unpackWord(int arg0, byte[] arg1, int arg2) {
        arg1[arg2] = (byte) arg0;
        arg1[arg2 + 1] = (byte) (arg0 >>> 8);
        arg1[arg2 + 2] = (byte) (arg0 >>> 16);
        arg1[arg2 + 3] = (byte) (arg0 >>> 24);
    }

    public int doFinal(byte[] arg0, int arg1) {
        this.finish();
        this.unpackWord(this.H1, arg0, arg1);
        this.unpackWord(this.H2, arg0, arg1 + 4);
        this.unpackWord(this.H3, arg0, arg1 + 8);
        this.unpackWord(this.H4, arg0, arg1 + 12);
        this.reset();
        return 16;
    }

    public void reset() {
        super.reset();
        this.H1 = 1732584193;
        this.H2 = -271733879;
        this.H3 = -1732584194;
        this.H4 = 271733878;
        this.xOff = 0;
        for (int var1 = 0; var1 != this.X.length; var1++) {
            this.X[var1] = 0;
        }
    }

    public void processBlock() {
        int var1 = this.H1;
        int var2 = this.H2;
        int var3 = this.H3;
        int var4 = this.H4;
        int var5 = this.rotateLeft(var1 + this.F(var2, var3, var4) + this.X[0] + -680876936, 7) + var2;
        int var6 = this.rotateLeft(var4 + this.F(var5, var2, var3) + this.X[1] + -389564586, 12) + var5;
        int var7 = this.rotateLeft(var3 + this.F(var6, var5, var2) + this.X[2] + 606105819, 17) + var6;
        int var8 = this.rotateLeft(var2 + this.F(var7, var6, var5) + this.X[3] + -1044525330, 22) + var7;
        int var9 = this.rotateLeft(var5 + this.F(var8, var7, var6) + this.X[4] + -176418897, 7) + var8;
        int var10 = this.rotateLeft(var6 + this.F(var9, var8, var7) + this.X[5] + 1200080426, 12) + var9;
        int var11 = this.rotateLeft(var7 + this.F(var10, var9, var8) + this.X[6] + -1473231341, 17) + var10;
        int var12 = this.rotateLeft(var8 + this.F(var11, var10, var9) + this.X[7] + -45705983, 22) + var11;
        int var13 = this.rotateLeft(var9 + this.F(var12, var11, var10) + this.X[8] + 1770035416, 7) + var12;
        int var14 = this.rotateLeft(var10 + this.F(var13, var12, var11) + this.X[9] + -1958414417, 12) + var13;
        int var15 = this.rotateLeft(var11 + this.F(var14, var13, var12) + this.X[10] + -42063, 17) + var14;
        int var16 = this.rotateLeft(var12 + this.F(var15, var14, var13) + this.X[11] + -1990404162, 22) + var15;
        int var17 = this.rotateLeft(var13 + this.F(var16, var15, var14) + this.X[12] + 1804603682, 7) + var16;
        int var18 = this.rotateLeft(var14 + this.F(var17, var16, var15) + this.X[13] + -40341101, 12) + var17;
        int var19 = this.rotateLeft(var15 + this.F(var18, var17, var16) + this.X[14] + -1502002290, 17) + var18;
        int var20 = this.rotateLeft(var16 + this.F(var19, var18, var17) + this.X[15] + 1236535329, 22) + var19;
        int var21 = this.rotateLeft(var17 + this.G(var20, var19, var18) + this.X[1] + -165796510, 5) + var20;
        int var22 = this.rotateLeft(var18 + this.G(var21, var20, var19) + this.X[6] + -1069501632, 9) + var21;
        int var23 = this.rotateLeft(var19 + this.G(var22, var21, var20) + this.X[11] + 643717713, 14) + var22;
        int var24 = this.rotateLeft(var20 + this.G(var23, var22, var21) + this.X[0] + -373897302, 20) + var23;
        int var25 = this.rotateLeft(var21 + this.G(var24, var23, var22) + this.X[5] + -701558691, 5) + var24;
        int var26 = this.rotateLeft(var22 + this.G(var25, var24, var23) + this.X[10] + 38016083, 9) + var25;
        int var27 = this.rotateLeft(var23 + this.G(var26, var25, var24) + this.X[15] + -660478335, 14) + var26;
        int var28 = this.rotateLeft(var24 + this.G(var27, var26, var25) + this.X[4] + -405537848, 20) + var27;
        int var29 = this.rotateLeft(var25 + this.G(var28, var27, var26) + this.X[9] + 568446438, 5) + var28;
        int var30 = this.rotateLeft(var26 + this.G(var29, var28, var27) + this.X[14] + -1019803690, 9) + var29;
        int var31 = this.rotateLeft(var27 + this.G(var30, var29, var28) + this.X[3] + -187363961, 14) + var30;
        int var32 = this.rotateLeft(var28 + this.G(var31, var30, var29) + this.X[8] + 1163531501, 20) + var31;
        int var33 = this.rotateLeft(var29 + this.G(var32, var31, var30) + this.X[13] + -1444681467, 5) + var32;
        int var34 = this.rotateLeft(var30 + this.G(var33, var32, var31) + this.X[2] + -51403784, 9) + var33;
        int var35 = this.rotateLeft(var31 + this.G(var34, var33, var32) + this.X[7] + 1735328473, 14) + var34;
        int var36 = this.rotateLeft(var32 + this.G(var35, var34, var33) + this.X[12] + -1926607734, 20) + var35;
        int var37 = this.rotateLeft(var33 + this.H(var36, var35, var34) + this.X[5] + -378558, 4) + var36;
        int var38 = this.rotateLeft(var34 + this.H(var37, var36, var35) + this.X[8] + -2022574463, 11) + var37;
        int var39 = this.rotateLeft(var35 + this.H(var38, var37, var36) + this.X[11] + 1839030562, 16) + var38;
        int var40 = this.rotateLeft(var36 + this.H(var39, var38, var37) + this.X[14] + -35309556, 23) + var39;
        int var41 = this.rotateLeft(var37 + this.H(var40, var39, var38) + this.X[1] + -1530992060, 4) + var40;
        int var42 = this.rotateLeft(var38 + this.H(var41, var40, var39) + this.X[4] + 1272893353, 11) + var41;
        int var43 = this.rotateLeft(var39 + this.H(var42, var41, var40) + this.X[7] + -155497632, 16) + var42;
        int var44 = this.rotateLeft(var40 + this.H(var43, var42, var41) + this.X[10] + -1094730640, 23) + var43;
        int var45 = this.rotateLeft(var41 + this.H(var44, var43, var42) + this.X[13] + 681279174, 4) + var44;
        int var46 = this.rotateLeft(var42 + this.H(var45, var44, var43) + this.X[0] + -358537222, 11) + var45;
        int var47 = this.rotateLeft(var43 + this.H(var46, var45, var44) + this.X[3] + -722521979, 16) + var46;
        int var48 = this.rotateLeft(var44 + this.H(var47, var46, var45) + this.X[6] + 76029189, 23) + var47;
        int var49 = this.rotateLeft(var45 + this.H(var48, var47, var46) + this.X[9] + -640364487, 4) + var48;
        int var50 = this.rotateLeft(var46 + this.H(var49, var48, var47) + this.X[12] + -421815835, 11) + var49;
        int var51 = this.rotateLeft(var47 + this.H(var50, var49, var48) + this.X[15] + 530742520, 16) + var50;
        int var52 = this.rotateLeft(var48 + this.H(var51, var50, var49) + this.X[2] + -995338651, 23) + var51;
        int var53 = this.rotateLeft(var49 + this.K(var52, var51, var50) + this.X[0] + -198630844, 6) + var52;
        int var54 = this.rotateLeft(var50 + this.K(var53, var52, var51) + this.X[7] + 1126891415, 10) + var53;
        int var55 = this.rotateLeft(var51 + this.K(var54, var53, var52) + this.X[14] + -1416354905, 15) + var54;
        int var56 = this.rotateLeft(var52 + this.K(var55, var54, var53) + this.X[5] + -57434055, 21) + var55;
        int var57 = this.rotateLeft(var53 + this.K(var56, var55, var54) + this.X[12] + 1700485571, 6) + var56;
        int var58 = this.rotateLeft(var54 + this.K(var57, var56, var55) + this.X[3] + -1894986606, 10) + var57;
        int var59 = this.rotateLeft(var55 + this.K(var58, var57, var56) + this.X[10] + -1051523, 15) + var58;
        int var60 = this.rotateLeft(var56 + this.K(var59, var58, var57) + this.X[1] + -2054922799, 21) + var59;
        int var61 = this.rotateLeft(var57 + this.K(var60, var59, var58) + this.X[8] + 1873313359, 6) + var60;
        int var62 = this.rotateLeft(var58 + this.K(var61, var60, var59) + this.X[15] + -30611744, 10) + var61;
        int var63 = this.rotateLeft(var59 + this.K(var62, var61, var60) + this.X[6] + -1560198380, 15) + var62;
        int var64 = this.rotateLeft(var60 + this.K(var63, var62, var61) + this.X[13] + 1309151649, 21) + var63;
        int var65 = this.rotateLeft(var61 + this.K(var64, var63, var62) + this.X[4] + -145523070, 6) + var64;
        int var66 = this.rotateLeft(var62 + this.K(var65, var64, var63) + this.X[11] + -1120210379, 10) + var65;
        int var67 = this.rotateLeft(var63 + this.K(var66, var65, var64) + this.X[2] + 718787259, 15) + var66;
        int var68 = this.rotateLeft(var64 + this.K(var67, var66, var65) + this.X[9] + -343485551, 21) + var67;
        this.H1 += var65;
        this.H2 += var68;
        this.H3 += var67;
        this.H4 += var66;
        this.xOff = 0;
        for (int var69 = 0; var69 != this.X.length; var69++) {
            this.X[var69] = 0;
        }
    }

    public int F(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | ~arg0 & arg2;
    }

    public void processLength(long arg0) {
        if (this.xOff > 14) {
            this.processBlock();
        }
        this.X[14] = (int) (arg0 & 0xFFFFFFFFFFFFFFFFL);
        this.X[15] = (int) (arg0 >>> 32);
    }

    public void copyIn(MD5Digest arg0) {
        super.copyIn(arg0);
        this.H1 = arg0.H1;
        this.H2 = arg0.H2;
        this.H3 = arg0.H3;
        this.H4 = arg0.H4;
        System.arraycopy(arg0.X, 0, this.X, 0, arg0.X.length);
        this.xOff = arg0.xOff;
    }

    public int K(int arg0, int arg1, int arg2) {
        return arg1 ^ (arg0 | ~arg2);
    }

    public int getDigestSize() {
        return 16;
    }

    public int H(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
    }

    public void reset(Memoable arg0) {
        MD5Digest var2 = (MD5Digest) arg0;
        this.copyIn(var2);
    }

    public byte[] getEncodedState() {
        byte[] var1 = new byte[this.xOff * 4 + 36];
        super.populateState(var1);
        Pack.intToBigEndian(this.H1, var1, 16);
        Pack.intToBigEndian(this.H2, var1, 20);
        Pack.intToBigEndian(this.H3, var1, 24);
        Pack.intToBigEndian(this.H4, var1, 28);
        Pack.intToBigEndian(this.xOff, var1, 32);
        for (int var2 = 0; var2 != this.xOff; var2++) {
            Pack.intToBigEndian(this.X[var2], var1, var2 * 4 + 36);
        }
        return var1;
    }
}
