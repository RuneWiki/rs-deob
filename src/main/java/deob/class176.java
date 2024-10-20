package deob;

@ObfuscatedName("fx")
public class class176 {

    @ObfuscatedName("fx.o")
    public static int[] field2905 = new int[32];

    @ObfuscatedName("fx.f")
    public static int[] field2902;

    @ObfuscatedName("fx.i")
    public static int[] field2901;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2905[var1] = var0 - 1;
            var0 += var0;
        }
        field2902 = new int[2000];
        field2901 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ai.o(IB)I")
    public static int method701(int arg0) {
        class48 var1 = class48.method85(arg0);
        int var2 = var1.field1060;
        int var3 = var1.field1059;
        int var4 = var1.field1061;
        int var5 = field2905[var4 - var3];
        return field2901[var2] >> var3 & var5;
    }

    @ObfuscatedName("eu.f(III)V")
    public static void method2876(int arg0, int arg1) {
        class48 var2 = class48.method85(arg0);
        int var3 = var2.field1060;
        int var4 = var2.field1059;
        int var5 = var2.field1061;
        int var6 = field2905[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2901[var3] = field2901[var3] & ~var7 | arg1 << var4 & var7;
    }
}
