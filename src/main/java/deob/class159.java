package deob;

@ObfuscatedName("fi")
public class class159 {

    @ObfuscatedName("fi.i")
    public static int[] field2712 = new int[32];

    @ObfuscatedName("fi.p")
    public static int[] field2710;

    @ObfuscatedName("fi.a")
    public static int[] field2709;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2712[var1] = var0 - 1;
            var0 += var0;
        }
        field2710 = new int[2000];
        field2709 = new int[2000];
    }

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bl.i(IB)I")
    public static int method1461(int arg0) {
        class38 var1 = class38.method2336(arg0);
        int var2 = var1.field972;
        int var3 = var1.field966;
        int var4 = var1.field967;
        int var5 = field2712[var4 - var3];
        return field2709[var2] >> var3 & var5;
    }

    @ObfuscatedName("cz.p(III)V")
    public static void method1788(int arg0, int arg1) {
        class38 var2 = class38.method2336(arg0);
        int var3 = var2.field972;
        int var4 = var2.field966;
        int var5 = var2.field967;
        int var6 = field2712[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2709[var3] = field2709[var3] & ~var7 | arg1 << var4 & var7;
    }
}
