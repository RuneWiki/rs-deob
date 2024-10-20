package deob;

@ObfuscatedName("fj")
public class class168 {

    @ObfuscatedName("fj.d")
    public static int[] field2176 = new int[32];

    @ObfuscatedName("fj.c")
    public static int[] field2173;

    @ObfuscatedName("fj.n")
    public static int[] field2174;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2176[var1] = var0 - 1;
            var0 += var0;
        }
        field2173 = new int[2000];
        field2174 = new int[2000];
    }

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("by.d(II)I")
    public static int method1112(int arg0) {
        class198 var1 = class198.method2846(arg0);
        int var2 = var1.field2866;
        int var3 = var1.field2869;
        int var4 = var1.field2870;
        int var5 = field2176[var4 - var3];
        return field2174[var2] >> var3 & var5;
    }

    @ObfuscatedName("cs.c(IIB)V")
    public static void method1809(int arg0, int arg1) {
        class198 var2 = class198.method2846(arg0);
        int var3 = var2.field2866;
        int var4 = var2.field2869;
        int var5 = var2.field2870;
        int var6 = field2176[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2174[var3] = field2174[var3] & ~var7 | arg1 << var4 & var7;
    }
}
