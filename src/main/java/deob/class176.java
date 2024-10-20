package deob;

@ObfuscatedName("fx")
public class class176 {

    @ObfuscatedName("fx.a")
    public static int[] field2894 = new int[32];

    @ObfuscatedName("fx.r")
    public static int[] field2892;

    @ObfuscatedName("fx.f")
    public static int[] field2891;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2894[var1] = var0 - 1;
            var0 += var0;
        }
        field2892 = new int[2000];
        field2891 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.a(II)I")
    public static int method2646(int arg0) {
        class48 var1 = class48.method1004(arg0);
        int var2 = var1.field1064;
        int var3 = var1.field1066;
        int var4 = var1.field1067;
        int var5 = field2894[var4 - var3];
        return field2891[var2] >> var3 & var5;
    }

    @ObfuscatedName("fu.r(IIB)V")
    public static void method3151(int arg0, int arg1) {
        class48 var2 = class48.method1004(arg0);
        int var3 = var2.field1064;
        int var4 = var2.field1066;
        int var5 = var2.field1067;
        int var6 = field2894[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2891[var3] = field2891[var3] & ~var7 | arg1 << var4 & var7;
    }
}
