package deob;

@ObfuscatedName("fg")
public class class157 {

    @ObfuscatedName("fg.g")
    public static int[] field2655 = new int[32];

    @ObfuscatedName("fg.e")
    public static int[] field2650;

    @ObfuscatedName("fg.n")
    public static int[] field2656;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2655[var1] = var0 - 1;
            var0 += var0;
        }
        field2650 = new int[2000];
        field2656 = new int[2000];
    }

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.g(II)I")
    public static int method1589(int arg0) {
        class37 var1 = Statics.method1596(arg0);
        int var2 = var1.field939;
        int var3 = var1.field946;
        int var4 = var1.field943;
        int var5 = field2655[var4 - var3];
        return field2656[var2] >> var3 & var5;
    }

    @ObfuscatedName("ca.e(III)V")
    public static void method2056(int arg0, int arg1) {
        class37 var2 = Statics.method1596(arg0);
        int var3 = var2.field939;
        int var4 = var2.field946;
        int var5 = var2.field943;
        int var6 = field2655[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2656[var3] = field2656[var3] & ~var7 | arg1 << var4 & var7;
    }
}
