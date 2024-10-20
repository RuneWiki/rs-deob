package deob;

@ObfuscatedName("js")
public class class285 {

    @ObfuscatedName("js.h")
    public static int[] field3330;

    static {
        new Object();
        field3330 = new int[33];
        field3330[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field3330[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class285() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.h(II)I")
    public static int method2235(int arg0) {
        return field3330[arg0];
    }

    @ObfuscatedName("hu.e(II)I")
    public static int method4442(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("fo.v(IIII)I")
    public static int method3041(int arg0, int arg1, int arg2) {
        int var3 = method2235(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 & ~var4;
    }

    @ObfuscatedName("jk.x(IIII)I")
    public static int method4871(int arg0, int arg1, int arg2) {
        int var3 = method2235(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 | var4;
    }

    @ObfuscatedName("qq.m(II)I")
    public static int method7578(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }

    @ObfuscatedName("cj.q(IB)I")
    public static int method2195(int arg0) {
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

    @ObfuscatedName("de.f(III)I")
    public static int method2588(int arg0, int arg1) {
        int var2 = 0;
        while (arg1 > 0) {
            var2 = var2 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var2;
    }

    @ObfuscatedName("gj.r(IIS)I")
    public static int method3314(int arg0, int arg1) {
        int var2 = arg0 >>> 31;
        return (arg0 + var2) / arg1 - var2;
    }

    @ObfuscatedName("nk.u(II)J")
    public static long method6675(int arg0) {
        if (arg0 > 63) {
            throw new class364("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[] { arg0 });
        }
        return (long) Math.pow(2.0D, (double) arg0) - 1L;
    }
}
