package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

public class SecP256K1Field {

    public static final int[] P = new int[] { -977, -2, -1, -1, -1, -1, -1, -1 };

    public static final int[] PExt = new int[] { 954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1 };

    public static final int[] PExtInv = new int[] { -954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2 };

    public static final int P7 = -1;

    public static final int PExt15 = -1;

    public static final int PInv33 = 977;

    public static void add(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat256.add(arg0, arg1, arg2);
        if (var3 != 0 || arg2[7] == -1 && Nat256.gte(arg2, P)) {
            Nat.add33To(8, 977, arg2);
        }
    }

    public static void addExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.add(16, arg0, arg1, arg2);
        if ((var3 != 0 || arg2[15] == -1 && Nat.gte(16, arg2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.incAt(16, arg2, PExtInv.length);
        }
    }

    public static void half(int[] arg0, int[] arg1) {
        if ((arg0[0] & 0x1) == 0) {
            Nat.shiftDownBit(8, arg0, 0, arg1);
        } else {
            int var2 = Nat256.add(arg0, P, arg1);
            Nat.shiftDownBit(8, arg1, var2);
        }
    }

    public static int[] fromBigInteger(BigInteger arg0) {
        int[] var1 = Nat256.fromBigInteger(arg0);
        if (var1[7] == -1 && Nat256.gte(var1, P)) {
            Nat256.subFrom(P, var1);
        }
        return var1;
    }

    public static void reduce32(int arg0, int[] arg1) {
        if (arg0 != 0 && Nat256.mul33WordAdd(977, arg0, arg1, 0) != 0 || arg1[7] == -1 && Nat256.gte(arg1, P)) {
            Nat.add33To(8, 977, arg1);
        }
    }

    public static void multiply(int[] arg0, int[] arg1, int[] arg2) {
        int[] var3 = Nat256.createExt();
        Nat256.mul(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void reduce(int[] arg0, int[] arg1) {
        long var2 = Nat256.mul33Add(977, arg0, 8, arg0, 0, arg1, 0);
        int var4 = Nat256.mul33DWordAdd(977, var2, arg1, 0);
        if (var4 != 0 || arg1[7] == -1 && Nat256.gte(arg1, P)) {
            Nat.add33To(8, 977, arg1);
        }
    }

    public static void negate(int[] arg0, int[] arg1) {
        if (Nat256.isZero(arg0)) {
            Nat256.zero(arg1);
        } else {
            Nat256.sub(P, arg0, arg1);
        }
    }

    public static void addOne(int[] arg0, int[] arg1) {
        int var2 = Nat.inc(8, arg0, arg1);
        if (var2 != 0 || arg1[7] == -1 && Nat256.gte(arg1, P)) {
            Nat.add33To(8, 977, arg1);
        }
    }

    public static void multiplyAddToExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat256.mulAddTo(arg0, arg1, arg2);
        if ((var3 != 0 || arg2[15] == -1 && Nat.gte(16, arg2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.incAt(16, arg2, PExtInv.length);
        }
    }

    public static void square(int[] arg0, int[] arg1) {
        int[] var2 = Nat256.createExt();
        Nat256.square(arg0, var2);
        reduce(var2, arg1);
    }

    public static void subtract(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat256.sub(arg0, arg1, arg2);
        if (var3 != 0) {
            Nat.sub33From(8, 977, arg2);
        }
    }

    public static void subtractExt(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.sub(16, arg0, arg1, arg2);
        if (var3 != 0 && Nat.subFrom(PExtInv.length, PExtInv, arg2) != 0) {
            Nat.decAt(16, arg2, PExtInv.length);
        }
    }

    public static void twice(int[] arg0, int[] arg1) {
        int var2 = Nat.shiftUpBit(8, arg0, 0, arg1);
        if (var2 != 0 || arg1[7] == -1 && Nat256.gte(arg1, P)) {
            Nat.add33To(8, 977, arg1);
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
}
