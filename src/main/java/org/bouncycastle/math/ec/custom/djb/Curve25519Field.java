package org.bouncycastle.math.ec.custom.djb;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

public class Curve25519Field {

    public static final int[] P = new int[] { -19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE };

    public static final int[] PExt = new int[] { 361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823 };

    public static final int P7 = Integer.MAX_VALUE;

    public static final int PInv = 19;

    public static final long M = 4294967295L;

    public static void addOne(int[] arg0, int[] arg1) {
        Nat.inc(8, arg0, arg1);
        if (Nat256.gte(arg1, P)) {
            subPFrom(arg1);
        }
    }

    public static void negate(int[] arg0, int[] arg1) {
        if (Nat256.isZero(arg0)) {
            Nat256.zero(arg1);
        } else {
            Nat256.sub(P, arg0, arg1);
        }
    }

    public static void squareN(int[] arg0, int arg1, int[] arg2) {
        int[] var3 = Nat256.createExt();
        Nat256.square(arg0, var3);
        reduce(var3, arg2);
        while (true) {
            arg1--;
            if (arg1 <= 0) {
                return;
            }
            Nat256.square(arg2, var3);
            reduce(var3, arg2);
        }
    }

    public static void subtract(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat256.sub(arg0, arg1, arg2);
        if (var3 != 0) {
            addPTo(arg2);
        }
    }

    public static int[] fromBigInteger(BigInteger arg0) {
        int[] var1 = Nat256.fromBigInteger(arg0);
        while (Nat256.gte(var1, P)) {
            Nat256.subFrom(P, var1);
        }
        return var1;
    }

    public static void half(int[] arg0, int[] arg1) {
        if ((arg0[0] & 0x1) == 0) {
            Nat.shiftDownBit(8, arg0, 0, arg1);
        } else {
            Nat256.add(arg0, P, arg1);
            Nat.shiftDownBit(8, arg1, 0);
        }
    }

    public static void multiply(int[] arg0, int[] arg1, int[] arg2) {
        int[] var3 = Nat256.createExt();
        Nat256.mul(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void multiplyAddToExt(int[] arg0, int[] arg1, int[] arg2) {
        Nat256.mulAddTo(arg0, arg1, arg2);
        if (Nat.gte(16, arg2, PExt)) {
            subPExtFrom(arg2);
        }
    }

    public static int addPExtTo(int[] arg0) {
        long var1 = ((long) PExt[0] & 0xFFFFFFFFL) + ((long) arg0[0] & 0xFFFFFFFFL);
        arg0[0] = (int) var1;
        long var3 = var1 >> 32;
        if (var3 != 0L) {
            var3 = (long) Nat.incAt(8, arg0, 1);
        }
        long var5 = ((long) arg0[8] & 0xFFFFFFFFL) - 19L + var3;
        arg0[8] = (int) var5;
        long var7 = var5 >> 32;
        if (var7 != 0L) {
            var7 = (long) Nat.decAt(15, arg0, 9);
        }
        long var9 = ((long) (PExt[15] + 1) & 0xFFFFFFFFL) + ((long) arg0[15] & 0xFFFFFFFFL) + var7;
        arg0[15] = (int) var9;
        long var11 = var9 >> 32;
        return (int) var11;
    }

    public static void reduce(int[] arg0, int[] arg1) {
        int var2 = arg0[7];
        Nat.shiftUpBit(8, arg0, 8, var2, arg1, 0);
        int var3 = Nat256.mulByWordAddTo(19, arg0, arg1) << 1;
        int var4 = arg1[7];
        int var5 = (var4 >>> 31) - (var2 >>> 31) + var3;
        int var6 = var4 & Integer.MAX_VALUE;
        int var7 = var6 + Nat.addWordTo(7, var5 * 19, arg1);
        arg1[7] = var7;
        if (Nat256.gte(arg1, P)) {
            subPFrom(arg1);
        }
    }

    public static void reduce27(int arg0, int[] arg1) {
        int var2 = arg1[7];
        int var3 = arg0 << 1 | var2 >>> 31;
        int var4 = var2 & Integer.MAX_VALUE;
        int var5 = var4 + Nat.addWordTo(7, var3 * 19, arg1);
        arg1[7] = var5;
        if (Nat256.gte(arg1, P)) {
            subPFrom(arg1);
        }
    }

    public static void square(int[] arg0, int[] arg1) {
        int[] var2 = Nat256.createExt();
        Nat256.square(arg0, var2);
        reduce(var2, arg1);
    }

    public static void add(int[] arg0, int[] arg1, int[] arg2) {
        Nat256.add(arg0, arg1, arg2);
        if (Nat256.gte(arg2, P)) {
            subPFrom(arg2);
        }
    }

    public static int addPTo(int[] arg0) {
        long var1 = ((long) arg0[0] & 0xFFFFFFFFL) - 19L;
        arg0[0] = (int) var1;
        long var3 = var1 >> 32;
        if (var3 != 0L) {
            var3 = (long) Nat.decAt(7, arg0, 1);
        }
        long var5 = ((long) arg0[7] & 0xFFFFFFFFL) + 2147483648L + var3;
        arg0[7] = (int) var5;
        long var7 = var5 >> 32;
        return (int) var7;
    }

    public static void subtractExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.sub(16, arg0, arg1, arg2);
        if (var3 != 0) {
            addPExtTo(arg2);
        }
    }

    public static int subPFrom(int[] arg0) {
        long var1 = ((long) arg0[0] & 0xFFFFFFFFL) + 19L;
        arg0[0] = (int) var1;
        long var3 = var1 >> 32;
        if (var3 != 0L) {
            var3 = (long) Nat.incAt(7, arg0, 1);
        }
        long var5 = ((long) arg0[7] & 0xFFFFFFFFL) - 2147483648L + var3;
        arg0[7] = (int) var5;
        long var7 = var5 >> 32;
        return (int) var7;
    }

    public static void twice(int[] arg0, int[] arg1) {
        Nat.shiftUpBit(8, arg0, 0, arg1);
        if (Nat256.gte(arg1, P)) {
            subPFrom(arg1);
        }
    }

    public static void addExt(int[] arg0, int[] arg1, int[] arg2) {
        Nat.add(16, arg0, arg1, arg2);
        if (Nat.gte(16, arg2, PExt)) {
            subPExtFrom(arg2);
        }
    }

    public static int subPExtFrom(int[] arg0) {
        long var1 = ((long) arg0[0] & 0xFFFFFFFFL) - ((long) PExt[0] & 0xFFFFFFFFL);
        arg0[0] = (int) var1;
        long var3 = var1 >> 32;
        if (var3 != 0L) {
            var3 = (long) Nat.decAt(8, arg0, 1);
        }
        long var5 = ((long) arg0[8] & 0xFFFFFFFFL) + 19L + var3;
        arg0[8] = (int) var5;
        long var7 = var5 >> 32;
        if (var7 != 0L) {
            var7 = (long) Nat.incAt(15, arg0, 9);
        }
        long var9 = ((long) arg0[15] & 0xFFFFFFFFL) - ((long) (PExt[15] + 1) & 0xFFFFFFFFL) + var7;
        arg0[15] = (int) var9;
        long var11 = var9 >> 32;
        return (int) var11;
    }
}
