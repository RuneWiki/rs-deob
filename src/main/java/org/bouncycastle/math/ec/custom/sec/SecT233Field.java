package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat256;

public class SecT233Field {

    public static final long M41 = 2199023255551L;

    public static final long M59 = 576460752303423487L;

    public static long[] fromBigInteger(BigInteger arg0) {
        long[] var1 = Nat256.fromBigInteger64(arg0);
        reduce23(var1, 0);
        return var1;
    }

    public static void add(long[] arg0, long[] arg1, long[] arg2) {
        arg2[0] = arg0[0] ^ arg1[0];
        arg2[1] = arg0[1] ^ arg1[1];
        arg2[2] = arg0[2] ^ arg1[2];
        arg2[3] = arg0[3] ^ arg1[3];
    }

    public static int trace(long[] arg0) {
        return (int) (arg0[0] ^ arg0[2] >>> 31) & 0x1;
    }

    public static void implExpand(long[] arg0, long[] arg1) {
        long var2 = arg0[0];
        long var4 = arg0[1];
        long var6 = arg0[2];
        long var8 = arg0[3];
        arg1[0] = var2 & 0x7FFFFFFFFFFFFFFL;
        arg1[1] = (var2 >>> 59 ^ var4 << 5) & 0x7FFFFFFFFFFFFFFL;
        arg1[2] = (var4 >>> 54 ^ var6 << 10) & 0x7FFFFFFFFFFFFFFL;
        arg1[3] = var6 >>> 49 ^ var8 << 15;
    }

    public static void reduce23(long[] arg0, int arg1) {
        long var2 = arg0[arg1 + 3];
        long var4 = var2 >>> 41;
        arg0[arg1] ^= var4;
        arg0[arg1 + 1] ^= var4 << 10;
        arg0[arg1 + 3] = var2 & 0x1FFFFFFFFFFL;
    }

