package deob;

@ObfuscatedName("hc")
public class class219 {

    @ObfuscatedName("hc.m")
    public static int[] field2690 = new int[32];

    @ObfuscatedName("hc.p")
    public static int[] field2688;

    @ObfuscatedName("hc.i")
    public static int[] field2689;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2690[var1] = var0 - 1;
            var0 += var0;
        }
        field2688 = new int[2000];
        field2689 = new int[2000];
    }

    public class219() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ch.m(II)I")
    public static int method1684(int arg0) {
        class258 var1 = (class258) class258.field3437.method3419((long) arg0);
        class258 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field271.method3930(14, arg0);
            class258 var4 = new class258();
            if (var3 != null) {
                var4.method4234(new class181(var3));
            }
            class258.field3437.method3418(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3435;
        int var7 = var2.field3438;
        int var8 = var2.field3436;
        int var9 = field2690[var8 - var7];
        return field2689[var6] >> var7 & var9;
    }

    @ObfuscatedName("db.p(IIB)V")
    public static void method2274(int arg0, int arg1) {
        class258 var2 = class258.method3772(arg0);
        int var3 = var2.field3435;
        int var4 = var2.field3438;
        int var5 = var2.field3436;
        int var6 = field2690[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2689[var3] = field2689[var3] & ~var7 | arg1 << var4 & var7;
    }
}
