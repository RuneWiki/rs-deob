package deob;

@ObfuscatedName("ea")
public class class155 {

    @ObfuscatedName("ea.g")
    public static int[] field2682 = new int[32];

    @ObfuscatedName("ea.i")
    public static int[] field2683;

    @ObfuscatedName("ea.k")
    public static int[] field2684;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2682[var1] = var0 - 1;
            var0 += var0;
        }
        field2683 = new int[2000];
        field2684 = new int[2000];
    }

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("al.g(IB)I")
    public static int method879(int arg0) {
        class42 var1 = class42.method2377(arg0);
        int var2 = var1.field983;
        int var3 = var1.field981;
        int var4 = var1.field982;
        int var5 = field2682[var4 - var3];
        return field2684[var2] >> var3 & var5;
    }

    @ObfuscatedName("v.i(III)V")
    public static void method479(int arg0, int arg1) {
        class42 var2 = class42.method2377(arg0);
        int var3 = var2.field983;
        int var4 = var2.field981;
        int var5 = var2.field982;
        int var6 = field2682[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2684[var3] = field2684[var3] & ~var7 | arg1 << var4 & var7;
    }
}
