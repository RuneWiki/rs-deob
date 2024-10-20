package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat224;

public class SecP224R1Field {

    public static final int[] P = new int[] { 1, 0, 0, -1, -1, -1, -1 };

    public static final int[] PExt = new int[] { 1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1 };

    public static final int[] PExtInv = new int[] { -1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1 };

    public static final int P6 = -1;

    public static final int PExt13 = -1;

    public static final long M = 4294967295L;

    public static void addPInvTo(int[] arg0) {
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
            Nat.incAt(7, arg0, 4);
        }
    }

    public static void addExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.add(14, arg0, arg1, arg2);
        if ((var3 != 0 || arg2[13] == -1 && Nat.gte(14, arg2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.incAt(14, arg2, PExtInv.length);
        }
    }

    public static void multiplyAddToExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat224.mulAddTo(arg0, arg1, arg2);
        if ((var3 != 0 || arg2[13] == -1 && Nat.gte(14, arg2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.incAt(14, arg2, PExtInv.length);
        }
    }

    public static int[] fromBigInteger(BigInteger arg0) {
        int[] var1 = Nat224.fromBigInteger(arg0);
        if (var1[6] == -1 && Nat224.gte(var1, P)) {
            Nat224.subFrom(P, var1);
        }
        return var1;
    }

    public static void half(int[] arg0, int[] arg1) {
        if ((arg0[0] & 0x1) == 0) {
            Nat.shiftDownBit(7, arg0, 0, arg1);
        } else {
            int var2 = Nat224.add(arg0, P, arg1);
            Nat.shiftDownBit(7, arg1, var2);
        }
    }

    public static void multiply(int[] arg0, int[] arg1, int[] arg2) {
        int[] var3 = Nat224.createExt();
        Nat224.mul(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void reduce32(int arg0, int[] arg1) {
        long var2 = 0L;
        if (arg0 != 0) {
            long var4 = (long) arg0 & 0xFFFFFFFFL;
            long var6 = ((long) arg1[0] & 0xFFFFFFFFL) - var4 + var2;
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
            long var16 = ((long) arg1[3] & 0xFFFFFFFFL) + var4 + var8;
            arg1[3] = (int) var16;
            var2 = var16 >> 32;
        }
        if (var2 != 0L && Nat.incAt(7, arg1, 4) != 0 || arg1[6] == -1 && Nat224.gte(arg1, P)) {
            addPInvTo(arg1);
        }
    }

    public static void negate(int[] arg0, int[] arg1) {
        if (Nat224.isZero(arg0)) {
            Nat224.zero(arg1);
        } else {
            Nat224.sub(P, arg0, arg1);
        }
    }

    public static void reduce(int[] arg0, int[] arg1) {
        long var2 = (long) arg0[10] & 0xFFFFFFFFL;
        long var4 = (long) arg0[11] & 0xFFFFFFFFL;
        long var6 = (long) arg0[12] & 0xFFFFFFFFL;
        long var8 = (long) arg0[13] & 0xFFFFFFFFL;
        long var10 = ((long) arg0[7] & 0xFFFFFFFFL) + var4 - 1L;
        long var12 = ((long) arg0[8] & 0xFFFFFFFFL) + var6;
        long var14 = ((long) arg0[9] & 0xFFFFFFFFL) + var8;
        long var16 = 0L;
        long var18 = ((long) arg0[0] & 0xFFFFFFFFL) - var10 + var16;
        long var20 = var18 & 0xFFFFFFFFL;
        long var22 = var18 >> 32;
        long var24 = ((long) arg0[1] & 0xFFFFFFFFL) - var12 + var22;
        arg1[1] = (int) var24;
        long var26 = var24 >> 32;
        long var28 = ((long) arg0[2] & 0xFFFFFFFFL) - var14 + var26;
        arg1[2] = (int) var28;
        long var30 = var28 >> 32;
        long var32 = ((long) arg0[3] & 0xFFFFFFFFL) + var10 - var2 + var30;
        long var34 = var32 & 0xFFFFFFFFL;
        long var36 = var32 >> 32;
        long var38 = ((long) arg0[4] & 0xFFFFFFFFL) + var12 - var4 + var36;
        arg1[4] = (int) var38;
        long var40 = var38 >> 32;
        long var42 = ((long) arg0[5] & 0xFFFFFFFFL) + var14 - var6 + var40;
        arg1[5] = (int) var42;
        long var44 = var42 >> 32;
        long var46 = ((long) arg0[6] & 0xFFFFFFFFL) + var2 - var8 + var44;
        arg1[6] = (int) var46;
        long var48 = var46 >> 32;
        long var50 = var48 + 1L;
        long var52 = var34 + var50;
        long var54 = var20 - var50;
        arg1[0] = (int) var54;
        long var56 = var54 >> 32;
        if (var56 != 0L) {
            long var58 = ((long) arg1[1] & 0xFFFFFFFFL) + var56;
            arg1[1] = (int) var58;
            long var60 = var58 >> 32;
            long var62 = ((long) arg1[2] & 0xFFFFFFFFL) + var60;
            arg1[2] = (int) var62;
            var52 += var62 >> 32;
        }
        arg1[3] = (int) var52;
        long var64 = var52 >> 32;
        if (var64 != 0L && Nat.incAt(7, arg1, 4) != 0 || arg1[6] == -1 && Nat224.gte(arg1, P)) {
            addPInvTo(arg1);
        }
    }

    public static void square(int[] arg0, int[] arg1) {
        int[] var2 = Nat224.createExt();
        Nat224.square(arg0, var2);
        reduce(var2, arg1);
    }

    public static void squareN(int[] arg0, int arg1, int[] arg2) {
        int[] var3 = Nat224.createExt();
        Nat224.square(arg0, var3);
        reduce(var3, arg2);
        while (true) {
            arg1--;
            if (arg1 <= 0) {
                return;
            }
            Nat224.square(arg2, var3);
            reduce(var3, arg2);
        }
    }

    public static void subtract(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat224.sub(arg0, arg1, arg2);
        if (var3 != 0) {
            subPInvFrom(arg2);
        }
    }

    public static void subtractExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.sub(14, arg0, arg1, arg2);
        if (var3 != 0 && Nat.subFrom(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.decAt(14, arg2, PExtInv.length);
        }
    }

    public static void twice(int[] arg0, int[] arg1) {
        int var2 = Nat.shiftUpBit(7, arg0, 0, arg1);
        if (var2 != 0 || arg1[6] == -1 && Nat224.gte(arg1, P)) {
            addPInvTo(arg1);
        }
    }

    public static void addOne(int[] arg0, int[] arg1) {
        int var2 = Nat.inc(7, arg0, arg1);
        if (var2 != 0 || arg1[6] == -1 && Nat224.gte(arg1, P)) {
            addPInvTo(arg1);
        }
    }

    public static void subPInvFrom(int[] arg0) {
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
            Nat.decAt(7, arg0, 4);
        }
    }

    public static void add(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat224.add(arg0, arg1, arg2);
        if (var3 != 0 || arg2[6] == -1 && Nat224.gte(arg2, P)) {
            addPInvTo(arg2);
        }
    }
}
