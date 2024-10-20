package deob;

@ObfuscatedName("kg")
public class class289 {

    @ObfuscatedName("kg.v")
    public static int[] field3283 = new int[32];

    @ObfuscatedName("kg.c")
    public static int[] field3282;

    @ObfuscatedName("kg.i")
    public static int[] field3284;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3283[var1] = var0 - 1;
            var0 += var0;
        }
        field3282 = new int[4000];
        field3284 = new int[4000];
    }

    public class289() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bu.v(II)I")
    public static int method1960(int arg0) {
        class184 var1 = class184.method2521(arg0);
        int var2 = var1.field1969;
        int var3 = var1.field1970;
        int var4 = var1.field1968;
        int var5 = field3283[var4 - var3];
        return field3284[var2] >> var3 & var5;
    }

    @ObfuscatedName("ix.c(III)V")
    public static void method4444(int arg0, int arg1) {
        class184 var2 = class184.method2521(arg0);
        int var3 = var2.field1969;
        int var4 = var2.field1970;
        int var5 = var2.field1968;
        int var6 = field3283[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field3284[var3] = field3284[var3] & ~var7 | arg1 << var4 & var7;
    }
}
