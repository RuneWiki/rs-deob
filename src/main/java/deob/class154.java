package deob;

@ObfuscatedName("ey")
public class class154 {

    @ObfuscatedName("ey.i")
    public static int[] field2662 = new int[32];

    @ObfuscatedName("ey.c")
    public static int[] field2659;

    @ObfuscatedName("ey.h")
    public static int[] field2661;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2662[var1] = var0 - 1;
            var0 += var0;
        }
        field2659 = new int[2000];
        field2661 = new int[2000];
    }

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.i(II)I")
    public static int method711(int arg0) {
        class42 var1 = class42.method154(arg0);
        int var2 = var1.field978;
        int var3 = var1.field985;
        int var4 = var1.field980;
        int var5 = field2662[var4 - var3];
        return field2661[var2] >> var3 & var5;
    }

    @ObfuscatedName("cy.c(III)V")
    public static void method2000(int arg0, int arg1) {
        class42 var2 = class42.method154(arg0);
        int var3 = var2.field978;
        int var4 = var2.field985;
        int var5 = var2.field980;
        int var6 = field2662[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2661[var3] = field2661[var3] & ~var7 | arg1 << var4 & var7;
    }
}
