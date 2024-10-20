package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat128;
import org.bouncycastle.math.raw.Nat256;

public class SecP128R1Field {

    public static final int[] P = new int[] { -1, -1, -1, -3 };

    public static final int[] PExt = new int[] { 1, 0, 0, 4, -2, -1, 3, -4 };

    public static final int[] PExtInv = new int[] { -1, -1, -1, -5, 1, 0, -4, 3 };

    public static final int P3 = -3;

    public static final int PExt7 = -4;

    public static final long M = 4294967295L;

    public static void square(int[] arg0, int[] arg1) {
        int[] var2 = Nat128.createExt();
        Nat128.square(arg0, var2);
        reduce(var2, arg1);
    }

    public static void add(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat128.add(arg0, arg1, arg2);
        if (var3 != 0 || arg2[3] == -3 && Nat128.gte(arg2, P)) {
            addPInvTo(arg2);
        }
    }

    public static void addExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat256.add(arg0, arg1, arg2);
        if (var3 != 0 || arg2[7] == -4 && Nat256.gte(arg2, PExt)) {
            Nat.addTo(PExtInv.length, PExtInv, arg2);
        }
    }

    public static void addOne(int[] arg0, int[] arg1) {
        int var2 = Nat.inc(4, arg0, arg1);
        if (var2 != 0 || arg1[3] == -3 && Nat128.gte(arg1, P)) {
            addPInvTo(arg1);
        }
    }

    public static int[] fromBigInteger(BigInteger arg0) {
        int[] var1 = Nat128.fromBigInteger(arg0);
        if (var1[3] == -3 && Nat128.gte(var1, P)) {
            Nat128.subFrom(P, var1);
        }
        return var1;
    }

    public static void half(int[] arg0, int[] arg1) {
        if ((arg0[0] & 0x1) == 0) {
            Nat.shiftDownBit(4, arg0, 0, arg1);
        } else {
            int var2 = Nat128.add(arg0, P, arg1);
            Nat.shiftDownBit(4, arg1, var2);
        }
    }

    public static void multiply(int[] arg0, int[] arg1, int[] arg2) {
        int[] var3 = Nat128.createExt();
        Nat128.mul(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void multiplyAddToExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat128.mulAddTo(arg0, arg1, arg2);
        if (var3 != 0 || arg2[7] == -4 && Nat256.gte(arg2, PExt)) {
            Nat.addTo(PExtInv.length, PExtInv, arg2);
        }
    }

    public static void negate(int[] arg0, int[] arg1) {
        if (Nat128.isZero(arg0)) {
            Nat128.zero(arg1);
        } else {
            Nat128.sub(P, arg0, arg1);
        }
    }

    public static void reduce32(int arg0, int[] arg1) {
        while (arg0 != 0) {
            long var2 = (long) arg0 & 0xFFFFFFFFL;
            long var4 = ((long) arg1[0] & 0xFFFFFFFFL) + var2;
            arg1[0] = (int) var4;
            long var6 = var4 >> 32;
            if (var6 != 0L) {
                long var8 = ((long) arg1[1] & 0xFFFFFFFFL) + var6;
                arg1[1] = (int) var8;
                long var10 = var8 >> 32;
                long var12 = ((long) arg1[2] & 0xFFFFFFFFL) + var10;
                arg1[2] = (int) var12;
                var6 = var12 >> 32;
            }
            long var14 = (var2 << 1) + ((long) arg1[3] & 0xFFFFFFFFL) + var6;
            arg1[3] = (int) var14;
            long var16 = var14 >> 32;
            arg0 = (int) var16;
        }
    }

    public static void subPInvFrom(int[] arg0) {
        long var1 = ((long) arg0[0] & 0xFFFFFFFFL) - 1L;
        arg0[0] = (int) var1;
        long var3 = var1 >> 32;
        if (var3 != 0L) {
            long var5 = ((long) arg0[1] & 0xFFFFFFFFL) + var3;
            arg0[1] = (int) var5;
            long var7 = var5 >> 32;
            long var9 = ((long) arg0[2] & 0xFFFFFFFFL) + var7;
            arg0[2] = (int) var9;
            var3 = var9 >> 32;
        }
        long var11 = ((long) arg0[3] & 0xFFFFFFFFL) - 2L + var3;
        arg0[3] = (int) var11;
    }

    public static void squareN(int[] arg0, int arg1, int[] arg2) {
        int[] var3 = Nat128.createExt();
        Nat128.square(arg0, var3);
        reduce(var3, arg2);
        while (true) {
            arg1--;
            if (arg1 <= 0) {
                return;
            }
            Nat128.square(arg2, var3);
            reduce(var3, arg2);
        }
    }

    public static void subtract(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat128.sub(arg0, arg1, arg2);
        if (var3 != 0) {
            subPInvFrom(arg2);
        }
    }

    public static void subtractExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.sub(10, arg0, arg1, arg2);
        if (var3 != 0) {
            Nat.subFrom(PExtInv.length, PExtInv, arg2);
        }
    }

    public static void twice(int[] arg0, int[] arg1) {
        int var2 = Nat.shiftUpBit(4, arg0, 0, arg1);
        if (var2 != 0 || arg1[3] == -3 && Nat128.gte(arg1, P)) {
            addPInvTo(arg1);
        }
    }

    public static void addPInvTo(int[] arg0) {
        long var1 = ((long) arg0[0] & 0xFFFFFFFFL) + 1L;
        arg0[0] = (int) var1;
        long var3 = var1 >> 32;
        if (var3 != 0L) {
            long var5 = ((long) arg0[1] & 0xFFFFFFFFL) + var3;
            arg0[1] = (int) var5;
            long var7 = var5 >> 32;
            long var9 = ((long) arg0[2] & 0xFFFFFFFFL) + var7;
            arg0[2] = (int) var9;
            var3 = var9 >> 32;
        }
        long var11 = ((long) arg0[3] & 0xFFFFFFFFL) + 2L + var3;
        arg0[3] = (int) var11;
    }

    public static void reduce(int[] arg0, int[] arg1) {
        long var2 = (long) arg0[0] & 0xFFFFFFFFL;
        long var4 = (long) arg0[1] & 0xFFFFFFFFL;
        long var6 = (long) arg0[2] & 0xFFFFFFFFL;
        long var8 = (long) arg0[3] & 0xFFFFFFFFL;
        long var10 = (long) arg0[4] & 0xFFFFFFFFL;
        long var12 = (long) arg0[5] & 0xFFFFFFFFL;
        long var14 = (long) arg0[6] & 0xFFFFFFFFL;
        long var16 = (long) arg0[7] & 0xFFFFFFFFL;
        long var18 = var8 + var16;
        long var20 = (var16 << 1) + var14;
        long var22 = var6 + var20;
        long var24 = (var20 << 1) + var12;
        long var26 = var4 + var24;
        long var28 = (var24 << 1) + var10;
        long var30 = var2 + var28;
        long var32 = (var28 << 1) + var18;
        arg1[0] = (int) var30;
        long var34 = (var30 >>> 32) + var26;
        arg1[1] = (int) var34;
        long var36 = (var34 >>> 32) + var22;
        arg1[2] = (int) var36;
        long var38 = (var36 >>> 32) + var32;
        arg1[3] = (int) var38;
        reduce32((int) (var38 >>> 32), arg1);
    }
}
