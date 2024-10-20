package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat160;

public class SecP160R1Field {

    public static final int[] P = new int[] { Integer.MAX_VALUE, -1, -1, -1, -1 };

    public static final int[] PExt = new int[] { 1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1 };

    public static final int[] PExtInv = new int[] { -1, -1073741826, -1, -1, -1, 1, 1 };

    public static final int P4 = -1;

    public static final int PExt9 = -1;

    public static final int PInv = -2147483647;

    public static final long M = 4294967295L;

    public static void add(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat160.add(arg0, arg1, arg2);
        if (var3 != 0 || arg2[4] == -1 && Nat160.gte(arg2, P)) {
            Nat.addWordTo(5, -2147483647, arg2);
        }
    }

    public static void addExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.add(10, arg0, arg1, arg2);
        if ((var3 != 0 || arg2[9] == -1 && Nat.gte(10, arg2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.incAt(10, arg2, PExtInv.length);
        }
    }

    public static void addOne(int[] arg0, int[] arg1) {
        int var2 = Nat.inc(5, arg0, arg1);
        if (var2 != 0 || arg1[4] == -1 && Nat160.gte(arg1, P)) {
            Nat.addWordTo(5, -2147483647, arg1);
        }
    }

    public static int[] fromBigInteger(BigInteger arg0) {
        int[] var1 = Nat160.fromBigInteger(arg0);
        if (var1[4] == -1 && Nat160.gte(var1, P)) {
            Nat160.subFrom(P, var1);
        }
        return var1;
    }

    public static void half(int[] arg0, int[] arg1) {
        if ((arg0[0] & 0x1) == 0) {
            Nat.shiftDownBit(5, arg0, 0, arg1);
        } else {
            int var2 = Nat160.add(arg0, P, arg1);
            Nat.shiftDownBit(5, arg1, var2);
        }
    }

    public static void multiply(int[] arg0, int[] arg1, int[] arg2) {
        int[] var3 = Nat160.createExt();
        Nat160.mul(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void reduce32(int arg0, int[] arg1) {
        if (arg0 != 0 && Nat160.mulWordsAdd(-2147483647, arg0, arg1, 0) != 0 || arg1[4] == -1 && Nat160.gte(arg1, P)) {
            Nat.addWordTo(5, -2147483647, arg1);
        }
    }

    public static void negate(int[] arg0, int[] arg1) {
        if (Nat160.isZero(arg0)) {
            Nat160.zero(arg1);
        } else {
            Nat160.sub(P, arg0, arg1);
        }
    }

    public static void squareN(int[] arg0, int arg1, int[] arg2) {
        int[] var3 = Nat160.createExt();
        Nat160.square(arg0, var3);
        reduce(var3, arg2);
        while (true) {
            arg1--;
            if (arg1 <= 0) {
                return;
            }
            Nat160.square(arg2, var3);
            reduce(var3, arg2);
        }
    }

    public static void square(int[] arg0, int[] arg1) {
        int[] var2 = Nat160.createExt();
        Nat160.square(arg0, var2);
        reduce(var2, arg1);
    }

    public static void twice(int[] arg0, int[] arg1) {
        int var2 = Nat.shiftUpBit(5, arg0, 0, arg1);
        if (var2 != 0 || arg1[4] == -1 && Nat160.gte(arg1, P)) {
            Nat.addWordTo(5, -2147483647, arg1);
        }
    }

    public static void subtract(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat160.sub(arg0, arg1, arg2);
        if (var3 != 0) {
            Nat.subWordFrom(5, -2147483647, arg2);
        }
    }

    public static void subtractExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.sub(10, arg0, arg1, arg2);
        if (var3 != 0 && Nat.subFrom(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.decAt(10, arg2, PExtInv.length);
        }
    }

    public static void multiplyAddToExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat160.mulAddTo(arg0, arg1, arg2);
        if ((var3 != 0 || arg2[9] == -1 && Nat.gte(10, arg2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.incAt(10, arg2, PExtInv.length);
        }
    }

    public static void reduce(int[] arg0, int[] arg1) {
        long var2 = (long) arg0[5] & 0xFFFFFFFFL;
        long var4 = (long) arg0[6] & 0xFFFFFFFFL;
        long var6 = (long) arg0[7] & 0xFFFFFFFFL;
        long var8 = (long) arg0[8] & 0xFFFFFFFFL;
        long var10 = (long) arg0[9] & 0xFFFFFFFFL;
        long var12 = 0L;
        long var14 = (var2 << 31) + ((long) arg0[0] & 0xFFFFFFFFL) + var2 + var12;
        arg1[0] = (int) var14;
        long var16 = var14 >>> 32;
        long var18 = (var4 << 31) + ((long) arg0[1] & 0xFFFFFFFFL) + var4 + var16;
        arg1[1] = (int) var18;
        long var20 = var18 >>> 32;
        long var22 = (var6 << 31) + ((long) arg0[2] & 0xFFFFFFFFL) + var6 + var20;
        arg1[2] = (int) var22;
        long var24 = var22 >>> 32;
        long var26 = (var8 << 31) + ((long) arg0[3] & 0xFFFFFFFFL) + var8 + var24;
        arg1[3] = (int) var26;
        long var28 = var26 >>> 32;
        long var30 = (var10 << 31) + ((long) arg0[4] & 0xFFFFFFFFL) + var10 + var28;
        arg1[4] = (int) var30;
        long var32 = var30 >>> 32;
        reduce32((int) var32, arg1);
    }
}
