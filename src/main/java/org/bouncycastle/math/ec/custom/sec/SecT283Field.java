package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat320;

public class SecT283Field {

    public static final long[] ROOT_Z = new long[] { 878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042L };

    public static final long M27 = 134217727L;

    public static final long M57 = 144115188075855871L;

    public static void sqrt(long[] arg0, long[] arg1) {
        long[] var2 = Nat320.create64();
        long var3 = Interleave.unshuffle(arg0[0]);
        long var5 = Interleave.unshuffle(arg0[1]);
        long var7 = var3 & 0xFFFFFFFFL | var5 << 32;
        var2[0] = var3 >>> 32 | var5 & 0xFFFFFFFF00000000L;
        long var9 = Interleave.unshuffle(arg0[2]);
        long var11 = Interleave.unshuffle(arg0[3]);
        long var13 = var9 & 0xFFFFFFFFL | var11 << 32;
        var2[1] = var9 >>> 32 | var11 & 0xFFFFFFFF00000000L;
        long var15 = Interleave.unshuffle(arg0[4]);
        long var17 = var15 & 0xFFFFFFFFL;
        var2[2] = var15 >>> 32;
        multiply(var2, ROOT_Z, arg1);
        arg1[0] ^= var7;
        arg1[1] ^= var13;
        arg1[2] ^= var17;
    }

    public static void addExt(long[] arg0, long[] arg1, long[] arg2) {
        arg2[0] = arg0[0] ^ arg1[0];
        arg2[1] = arg0[1] ^ arg1[1];
        arg2[2] = arg0[2] ^ arg1[2];
        arg2[3] = arg0[3] ^ arg1[3];
        arg2[4] = arg0[4] ^ arg1[4];
        arg2[5] = arg0[5] ^ arg1[5];
        arg2[6] = arg0[6] ^ arg1[6];
        arg2[7] = arg0[7] ^ arg1[7];
        arg2[8] = arg0[8] ^ arg1[8];
    }

    public static void addOne(long[] arg0, long[] arg1) {
        arg1[0] = arg0[0] ^ 0x1L;
        arg1[1] = arg0[1];
        arg1[2] = arg0[2];
        arg1[3] = arg0[3];
        arg1[4] = arg0[4];
    }

    public static long[] fromBigInteger(BigInteger arg0) {
        long[] var1 = Nat320.fromBigInteger64(arg0);
        reduce37(var1, 0);
        return var1;
    }

    public static void invert(long[] arg0, long[] arg1) {
        if (Nat320.isZero64(arg0)) {
            throw new IllegalStateException();
        }
        long[] var2 = Nat320.create64();
        long[] var3 = Nat320.create64();
        square(arg0, var2);
        multiply(var2, arg0, var2);
        squareN(var2, 2, var3);
        multiply(var3, var2, var3);
        squareN(var3, 4, var2);
        multiply(var2, var3, var2);
        squareN(var2, 8, var3);
        multiply(var3, var2, var3);
        square(var3, var3);
        multiply(var3, arg0, var3);
        squareN(var3, 17, var2);
        multiply(var2, var3, var2);
        square(var2, var2);
        multiply(var2, arg0, var2);
        squareN(var2, 35, var3);
        multiply(var3, var2, var3);
        squareN(var3, 70, var2);
        multiply(var2, var3, var2);
        square(var2, var2);
        multiply(var2, arg0, var2);
        squareN(var2, 141, var3);
        multiply(var3, var2, var3);
        square(var3, arg1);
    }

    public static void multiplyAddToExt(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = Nat320.createExt64();
        implMultiply(arg0, arg1, var3);
        addExt(arg2, var3, arg2);
    }

    public static void implMulw(long arg0, long arg1, long[] arg2, int arg3) {
        long[] var6 = new long[8];
        var6[1] = arg1;
        var6[2] = var6[1] << 1;
        var6[3] = var6[2] ^ arg1;
        var6[4] = var6[2] << 1;
        var6[5] = var6[4] ^ arg1;
        var6[6] = var6[3] << 1;
        var6[7] = var6[6] ^ arg1;
        int var7 = (int) arg0;
        long var8 = 0L;
        long var10 = var6[var7 & 0x7];
        int var12 = 48;
        do {
            int var13 = (int) (arg0 >>> var12);
            long var14 = var6[var13 & 0x7] ^ var6[var13 >>> 3 & 0x7] << 3 ^ var6[var13 >>> 6 & 0x7] << 6;
            var10 ^= var14 << var12;
            var8 ^= var14 >>> -var12;
            var12 -= 9;
        } while (var12 > 0);
        long var16 = var8 ^ (arg0 & 0x100804020100800L & arg1 << 7 >> 63) >>> 8;
        arg2[arg3] = var10 & 0x1FFFFFFFFFFFFFFL;
        arg2[arg3 + 1] = var10 >>> 57 ^ var16 << 7;
    }

