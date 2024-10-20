package deob;

@ObfuscatedName("fp")
public class class166 {

    @ObfuscatedName("fp.q")
    public static int[] field2166 = new int[32];

    @ObfuscatedName("fp.d")
    public static int[] field2162;

    @ObfuscatedName("fp.h")
    public static int[] field2163;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2166[var1] = var0 - 1;
            var0 += var0;
        }
        field2162 = new int[2000];
        field2163 = new int[2000];
    }

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.q(II)I")
    public static int method2011(int arg0) {
        class195 var1 = class195.method2980(arg0);
        int var2 = var1.field2849;
        int var3 = var1.field2851;
        int var4 = var1.field2848;
        int var5 = field2166[var4 - var3];
        return field2163[var2] >> var3 & var5;
    }

    @ObfuscatedName("gv.d(IIB)V")
    public static void method3525(int arg0, int arg1) {
        class195 var2 = class195.method2980(arg0);
        int var3 = var2.field2849;
        int var4 = var2.field2851;
        int var5 = var2.field2848;
        int var6 = field2166[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2163[var3] = field2163[var3] & ~var7 | arg1 << var4 & var7;
    }
}
