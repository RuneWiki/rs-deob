package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public class SHA224Digest extends GeneralDigest implements EncodableDigest {

    public int[] X = new int[64];

    public int H1;

    public int H2;

    public int H3;

    public int H4;

    public int H5;

    public int H6;

    public int H7;

    public int H8;

    public int xOff;

    public static final int[] K = new int[] { 1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998 };

    public static final int DIGEST_LENGTH = 28;

    public byte[] getEncodedState() {
        byte[] var1 = new byte[this.xOff * 4 + 52];
        super.populateState(var1);
        Pack.intToBigEndian(this.H1, var1, 16);
        Pack.intToBigEndian(this.H2, var1, 20);
        Pack.intToBigEndian(this.H3, var1, 24);
        Pack.intToBigEndian(this.H4, var1, 28);
        Pack.intToBigEndian(this.H5, var1, 32);
        Pack.intToBigEndian(this.H6, var1, 36);
        Pack.intToBigEndian(this.H7, var1, 40);
        Pack.intToBigEndian(this.H8, var1, 44);
        Pack.intToBigEndian(this.xOff, var1, 48);
        for (int var2 = 0; var2 != this.xOff; var2++) {
            Pack.intToBigEndian(this.X[var2], var1, var2 * 4 + 52);
        }
        return var1;
    }

    public int Theta1(int arg0) {
        return (arg0 >>> 17 | arg0 << 15) ^ (arg0 >>> 19 | arg0 << 13) ^ arg0 >>> 10;
    }

    public void doCopy(SHA224Digest arg0) {
        super.copyIn(arg0);
        this.H1 = arg0.H1;
        this.H2 = arg0.H2;
        this.H3 = arg0.H3;
        this.H4 = arg0.H4;
        this.H5 = arg0.H5;
        this.H6 = arg0.H6;
        this.H7 = arg0.H7;
        this.H8 = arg0.H8;
        System.arraycopy(arg0.X, 0, this.X, 0, arg0.X.length);
        this.xOff = arg0.xOff;
    }

    public SHA224Digest(byte[] arg0) {
        super(arg0);
        this.H1 = Pack.bigEndianToInt(arg0, 16);
        this.H2 = Pack.bigEndianToInt(arg0, 20) * -643266377 * 914150663;
        this.H3 = Pack.bigEndianToInt(arg0, 24) * -1024054617 * 812702999;
        this.H4 = Pack.bigEndianToInt(arg0, 28) * 579257609 * -150054599;
        this.H5 = Pack.bigEndianToInt(arg0, 32) * -203199023 * -4191439;
        this.H6 = Pack.bigEndianToInt(arg0, 36) * -274367503 * 1750603025;
        this.H7 = Pack.bigEndianToInt(arg0, 40) * -871487465 * 1694076839;
        this.H8 = Pack.bigEndianToInt(arg0, 44);
        this.xOff = Pack.bigEndianToInt(arg0, 48);
        for (int var2 = 0; var2 != this.xOff; var2++) {
            this.X[var2] = Pack.bigEndianToInt(arg0, var2 * 4 + 52);
        }
    }

    public String getAlgorithmName() {
        return "SHA-224";
    }

    public int getDigestSize() {
        return 28;
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

    public int Sum1(int arg0) {
        return (arg0 >>> 6 | arg0 << 26) ^ (arg0 >>> 11 | arg0 << 21) ^ (arg0 >>> 25 | arg0 << 7);
    }

    public int doFinal(byte[] arg0, int arg1) {
        this.finish();
        Pack.intToBigEndian(this.H1, arg0, arg1);
        Pack.intToBigEndian(this.H2, arg0, arg1 + 4);
        Pack.intToBigEndian(this.H3, arg0, arg1 + 8);
        Pack.intToBigEndian(this.H4, arg0, arg1 + 12);
        Pack.intToBigEndian(this.H5, arg0, arg1 + 16);
        Pack.intToBigEndian(this.H6, arg0, arg1 + 20);
        Pack.intToBigEndian(this.H7, arg0, arg1 + 24);
        this.reset();
        return 28;
    }

    public void reset() {
        super.reset();
        this.H1 = -1056596264;
        this.H2 = 914150663;
        this.H3 = 812702999;
        this.H4 = -150054599;
        this.H5 = -4191439;
        this.H6 = 1750603025;
        this.H7 = 1694076839;
        this.H8 = -1090891868;
        this.xOff = 0;
        for (int var1 = 0; var1 != this.X.length; var1++) {
            this.X[var1] = 0;
        }
    }

    public void processLength(long arg0) {
        if (this.xOff > 14) {
            this.processBlock();
        }
        this.X[14] = (int) (arg0 >>> 32);
        this.X[15] = (int) (arg0 & 0xFFFFFFFFFFFFFFFFL);
    }

    public int Maj(int arg0, int arg1, int arg2) {
        return arg0 & arg1 ^ arg0 & arg2 ^ arg1 & arg2;
    }

    public void reset(Memoable arg0) {
        SHA224Digest var2 = (SHA224Digest) arg0;
        this.doCopy(var2);
    }

    public int Sum0(int arg0) {
        return (arg0 >>> 2 | arg0 << 30) ^ (arg0 >>> 13 | arg0 << 19) ^ (arg0 >>> 22 | arg0 << 10);
    }

    public SHA224Digest() {
        this.reset();
    }

    public int Theta0(int arg0) {
        return (arg0 >>> 7 | arg0 << 25) ^ (arg0 >>> 18 | arg0 << 14) ^ arg0 >>> 3;
    }

    public void processBlock() {
        for (int var1 = 16; var1 <= 63; var1++) {
            this.X[var1] = this.Theta1(this.X[var1 - 2]) + this.X[var1 - 7] + this.Theta0(this.X[var1 - 15]) + this.X[var1 - 16];
        }
        int var2 = this.H1;
        int var3 = this.H2;
        int var4 = this.H3;
        int var5 = this.H4;
        int var6 = this.H5;
        int var7 = this.H6;
        int var8 = this.H7;
        int var9 = this.H8;
        int var10 = 0;
        for (int var11 = 0; var11 < 8; var11++) {
            int var12 = var9 + this.Sum1(var6) + this.Ch(var6, var7, var8) + K[var10] + this.X[var10];
            int var13 = var5 + var12;
            int var14 = var12 + this.Sum0(var2) + this.Maj(var2, var3, var4);
            var10++;
            int var15 = var8 + this.Sum1(var13) + this.Ch(var13, var6, var7) + K[var10] + this.X[var10];
            int var16 = var4 + var15;
            int var17 = var15 + this.Sum0(var14) + this.Maj(var14, var2, var3);
            var10++;
            int var18 = var7 + this.Sum1(var16) + this.Ch(var16, var13, var6) + K[var10] + this.X[var10];
            int var19 = var3 + var18;
            int var20 = var18 + this.Sum0(var17) + this.Maj(var17, var14, var2);
            var10++;
            int var21 = var6 + this.Sum1(var19) + this.Ch(var19, var16, var13) + K[var10] + this.X[var10];
            int var22 = var2 + var21;
            int var23 = var21 + this.Sum0(var20) + this.Maj(var20, var17, var14);
            var10++;
            int var24 = var13 + this.Sum1(var22) + this.Ch(var22, var19, var16) + K[var10] + this.X[var10];
            var9 = var14 + var24;
            var5 = var24 + this.Sum0(var23) + this.Maj(var23, var20, var17);
            var10++;
            int var25 = var16 + this.Sum1(var9) + this.Ch(var9, var22, var19) + K[var10] + this.X[var10];
            var8 = var17 + var25;
            var4 = var25 + this.Sum0(var5) + this.Maj(var5, var23, var20);
            var10++;
            int var26 = var19 + this.Sum1(var8) + this.Ch(var8, var9, var22) + K[var10] + this.X[var10];
            var7 = var20 + var26;
            var3 = var26 + this.Sum0(var4) + this.Maj(var4, var5, var23);
            var10++;
            int var27 = var22 + this.Sum1(var7) + this.Ch(var7, var8, var9) + K[var10] + this.X[var10];
            var6 = var23 + var27;
            var2 = var27 + this.Sum0(var3) + this.Maj(var3, var4, var5);
            var10++;
        }
        this.H1 += var2;
        this.H2 += var3;
        this.H3 += var4;
        this.H4 += var5;
        this.H5 += var6;
        this.H6 += var7;
        this.H7 += var8;
        this.H8 += var9;
        this.xOff = 0;
        for (int var28 = 0; var28 < 16; var28++) {
            this.X[var28] = 0;
        }
    }

    public Memoable copy() {
        return new SHA224Digest(this);
    }

    public SHA224Digest(SHA224Digest arg0) {
        super((GeneralDigest) arg0);
        this.doCopy(arg0);
    }

    public int Ch(int arg0, int arg1, int arg2) {
        return arg0 & arg1 ^ ~arg0 & arg2;
    }
}