    public static void reduce(long[] arg0, long[] arg1) {
        long var2 = arg0[0];
        long var4 = arg0[1];
        long var6 = arg0[2];
        long var8 = arg0[3];
        long var10 = arg0[4];
        long var12 = arg0[5];
        long var14 = arg0[6];
        long var16 = arg0[7];
        long var18 = arg0[8];
        long var20 = var8 ^ var18 << 37 ^ var18 << 42 ^ var18 << 44 ^ var18 << 49;
        long var22 = var10 ^ var18 >>> 27 ^ var18 >>> 22 ^ var18 >>> 20 ^ var18 >>> 15;
        long var24 = var6 ^ var16 << 37 ^ var16 << 42 ^ var16 << 44 ^ var16 << 49;
        long var26 = var20 ^ var16 >>> 27 ^ var16 >>> 22 ^ var16 >>> 20 ^ var16 >>> 15;
        long var28 = var4 ^ var14 << 37 ^ var14 << 42 ^ var14 << 44 ^ var14 << 49;
        long var30 = var24 ^ var14 >>> 27 ^ var14 >>> 22 ^ var14 >>> 20 ^ var14 >>> 15;
        long var32 = var2 ^ var12 << 37 ^ var12 << 42 ^ var12 << 44 ^ var12 << 49;
        long var34 = var28 ^ var12 >>> 27 ^ var12 >>> 22 ^ var12 >>> 20 ^ var12 >>> 15;
        long var36 = var22 >>> 27;
        arg1[0] = var32 ^ var36 ^ var36 << 5 ^ var36 << 7 ^ var36 << 12;
        arg1[1] = var34;
        arg1[2] = var30;
        arg1[3] = var26;
        arg1[4] = var22 & 0x7FFFFFFL;
    }

    public static void add(long[] arg0, long[] arg1, long[] arg2) {
        arg2[0] = arg0[0] ^ arg1[0];
        arg2[1] = arg0[1] ^ arg1[1];
        arg2[2] = arg0[2] ^ arg1[2];
        arg2[3] = arg0[3] ^ arg1[3];
        arg2[4] = arg0[4] ^ arg1[4];
    }

