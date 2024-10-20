package deob;

@ObfuscatedName("hd")
public class class219 {

    @ObfuscatedName("hd.d")
    public static int[] field2687 = new int[32];

    @ObfuscatedName("hd.x")
    public static int[] field2689;

    @ObfuscatedName("hd.k")
    public static int[] field2688;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2687[var1] = var0 - 1;
            var0 += var0;
        }
        field2689 = new int[2000];
        field2688 = new int[2000];
    }

    public class219() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bc.d(IB)I")
    public static int method1016(int arg0) {
        class258 var1 = class258.method996(arg0);
        int var2 = var1.field3451;
        int var3 = var1.field3452;
        int var4 = var1.field3453;
        int var5 = field2687[var4 - var3];
        return field2688[var2] >> var3 & var5;
    }

    @ObfuscatedName("cr.x(IIB)V")
    public static void method1738(int arg0, int arg1) {
        class258 var2 = class258.method996(arg0);
        int var3 = var2.field3451;
        int var4 = var2.field3452;
        int var5 = var2.field3453;
        int var6 = field2687[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2688[var3] = field2688[var3] & ~var7 | arg1 << var4 & var7;
    }
}
