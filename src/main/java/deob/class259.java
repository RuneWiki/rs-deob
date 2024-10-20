package deob;

@ObfuscatedName("ii")
public class class259 {

    @ObfuscatedName("ii.c")
    public static int[] field3050;

    static {
        new Object();
        field3050 = new int[33];
        field3050[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field3050[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class259() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("id.c(III)I")
    public static int method4425(int arg0, int arg1) {
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

    @ObfuscatedName("im.b(II)I")
    public static int method4481(int arg0) {
        return field3050[arg0];
    }

    @ObfuscatedName("lf.p(II)I")
    public static int method5272(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("du.m(IIII)I")
    public static int method2589(int arg0, int arg1, int arg2) {
        int var3 = method4481(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 & ~var4;
    }

    @ObfuscatedName("fw.t(IIII)I")
    public static int method3327(int arg0, int arg1, int arg2) {
        int var3 = method4481(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 | var4;
    }

    @ObfuscatedName("fo.s(IB)I")
    public static int method3053(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }

    @ObfuscatedName("bj.j(II)I")
    public static int method1949(int arg0) {
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

    @ObfuscatedName("ot.w(IIB)I")
    public static int method6419(int arg0, int arg1) {
        int var2 = 0;
        while (arg1 > 0) {
            var2 = var2 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var2;
    }

    @ObfuscatedName("gh.n(IIB)I")
    public static int method3821(int arg0, int arg1) {
        int var2 = arg0 >>> 31;
        return (arg0 + var2) / arg1 - var2;
    }
}