    public static void multiply(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = Nat320.createExt64();
        implMultiply(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void square(long[] arg0, long[] arg1) {
        long[] var2 = Nat.create64(9);
        implSquare(arg0, var2);
        reduce(var2, arg1);
    }

    public static void squareAddToExt(long[] arg0, long[] arg1) {
        long[] var2 = Nat.create64(9);
        implSquare(arg0, var2);
        addExt(arg1, var2, arg1);
    }

    public static void squareN(long[] arg0, int arg1, long[] arg2) {
        long[] var3 = Nat.create64(9);
        implSquare(arg0, var3);
        reduce(var3, arg2);
        while (true) {
            arg1--;
            if (arg1 <= 0) {
                return;
            }
            implSquare(arg2, var3);
            reduce(var3, arg2);
        }
    }

    public static int trace(long[] arg0) {
        return (int) (arg0[0] ^ arg0[4] >>> 15) & 0x1;
    }

    public static void implCompactExt(long[] arg0) {
        long var1 = arg0[0];
        long var3 = arg0[1];
        long var5 = arg0[2];
        long var7 = arg0[3];
        long var9 = arg0[4];
        long var11 = arg0[5];
        long var13 = arg0[6];
        long var15 = arg0[7];
        long var17 = arg0[8];
        long var19 = arg0[9];
        arg0[0] = var1 ^ var3 << 57;
        arg0[1] = var3 >>> 7 ^ var5 << 50;
        arg0[2] = var5 >>> 14 ^ var7 << 43;
        arg0[3] = var7 >>> 21 ^ var9 << 36;
        arg0[4] = var9 >>> 28 ^ var11 << 29;
        arg0[5] = var11 >>> 35 ^ var13 << 22;
        arg0[6] = var13 >>> 42 ^ var15 << 15;
        arg0[7] = var15 >>> 49 ^ var17 << 8;
        arg0[8] = var17 >>> 56 ^ var19 << 1;
        arg0[9] = var19 >>> 63;
    }

    public static void implExpand(long[] arg0, long[] arg1) {
        long var2 = arg0[0];
        long var4 = arg0[1];
        long var6 = arg0[2];
        long var8 = arg0[3];
        long var10 = arg0[4];
        arg1[0] = var2 & 0x1FFFFFFFFFFFFFFL;
        arg1[1] = (var2 >>> 57 ^ var4 << 7) & 0x1FFFFFFFFFFFFFFL;
        arg1[2] = (var4 >>> 50 ^ var6 << 14) & 0x1FFFFFFFFFFFFFFL;
        arg1[3] = (var6 >>> 43 ^ var8 << 21) & 0x1FFFFFFFFFFFFFFL;
        arg1[4] = var8 >>> 36 ^ var10 << 28;
    }

    public static void implMultiply(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = new long[5];
        long[] var4 = new long[5];
        implExpand(arg0, var3);
        implExpand(arg1, var4);
        long[] var5 = new long[26];
        implMulw(var3[0], var4[0], var5, 0);
        implMulw(var3[1], var4[1], var5, 2);
        implMulw(var3[2], var4[2], var5, 4);
        implMulw(var3[3], var4[3], var5, 6);
        implMulw(var3[4], var4[4], var5, 8);
        long var6 = var3[0] ^ var3[1];
        long var8 = var4[0] ^ var4[1];
        long var10 = var3[0] ^ var3[2];
        long var12 = var4[0] ^ var4[2];
        long var14 = var3[2] ^ var3[4];
        long var16 = var4[2] ^ var4[4];
        long var18 = var3[3] ^ var3[4];
        long var20 = var4[3] ^ var4[4];
        implMulw(var10 ^ var3[3], var12 ^ var4[3], var5, 18);
        implMulw(var14 ^ var3[1], var16 ^ var4[1], var5, 20);
        long var22 = var6 ^ var18;
        long var24 = var8 ^ var20;
        long var26 = var22 ^ var3[2];
        long var28 = var24 ^ var4[2];
        implMulw(var22, var24, var5, 22);
        implMulw(var26, var28, var5, 24);
        implMulw(var6, var8, var5, 10);
        implMulw(var10, var12, var5, 12);
        implMulw(var14, var16, var5, 14);
        implMulw(var18, var20, var5, 16);
        arg2[0] = var5[0];
        arg2[9] = var5[9];
        long var30 = var5[0] ^ var5[1];
        long var32 = var30 ^ var5[2];
        long var34 = var32 ^ var5[10];
        arg2[1] = var34;
        long var36 = var5[3] ^ var5[4];
        long var38 = var5[11] ^ var5[12];
        long var40 = var36 ^ var38;
        long var42 = var32 ^ var40;
        arg2[2] = var42;
        long var44 = var30 ^ var36;
        long var46 = var5[5] ^ var5[6];
        long var48 = var44 ^ var46;
        long var50 = var48 ^ var5[8];
        long var52 = var5[13] ^ var5[14];
        long var54 = var50 ^ var52;
        long var56 = var5[18] ^ var5[22];
        long var58 = var56 ^ var5[24];
        long var60 = var54 ^ var58;
        arg2[3] = var60;
        long var62 = var5[7] ^ var5[8];
        long var64 = var62 ^ var5[9];
        long var66 = var64 ^ var5[17];
        arg2[8] = var66;
        long var68 = var64 ^ var46;
        long var70 = var5[15] ^ var5[16];
        long var72 = var68 ^ var70;
        arg2[7] = var72;
        long var74 = var72 ^ var34;
        long var76 = var5[19] ^ var5[20];
        long var78 = var5[25] ^ var5[24];
        long var80 = var5[18] ^ var5[23];
        long var82 = var76 ^ var78;
        long var84 = var82 ^ var80;
        long var86 = var84 ^ var74;
        arg2[4] = var86;
        long var88 = var42 ^ var66;
        long var90 = var82 ^ var88;
        long var92 = var5[21] ^ var5[22];
        long var94 = var90 ^ var92;
        arg2[5] = var94;
        long var96 = var50 ^ var5[0];
        long var98 = var96 ^ var5[9];
        long var100 = var98 ^ var52;
        long var102 = var100 ^ var5[21];
        long var104 = var102 ^ var5[23];
        long var106 = var104 ^ var5[25];
        arg2[6] = var106;
        implCompactExt(arg2);
    }

    public static void reduce37(long[] arg0, int arg1) {
        long var2 = arg0[arg1 + 4];
        long var4 = var2 >>> 27;
        arg0[arg1] ^= var4 ^ var4 << 5 ^ var4 << 7 ^ var4 << 12;
        arg0[arg1 + 4] = var2 & 0x7FFFFFFL;
    }

    public static void implSquare(long[] arg0, long[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            Interleave.expand64To128(arg0[var2], arg1, var2 << 1);
        }
        arg1[8] = Interleave.expand32to64((int) arg0[4]);
    }
}
