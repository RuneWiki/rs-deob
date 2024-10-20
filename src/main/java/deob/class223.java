package deob;

@ObfuscatedName("hy")
public class class223 {

    @ObfuscatedName("hy.s")
    public static int[] field2712 = new int[32];

    @ObfuscatedName("hy.g")
    public static int[] field2711;

    @ObfuscatedName("hy.m")
    public static int[] field2713;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2712[var1] = var0 - 1;
            var0 += var0;
        }
        field2711 = new int[2000];
        field2713 = new int[2000];
    }

    public class223() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.s(II)I")
    public static int method51(int arg0) {
        class262 var1 = class262.method3071(arg0);
        int var2 = var1.field3463;
        int var3 = var1.field3464;
        int var4 = var1.field3465;
        int var5 = field2712[var4 - var3];
        return field2713[var2] >> var3 & var5;
    }

    @ObfuscatedName("eh.g(III)V")
    public static void method2913(int arg0, int arg1) {
        class262 var2 = class262.method3071(arg0);
        int var3 = var2.field3463;
        int var4 = var2.field3464;
        int var5 = var2.field3465;
        int var6 = field2712[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2713[var3] = field2713[var3] & ~var7 | arg1 << var4 & var7;
    }
}
