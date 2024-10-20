package deob;

@ObfuscatedName("il")
public class class246 {

    @ObfuscatedName("il.i")
    public static int[] field2909;

    static {
        new Object();
        field2909 = new int[33];
        field2909[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field2909[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class246() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ly.i(III)I")
    public static int method5261(int arg0, int arg1) {
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

    @ObfuscatedName("dz.w(II)I")
    public static int method2425(int arg0) {
        return field2909[arg0];
    }

    @ObfuscatedName("hm.s(II)I")
    public static int method3747(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("iy.a(IIIB)I")
    public static int method4439(int arg0, int arg1, int arg2) {
        int var3 = method2425(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 & ~var4;
    }

    @ObfuscatedName("bh.o(IIIB)I")
    public static int method1087(int arg0, int arg1, int arg2) {
        int var3 = method2425(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 | var4;
    }

    @ObfuscatedName("bv.g(II)I")
    public static int method1815(int arg0) {
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
