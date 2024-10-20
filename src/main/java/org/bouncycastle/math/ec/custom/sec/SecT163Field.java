package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat192;

public class SecT163Field {

    public static final long[] ROOT_Z = new long[] { -5270498306774157648L, 5270498306774195053L, 19634136210L };

    public static final long M35 = 34359738367L;

    public static final long M55 = 36028797018963967L;

    public static void sqrt(long[] arg0, long[] arg1) {
        long[] var2 = Nat192.create64();
        long var3 = Interleave.unshuffle(arg0[0]);
        long var5 = Interleave.unshuffle(arg0[1]);
        long var7 = var3 & 0xFFFFFFFFL | var5 << 32;
        var2[0] = var3 >>> 32 | var5 & 0xFFFFFFFF00000000L;
        long var9 = Interleave.unshuffle(arg0[2]);
        long var11 = var9 & 0xFFFFFFFFL;
        var2[1] = var9 >>> 32;
        multiply(var2, ROOT_Z, arg1);
        arg1[0] ^= var7;
        arg1[1] ^= var11;
    }

    public static void addExt(long[] arg0, long[] arg1, long[] arg2) {
        arg2[0] = arg0[0] ^ arg1[0];
        arg2[1] = arg0[1] ^ arg1[1];
        arg2[2] = arg0[2] ^ arg1[2];
        arg2[3] = arg0[3] ^ arg1[3];
        arg2[4] = arg0[4] ^ arg1[4];
        arg2[5] = arg0[5] ^ arg1[5];
    }

    public static void square(long[] arg0, long[] arg1) {
        long[] var2 = Nat192.createExt64();
        implSquare(arg0, var2);
        reduce(var2, arg1);
    }

    public static void addOne(long[] arg0, long[] arg1) {
        arg1[0] = arg0[0] ^ 0x1L;
        arg1[1] = arg0[1];
        arg1[2] = arg0[2];
    }

    public static long[] fromBigInteger(BigInteger arg0) {
        long[] var1 = Nat192.fromBigInteger64(arg0);
        reduce29(var1, 0);
        return var1;
    }

    public static void invert(long[] arg0, long[] arg1) {
        if (Nat192.isZero64(arg0)) {
            throw new IllegalStateException();
        }
        long[] var2 = Nat192.create64();
        long[] var3 = Nat192.create64();
        square(arg0, var2);
        squareN(var2, 1, var3);
        multiply(var2, var3, var2);
        squareN(var3, 1, var3);
        multiply(var2, var3, var2);
        squareN(var2, 3, var3);
        multiply(var2, var3, var2);
        squareN(var3, 3, var3);
        multiply(var2, var3, var2);
        squareN(var2, 9, var3);
        multiply(var2, var3, var2);
        squareN(var3, 9, var3);
        multiply(var2, var3, var2);
        squareN(var2, 27, var3);
        multiply(var2, var3, var2);
        squareN(var3, 27, var3);
        multiply(var2, var3, var2);
        squareN(var2, 81, var3);
        multiply(var2, var3, arg1);
    }

