package deob;

@ObfuscatedName("en")
public class class154 {

    @ObfuscatedName("en.e")
    public static int[] field2653 = new int[32];

    @ObfuscatedName("en.v")
    public static int[] field2648;

    @ObfuscatedName("en.i")
    public static int[] field2649;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2653[var1] = var0 - 1;
            var0 += var0;
        }
        field2648 = new int[2000];
        field2649 = new int[2000];
    }

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.e(II)I")
    public static int method877(int arg0) {
        class42 var1 = class42.method2057(arg0);
        int var2 = var1.field964;
        int var3 = var1.field967;
        int var4 = var1.field966;
        int var5 = field2653[var4 - var3];
        return field2649[var2] >> var3 & var5;
    }

    @ObfuscatedName("el.v(III)V")
    public static void method2663(int arg0, int arg1) {
        class42 var2 = class42.method2057(arg0);
        int var3 = var2.field964;
        int var4 = var2.field967;
        int var5 = var2.field966;
        int var6 = field2653[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2649[var3] = field2649[var3] & ~var7 | arg1 << var4 & var7;
    }
}
