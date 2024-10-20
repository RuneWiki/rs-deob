package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat160;

public class SecP160R2Field {

    public static final int[] P = new int[] { -21389, -2, -1, -1, -1 };

    public static final int[] PExt = new int[] { 457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1 };

    public static final int[] PExtInv = new int[] { -457489321, -42779, -2, -1, -1, 42777, 2 };

    public static final int P4 = -1;

    public static final int PExt9 = -1;

    public static final int PInv33 = 21389;

    public static void reduce32(int arg0, int[] arg1) {
        if (arg0 != 0 && Nat160.mul33WordAdd(21389, arg0, arg1, 0) != 0 || arg1[4] == -1 && Nat160.gte(arg1, P)) {
            Nat.add33To(5, 21389, arg1);
        }
    }

    public static void negate(int[] arg0, int[] arg1) {
        if (Nat160.isZero(arg0)) {
            Nat160.zero(arg1);
        } else {
            Nat160.sub(P, arg0, arg1);
        }
    }

    public static void reduce(int[] arg0, int[] arg1) {
        long var2 = Nat160.mul33Add(21389, arg0, 5, arg0, 0, arg1, 0);
        int var4 = Nat160.mul33DWordAdd(21389, var2, arg1, 0);
        if (var4 != 0 || arg1[4] == -1 && Nat160.gte(arg1, P)) {
            Nat.add33To(5, 21389, arg1);
        }
    }

    public static void addOne(int[] arg0, int[] arg1) {
        int var2 = Nat.inc(5, arg0, arg1);
        if (var2 != 0 || arg1[4] == -1 && Nat160.gte(arg1, P)) {
            Nat.add33To(5, 21389, arg1);
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

    public static void multiplyAddToExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat160.mulAddTo(arg0, arg1, arg2);
        if ((var3 != 0 || arg2[9] == -1 && Nat.gte(10, arg2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.incAt(10, arg2, PExtInv.length);
        }
    }

    public static void subtractExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.sub(10, arg0, arg1, arg2);
        if (var3 != 0 && Nat.subFrom(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.decAt(10, arg2, PExtInv.length);
        }
    }

    public static void square(int[] arg0, int[] arg1) {
        int[] var2 = Nat160.createExt();
        Nat160.square(arg0, var2);
        reduce(var2, arg1);
    }

    public static void addExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.add(10, arg0, arg1, arg2);
        if ((var3 != 0 || arg2[9] == -1 && Nat.gte(10, arg2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.incAt(10, arg2, PExtInv.length);
        }
    }

    public static void add(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat160.add(arg0, arg1, arg2);
        if (var3 != 0 || arg2[4] == -1 && Nat160.gte(arg2, P)) {
            Nat.add33To(5, 21389, arg2);
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

    public static void subtract(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat160.sub(arg0, arg1, arg2);
        if (var3 != 0) {
            Nat.sub33From(5, 21389, arg2);
        }
    }

    public static void twice(int[] arg0, int[] arg1) {
        int var2 = Nat.shiftUpBit(5, arg0, 0, arg1);
        if (var2 != 0 || arg1[4] == -1 && Nat160.gte(arg1, P)) {
            Nat.add33To(5, 21389, arg1);
        }
    }
}
