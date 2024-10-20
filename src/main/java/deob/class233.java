package deob;

@ObfuscatedName("hm")
public class class233 {

    @ObfuscatedName("hm.n")
    public static int[] field2634 = new int[32];

    @ObfuscatedName("hm.h")
    public static int[] field2633;

    @ObfuscatedName("hm.l")
    public static int[] field2632;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2634[var1] = var0 - 1;
            var0 += var0;
        }
        field2633 = new int[4000];
        field2632 = new int[4000];
    }

    public class233() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ih.n(II)I")
    public static int method4441(int arg0) {
        class269 var1 = (class269) class269.field3393.method3902((long) arg0);
        class269 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3394.method4494(14, arg0);
            class269 var4 = new class269();
            if (var3 != null) {
                var4.method4757(new class190(var3));
            }
            class269.field3393.method3908(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3396;
        int var7 = var2.field3395;
        int var8 = var2.field3392;
        int var9 = field2634[var8 - var7];
        return field2632[var6] >> var7 & var9;
    }

    @ObfuscatedName("co.h(III)V")
    public static void method1952(int arg0, int arg1) {
        class269 var2 = (class269) class269.field3393.method3902((long) arg0);
        class269 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3394.method4494(14, arg0);
            class269 var5 = new class269();
            if (var4 != null) {
                var5.method4757(new class190(var4));
            }
            class269.field3393.method3908(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3396;
        int var8 = var3.field3395;
        int var9 = var3.field3392;
        int var10 = field2634[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2632[var7] = field2632[var7] & ~var11 | arg1 << var8 & var11;
    }
}
