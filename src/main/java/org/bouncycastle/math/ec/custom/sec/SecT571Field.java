package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat576;

public class SecT571Field {

    public static final long[] ROOT_Z = new long[] { 3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L };

    public static final long M59 = 576460752303423487L;

    public static final long RM = -1190112520884487202L;

    public static void add(long[] arg0, int arg1, long[] arg2, int arg3, long[] arg4, int arg5) {
        for (int var6 = 0; var6 < 9; var6++) {
            arg4[arg5 + var6] = arg0[arg1 + var6] ^ arg2[arg3 + var6];
        }
    }

    public static void add(long[] arg0, long[] arg1, long[] arg2) {
        for (int var3 = 0; var3 < 9; var3++) {
            arg2[var3] = arg0[var3] ^ arg1[var3];
        }
    }

    public static void addBothTo(long[] arg0, int arg1, long[] arg2, int arg3, long[] arg4, int arg5) {
        for (int var6 = 0; var6 < 9; var6++) {
            arg4[arg5 + var6] ^= arg0[arg1 + var6] ^ arg2[arg3 + var6];
        }
    }

    public static void addExt(long[] arg0, long[] arg1, long[] arg2) {
        for (int var3 = 0; var3 < 18; var3++) {
            arg2[var3] = arg0[var3] ^ arg1[var3];
        }
    }

    public static void multiplyAddToExt(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = Nat576.createExt64();
        implMultiply(arg0, arg1, var3);
        addExt(arg2, var3, arg2);
    }

    public static void invert(long[] arg0, long[] arg1) {
        if (Nat576.isZero64(arg0)) {
            throw new IllegalStateException();
        }
        long[] var2 = Nat576.create64();
        long[] var3 = Nat576.create64();
        long[] var4 = Nat576.create64();
        square(arg0, var4);
        square(var4, var2);
        square(var2, var3);
        multiply(var2, var3, var2);
        squareN(var2, 2, var3);
        multiply(var2, var3, var2);
        multiply(var2, var4, var2);
        squareN(var2, 5, var3);
        multiply(var2, var3, var2);
        squareN(var3, 5, var3);
        multiply(var2, var3, var2);
        squareN(var2, 15, var3);
        multiply(var2, var3, var4);
        squareN(var4, 30, var2);
        squareN(var2, 30, var3);
        multiply(var2, var3, var2);
        squareN(var2, 60, var3);
        multiply(var2, var3, var2);
        squareN(var3, 60, var3);
        multiply(var2, var3, var2);
        squareN(var2, 180, var3);
        multiply(var2, var3, var2);
        squareN(var3, 180, var3);
        multiply(var2, var3, var2);
        multiply(var2, var4, arg1);
    }

