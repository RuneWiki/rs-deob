package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat224;

public class SecP224K1Field {

    public static final int[] P = new int[] { -6803, -2, -1, -1, -1, -1, -1 };

    public static final int[] PExt = new int[] { 46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1 };

    public static final int[] PExtInv = new int[] { -46280809, -13607, -2, -1, -1, -1, -1, 13605, 2 };

    public static final int P6 = -1;

    public static final int PExt13 = -1;

    public static final int PInv33 = 6803;

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

    public static void add(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat224.add(arg0, arg1, arg2);
        if (var3 != 0 || arg2[6] == -1 && Nat224.gte(arg2, P)) {
            Nat.add33To(7, 6803, arg2);
        }
    }

    public static void addExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.add(14, arg0, arg1, arg2);
        if ((var3 != 0 || arg2[13] == -1 && Nat.gte(14, arg2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.incAt(14, arg2, PExtInv.length);
        }
    }

    public static int[] fromBigInteger(BigInteger arg0) {
        int[] var1 = Nat224.fromBigInteger(arg0);
        if (var1[6] == -1 && Nat224.gte(var1, P)) {
            Nat.add33To(7, 6803, var1);
        }
        return var1;
    }

    public static void square(int[] arg0, int[] arg1) {
        int[] var2 = Nat224.createExt();
        Nat224.square(arg0, var2);
        reduce(var2, arg1);
    }

    public static void reduce(int[] arg0, int[] arg1) {
        long var2 = Nat224.mul33Add(6803, arg0, 7, arg0, 0, arg1, 0);
        int var4 = Nat224.mul33DWordAdd(6803, var2, arg1, 0);
        if (var4 != 0 || arg1[6] == -1 && Nat224.gte(arg1, P)) {
            Nat.add33To(7, 6803, arg1);
        }
    }

    public static void multiplyAddToExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat224.mulAddTo(arg0, arg1, arg2);
        if ((var3 != 0 || arg2[13] == -1 && Nat.gte(14, arg2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.incAt(14, arg2, PExtInv.length);
        }
    }

    public static void negate(int[] arg0, int[] arg1) {
        if (Nat224.isZero(arg0)) {
            Nat224.zero(arg1);
        } else {
            Nat224.sub(P, arg0, arg1);
        }
    }

    public static void multiply(int[] arg0, int[] arg1, int[] arg2) {
        int[] var3 = Nat224.createExt();
        Nat224.mul(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void reduce32(int arg0, int[] arg1) {
        if (arg0 != 0 && Nat224.mul33WordAdd(6803, arg0, arg1, 0) != 0 || arg1[6] == -1 && Nat224.gte(arg1, P)) {
            Nat.add33To(7, 6803, arg1);
        }
    }

    public static void half(int[] arg0, int[] arg1) {
        if ((arg0[0] & 0x1) == 0) {
            Nat.shiftDownBit(7, arg0, 0, arg1);
        } else {
            int var2 = Nat224.add(arg0, P, arg1);
            Nat.shiftDownBit(7, arg1, var2);
        }
    }

    public static void addOne(int[] arg0, int[] arg1) {
        int var2 = Nat.inc(7, arg0, arg1);
        if (var2 != 0 || arg1[6] == -1 && Nat224.gte(arg1, P)) {
            Nat.add33To(7, 6803, arg1);
        }
    }

    public static void subtract(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat224.sub(arg0, arg1, arg2);
        if (var3 != 0) {
            Nat.sub33From(7, 6803, arg2);
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
            Nat.add33To(7, 6803, arg1);
        }
    }
}
