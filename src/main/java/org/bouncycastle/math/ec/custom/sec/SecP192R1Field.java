package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;

public class SecP192R1Field {

    public static final int[] P = new int[] { -1, -1, -2, -1, -1, -1 };

    public static final int[] PExt = new int[] { 1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1 };

    public static final int[] PExtInv = new int[] { -1, -1, -3, -1, -2, -1, 1, 0, 2 };

    public static final int P5 = -1;

    public static final int PExt11 = -1;

    public static final long M = 4294967295L;

    public static void subPInvFrom(int[] arg0) {
        long var1 = ((long) arg0[0] & 0xFFFFFFFFL) - 1L;
        arg0[0] = (int) var1;
        long var3 = var1 >> 32;
        if (var3 != 0L) {
            long var5 = ((long) arg0[1] & 0xFFFFFFFFL) + var3;
            arg0[1] = (int) var5;
            var3 = var5 >> 32;
        }
        long var7 = ((long) arg0[2] & 0xFFFFFFFFL) - 1L + var3;
        arg0[2] = (int) var7;
        long var9 = var7 >> 32;
        if (var9 != 0L) {
            Nat.decAt(6, arg0, 3);
        }
    }

    public static void reduce(int[] arg0, int[] arg1) {
        long var2 = (long) arg0[6] & 0xFFFFFFFFL;
        long var4 = (long) arg0[7] & 0xFFFFFFFFL;
        long var6 = (long) arg0[8] & 0xFFFFFFFFL;
        long var8 = (long) arg0[9] & 0xFFFFFFFFL;
        long var10 = (long) arg0[10] & 0xFFFFFFFFL;
        long var12 = (long) arg0[11] & 0xFFFFFFFFL;
        long var14 = var2 + var10;
        long var16 = var4 + var12;
        long var18 = 0L;
        long var20 = ((long) arg0[0] & 0xFFFFFFFFL) + var14 + var18;
        int var22 = (int) var20;
        long var23 = var20 >> 32;
        long var25 = ((long) arg0[1] & 0xFFFFFFFFL) + var16 + var23;
        arg1[1] = (int) var25;
        long var27 = var25 >> 32;
        long var29 = var6 + var14;
        long var31 = var8 + var16;
        long var33 = ((long) arg0[2] & 0xFFFFFFFFL) + var29 + var27;
        long var35 = var33 & 0xFFFFFFFFL;
        long var37 = var33 >> 32;
        long var39 = ((long) arg0[3] & 0xFFFFFFFFL) + var31 + var37;
        arg1[3] = (int) var39;
        long var41 = var39 >> 32;
        long var43 = var29 - var2;
        long var45 = var31 - var4;
        long var47 = ((long) arg0[4] & 0xFFFFFFFFL) + var43 + var41;
        arg1[4] = (int) var47;
        long var49 = var47 >> 32;
        long var51 = ((long) arg0[5] & 0xFFFFFFFFL) + var45 + var49;
        arg1[5] = (int) var51;
        long var53 = var51 >> 32;
        long var55 = var35 + var53;
        long var57 = ((long) var22 & 0xFFFFFFFFL) + var53;
        arg1[0] = (int) var57;
        long var59 = var57 >> 32;
        if (var59 != 0L) {
            long var61 = ((long) arg1[1] & 0xFFFFFFFFL) + var59;
            arg1[1] = (int) var61;
            var55 += var61 >> 32;
        }
        arg1[2] = (int) var55;
        long var63 = var55 >> 32;
        if (var63 != 0L && Nat.incAt(6, arg1, 3) != 0 || arg1[5] == -1 && Nat192.gte(arg1, P)) {
            addPInvTo(arg1);
        }
    }

    public static void addExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.add(12, arg0, arg1, arg2);
        if ((var3 != 0 || arg2[11] == -1 && Nat.gte(12, arg2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.incAt(12, arg2, PExtInv.length);
        }
    }

    public static void addOne(int[] arg0, int[] arg1) {
        int var2 = Nat.inc(6, arg0, arg1);
        if (var2 != 0 || arg1[5] == -1 && Nat192.gte(arg1, P)) {
            addPInvTo(arg1);
        }
    }

    public static int[] fromBigInteger(BigInteger arg0) {
        int[] var1 = Nat192.fromBigInteger(arg0);
        if (var1[5] == -1 && Nat192.gte(var1, P)) {
            Nat192.subFrom(P, var1);
        }
        return var1;
    }

    public static void half(int[] arg0, int[] arg1) {
        if ((arg0[0] & 0x1) == 0) {
            Nat.shiftDownBit(6, arg0, 0, arg1);
        } else {
            int var2 = Nat192.add(arg0, P, arg1);
            Nat.shiftDownBit(6, arg1, var2);
        }
    }

    public static void multiply(int[] arg0, int[] arg1, int[] arg2) {
        int[] var3 = Nat192.createExt();
        Nat192.mul(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void square(int[] arg0, int[] arg1) {
        int[] var2 = Nat192.createExt();
        Nat192.square(arg0, var2);
        reduce(var2, arg1);
    }

    public static void negate(int[] arg0, int[] arg1) {
        if (Nat192.isZero(arg0)) {
            Nat192.zero(arg1);
        } else {
            Nat192.sub(P, arg0, arg1);
        }
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
                var8 = var10 >> 32;
            }
            long var12 = ((long) arg1[2] & 0xFFFFFFFFL) + var4 + var8;
            arg1[2] = (int) var12;
            var2 = var12 >> 32;
        }
        if (var2 != 0L && Nat.incAt(6, arg1, 3) != 0 || arg1[5] == -1 && Nat192.gte(arg1, P)) {
            addPInvTo(arg1);
        }
    }

    public static void add(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat192.add(arg0, arg1, arg2);
        if (var3 != 0 || arg2[5] == -1 && Nat192.gte(arg2, P)) {
            addPInvTo(arg2);
        }
    }

    public static void squareN(int[] arg0, int arg1, int[] arg2) {
        int[] var3 = Nat192.createExt();
        Nat192.square(arg0, var3);
        reduce(var3, arg2);
        while (true) {
            arg1--;
            if (arg1 <= 0) {
                return;
            }
            Nat192.square(arg2, var3);
            reduce(var3, arg2);
        }
    }

    public static void subtract(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat192.sub(arg0, arg1, arg2);
        if (var3 != 0) {
            subPInvFrom(arg2);
        }
    }

    public static void subtractExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.sub(12, arg0, arg1, arg2);
        if (var3 != 0 && Nat.subFrom(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.decAt(12, arg2, PExtInv.length);
        }
    }

    public static void twice(int[] arg0, int[] arg1) {
        int var2 = Nat.shiftUpBit(6, arg0, 0, arg1);
        if (var2 != 0 || arg1[5] == -1 && Nat192.gte(arg1, P)) {
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
            var3 = var5 >> 32;
        }
        long var7 = ((long) arg0[2] & 0xFFFFFFFFL) + 1L + var3;
        arg0[2] = (int) var7;
        long var9 = var7 >> 32;
        if (var9 != 0L) {
            Nat.incAt(6, arg0, 3);
        }
    }

    public static void multiplyAddToExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat192.mulAddTo(arg0, arg1, arg2);
        if ((var3 != 0 || arg2[11] == -1 && Nat.gte(12, arg2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.incAt(12, arg2, PExtInv.length);
        }
    }
}