    public static void multiply(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = Nat192.createExt64();
        implMultiply(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void multiplyAddToExt(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = Nat192.createExt64();
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
        long var14 = var6 ^ var12 << 29 ^ var12 << 32 ^ var12 << 35 ^ var12 << 36;
        long var16 = var8 ^ var12 >>> 35 ^ var12 >>> 32 ^ var12 >>> 29 ^ var12 >>> 28;
        long var18 = var4 ^ var10 << 29 ^ var10 << 32 ^ var10 << 35 ^ var10 << 36;
        long var20 = var14 ^ var10 >>> 35 ^ var10 >>> 32 ^ var10 >>> 29 ^ var10 >>> 28;
        long var22 = var2 ^ var16 << 29 ^ var16 << 32 ^ var16 << 35 ^ var16 << 36;
        long var24 = var18 ^ var16 >>> 35 ^ var16 >>> 32 ^ var16 >>> 29 ^ var16 >>> 28;
        long var26 = var20 >>> 35;
        arg1[0] = var22 ^ var26 ^ var26 << 3 ^ var26 << 6 ^ var26 << 7;
        arg1[1] = var24;
        arg1[2] = var20 & 0x7FFFFFFFFL;
    }

    public static void add(long[] arg0, long[] arg1, long[] arg2) {
        arg2[0] = arg0[0] ^ arg1[0];
        arg2[1] = arg0[1] ^ arg1[1];
        arg2[2] = arg0[2] ^ arg1[2];
    }

    public static int trace(long[] arg0) {
        return (int) (arg0[0] ^ arg0[2] >>> 29) & 0x1;
    }

    public static void implSquare(long[] arg0, long[] arg1) {
        Interleave.expand64To128(arg0[0], arg1, 0);
        Interleave.expand64To128(arg0[1], arg1, 2);
        long var2 = arg0[2];
        arg1[4] = Interleave.expand32to64((int) var2);
        arg1[5] = (long) Interleave.expand8to16((int) (var2 >>> 32)) & 0xFFFFFFFFL;
    }

    public static void squareAddToExt(long[] arg0, long[] arg1) {
        long[] var2 = Nat192.createExt64();
        implSquare(arg0, var2);
        addExt(arg1, var2, arg1);
    }

    public static void reduce29(long[] arg0, int arg1) {
        long var2 = arg0[arg1 + 2];
        long var4 = var2 >>> 35;
        arg0[arg1] ^= var4 ^ var4 << 3 ^ var4 << 6 ^ var4 << 7;
        arg0[arg1 + 2] = var2 & 0x7FFFFFFFFL;
    }

    public static void squareN(long[] arg0, int arg1, long[] arg2) {
        long[] var3 = Nat192.createExt64();
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

    public static void implCompactExt(long[] arg0) {
        long var1 = arg0[0];
        long var3 = arg0[1];
        long var5 = arg0[2];
        long var7 = arg0[3];
        long var9 = arg0[4];
        long var11 = arg0[5];
        arg0[0] = var1 ^ var3 << 55;
        arg0[1] = var3 >>> 9 ^ var5 << 46;
        arg0[2] = var5 >>> 18 ^ var7 << 37;
        arg0[3] = var7 >>> 27 ^ var9 << 28;
        arg0[4] = var9 >>> 36 ^ var11 << 19;
        arg0[5] = var11 >>> 45;
    }

    public static void implMultiply(long[] arg0, long[] arg1, long[] arg2) {
        long var3 = arg0[0];
        long var5 = arg0[1];
        long var7 = arg0[2];
        long var9 = var5 >>> 46 ^ var7 << 18;
        long var11 = (var3 >>> 55 ^ var5 << 9) & 0x7FFFFFFFFFFFFFL;
        long var13 = var3 & 0x7FFFFFFFFFFFFFL;
        long var15 = arg1[0];
        long var17 = arg1[1];
        long var19 = arg1[2];
        long var21 = var17 >>> 46 ^ var19 << 18;
        long var23 = (var15 >>> 55 ^ var17 << 9) & 0x7FFFFFFFFFFFFFL;
        long var25 = var15 & 0x7FFFFFFFFFFFFFL;
        long[] var27 = new long[10];
        implMulw(var13, var25, var27, 0);
        implMulw(var9, var21, var27, 2);
        long var28 = var13 ^ var11 ^ var9;
        long var30 = var25 ^ var23 ^ var21;
        implMulw(var28, var30, var27, 4);
        long var32 = var11 << 1 ^ var9 << 2;
        long var34 = var23 << 1 ^ var21 << 2;
        implMulw(var13 ^ var32, var25 ^ var34, var27, 6);
        implMulw(var28 ^ var32, var30 ^ var34, var27, 8);
        long var36 = var27[6] ^ var27[8];
        long var38 = var27[7] ^ var27[9];
        long var40 = var36 << 1 ^ var27[6];
        long var42 = var36 ^ var38 << 1 ^ var27[7];
        long var46 = var27[0];
        long var48 = var27[1] ^ var27[0] ^ var27[4];
        long var50 = var27[1] ^ var27[5];
        long var52 = var46 ^ var40 ^ var27[2] << 4 ^ var27[2] << 1;
        long var54 = var48 ^ var42 ^ var27[3] << 4 ^ var27[3] << 1;
        long var56 = var50 ^ var38;
        long var58 = var54 ^ var52 >>> 55;
        long var60 = var52 & 0x7FFFFFFFFFFFFFL;
        long var62 = var56 ^ var58 >>> 55;
        long var64 = var58 & 0x7FFFFFFFFFFFFFL;
        long var66 = var60 >>> 1 ^ (var64 & 0x1L) << 54;
        long var68 = var64 >>> 1 ^ (var62 & 0x1L) << 54;
        long var70 = var62 >>> 1;
        long var72 = var66 ^ var66 << 1;
        long var74 = var72 ^ var72 << 2;
        long var76 = var74 ^ var74 << 4;
        long var78 = var76 ^ var76 << 8;
        long var80 = var78 ^ var78 << 16;
        long var82 = var80 ^ var80 << 32;
        long var84 = var82 & 0x7FFFFFFFFFFFFFL;
        long var86 = var68 ^ var84 >>> 54;
        long var88 = var86 ^ var86 << 1;
        long var90 = var88 ^ var88 << 2;
        long var92 = var90 ^ var90 << 4;
        long var94 = var92 ^ var92 << 8;
        long var96 = var94 ^ var94 << 16;
        long var98 = var96 ^ var96 << 32;
        long var100 = var98 & 0x7FFFFFFFFFFFFFL;
        long var102 = var70 ^ var100 >>> 54;
        long var104 = var102 ^ var102 << 1;
        long var106 = var104 ^ var104 << 2;
        long var108 = var106 ^ var106 << 4;
        long var110 = var108 ^ var108 << 8;
        long var112 = var110 ^ var110 << 16;
        long var114 = var112 ^ var112 << 32;
        arg2[0] = var46;
        arg2[1] = var48 ^ var84 ^ var27[2];
        arg2[2] = var50 ^ var100 ^ var84 ^ var27[3];
        arg2[3] = var114 ^ var100;
        arg2[4] = var114 ^ var27[2];
        arg2[5] = var27[3];
        implCompactExt(arg2);
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
        long var10 = var6[var7 & 0x3];
        int var12 = 47;
        do {
            int var13 = (int) (arg0 >>> var12);
            long var14 = var6[var13 & 0x7] ^ var6[var13 >>> 3 & 0x7] << 3 ^ var6[var13 >>> 6 & 0x7] << 6;
            var10 ^= var14 << var12;
            var8 ^= var14 >>> -var12;
            var12 -= 9;
        } while (var12 > 0);
        arg2[arg3] = var10 & 0x7FFFFFFFFFFFFFL;
        arg2[arg3 + 1] = var10 >>> 55 ^ var8 << 9;
    }
}
