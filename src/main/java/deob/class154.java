package deob;

@ObfuscatedName("eo")
public class class154 {

    @ObfuscatedName("eo.k")
    public static int[] field2664 = new int[32];

    @ObfuscatedName("eo.r")
    public static int[] field2663;

    @ObfuscatedName("eo.y")
    public static int[] field2665;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2664[var1] = var0 - 1;
            var0 += var0;
        }
        field2663 = new int[2000];
        field2665 = new int[2000];
    }

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.k(IB)I")
    public static int method2548(int arg0) {
        class42 var1 = class42.method85(arg0);
        int var2 = var1.field978;
        int var3 = var1.field981;
        int var4 = var1.field979;
        int var5 = field2664[var4 - var3];
        return field2665[var2] >> var3 & var5;
    }

    @ObfuscatedName("bx.r(III)V")
    public static void method1601(int arg0, int arg1) {
        class42 var2 = class42.method85(arg0);
        int var3 = var2.field978;
        int var4 = var2.field981;
        int var5 = var2.field979;
        int var6 = field2664[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2665[var3] = field2665[var3] & ~var7 | arg1 << var4 & var7;
    }
}
