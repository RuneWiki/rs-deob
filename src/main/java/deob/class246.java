package deob;

@ObfuscatedName("if")
public class class246 {

    @ObfuscatedName("if.n")
    public static int[] field2886;

    static {
        new Object();
        field2886 = new int[33];
        field2886[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field2886[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class246() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mj.n(III)I")
    public static int method5615(int arg0, int arg1) {
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

    @ObfuscatedName("dm.c(II)I")
    public static int method2367(int arg0) {
        return field2886[arg0];
    }

    @ObfuscatedName("cv.m(II)I")
    public static int method2094(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("l.k(IIII)I")
    public static int method93(int arg0, int arg1, int arg2) {
        int var3 = method2367(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 & ~var4;
    }

    @ObfuscatedName("be.o(IIII)I")
    public static int method1633(int arg0, int arg1, int arg2) {
        int var3 = method2367(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 | var4;
    }

    @ObfuscatedName("bz.g(II)I")
    public static int method1937(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }

    @ObfuscatedName("fd.z(IB)I")
    public static int method3126(int arg0) {
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
}
