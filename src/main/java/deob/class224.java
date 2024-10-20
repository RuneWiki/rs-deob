package deob;

@ObfuscatedName("hv")
public class class224 {

    @ObfuscatedName("hv.m")
    public static int[] field2603 = new int[32];

    @ObfuscatedName("hv.f")
    public static int[] field2600;

    @ObfuscatedName("hv.q")
    public static int[] field2601;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2603[var1] = var0 - 1;
            var0 += var0;
        }
        field2600 = new int[4000];
        field2601 = new int[4000];
    }

    public class224() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ah.m(II)I")
    public static int method529(int arg0) {
        class260 var1 = class260.method2985(arg0);
        int var2 = var1.field3372;
        int var3 = var1.field3371;
        int var4 = var1.field3370;
        int var5 = field2603[var4 - var3];
        return field2601[var2] >> var3 & var5;
    }

    @ObfuscatedName("bi.f(III)V")
    public static void method1534(int arg0, int arg1) {
        class260 var2 = class260.method2985(arg0);
        int var3 = var2.field3372;
        int var4 = var2.field3371;
        int var5 = var2.field3370;
        int var6 = field2603[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2601[var3] = field2601[var3] & ~var7 | arg1 << var4 & var7;
    }
}
