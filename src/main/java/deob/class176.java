package deob;

@ObfuscatedName("fi")
public class class176 {

    @ObfuscatedName("fi.c")
    public static int[] field2885 = new int[32];

    @ObfuscatedName("fi.h")
    public static int[] field2886;

    @ObfuscatedName("fi.k")
    public static int[] field2887;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2885[var1] = var0 - 1;
            var0 += var0;
        }
        field2886 = new int[2000];
        field2887 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.c(IB)I")
    public static int method43(int arg0) {
        class48 var1 = class48.method665(arg0);
        int var2 = var1.field1065;
        int var3 = var1.field1063;
        int var4 = var1.field1070;
        int var5 = field2885[var4 - var3];
        return field2887[var2] >> var3 & var5;
    }

    @ObfuscatedName("cs.h(III)V")
    public static void method1897(int arg0, int arg1) {
        class48 var2 = class48.method665(arg0);
        int var3 = var2.field1065;
        int var4 = var2.field1063;
        int var5 = var2.field1070;
        int var6 = field2885[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2887[var3] = field2887[var3] & ~var7 | arg1 << var4 & var7;
    }
}
