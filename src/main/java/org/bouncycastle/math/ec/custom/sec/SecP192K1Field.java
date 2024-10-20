package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;

public class SecP192K1Field {

    public static final int[] P = new int[] { -4553, -2, -1, -1, -1, -1 };

    public static final int[] PExt = new int[] { 20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1 };

    public static final int[] PExtInv = new int[] { -20729809, -9107, -2, -1, -1, -1, 9105, 2 };

    public static final int P5 = -1;

    public static final int PExt11 = -1;

    public static final int PInv33 = 4553;

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

    public static void addExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.add(12, arg0, arg1, arg2);
        if ((var3 != 0 || arg2[11] == -1 && Nat.gte(12, arg2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.incAt(12, arg2, PExtInv.length);
        }
    }

    public static void addOne(int[] arg0, int[] arg1) {
        int var2 = Nat.inc(6, arg0, arg1);
        if (var2 != 0 || arg1[5] == -1 && Nat192.gte(arg1, P)) {
            Nat.add33To(6, 4553, arg1);
        }
    }

    public static void reduce(int[] arg0, int[] arg1) {
        long var2 = Nat192.mul33Add(4553, arg0, 6, arg0, 0, arg1, 0);
        int var4 = Nat192.mul33DWordAdd(4553, var2, arg1, 0);
        if (var4 != 0 || arg1[5] == -1 && Nat192.gte(arg1, P)) {
            Nat.add33To(6, 4553, arg1);
        }
    }

    public static void multiplyAddToExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat192.mulAddTo(arg0, arg1, arg2);
        if ((var3 != 0 || arg2[11] == -1 && Nat.gte(12, arg2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.incAt(12, arg2, PExtInv.length);
        }
    }

    public static void negate(int[] arg0, int[] arg1) {
        if (Nat192.isZero(arg0)) {
            Nat192.zero(arg1);
        } else {
            Nat192.sub(P, arg0, arg1);
        }
    }

    public static void multiply(int[] arg0, int[] arg1, int[] arg2) {
        int[] var3 = Nat192.createExt();
        Nat192.mul(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void reduce32(int arg0, int[] arg1) {
        if (arg0 != 0 && Nat192.mul33WordAdd(4553, arg0, arg1, 0) != 0 || arg1[5] == -1 && Nat192.gte(arg1, P)) {
            Nat.add33To(6, 4553, arg1);
        }
    }

    public static void square(int[] arg0, int[] arg1) {
        int[] var2 = Nat192.createExt();
        Nat192.square(arg0, var2);
        reduce(var2, arg1);
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
            Nat.sub33From(6, 4553, arg2);
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
            Nat.add33To(6, 4553, arg1);
        }
    }

    public static void add(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat192.add(arg0, arg1, arg2);
        if (var3 != 0 || arg2[5] == -1 && Nat192.gte(arg2, P)) {
            Nat.add33To(6, 4553, arg2);
        }
    }
}
