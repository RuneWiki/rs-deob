package deob;

@ObfuscatedName("md")
public class class336 {

    @ObfuscatedName("md.ac")
    public static int[] field3566 = new int[32];

    @ObfuscatedName("md.ak")
    public static int[] field3567;

    @ObfuscatedName("md.ax")
    public static int[] field3568;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3566[var1] = var0 - 1;
            var0 += var0;
        }
        field3567 = new int[5000];
        field3568 = new int[5000];
    }

    public class336() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.ac(II)I")
    public static int method686(int arg0) {
        class214 var1 = class214.method2671(arg0);
        int var2 = var1.field2145;
        int var3 = var1.field2142;
        int var4 = var1.field2143;
        int var5 = field3566[var4 - var3];
        return field3568[var2] >> var3 & var5;
    }

    @ObfuscatedName("fj.al(III)V")
    public static void method2871(int arg0, int arg1) {
        class214 var2 = class214.method2671(arg0);
        int var3 = var2.field2145;
        int var4 = var2.field2142;
        int var5 = var2.field2143;
        int var6 = field3566[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field3568[var3] = field3568[var3] & ~var7 | arg1 << var4 & var7;
    }
}
