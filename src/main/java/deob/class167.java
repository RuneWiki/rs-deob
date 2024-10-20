package deob;

@ObfuscatedName("fo")
public class class167 {

    @ObfuscatedName("fo.t")
    public static int[] field2789 = new int[32];

    @ObfuscatedName("fo.b")
    public static int[] field2786;

    @ObfuscatedName("fo.p")
    public static int[] field2787;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2789[var1] = var0 - 1;
            var0 += var0;
        }
        field2786 = new int[2000];
        field2787 = new int[2000];
    }

    public class167() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.t(II)I")
    public static int method2416(int arg0) {
        class44 var1 = class44.method592(arg0);
        int var2 = var1.field989;
        int var3 = var1.field991;
        int var4 = var1.field993;
        int var5 = field2789[var4 - var3];
        return field2787[var2] >> var3 & var5;
    }

    @ObfuscatedName("au.b(III)V")
    public static void method620(int arg0, int arg1) {
        class44 var2 = class44.method592(arg0);
        int var3 = var2.field989;
        int var4 = var2.field991;
        int var5 = var2.field993;
        int var6 = field2789[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2787[var3] = field2787[var3] & ~var7 | arg1 << var4 & var7;
    }
}
