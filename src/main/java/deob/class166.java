package deob;

@ObfuscatedName("fl")
public class class166 {

    @ObfuscatedName("fl.i")
    public static int[] field2171 = new int[32];

    @ObfuscatedName("fl.e")
    public static int[] field2170;

    @ObfuscatedName("fl.f")
    public static int[] field2169;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2171[var1] = var0 - 1;
            var0 += var0;
        }
        field2170 = new int[2000];
        field2169 = new int[2000];
    }

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cg.i(II)I")
    public static int method1794(int arg0) {
        class195 var1 = class195.method556(arg0);
        int var2 = var1.field2849;
        int var3 = var1.field2850;
        int var4 = var1.field2853;
        int var5 = field2171[var4 - var3];
        return field2169[var2] >> var3 & var5;
    }

    @ObfuscatedName("ap.e(IIB)V")
    public static void method635(int arg0, int arg1) {
        class195 var2 = class195.method556(arg0);
        int var3 = var2.field2849;
        int var4 = var2.field2850;
        int var5 = var2.field2853;
        int var6 = field2171[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2169[var3] = field2169[var3] & ~var7 | arg1 << var4 & var7;
    }
}
