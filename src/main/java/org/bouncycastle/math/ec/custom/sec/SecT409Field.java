package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat448;

public class SecT409Field {

    public static final long M25 = 33554431L;

    public static final long M59 = 576460752303423487L;

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
        long var21 = arg0[10];
        long var23 = arg0[11];
        long var25 = arg0[12];
        long var27 = arg0[13];
        arg0[0] = var1 ^ var3 << 59;
        arg0[1] = var3 >>> 5 ^ var5 << 54;
        arg0[2] = var5 >>> 10 ^ var7 << 49;
        arg0[3] = var7 >>> 15 ^ var9 << 44;
        arg0[4] = var9 >>> 20 ^ var11 << 39;
        arg0[5] = var11 >>> 25 ^ var13 << 34;
        arg0[6] = var13 >>> 30 ^ var15 << 29;
        arg0[7] = var15 >>> 35 ^ var17 << 24;
        arg0[8] = var17 >>> 40 ^ var19 << 19;
        arg0[9] = var19 >>> 45 ^ var21 << 14;
        arg0[10] = var21 >>> 50 ^ var23 << 9;
        arg0[11] = var23 >>> 55 ^ var25 << 4 ^ var27 << 63;
        arg0[12] = var25 >>> 60 ^ var27 >>> 1;
        arg0[13] = 0L;
    }

    public static void add(long[] arg0, long[] arg1, long[] arg2) {
        arg2[0] = arg0[0] ^ arg1[0];
        arg2[1] = arg0[1] ^ arg1[1];
        arg2[2] = arg0[2] ^ arg1[2];
        arg2[3] = arg0[3] ^ arg1[3];
        arg2[4] = arg0[4] ^ arg1[4];
        arg2[5] = arg0[5] ^ arg1[5];
        arg2[6] = arg0[6] ^ arg1[6];
    }

    public static void addExt(long[] arg0, long[] arg1, long[] arg2) {
        for (int var3 = 0; var3 < 13; var3++) {
            arg2[var3] = arg0[var3] ^ arg1[var3];
        }
    }

    public static void implExpand(long[] arg0, long[] arg1) {
        long var2 = arg0[0];
        long var4 = arg0[1];
        long var6 = arg0[2];
        long var8 = arg0[3];
        long var10 = arg0[4];
        long var12 = arg0[5];
        long var14 = arg0[6];
        arg1[0] = var2 & 0x7FFFFFFFFFFFFFFL;
        arg1[1] = (var2 >>> 59 ^ var4 << 5) & 0x7FFFFFFFFFFFFFFL;
        arg1[2] = (var4 >>> 54 ^ var6 << 10) & 0x7FFFFFFFFFFFFFFL;
        arg1[3] = (var6 >>> 49 ^ var8 << 15) & 0x7FFFFFFFFFFFFFFL;
        arg1[4] = (var8 >>> 44 ^ var10 << 20) & 0x7FFFFFFFFFFFFFFL;
        arg1[5] = (var10 >>> 39 ^ var12 << 25) & 0x7FFFFFFFFFFFFFFL;
        arg1[6] = var12 >>> 34 ^ var14 << 30;
    }

    public static long[] fromBigInteger(BigInteger arg0) {
        long[] var1 = Nat448.fromBigInteger64(arg0);
        reduce39(var1, 0);
        return var1;
    }

    public static void implMulwAcc(long[] arg0, long arg1, long[] arg2, int arg3) {
        long[] var5 = new long[8];
        var5[1] = arg1;
        var5[2] = var5[1] << 1;
        var5[3] = var5[2] ^ arg1;
        var5[4] = var5[2] << 1;
        var5[5] = var5[4] ^ arg1;
        var5[6] = var5[3] << 1;
        var5[7] = var5[6] ^ arg1;
        for (int var6 = 0; var6 < 7; var6++) {
            long var7 = arg0[var6];
            int var9 = (int) var7;
            long var10 = 0L;
            long var12 = var5[var9 & 0x7] ^ var5[var9 >>> 3 & 0x7] << 3;
            int var14 = 54;
            do {
                int var15 = (int) (var7 >>> var14);
                long var16 = var5[var15 & 0x7] ^ var5[var15 >>> 3 & 0x7] << 3;
                var12 ^= var16 << var14;
                var10 ^= var16 >>> -var14;
                var14 -= 6;
            } while (var14 > 0);
            arg2[arg3 + var6] ^= var12 & 0x7FFFFFFFFFFFFFFL;
            arg2[arg3 + var6 + 1] ^= var12 >>> 59 ^ var10 << 5;
        }
    }

    public static void multiply(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = Nat448.createExt64();
        implMultiply(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void multiplyAddToExt(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = Nat448.createExt64();
        implMultiply(arg0, arg1, var3);
        addExt(arg2, var3, arg2);
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
        long var18 = arg0[12];
        long var20 = var12 ^ var18 << 39;
        long var22 = var14 ^ var18 >>> 25 ^ var18 << 62;
        long var24 = var16 ^ var18 >>> 2;
        long var26 = arg0[11];
        long var28 = var10 ^ var26 << 39;
        long var30 = var20 ^ var26 >>> 25 ^ var26 << 62;
        long var32 = var22 ^ var26 >>> 2;
        long var34 = arg0[10];
        long var36 = var8 ^ var34 << 39;
        long var38 = var28 ^ var34 >>> 25 ^ var34 << 62;
        long var40 = var30 ^ var34 >>> 2;
        long var42 = arg0[9];
        long var44 = var6 ^ var42 << 39;
        long var46 = var36 ^ var42 >>> 25 ^ var42 << 62;
        long var48 = var38 ^ var42 >>> 2;
        long var50 = arg0[8];
        long var52 = var4 ^ var50 << 39;
        long var54 = var44 ^ var50 >>> 25 ^ var50 << 62;
        long var56 = var46 ^ var50 >>> 2;
        long var60 = var2 ^ var24 << 39;
        long var62 = var52 ^ var24 >>> 25 ^ var24 << 62;
        long var64 = var54 ^ var24 >>> 2;
        long var66 = var32 >>> 25;
        arg1[0] = var60 ^ var66;
        arg1[1] = var62 ^ var66 << 23;
        arg1[2] = var64;
        arg1[3] = var56;
        arg1[4] = var48;
        arg1[5] = var40;
        arg1[6] = var32 & 0x1FFFFFFL;
    }

    public static void sqrt(long[] arg0, long[] arg1) {
        long var2 = Interleave.unshuffle(arg0[0]);
        long var4 = Interleave.unshuffle(arg0[1]);
        long var6 = var2 & 0xFFFFFFFFL | var4 << 32;
        long var8 = var2 >>> 32 | var4 & 0xFFFFFFFF00000000L;
        long var10 = Interleave.unshuffle(arg0[2]);
        long var12 = Interleave.unshuffle(arg0[3]);
        long var14 = var10 & 0xFFFFFFFFL | var12 << 32;
        long var16 = var10 >>> 32 | var12 & 0xFFFFFFFF00000000L;
        long var18 = Interleave.unshuffle(arg0[4]);
        long var20 = Interleave.unshuffle(arg0[5]);
        long var22 = var18 & 0xFFFFFFFFL | var20 << 32;
        long var24 = var18 >>> 32 | var20 & 0xFFFFFFFF00000000L;
        long var26 = Interleave.unshuffle(arg0[6]);
        long var28 = var26 & 0xFFFFFFFFL;
        long var30 = var26 >>> 32;
        arg1[0] = var6 ^ var8 << 44;
        arg1[1] = var14 ^ var16 << 44 ^ var8 >>> 20;
        arg1[2] = var22 ^ var24 << 44 ^ var16 >>> 20;
        arg1[3] = var28 ^ var30 << 44 ^ var24 >>> 20 ^ var8 << 13;
        arg1[4] = var30 >>> 20 ^ var16 << 13 ^ var8 >>> 51;
        arg1[5] = var24 << 13 ^ var16 >>> 51;
        arg1[6] = var30 << 13 ^ var24 >>> 51;
    }

    public static void square(long[] arg0, long[] arg1) {
        long[] var2 = Nat.create64(13);
        implSquare(arg0, var2);
        reduce(var2, arg1);
    }

    public static void squareAddToExt(long[] arg0, long[] arg1) {
        long[] var2 = Nat.create64(13);
        implSquare(arg0, var2);
        addExt(arg1, var2, arg1);
    }

    public static void squareN(long[] arg0, int arg1, long[] arg2) {
        long[] var3 = Nat.create64(13);
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
        return (int) arg0[0] & 0x1;
    }

    public static void reduce39(long[] arg0, int arg1) {
        long var2 = arg0[arg1 + 6];
        long var4 = var2 >>> 25;
        arg0[arg1] ^= var4;
        arg0[arg1 + 1] ^= var4 << 23;
        arg0[arg1 + 6] = var2 & 0x1FFFFFFL;
    }

    public static void invert(long[] arg0, long[] arg1) {
        if (Nat448.isZero64(arg0)) {
            throw new IllegalStateException();
        }
        long[] var2 = Nat448.create64();
        long[] var3 = Nat448.create64();
        long[] var4 = Nat448.create64();
        square(arg0, var2);
        squareN(var2, 1, var3);
        multiply(var2, var3, var2);
        squareN(var3, 1, var3);
        multiply(var2, var3, var2);
        squareN(var2, 3, var3);
        multiply(var2, var3, var2);
        squareN(var2, 6, var3);
        multiply(var2, var3, var2);
        squareN(var2, 12, var3);
        multiply(var2, var3, var4);
        squareN(var4, 24, var2);
        squareN(var2, 24, var3);
        multiply(var2, var3, var2);
        squareN(var2, 48, var3);
        multiply(var2, var3, var2);
        squareN(var2, 96, var3);
        multiply(var2, var3, var2);
        squareN(var2, 192, var3);
        multiply(var2, var3, var2);
        multiply(var2, var4, arg1);
    }

    public static void implMultiply(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = new long[7];
        long[] var4 = new long[7];
        implExpand(arg0, var3);
        implExpand(arg1, var4);
        for (int var5 = 0; var5 < 7; var5++) {
            implMulwAcc(var3, var4[var5], arg2, var5);
        }
        implCompactExt(arg2);
    }

    public static void addOne(long[] arg0, long[] arg1) {
        arg1[0] = arg0[0] ^ 0x1L;
        arg1[1] = arg0[1];
        arg1[2] = arg0[2];
        arg1[3] = arg0[3];
        arg1[4] = arg0[4];
        arg1[5] = arg0[5];
        arg1[6] = arg0[6];
    }

    public static void implSquare(long[] arg0, long[] arg1) {
        for (int var2 = 0; var2 < 6; var2++) {
            Interleave.expand64To128(arg0[var2], arg1, var2 << 1);
        }
        arg1[12] = Interleave.expand32to64((int) arg0[6]);
    }
}
