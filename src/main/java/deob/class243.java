package deob;

@ObfuscatedName("ir")
public class class243 {

    @ObfuscatedName("ir.f")
    public static int[] field2922 = new int[32];

    @ObfuscatedName("ir.e")
    public static int[] field2923;

    @ObfuscatedName("ir.v")
    public static int[] field2924;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2922[var1] = var0 - 1;
            var0 += var0;
        }
        field2923 = new int[4000];
        field2924 = new int[4000];
    }

    public class243() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bu.f(II)I")
    public static int method1005(int arg0) {
        class151 var1 = class151.method3012(arg0);
        int var2 = var1.field1709;
        int var3 = var1.field1712;
        int var4 = var1.field1714;
        int var5 = field2922[var4 - var3];
        return field2924[var2] >> var3 & var5;
    }

    @ObfuscatedName("jf.e(IIB)V")
    public static void method4497(int arg0, int arg1) {
        class151 var2 = class151.method3012(arg0);
        int var3 = var2.field1709;
        int var4 = var2.field1712;
        int var5 = var2.field1714;
        int var6 = field2922[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2924[var3] = field2924[var3] & ~var7 | arg1 << var4 & var7;
    }
}
