package org.bouncycastle.math.raw;

import java.util.Random;

public abstract class Mod {

    public static void invert(int[] arg0, int[] arg1, int[] arg2) {
        int var3 = arg0.length;
        if (Nat.isZero(var3, arg1)) {
            throw new IllegalArgumentException("'x' cannot be 0");
        } else if (Nat.isOne(var3, arg1)) {
            System.arraycopy(arg1, 0, arg2, 0, var3);
        } else {
            int[] var4 = Nat.copy(var3, arg1);
            int[] var5 = Nat.create(var3);
            var5[0] = 1;
            int var6 = 0;
            if ((var4[0] & 0x1) == 0) {
                var6 = inversionStep(arg0, var4, var3, var5, var6);
            }
            if (Nat.isOne(var3, var4)) {
                inversionResult(arg0, var6, var5, arg2);
            } else {
                int[] var7 = Nat.copy(var3, arg0);
                int[] var8 = Nat.create(var3);
                int var9 = 0;
                int var10 = var3;
                while (true) {
                    while (var4[var10 - 1] != 0 || var7[var10 - 1] != 0) {
                        if (Nat.gte(var10, var4, var7)) {
                            Nat.subFrom(var10, var7, var4);
                            int var11 = var6 + (Nat.subFrom(var3, var8, var5) - var9);
                            var6 = inversionStep(arg0, var4, var10, var5, var11);
                            if (Nat.isOne(var10, var4)) {
                                inversionResult(arg0, var6, var5, arg2);
                                return;
                            }
                        } else {
                            Nat.subFrom(var10, var4, var7);
                            int var12 = var9 + (Nat.subFrom(var3, var5, var8) - var6);
                            var9 = inversionStep(arg0, var7, var10, var8, var12);
                            if (Nat.isOne(var10, var7)) {
                                inversionResult(arg0, var9, var8, arg2);
                                return;
                            }
                        }
                    }
                    var10--;
                }
            }
        }
    }

    public static void add(int[] arg0, int[] arg1, int[] arg2, int[] arg3) {
        int var4 = arg0.length;
        int var5 = Nat.add(var4, arg1, arg2, arg3);
        if (var5 != 0) {
            Nat.subFrom(var4, arg0, arg3);
        }
    }

    public static int inverse32(int arg0) {
        int var2 = (2 - arg0 * arg0) * arg0;
        int var3 = (2 - arg0 * var2) * var2;
        int var4 = (2 - arg0 * var3) * var3;
        return (2 - arg0 * var4) * var4;
    }

    public static int[] random(int[] arg0) {
        int var1 = arg0.length;
        Random var2 = new Random();
        int[] var3 = Nat.create(var1);
        int var4 = arg0[var1 - 1];
        int var5 = var4 | var4 >>> 1;
        int var6 = var5 | var5 >>> 2;
        int var7 = var6 | var6 >>> 4;
        int var8 = var7 | var7 >>> 8;
        int var9 = var8 | var8 >>> 16;
        do {
            for (int var10 = 0; var10 != var1; var10++) {
                var3[var10] = var2.nextInt();
            }
            var3[var1 - 1] &= var9;
        } while (Nat.gte(var1, var3, arg0));
        return var3;
    }

    public static void subtract(int[] arg0, int[] arg1, int[] arg2, int[] arg3) {
        int var4 = arg0.length;
        int var5 = Nat.sub(var4, arg1, arg2, arg3);
        if (var5 != 0) {
            Nat.addTo(var4, arg0, arg3);
        }
    }

    public static void inversionResult(int[] arg0, int arg1, int[] arg2, int[] arg3) {
        if (arg1 < 0) {
            Nat.add(arg0.length, arg2, arg0, arg3);
        } else {
            System.arraycopy(arg2, 0, arg3, 0, arg0.length);
        }
    }

    public static int inversionStep(int[] arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        int var5 = arg0.length;
        int var6 = 0;
        while (arg1[0] == 0) {
            Nat.shiftDownWord(arg2, arg1, 0);
            var6 += 32;
        }
        int var7 = getTrailingZeroes(arg1[0]);
        if (var7 > 0) {
            Nat.shiftDownBits(arg2, arg1, var7, 0);
            var6 += var7;
        }
        for (int var8 = 0; var8 < var6; var8++) {
            if ((arg3[0] & 0x1) != 0) {
                if (arg4 < 0) {
                    arg4 += Nat.addTo(var5, arg0, arg3);
                } else {
                    arg4 += Nat.subFrom(var5, arg0, arg3);
                }
            }
            Nat.shiftDownBit(var5, arg3, arg4);
        }
        return arg4;
    }

    public static int getTrailingZeroes(int arg0) {
        int var1 = 0;
        while ((arg0 & 0x1) == 0) {
            arg0 >>>= 0x1;
            var1++;
        }
        return var1;
    }
}
