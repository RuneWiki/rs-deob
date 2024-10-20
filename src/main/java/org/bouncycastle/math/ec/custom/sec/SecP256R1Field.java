package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

public class SecP256R1Field {

    public static final int[] P = new int[] { -1, -1, -1, 0, 0, 0, 1, -1 };

    public static final int[] PExt = new int[] { 1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2 };

    public static final int P7 = -1;

    public static final int PExt15 = -1;

    public static final long M = 4294967295L;

    public static void half(int[] arg0, int[] arg1) {
        if ((arg0[0] & 0x1) == 0) {
            Nat.shiftDownBit(8, arg0, 0, arg1);
        } else {
            int var2 = Nat256.add(arg0, P, arg1);
            Nat.shiftDownBit(8, arg1, var2);
        }
    }

    public static void add(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat256.add(arg0, arg1, arg2);
        if (var3 != 0 || arg2[7] == -1 && Nat256.gte(arg2, P)) {
            addPInvTo(arg2);
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
        long var11 = ((long) arg0[3] & 0xFFFFFFFFL) - 1L + var3;
        arg0[3] = (int) var11;
        long var13 = var11 >> 32;
        if (var13 != 0L) {
            long var15 = ((long) arg0[4] & 0xFFFFFFFFL) + var13;
            arg0[4] = (int) var15;
            long var17 = var15 >> 32;
            long var19 = ((long) arg0[5] & 0xFFFFFFFFL) + var17;
            arg0[5] = (int) var19;
            var13 = var19 >> 32;
        }
        long var21 = ((long) arg0[6] & 0xFFFFFFFFL) - 1L + var13;
        arg0[6] = (int) var21;
        long var23 = var21 >> 32;
        long var25 = ((long) arg0[7] & 0xFFFFFFFFL) + 1L + var23;
        arg0[7] = (int) var25;
    }

    public static void addOne(int[] arg0, int[] arg1) {
        int var2 = Nat.inc(8, arg0, arg1);
        if (var2 != 0 || arg1[7] == -1 && Nat256.gte(arg1, P)) {
            addPInvTo(arg1);
        }
    }

    public static int[] fromBigInteger(BigInteger arg0) {
        int[] var1 = Nat256.fromBigInteger(arg0);
        if (var1[7] == -1 && Nat256.gte(var1, P)) {
            Nat256.subFrom(P, var1);
        }
        return var1;
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
        long var11 = ((long) arg0[3] & 0xFFFFFFFFL) + 1L + var3;
        arg0[3] = (int) var11;
        long var13 = var11 >> 32;
        if (var13 != 0L) {
            long var15 = ((long) arg0[4] & 0xFFFFFFFFL) + var13;
            arg0[4] = (int) var15;
            long var17 = var15 >> 32;
            long var19 = ((long) arg0[5] & 0xFFFFFFFFL) + var17;
            arg0[5] = (int) var19;
            var13 = var19 >> 32;
        }
        long var21 = ((long) arg0[6] & 0xFFFFFFFFL) + 1L + var13;
        arg0[6] = (int) var21;
        long var23 = var21 >> 32;
        long var25 = ((long) arg0[7] & 0xFFFFFFFFL) - 1L + var23;
        arg0[7] = (int) var25;
    }

    public static void multiply(int[] arg0, int[] arg1, int[] arg2) {
        int[] var3 = Nat256.createExt();
        Nat256.mul(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void multiplyAddToExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat256.mulAddTo(arg0, arg1, arg2);
        if (var3 != 0 || arg2[15] == -1 && Nat.gte(16, arg2, PExt)) {
            Nat.subFrom(16, PExt, arg2);
        }
    }

    public static void negate(int[] arg0, int[] arg1) {
        if (Nat256.isZero(arg0)) {
            Nat256.zero(arg1);
        } else {
            Nat256.sub(P, arg0, arg1);
        }
    }

    public static void reduce(int[] arg0, int[] arg1) {
        long var2 = (long) arg0[8] & 0xFFFFFFFFL;
        long var4 = (long) arg0[9] & 0xFFFFFFFFL;
        long var6 = (long) arg0[10] & 0xFFFFFFFFL;
        long var8 = (long) arg0[11] & 0xFFFFFFFFL;
        long var10 = (long) arg0[12] & 0xFFFFFFFFL;
        long var12 = (long) arg0[13] & 0xFFFFFFFFL;
        long var14 = (long) arg0[14] & 0xFFFFFFFFL;
        long var16 = (long) arg0[15] & 0xFFFFFFFFL;
        long var18 = var2 - 6L;
        long var20 = var4 + var18;
        long var22 = var4 + var6;
        long var24 = var6 + var8 - var16;
        long var26 = var8 + var10;
        long var28 = var10 + var12;
        long var30 = var12 + var14;
        long var32 = var14 + var16;
        long var34 = var30 - var20;
        long var36 = 0L;
        long var38 = ((long) arg0[0] & 0xFFFFFFFFL) - var26 - var34 + var36;
        arg1[0] = (int) var38;
        long var40 = var38 >> 32;
        long var42 = ((long) arg0[1] & 0xFFFFFFFFL) + var22 - var28 - var32 + var40;
        arg1[1] = (int) var42;
        long var44 = var42 >> 32;
        long var46 = ((long) arg0[2] & 0xFFFFFFFFL) + var24 - var30 + var44;
        arg1[2] = (int) var46;
        long var48 = var46 >> 32;
        long var50 = (var26 << 1) + ((long) arg0[3] & 0xFFFFFFFFL) + var34 - var32 + var48;
        arg1[3] = (int) var50;
        long var52 = var50 >> 32;
        long var54 = (var28 << 1) + ((long) arg0[4] & 0xFFFFFFFFL) + var14 - var22 + var52;
        arg1[4] = (int) var54;
        long var56 = var54 >> 32;
        long var58 = (var30 << 1) + ((long) arg0[5] & 0xFFFFFFFFL) - var24 + var56;
        arg1[5] = (int) var58;
        long var60 = var58 >> 32;
        long var62 = (var32 << 1) + ((long) arg0[6] & 0xFFFFFFFFL) + var34 + var60;
        arg1[6] = (int) var62;
        long var64 = var62 >> 32;
        long var66 = (var16 << 1) + ((long) arg0[7] & 0xFFFFFFFFL) + var18 - var24 - var28 + var64;
        arg1[7] = (int) var66;
        long var68 = var66 >> 32;
        long var70 = var68 + 6L;
        reduce32((int) var70, arg1);
    }

    public static void reduce32(int arg0, int[] arg1) {
        long var2 = 0L;
        if (arg0 != 0) {
            long var4 = (long) arg0 & 0xFFFFFFFFL;
            long var6 = ((long) arg1[0] & 0xFFFFFFFFL) + var4 + var2;
            arg1[0] = (int) var6;
            long var8 = var6 >> 32;
            if (var8 != 0L) {
                long var10 = ((long) arg1[1] & 0xFFFFFFFFL) + var8;
                arg1[1] = (int) var10;
                long var12 = var10 >> 32;
                long var14 = ((long) arg1[2] & 0xFFFFFFFFL) + var12;
                arg1[2] = (int) var14;
                var8 = var14 >> 32;
            }
            long var16 = ((long) arg1[3] & 0xFFFFFFFFL) - var4 + var8;
            arg1[3] = (int) var16;
            long var18 = var16 >> 32;
            if (var18 != 0L) {
                long var20 = ((long) arg1[4] & 0xFFFFFFFFL) + var18;
                arg1[4] = (int) var20;
                long var22 = var20 >> 32;
                long var24 = ((long) arg1[5] & 0xFFFFFFFFL) + var22;
                arg1[5] = (int) var24;
                var18 = var24 >> 32;
            }
            long var26 = ((long) arg1[6] & 0xFFFFFFFFL) - var4 + var18;
            arg1[6] = (int) var26;
            long var28 = var26 >> 32;
            long var30 = ((long) arg1[7] & 0xFFFFFFFFL) + var4 + var28;
            arg1[7] = (int) var30;
            var2 = var30 >> 32;
        }
        if (var2 != 0L || arg1[7] == -1 && Nat256.gte(arg1, P)) {
            addPInvTo(arg1);
        }
    }

    public static void twice(int[] arg0, int[] arg1) {
        int var2 = Nat.shiftUpBit(8, arg0, 0, arg1);
        if (var2 != 0 || arg1[7] == -1 && Nat256.gte(arg1, P)) {
            addPInvTo(arg1);
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
            subPInvFrom(arg2);
        }
    }

    public static void square(int[] arg0, int[] arg1) {
        int[] var2 = Nat256.createExt();
        Nat256.square(arg0, var2);
        reduce(var2, arg1);
    }

    public static void subtractExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.sub(16, arg0, arg1, arg2);
        if (var3 != 0) {
            Nat.addTo(16, PExt, arg2);
        }
    }

    public static void addExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.add(16, arg0, arg1, arg2);
        if (var3 != 0 || arg2[15] == -1 && Nat.gte(16, arg2, PExt)) {
            Nat.subFrom(16, PExt, arg2);
        }
    }
}