    public static void invert(long[] arg0, long[] arg1) {
        if (Nat256.isZero64(arg0)) {
            throw new IllegalStateException();
        }
        long[] var2 = Nat256.create64();
        long[] var3 = Nat256.create64();
        square(arg0, var2);
        multiply(var2, arg0, var2);
        square(var2, var2);
        multiply(var2, arg0, var2);
        squareN(var2, 3, var3);
        multiply(var3, var2, var3);
        square(var3, var3);
        multiply(var3, arg0, var3);
        squareN(var3, 7, var2);
        multiply(var2, var3, var2);
        squareN(var2, 14, var3);
        multiply(var3, var2, var3);
        square(var3, var3);
        multiply(var3, arg0, var3);
        squareN(var3, 29, var2);
        multiply(var2, var3, var2);
        squareN(var2, 58, var3);
        multiply(var3, var2, var3);
        squareN(var3, 116, var2);
        multiply(var2, var3, var2);
        square(var2, arg1);
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

    public static void addExt(long[] arg0, long[] arg1, long[] arg2) {
        arg2[0] = arg0[0] ^ arg1[0];
        arg2[1] = arg0[1] ^ arg1[1];
        arg2[2] = arg0[2] ^ arg1[2];
        arg2[3] = arg0[3] ^ arg1[3];
        arg2[4] = arg0[4] ^ arg1[4];
        arg2[5] = arg0[5] ^ arg1[5];
        arg2[6] = arg0[6] ^ arg1[6];
        arg2[7] = arg0[7] ^ arg1[7];
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
        long var18 = var16 >>> 27;
        long var20 = var16 ^ (var8 >>> 27 | var16 << 37);
        long var22 = var8 ^ var8 << 37;
        long[] var24 = Nat256.createExt64();
        int[] var25 = new int[] { 32, 117, 191 };
        for (int var26 = 0; var26 < var25.length; var26++) {
            int var27 = var25[var26] >>> 6;
            int var28 = var25[var26] & 0x3F;
            var24[var27] ^= var22 << var28;
            var24[var27 + 1] ^= var20 << var28 | var22 >>> -var28;
            var24[var27 + 2] ^= var18 << var28 | var20 >>> -var28;
            var24[var27 + 3] ^= var18 >>> -var28;
        }
        reduce(var24, arg1);
        arg1[0] ^= var6;
        arg1[1] ^= var14;
    }

    public static void square(long[] arg0, long[] arg1) {
        long[] var2 = Nat256.createExt64();
        implSquare(arg0, var2);
        reduce(var2, arg1);
    }

    public static void squareAddToExt(long[] arg0, long[] arg1) {
        long[] var2 = Nat256.createExt64();
        implSquare(arg0, var2);
        addExt(arg1, var2, arg1);
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

    public static void reduce(long[] arg0, long[] arg1) {
        long var2 = arg0[0];
        long var4 = arg0[1];
        long var6 = arg0[2];
        long var8 = arg0[3];
        long var10 = arg0[4];
        long var12 = arg0[5];
        long var14 = arg0[6];
        long var16 = arg0[7];
        long var18 = var8 ^ var16 << 23;
        long var20 = var10 ^ var16 >>> 41 ^ var16 << 33;
        long var22 = var12 ^ var16 >>> 31;
        long var24 = var6 ^ var14 << 23;
        long var26 = var18 ^ var14 >>> 41 ^ var14 << 33;
        long var28 = var20 ^ var14 >>> 31;
        long var30 = var4 ^ var22 << 23;
        long var32 = var24 ^ var22 >>> 41 ^ var22 << 33;
        long var34 = var26 ^ var22 >>> 31;
        long var36 = var2 ^ var28 << 23;
        long var38 = var30 ^ var28 >>> 41 ^ var28 << 33;
        long var40 = var32 ^ var28 >>> 31;
        long var42 = var34 >>> 41;
        arg1[0] = var36 ^ var42;
        arg1[1] = var38 ^ var42 << 10;
        arg1[2] = var40;
        arg1[3] = var34 & 0x1FFFFFFFFFFL;
    }

    public static void multiplyAddToExt(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = Nat256.createExt64();
        implMultiply(arg0, arg1, var3);
        addExt(arg2, var3, arg2);
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
        int var12 = 54;
        do {
            int var13 = (int) (arg0 >>> var12);
            long var14 = var6[var13 & 0x7] ^ var6[var13 >>> 3 & 0x7] << 3;
            var10 ^= var14 << var12;
            var8 ^= var14 >>> -var12;
            var12 -= 6;
        } while (var12 > 0);
        arg2[arg3] ^= var10 & 0x7FFFFFFFFFFFFFFL;
        arg2[arg3 + 1] ^= var10 >>> 59 ^ var8 << 5;
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

    public static void implCompactExt(long[] arg0) {
        long var1 = arg0[0];
        long var3 = arg0[1];
        long var5 = arg0[2];
        long var7 = arg0[3];
        long var9 = arg0[4];
        long var11 = arg0[5];
        long var13 = arg0[6];
        long var15 = arg0[7];
        arg0[0] = var1 ^ var3 << 59;
        arg0[1] = var3 >>> 5 ^ var5 << 54;
        arg0[2] = var5 >>> 10 ^ var7 << 49;
        arg0[3] = var7 >>> 15 ^ var9 << 44;
        arg0[4] = var9 >>> 20 ^ var11 << 39;
        arg0[5] = var11 >>> 25 ^ var13 << 34;
        arg0[6] = var13 >>> 30 ^ var15 << 29;
        arg0[7] = var15 >>> 35;
    }

    public static void implSquare(long[] arg0, long[] arg1) {
        Interleave.expand64To128(arg0[0], arg1, 0);
        Interleave.expand64To128(arg0[1], arg1, 2);
        Interleave.expand64To128(arg0[2], arg1, 4);
        long var2 = arg0[3];
        arg1[6] = Interleave.expand32to64((int) var2);
        arg1[7] = (long) Interleave.expand16to32((int) (var2 >>> 32)) & 0xFFFFFFFFL;
    }
}
