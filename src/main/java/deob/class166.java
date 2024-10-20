package deob;

@ObfuscatedName("fj")
public class class166 {

    @ObfuscatedName("fj.x")
    public static int[] field2164 = new int[32];

    @ObfuscatedName("fj.n")
    public static int[] field2165;

    @ObfuscatedName("fj.g")
    public static int[] field2166;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2164[var1] = var0 - 1;
            var0 += var0;
        }
        field2165 = new int[2000];
        field2166 = new int[2000];
    }

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.x(II)I")
    public static int method203(int arg0) {
        class195 var1 = Statics.method701(arg0);
        int var2 = var1.field2856;
        int var3 = var1.field2859;
        int var4 = var1.field2857;
        int var5 = field2164[var4 - var3];
        return field2166[var2] >> var3 & var5;
    }
}
