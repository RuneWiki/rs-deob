package deob;

@ObfuscatedName("jd")
public class class272 {

    @ObfuscatedName("jd.s")
    public static int[] field3186;

    static {
        new Object();
        field3186 = new int[33];
        field3186[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field3186[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class272() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hw.w(II)I")
    public static int method4387(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("ct.v(IIII)I")
    public static int method2210(int arg0, int arg1, int arg2) {
        int var3 = Statics.method166(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 & ~var4;
    }

    @ObfuscatedName("gg.c(IIIB)I")
    public static int method3593(int arg0, int arg1, int arg2) {
        int var3 = Statics.method166(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 | var4;
    }

    @ObfuscatedName("if.q(II)I")
    public static int method4475(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }
}
