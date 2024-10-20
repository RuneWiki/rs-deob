package deob;

@ObfuscatedName("fz")
public class class167 {

    @ObfuscatedName("fz.n")
    public static int[] field2797 = new int[32];

    @ObfuscatedName("fz.g")
    public static int[] field2799;

    @ObfuscatedName("fz.a")
    public static int[] field2796;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2797[var1] = var0 - 1;
            var0 += var0;
        }
        field2799 = new int[2000];
        field2796 = new int[2000];
    }

    public class167() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cy.g(IIB)V")
    public static void method1856(int arg0, int arg1) {
        class44 var2 = (class44) class44.field1035.method3388((long) arg0);
        class44 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1039.method2929(14, arg0);
            class44 var5 = new class44();
            if (var4 != null) {
                var5.method854(new class111(var4));
            }
            class44.field1035.method3396(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field1037;
        int var8 = var3.field1038;
        int var9 = var3.field1041;
        int var10 = field2797[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2796[var7] = field2796[var7] & ~var11 | arg1 << var8 & var11;
    }
}
