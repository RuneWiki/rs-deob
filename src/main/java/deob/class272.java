package deob;

@ObfuscatedName("jo")
public class class272 {

    @ObfuscatedName("jo.o")
    public static int[] field3221;

    static {
        new Object();
        field3221 = new int[33];
        field3221[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field3221[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class272() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cq.o(IIB)I")
    public static int method2271(int arg0, int arg1) {
        int var2 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var2 = arg0 * var2;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg0 * var2;
        } else {
            return var2;
        }
    }

    @ObfuscatedName("mt.q(III)I")
    public static int method5646(int arg0, int arg1) {
        if (arg1 > arg0) {
            int var2 = arg0;
            arg0 = arg1;
            arg1 = var2;
        }
        while (arg1 != 0) {
            int var3 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var3;
        }
        return arg0;
    }

    @ObfuscatedName("eg.l(IB)I")
    public static int method2762(int arg0) {
        return field3221[arg0];
    }

    @ObfuscatedName("fe.k(II)I")
    public static int method3035(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("bm.a(IIII)I")
    public static int method1857(int arg0, int arg1, int arg2) {
        int var3 = method2762(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 & ~var4;
    }

    @ObfuscatedName("pi.p(IB)I")
    public static int method6642(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }

    @ObfuscatedName("el.s(IB)I")
    public static int method2747(int arg0) {
        int var1 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var1 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var1 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var1 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var1 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var1++;
        }
        return arg0 + var1;
    }

    @ObfuscatedName("eb.r(III)I")
    public static int method2663(int arg0, int arg1) {
        int var2 = arg0 >>> 31;
        return (arg0 + var2) / arg1 - var2;
    }
}
