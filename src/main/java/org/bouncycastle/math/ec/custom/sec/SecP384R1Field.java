package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat384;

public class SecP384R1Field {

    public static final int[] P = new int[] { -1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1 };

    public static final int[] PExt = new int[] { 1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1 };

    public static final int[] PExtInv = new int[] { -1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2 };

    public static final int P11 = -1;

    public static final int PExt23 = -1;

    public static final long M = 4294967295L;

    public static void multiply(int[] arg0, int[] arg1, int[] arg2) {
        int[] var3 = Nat.create(24);
        Nat384.mul(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void addPInvTo(int[] arg0) {
        long var1 = ((long) arg0[0] & 0xFFFFFFFFL) + 1L;
        arg0[0] = (int) var1;
        long var3 = var1 >> 32;
        long var5 = ((long) arg0[1] & 0xFFFFFFFFL) - 1L + var3;
        arg0[1] = (int) var5;
        long var7 = var5 >> 32;
        if (var7 != 0L) {
            long var9 = ((long) arg0[2] & 0xFFFFFFFFL) + var7;
            arg0[2] = (int) var9;
            var7 = var9 >> 32;
        }
        long var11 = ((long) arg0[3] & 0xFFFFFFFFL) + 1L + var7;
        arg0[3] = (int) var11;
        long var13 = var11 >> 32;
        long var15 = ((long) arg0[4] & 0xFFFFFFFFL) + 1L + var13;
        arg0[4] = (int) var15;
        long var17 = var15 >> 32;
        if (var17 != 0L) {
            Nat.incAt(12, arg0, 5);
        }
    }

    public static void reduce(int[] arg0, int[] arg1) {
        long var2 = (long) arg0[16] & 0xFFFFFFFFL;
        long var4 = (long) arg0[17] & 0xFFFFFFFFL;
        long var6 = (long) arg0[18] & 0xFFFFFFFFL;
        long var8 = (long) arg0[19] & 0xFFFFFFFFL;
        long var10 = (long) arg0[20] & 0xFFFFFFFFL;
        long var12 = (long) arg0[21] & 0xFFFFFFFFL;
        long var14 = (long) arg0[22] & 0xFFFFFFFFL;
        long var16 = (long) arg0[23] & 0xFFFFFFFFL;
        long var18 = ((long) arg0[12] & 0xFFFFFFFFL) + var10 - 1L;
        long var20 = ((long) arg0[13] & 0xFFFFFFFFL) + var14;
        long var22 = ((long) arg0[14] & 0xFFFFFFFFL) + var14 + var16;
        long var24 = ((long) arg0[15] & 0xFFFFFFFFL) + var16;
        long var26 = var4 + var12;
        long var28 = var12 - var16;
        long var30 = var14 - var16;
        long var32 = var18 + var28;
        long var34 = 0L;
        long var36 = ((long) arg0[0] & 0xFFFFFFFFL) + var32 + var34;
        arg1[0] = (int) var36;
        long var38 = var36 >> 32;
        long var40 = ((long) arg0[1] & 0xFFFFFFFFL) + var16 - var18 + var20 + var38;
        arg1[1] = (int) var40;
        long var42 = var40 >> 32;
        long var44 = ((long) arg0[2] & 0xFFFFFFFFL) - var12 - var20 + var22 + var42;
        arg1[2] = (int) var44;
        long var46 = var44 >> 32;
        long var48 = ((long) arg0[3] & 0xFFFFFFFFL) - var22 + var24 + var32 + var46;
        arg1[3] = (int) var48;
        long var50 = var48 >> 32;
        long var52 = ((long) arg0[4] & 0xFFFFFFFFL) + var2 + var12 + var20 - var24 + var32 + var50;
        arg1[4] = (int) var52;
        long var54 = var52 >> 32;
        long var56 = ((long) arg0[5] & 0xFFFFFFFFL) - var2 + var20 + var22 + var26 + var54;
        arg1[5] = (int) var56;
        long var58 = var56 >> 32;
        long var60 = ((long) arg0[6] & 0xFFFFFFFFL) + var6 - var4 + var22 + var24 + var58;
        arg1[6] = (int) var60;
        long var62 = var60 >> 32;
        long var64 = ((long) arg0[7] & 0xFFFFFFFFL) + var2 + var8 - var6 + var24 + var62;
        arg1[7] = (int) var64;
        long var66 = var64 >> 32;
        long var68 = ((long) arg0[8] & 0xFFFFFFFFL) + var2 + var4 + var10 - var8 + var66;
        arg1[8] = (int) var68;
        long var70 = var68 >> 32;
        long var72 = ((long) arg0[9] & 0xFFFFFFFFL) + var6 - var10 + var26 + var70;
        arg1[9] = (int) var72;
        long var74 = var72 >> 32;
        long var76 = ((long) arg0[10] & 0xFFFFFFFFL) + var6 + var8 - var28 + var30 + var74;
        arg1[10] = (int) var76;
        long var78 = var76 >> 32;
        long var80 = ((long) arg0[11] & 0xFFFFFFFFL) + var8 + var10 - var30 + var78;
        arg1[11] = (int) var80;
        long var82 = var80 >> 32;
        long var84 = var82 + 1L;
        reduce32((int) var84, arg1);
    }

    public static void addOne(int[] arg0, int[] arg1) {
        int var2 = Nat.inc(12, arg0, arg1);
        if (var2 != 0 || arg1[11] == -1 && Nat.gte(12, arg1, P)) {
            addPInvTo(arg1);
        }
    }

    public static int[] fromBigInteger(BigInteger arg0) {
        int[] var1 = Nat.fromBigInteger(384, arg0);
        if (var1[11] == -1 && Nat.gte(12, var1, P)) {
            Nat.subFrom(12, P, var1);
        }
        return var1;
    }

    public static void half(int[] arg0, int[] arg1) {
        if ((arg0[0] & 0x1) == 0) {
            Nat.shiftDownBit(12, arg0, 0, arg1);
        } else {
            int var2 = Nat.add(12, arg0, P, arg1);
            Nat.shiftDownBit(12, arg1, var2);
        }
    }

    public static void negate(int[] arg0, int[] arg1) {
        if (Nat.isZero(12, arg0)) {
            Nat.zero(12, arg1);
        } else {
            Nat.sub(12, P, arg0, arg1);
        }
    }

    public static void addExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.add(24, arg0, arg1, arg2);
        if ((var3 != 0 || arg2[23] == -1 && Nat.gte(24, arg2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.incAt(24, arg2, PExtInv.length);
        }
    }

    public static void add(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.add(12, arg0, arg1, arg2);
        if (var3 != 0 || arg2[11] == -1 && Nat.gte(12, arg2, P)) {
            addPInvTo(arg2);
        }
    }

    public static void reduce32(int arg0, int[] arg1) {
        long var2 = 0L;
        if (arg0 != 0) {
            long var4 = (long) arg0 & 0xFFFFFFFFL;
            long var6 = ((long) arg1[0] & 0xFFFFFFFFL) + var4 + var2;
            arg1[0] = (int) var6;
            long var8 = var6 >> 32;
            long var10 = ((long) arg1[1] & 0xFFFFFFFFL) - var4 + var8;
            arg1[1] = (int) var10;
            long var12 = var10 >> 32;
            if (var12 != 0L) {
                long var14 = ((long) arg1[2] & 0xFFFFFFFFL) + var12;
                arg1[2] = (int) var14;
                var12 = var14 >> 32;
            }
            long var16 = ((long) arg1[3] & 0xFFFFFFFFL) + var4 + var12;
            arg1[3] = (int) var16;
            long var18 = var16 >> 32;
            long var20 = ((long) arg1[4] & 0xFFFFFFFFL) + var4 + var18;
            arg1[4] = (int) var20;
            var2 = var20 >> 32;
        }
        if (var2 != 0L && Nat.incAt(12, arg1, 5) != 0 || arg1[11] == -1 && Nat.gte(12, arg1, P)) {
            addPInvTo(arg1);
        }
    }

    public static void square(int[] arg0, int[] arg1) {
        int[] var2 = Nat.create(24);
        Nat384.square(arg0, var2);
        reduce(var2, arg1);
    }

    public static void squareN(int[] arg0, int arg1, int[] arg2) {
        int[] var3 = Nat.create(24);
        Nat384.square(arg0, var3);
        reduce(var3, arg2);
        while (true) {
            arg1--;
            if (arg1 <= 0) {
                return;
            }
            Nat384.square(arg2, var3);
            reduce(var3, arg2);
        }
    }

    public static void subtract(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.sub(12, arg0, arg1, arg2);
        if (var3 != 0) {
            subPInvFrom(arg2);
        }
    }

    public static void subtractExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.sub(24, arg0, arg1, arg2);
        if (var3 != 0 && Nat.subFrom(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.decAt(24, arg2, PExtInv.length);
        }
    }

    public static void twice(int[] arg0, int[] arg1) {
        int var2 = Nat.shiftUpBit(12, arg0, 0, arg1);
        if (var2 != 0 || arg1[11] == -1 && Nat.gte(12, arg1, P)) {
            addPInvTo(arg1);
        }
    }

    public static void subPInvFrom(int[] arg0) {
        long var1 = ((long) arg0[0] & 0xFFFFFFFFL) - 1L;
        arg0[0] = (int) var1;
        long var3 = var1 >> 32;
        long var5 = ((long) arg0[1] & 0xFFFFFFFFL) + 1L + var3;
        arg0[1] = (int) var5;
        long var7 = var5 >> 32;
        if (var7 != 0L) {
            long var9 = ((long) arg0[2] & 0xFFFFFFFFL) + var7;
            arg0[2] = (int) var9;
            var7 = var9 >> 32;
        }
        long var11 = ((long) arg0[3] & 0xFFFFFFFFL) - 1L + var7;
        arg0[3] = (int) var11;
        long var13 = var11 >> 32;
        long var15 = ((long) arg0[4] & 0xFFFFFFFFL) - 1L + var13;
        arg0[4] = (int) var15;
        long var17 = var15 >> 32;
        if (var17 != 0L) {
            Nat.decAt(12, arg0, 5);
        }
    }
}
