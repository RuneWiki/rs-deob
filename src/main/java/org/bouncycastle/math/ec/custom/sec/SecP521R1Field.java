package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat512;

public class SecP521R1Field {

    public static final int[] P = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511 };

    public static final int P16 = 511;

    public static void add(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.add(16, arg0, arg1, arg2) + arg0[16] + arg1[16];
        if (var3 > 511 || var3 == 511 && Nat.eq(16, arg2, P)) {
            int var4 = var3 + Nat.inc(16, arg2);
            var3 = var4 & 0x1FF;
        }
        arg2[16] = var3;
    }

    public static void subtract(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = Nat.sub(16, arg0, arg1, arg2) + arg0[16] - arg1[16];
        if (var3 < 0) {
            int var4 = var3 + Nat.dec(16, arg2);
            var3 = var4 & 0x1FF;
        }
        arg2[16] = var3;
    }

    public static void addOne(int[] arg0, int[] arg1) {
        int var2 = Nat.inc(16, arg0, arg1) + arg0[16];
        if (var2 > 511 || var2 == 511 && Nat.eq(16, arg1, P)) {
            int var3 = var2 + Nat.inc(16, arg1);
            var2 = var3 & 0x1FF;
        }
        arg1[16] = var2;
    }

    public static int[] fromBigInteger(BigInteger arg0) {
        int[] var1 = Nat.fromBigInteger(521, arg0);
        if (Nat.eq(17, var1, P)) {
            Nat.zero(17, var1);
        }
        return var1;
    }

    public static void half(int[] arg0, int[] arg1) {
        int var2 = arg0[16];
        int var3 = Nat.shiftDownBit(16, arg0, var2, arg1);
        arg1[16] = var2 >>> 1 | var3 >>> 23;
    }

    public static void squareN(int[] arg0, int arg1, int[] arg2) {
        int[] var3 = Nat.create(33);
        implSquare(arg0, var3);
        reduce(var3, arg2);
        while (true) {
            arg1--;
            if (arg1 <= 0) {
                return;
            }
            implSquare(arg2, var3);
            reduce(var3, arg2);
        }
    }

    public static void negate(int[] arg0, int[] arg1) {
        if (Nat.isZero(17, arg0)) {
            Nat.zero(17, arg1);
        } else {
            Nat.sub(17, P, arg0, arg1);
        }
    }

    public static void reduce(int[] arg0, int[] arg1) {
        int var2 = arg0[32];
        int var3 = Nat.shiftDownBits(16, arg0, 16, 9, var2, arg1, 0) >>> 23;
        int var4 = (var2 >>> 9) + var3;
        int var5 = var4 + Nat.addTo(16, arg0, arg1);
        if (var5 > 511 || var5 == 511 && Nat.eq(16, arg1, P)) {
            int var6 = var5 + Nat.inc(16, arg1);
            var5 = var6 & 0x1FF;
        }
        arg1[16] = var5;
    }

    public static void multiply(int[] arg0, int[] arg1, int[] arg2) {
        int[] var3 = Nat.create(33);
        implMultiply(arg0, arg1, var3);
        reduce(var3, arg2);
    }

    public static void square(int[] arg0, int[] arg1) {
        int[] var2 = Nat.create(33);
        implSquare(arg0, var2);
        reduce(var2, arg1);
    }

    public static void reduce23(int[] arg0) {
        int var1 = arg0[16];
        int var2 = Nat.addWordTo(16, var1 >>> 9, arg0) + (var1 & 0x1FF);
        if (var2 > 511 || var2 == 511 && Nat.eq(16, arg0, P)) {
            int var3 = var2 + Nat.inc(16, arg0);
            var2 = var3 & 0x1FF;
        }
        arg0[16] = var2;
    }

    public static void twice(int[] arg0, int[] arg1) {
        int var2 = arg0[16];
        int var3 = Nat.shiftUpBit(16, arg0, var2 << 23, arg1) | var2 << 1;
        arg1[16] = var3 & 0x1FF;
    }

    public static void implMultiply(int[] arg0, int[] arg1, int[] arg2) {
        Nat512.mul(arg0, arg1, arg2);
        int var3 = arg0[16];
        int var4 = arg1[16];
        arg2[32] = Nat.mul31BothAdd(16, var3, arg1, var4, arg0, arg2, 16) + var3 * var4;
    }

    public static void implSquare(int[] arg0, int[] arg1) {
        Nat512.square(arg0, arg1);
        int var2 = arg0[16];
        arg1[32] = Nat.mulWordAddTo(16, var2 << 1, arg0, 0, arg1, 16) + var2 * var2;
    }
}
