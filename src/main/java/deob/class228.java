package deob;

@ObfuscatedName("hs")
public class class228 {

    @ObfuscatedName("hs.g")
    public static int[] field2628 = new int[32];

    @ObfuscatedName("hs.r")
    public static int[] field2631;

    @ObfuscatedName("hs.e")
    public static int[] field2630;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2628[var1] = var0 - 1;
            var0 += var0;
        }
        field2631 = new int[4000];
        field2630 = new int[4000];
    }

    public class228() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cq.g(IB)I")
    public static int method2246(int arg0) {
        class266 var1 = class266.method1886(arg0);
        int var2 = var1.field3398;
        int var3 = var1.field3400;
        int var4 = var1.field3399;
        int var5 = field2628[var4 - var3];
        return field2630[var2] >> var3 & var5;
    }

    @ObfuscatedName("ai.r(III)V")
    public static void method687(int arg0, int arg1) {
        class266 var2 = class266.method1886(arg0);
        int var3 = var2.field3398;
        int var4 = var2.field3400;
        int var5 = var2.field3399;
        int var6 = field2628[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2630[var3] = field2630[var3] & ~var7 | arg1 << var4 & var7;
    }
}
