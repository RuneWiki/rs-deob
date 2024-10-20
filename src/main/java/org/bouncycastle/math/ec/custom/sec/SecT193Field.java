package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat256;

public class SecT193Field {

    public static final long M01 = 1L;

    public static final long M49 = 562949953421311L;

    public static void invert(long[] arg0, long[] arg1) {
        if (Nat256.isZero64(arg0)) {
            throw new IllegalStateException();
        }
        long[] var2 = Nat256.create64();
        long[] var3 = Nat256.create64();
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
        multiply(var2, var3, var2);
        squareN(var2, 24, var3);
        multiply(var2, var3, var2);
        squareN(var2, 48, var3);
        multiply(var2, var3, var2);
        squareN(var2, 96, var3);
        multiply(var2, var3, arg1);
    }

    public static void squareN(long[] arg0, int arg1, long[] arg2) {
        long[] var3 = Nat256.createExt64();
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

    public static void multiply(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = Nat256.createExt64();
        implMultiply(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void addOne(long[] arg0, long[] arg1) {
        arg1[0] = arg0[0] ^ 0x1L;
        arg1[1] = arg0[1];
        arg1[2] = arg0[2];
        arg1[3] = arg0[3];
    }

    public static long[] fromBigInteger(BigInteger arg0) {
        long[] var1 = Nat256.fromBigInteger64(arg0);
        reduce63(var1, 0);
        return var1;
    }

    public static void add(long[] arg0, long[] arg1, long[] arg2) {
        arg2[0] = arg0[0] ^ arg1[0];
        arg2[1] = arg0[1] ^ arg1[1];
        arg2[2] = arg0[2] ^ arg1[2];
        arg2[3] = arg0[3] ^ arg1[3];
    }

    public static void addExt(long[] arg0, long[] arg1, long[] arg2) {
        arg2[0] = arg0[0] ^ arg1[0];
        arg2[1] = arg0[1] ^ arg1[1];
        arg2[2] = arg0[2] ^ arg1[2];
        arg2[3] = arg0[3] ^ arg1[3];
        arg2[4] = arg0[4] ^ arg1[4];
        arg2[5] = arg0[5] ^ arg1[5];
        arg2[6] = arg0[6] ^ arg1[6];
    }

    public static void multiplyAddToExt(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = Nat256.createExt64();
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
        long var16 = var6 ^ var14 << 63;
        long var18 = var8 ^ var14 >>> 1 ^ var14 << 14;
        long var20 = var10 ^ var14 >>> 50;
        long var22 = var4 ^ var12 << 63;
        long var24 = var16 ^ var12 >>> 1 ^ var12 << 14;
        long var26 = var18 ^ var12 >>> 50;
        long var28 = var2 ^ var20 << 63;
        long var30 = var22 ^ var20 >>> 1 ^ var20 << 14;
        long var32 = var24 ^ var20 >>> 50;
        long var34 = var26 >>> 1;
        arg1[0] = var28 ^ var34 ^ var34 << 15;
        arg1[1] = var30 ^ var34 >>> 49;
        arg1[2] = var32;
        arg1[3] = var26 & 0x1L;
    }

    public static void reduce63(long[] arg0, int arg1) {
        long var2 = arg0[arg1 + 3];
        long var4 = var2 >>> 1;
        arg0[arg1] ^= var4 ^ var4 << 15;
        arg0[arg1 + 1] ^= var4 >>> 49;
        arg0[arg1 + 3] = var2 & 0x1L;
    }

    public static void sqrt(long[] arg0, long[] arg1) {
        long var2 = Interleave.unshuffle(arg0[0]);
        long var4 = Interleave.unshuffle(arg0[1]);
        long var6 = var2 & 0xFFFFFFFFL | var4 << 32;
        long var8 = var2 >>> 32 | var4 & 0xFFFFFFFF00000000L;
        long var10 = Interleave.unshuffle(arg0[2]);
        long var12 = var10 & 0xFFFFFFFFL ^ arg0[3] << 32;
        long var14 = var10 >>> 32;
        arg1[0] = var6 ^ var8 << 8;
        arg1[1] = var12 ^ var14 << 8 ^ var8 >>> 56 ^ var8 << 33;
        arg1[2] = var14 >>> 56 ^ var14 << 33 ^ var8 >>> 31;
        arg1[3] = var14 >>> 31;
    }

    public static void square(long[] arg0, long[] arg1) {
        long[] var2 = Nat256.createExt64();
        implSquare(arg0, var2);
        reduce(var2, arg1);
    }

    public static void implMultiply(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = new long[4];
        long[] var4 = new long[4];
        implExpand(arg0, var3);
        implExpand(arg1, var4);
        implMulwAcc(var3[0], var4[0], arg2, 0);
        implMulwAcc(var3[1], var4[1], arg2, 1);
        implMulwAcc(var3[2], var4[2], arg2, 2);
        implMulwAcc(var3[3], var4[3], arg2, 3);
        for (int var5 = 5; var5 > 0; var5--) {
            arg2[var5] ^= arg2[var5 - 1];
        }
        implMulwAcc(var3[0] ^ var3[1], var4[0] ^ var4[1], arg2, 1);
        implMulwAcc(var3[2] ^ var3[3], var4[2] ^ var4[3], arg2, 3);
        for (int var6 = 7; var6 > 1; var6--) {
            arg2[var6] ^= arg2[var6 - 2];
        }
        long var7 = var3[0] ^ var3[2];
        long var9 = var3[1] ^ var3[3];
        long var11 = var4[0] ^ var4[2];
        long var13 = var4[1] ^ var4[3];
        implMulwAcc(var7 ^ var9, var11 ^ var13, arg2, 3);
        long[] var15 = new long[3];
        implMulwAcc(var7, var11, var15, 0);
        implMulwAcc(var9, var13, var15, 1);
        long var16 = var15[0];
        long var18 = var15[1];
        long var20 = var15[2];
        arg2[2] ^= var16;
        arg2[3] ^= var16 ^ var18;
        arg2[4] ^= var20 ^ var18;
        arg2[5] ^= var20;
        implCompactExt(arg2);
    }

    public static void squareAddToExt(long[] arg0, long[] arg1) {
        long[] var2 = Nat256.createExt64();
        implSquare(arg0, var2);
        addExt(arg1, var2, arg1);
    }

    public static int trace(long[] arg0) {
        return (int) arg0[0] & 0x1;
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
        arg0[0] = var1 ^ var3 << 49;
        arg0[1] = var3 >>> 15 ^ var5 << 34;
        arg0[2] = var5 >>> 30 ^ var7 << 19;
        arg0[3] = var7 >>> 45 ^ var9 << 4 ^ var11 << 53;
        arg0[4] = var9 >>> 60 ^ var13 << 38 ^ var11 >>> 11;
        arg0[5] = var13 >>> 26 ^ var15 << 23;
        arg0[6] = var15 >>> 41;
        arg0[7] = 0L;
    }

    public static void implExpand(long[] arg0, long[] arg1) {
        long var2 = arg0[0];
        long var4 = arg0[1];
        long var6 = arg0[2];
        long var8 = arg0[3];
        arg1[0] = var2 & 0x1FFFFFFFFFFFFL;
        arg1[1] = (var2 >>> 49 ^ var4 << 15) & 0x1FFFFFFFFFFFFL;
        arg1[2] = (var4 >>> 34 ^ var6 << 30) & 0x1FFFFFFFFFFFFL;
        arg1[3] = var6 >>> 19 ^ var8 << 45;
    }

    public static void implMulwAcc(long arg0, long arg1, long[] arg2, int arg3) {
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
        long var10 = var6[var7 & 0x7] ^ var6[var7 >>> 3 & 0x7] << 3;
        int var12 = 36;
        do {
            int var13 = (int) (arg0 >>> var12);
            long var14 = var6[var13 & 0x7] ^ var6[var13 >>> 3 & 0x7] << 3 ^ var6[var13 >>> 6 & 0x7] << 6 ^ var6[var13 >>> 9 & 0x7] << 9 ^ var6[var13 >>> 12 & 0x7] << 12;
            var10 ^= var14 << var12;
            var8 ^= var14 >>> -var12;
            var12 -= 15;
        } while (var12 > 0);
        arg2[arg3] ^= var10 & 0x1FFFFFFFFFFFFL;
        arg2[arg3 + 1] ^= var10 >>> 49 ^ var8 << 15;
    }

    public static void implSquare(long[] arg0, long[] arg1) {
        Interleave.expand64To128(arg0[0], arg1, 0);
        Interleave.expand64To128(arg0[1], arg1, 2);
        Interleave.expand64To128(arg0[2], arg1, 4);
        arg1[6] = arg0[3] & 0x1L;
    }
}
