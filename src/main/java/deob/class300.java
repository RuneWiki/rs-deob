package deob;

@ObfuscatedName("ke")
public class class300 {

    @ObfuscatedName("ke.f")
    public static int[] field3461 = new int[32];

    @ObfuscatedName("ke.w")
    public static int[] field3460;

    @ObfuscatedName("ke.v")
    public static int[] field3459;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3461[var1] = var0 - 1;
            var0 += var0;
        }
        field3460 = new int[4000];
        field3459 = new int[4000];
    }

    public class300() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bc.f(II)I")
    public static int method2093(int arg0) {
        class196 var1 = class196.method3300(arg0);
        int var2 = var1.field2112;
        int var3 = var1.field2113;
        int var4 = var1.field2114;
        int var5 = field3461[var4 - var3];
        return field3459[var2] >> var3 & var5;
    }

    @ObfuscatedName("jd.w(IIB)V")
    public static void method4988(int arg0, int arg1) {
        class196 var2 = class196.method3300(arg0);
        int var3 = var2.field2112;
        int var4 = var2.field2113;
        int var5 = var2.field2114;
        int var6 = field3461[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field3459[var3] = field3459[var3] & ~var7 | arg1 << var4 & var7;
    }
}
