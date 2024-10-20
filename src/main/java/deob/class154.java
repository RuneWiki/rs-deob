package deob;

@ObfuscatedName("ez")
public class class154 {

    @ObfuscatedName("ez.g")
    public static int[] field2659 = new int[32];

    @ObfuscatedName("ez.v")
    public static int[] field2662;

    @ObfuscatedName("ez.z")
    public static int[] field2660;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2659[var1] = var0 - 1;
            var0 += var0;
        }
        field2662 = new int[2000];
        field2660 = new int[2000];
    }

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("em.g(II)I")
    public static int method2684(int arg0) {
        class42 var1 = class42.method514(arg0);
        int var2 = var1.field979;
        int var3 = var1.field972;
        int var4 = var1.field971;
        int var5 = field2659[var4 - var3];
        return field2660[var2] >> var3 & var5;
    }
}
