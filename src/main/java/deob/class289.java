package deob;

@ObfuscatedName("kf")
public class class289 {

    @ObfuscatedName("kf.f")
    public static int[] field3341;

    static {
        new Object();
        field3341 = new int[33];
        field3341[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field3341[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class289() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ah.f(IB)I")
    public static int method844(int arg0) {
        return field3341[arg0];
    }

    @ObfuscatedName("ne.w(IB)I")
    public static int method6463(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("li.v(IIII)I")
    public static int method5924(int arg0, int arg1, int arg2) {
        int var3 = method844(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 & ~var4;
    }

    @ObfuscatedName("ee.s(IIII)I")
    public static int method3096(int arg0, int arg1, int arg2) {
        int var3 = method844(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 | var4;
    }

    @ObfuscatedName("z.z(IB)I")
    public static int method16(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }

    @ObfuscatedName("dy.i(IIB)I")
    public static int method2744(int arg0, int arg1) {
        int var2 = 0;
        while (arg1 > 0) {
            var2 = var2 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var2;
    }

    @ObfuscatedName("gn.n(II)J")
    public static long method3570(int arg0) {
        if (arg0 > 63) {
            throw new class368("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[] { arg0 });
        }
        return (long) Math.pow(2.0D, (double) arg0) - 1L;
    }
}
