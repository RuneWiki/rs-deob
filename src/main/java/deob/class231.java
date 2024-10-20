package deob;

@ObfuscatedName("hi")
public class class231 {

    @ObfuscatedName("hi.v")
    public static int[] field2815;

    static {
        new Object();
        field2815 = new int[33];
        field2815[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field2815[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class231() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fz.n(II)I")
    public static int method2944(int arg0) {
        return field2815[arg0];
    }

    @ObfuscatedName("fl.f(II)I")
    public static int method2908(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("bg.y(IIIS)I")
    public static int method1502(int arg0, int arg1, int arg2) {
        int var3 = method2944(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 & ~var4;
    }

    @ObfuscatedName("ml.p(IIII)I")
    public static int method5480(int arg0, int arg1, int arg2) {
        int var3 = method2944(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 | var4;
    }

    @ObfuscatedName("ce.j(II)I")
    public static int method1933(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }

    @ObfuscatedName("fz.r(II)I")
    public static int method2942(int arg0) {
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
