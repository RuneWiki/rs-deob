package deob;

@ObfuscatedName("ea")
public class class155 {

    @ObfuscatedName("ea.g")
    public static int[] field2678 = new int[32];

    @ObfuscatedName("ea.s")
    public static int[] field2679;

    @ObfuscatedName("ea.v")
    public static int[] field2680;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2678[var1] = var0 - 1;
            var0 += var0;
        }
        field2679 = new int[2000];
        field2680 = new int[2000];
    }

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ei.g(II)I")
    public static int method2637(int arg0) {
        class42 var1 = class42.method569(arg0);
        int var2 = var1.field972;
        int var3 = var1.field973;
        int var4 = var1.field974;
        int var5 = field2678[var4 - var3];
        return field2680[var2] >> var3 & var5;
    }

    @ObfuscatedName("ae.s(III)V")
    public static void method815(int arg0, int arg1) {
        class42 var2 = class42.method569(arg0);
        int var3 = var2.field972;
        int var4 = var2.field973;
        int var5 = var2.field974;
        int var6 = field2678[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2680[var3] = field2680[var3] & ~var7 | arg1 << var4 & var7;
    }
}