    public static void multiply(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = Nat576.createExt64();
        implMultiply(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void reduce5(long[] arg0, int arg1) {
        long var2 = arg0[arg1 + 8];
        long var4 = var2 >>> 59;
        arg0[arg1] ^= var4 ^ var4 << 2 ^ var4 << 5 ^ var4 << 10;
        arg0[arg1 + 8] = var2 & 0x7FFFFFFFFFFFFFFL;
    }

    public static void reduce(long[] arg0, long[] arg1) {
        long var2 = arg0[9];
        long var4 = arg0[17];
        long var8 = var2 ^ var4 >>> 59 ^ var4 >>> 57 ^ var4 >>> 54 ^ var4 >>> 49;
        long var10 = arg0[8] ^ var4 << 5 ^ var4 << 7 ^ var4 << 10 ^ var4 << 15;
        for (int var12 = 16; var12 >= 10; var12--) {
            long var13 = arg0[var12];
            arg1[var12 - 8] = var10 ^ var13 >>> 59 ^ var13 >>> 57 ^ var13 >>> 54 ^ var13 >>> 49;
            var10 = arg0[var12 - 9] ^ var13 << 5 ^ var13 << 7 ^ var13 << 10 ^ var13 << 15;
        }
        arg1[1] = var10 ^ var8 >>> 59 ^ var8 >>> 57 ^ var8 >>> 54 ^ var8 >>> 49;
        long var17 = arg0[0] ^ var8 << 5 ^ var8 << 7 ^ var8 << 10 ^ var8 << 15;
        long var19 = arg1[8];
        long var21 = var19 >>> 59;
        arg1[0] = var17 ^ var21 ^ var21 << 2 ^ var21 << 5 ^ var21 << 10;
        arg1[8] = var19 & 0x7FFFFFFFFFFFFFFL;
    }

    public static void implMultiply(long[] arg0, long[] arg1, long[] arg2) {
        long[] var3 = new long[144];
        System.arraycopy(arg1, 0, var3, 9, 9);
        int var4 = 0;
        for (int var5 = 7; var5 > 0; var5--) {
            var4 += 18;
            Nat.shiftUpBit64(9, var3, var4 >>> 1, 0L, var3, var4);
            reduce5(var3, var4);
            add(var3, 9, var3, var4, var3, var4 + 9);
        }
        long[] var6 = new long[var3.length];
        Nat.shiftUpBits64(var3.length, var3, 0, 4, 0L, var6, 0);
        byte var7 = 15;
        for (int var8 = 56; var8 >= 0; var8 -= 8) {
            for (int var9 = 1; var9 < 9; var9 += 2) {
                int var10 = (int) (arg0[var9] >>> var8);
                int var11 = var10 & var7;
                int var12 = var10 >>> 4 & var7;
                addBothTo(var3, var11 * 9, var6, var12 * 9, arg2, var9 - 1);
            }
            Nat.shiftUpBits64(16, arg2, 0, 8, 0L);
        }
        for (int var13 = 56; var13 >= 0; var13 -= 8) {
            for (int var14 = 0; var14 < 9; var14 += 2) {
                int var15 = (int) (arg0[var14] >>> var13);
                int var16 = var15 & var7;
                int var17 = var15 >>> 4 & var7;
                addBothTo(var3, var16 * 9, var6, var17 * 9, arg2, var14);
            }
            if (var13 > 0) {
                Nat.shiftUpBits64(18, arg2, 0, 8, 0L);
            }
        }
    }

    public static void sqrt(long[] arg0, long[] arg1) {
        long[] var2 = Nat576.create64();
        long[] var3 = Nat576.create64();
        int var4 = 0;
        for (int var5 = 0; var5 < 4; var5++) {
            long var6 = Interleave.unshuffle(arg0[var4++]);
            long var8 = Interleave.unshuffle(arg0[var4++]);
            var2[var5] = var6 & 0xFFFFFFFFL | var8 << 32;
            var3[var5] = var6 >>> 32 | var8 & 0xFFFFFFFF00000000L;
        }
        long var10 = Interleave.unshuffle(arg0[var4]);
        var2[4] = var10 & 0xFFFFFFFFL;
        var3[4] = var10 >>> 32;
        multiply(var3, ROOT_Z, arg1);
        add(arg1, var2, arg1);
    }

    public static void square(long[] arg0, long[] arg1) {
        long[] var2 = Nat576.createExt64();
        implSquare(arg0, var2);
        reduce(var2, arg1);
    }

    public static long[] fromBigInteger(BigInteger arg0) {
        long[] var1 = Nat576.fromBigInteger64(arg0);
        reduce5(var1, 0);
        return var1;
    }

    public static void squareN(long[] arg0, int arg1, long[] arg2) {
        long[] var3 = Nat576.createExt64();
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
        return (int) (arg0[0] ^ arg0[8] >>> 49 ^ arg0[8] >>> 57) & 0x1;
    }

    public static void addOne(long[] arg0, long[] arg1) {
        arg1[0] = arg0[0] ^ 0x1L;
        for (int var2 = 1; var2 < 9; var2++) {
            arg1[var2] = arg0[var2];
        }
    }

    public static void implMulwAcc(long[] arg0, long arg1, long[] arg2, int arg3) {
        long[] var5 = new long[32];
        var5[1] = arg1;
        for (int var6 = 2; var6 < 32; var6 += 2) {
            var5[var6] = var5[var6 >>> 1] << 1;
            var5[var6 + 1] = var5[var6] ^ arg1;
        }
        long var7 = 0L;
        for (int var9 = 0; var9 < 9; var9++) {
            long var10 = arg0[var9];
            int var12 = (int) var10;
            long var13 = var7 ^ var5[var12 & 0x1F];
            long var15 = 0L;
            int var17 = 60;
            do {
                int var18 = (int) (var10 >>> var17);
                long var19 = var5[var18 & 0x1F];
                var13 ^= var19 << var17;
                var15 ^= var19 >>> -var17;
                var17 -= 5;
            } while (var17 > 0);
            for (int var21 = 0; var21 < 4; var21++) {
                var10 = (var10 & 0xEF7BDEF7BDEF7BDEL) >>> 1;
                var15 ^= var10 & arg1 << var21 >> 63;
            }
            arg2[arg3 + var9] ^= var13;
            var7 = var15;
        }
        arg2[arg3 + 9] ^= var7;
    }

    public static void implSquare(long[] arg0, long[] arg1) {
        for (int var2 = 0; var2 < 9; var2++) {
            Interleave.expand64To128(arg0[var2], arg1, var2 << 1);
        }
    }

    public static void squareAddToExt(long[] arg0, long[] arg1) {
        long[] var2 = Nat576.createExt64();
        implSquare(arg0, var2);
        addExt(arg1, var2, arg1);
    }
}
