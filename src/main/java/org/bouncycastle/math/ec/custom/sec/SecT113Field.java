package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat128;

public class SecT113Field {

    public static final long M49 = 562949953421311L;

    public static final long M57 = 144115188075855871L;

    public static long[] fromBigInteger(BigInteger arg0) {
        long[] var1 = Nat128.fromBigInteger64(arg0);
        reduce15(var1, 0);
        return var1;
    }

    public static void add(long[] arg0, long[] arg1, long[] arg2) {
        arg2[0] = arg0[0] ^ arg1[0];
        arg2[1] = arg0[1] ^ arg1[1];
    }

    public static void reduce(long[] arg0, long[] arg1) {
        long var2 = arg0[0];
        long var4 = arg0[1];
        long var6 = arg0[2];
        long var8 = arg0[3];
        long var10 = var4 ^ var8 << 15 ^ var8 << 24;
        long var12 = var6 ^ var8 >>> 49 ^ var8 >>> 40;
        long var14 = var2 ^ var12 << 15 ^ var12 << 24;
        long var16 = var10 ^ var12 >>> 49 ^ var12 >>> 40;
        long var18 = var16 >>> 49;
        arg1[0] = var14 ^ var18 ^ var18 << 9;
        arg1[1] = var16 & 0x1FFFFFFFFFFFFL;
    }

    public static int trace(long[] arg0) {
        return (int) arg0[0] & 0x1;
    }

    public static void square(long[] arg0, long[] arg1) {
        long[] var2 = Nat128.createExt64();
        implSquare(arg0, var2);
        reduce(var2, arg1);
    }

    public static void multiply(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = Nat128.createExt64();
        implMultiply(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void multiplyAddToExt(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = Nat128.createExt64();
        implMultiply(arg0, arg1, var3);
        addExt(arg2, var3, arg2);
    }

    public static void implSquare(long[] arg0, long[] arg1) {
        Interleave.expand64To128(arg0[0], arg1, 0);
        Interleave.expand64To128(arg0[1], arg1, 2);
    }

    public static void reduce15(long[] arg0, int arg1) {
        long var2 = arg0[arg1 + 1];
        long var4 = var2 >>> 49;
        arg0[arg1] ^= var4 ^ var4 << 9;
        arg0[arg1 + 1] = var2 & 0x1FFFFFFFFFFFFL;
    }

    public static void sqrt(long[] arg0, long[] arg1) {
        long var2 = Interleave.unshuffle(arg0[0]);
        long var4 = Interleave.unshuffle(arg0[1]);
        long var6 = var2 & 0xFFFFFFFFL | var4 << 32;
        long var8 = var2 >>> 32 | var4 & 0xFFFFFFFF00000000L;
        arg1[0] = var6 ^ var8 << 57 ^ var8 << 5;
        arg1[1] = var8 >>> 7 ^ var8 >>> 59;
    }

    public static void addOne(long[] arg0, long[] arg1) {
        arg1[0] = arg0[0] ^ 0x1L;
        arg1[1] = arg0[1];
    }

    public static void squareAddToExt(long[] arg0, long[] arg1) {
        long[] var2 = Nat128.createExt64();
        implSquare(arg0, var2);
        addExt(arg1, var2, arg1);
    }

    public static void squareN(long[] arg0, int arg1, long[] arg2) {
        long[] var3 = Nat128.createExt64();
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

    public static void implMultiply(long[] arg0, long[] arg1, long[] arg2) {
        long var3 = arg0[0];
        long var5 = arg0[1];
        long var7 = (var3 >>> 57 ^ var5 << 7) & 0x1FFFFFFFFFFFFFFL;
        long var9 = var3 & 0x1FFFFFFFFFFFFFFL;
        long var11 = arg1[0];
        long var13 = arg1[1];
        long var15 = (var11 >>> 57 ^ var13 << 7) & 0x1FFFFFFFFFFFFFFL;
        long var17 = var11 & 0x1FFFFFFFFFFFFFFL;
        long[] var19 = new long[6];
        implMulw(var9, var17, var19, 0);
        implMulw(var7, var15, var19, 2);
        implMulw(var9 ^ var7, var17 ^ var15, var19, 4);
        long var20 = var19[1] ^ var19[2];
        long var22 = var19[0];
        long var24 = var19[3];
        long var26 = var19[4] ^ var22 ^ var20;
        long var28 = var19[5] ^ var24 ^ var20;
        arg2[0] = var22 ^ var26 << 57;
        arg2[1] = var26 >>> 7 ^ var28 << 50;
        arg2[2] = var28 >>> 14 ^ var24 << 43;
        arg2[3] = var24 >>> 21;
    }

    public static void addExt(long[] arg0, long[] arg1, long[] arg2) {
        arg2[0] = arg0[0] ^ arg1[0];
        arg2[1] = arg0[1] ^ arg1[1];
        arg2[2] = arg0[2] ^ arg1[2];
        arg2[3] = arg0[3] ^ arg1[3];
    }

    public static void invert(long[] arg0, long[] arg1) {
        if (Nat128.isZero64(arg0)) {
            throw new IllegalStateException();
        }
        long[] var2 = Nat128.create64();
        long[] var3 = Nat128.create64();
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
        squareN(var3, 28, var2);
        multiply(var2, var3, var2);
        squareN(var2, 56, var3);
        multiply(var3, var2, var3);
        square(var3, arg1);
    }
}
