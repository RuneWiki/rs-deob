package deob;

@ObfuscatedName("hj")
public class class213 {

    @ObfuscatedName("hj.a")
    public static int[] field2504 = new int[32];

    @ObfuscatedName("hj.t")
    public static int[] field2505;

    @ObfuscatedName("hj.n")
    public static int[] field2507;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2504[var1] = var0 - 1;
            var0 += var0;
        }
        field2505 = new int[4000];
        field2507 = new int[4000];
    }

    public class213() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.a(II)I")
    public static int method3185(int arg0) {
        class249 var1 = (class249) class249.field3285.method3120((long) arg0);
        class249 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3284.method3873(14, arg0);
            class249 var4 = new class249();
            if (var3 != null) {
                var4.method4198(new class300(var3));
            }
            class249.field3285.method3122(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3288;
        int var7 = var2.field3287;
        int var8 = var2.field3290;
        int var9 = field2504[var8 - var7];
        return field2507[var6] >> var7 & var9;
    }

    @ObfuscatedName("bt.t(IIB)V")
    public static void method1125(int arg0, int arg1) {
        class249 var2 = (class249) class249.field3285.method3120((long) arg0);
        class249 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3284.method3873(14, arg0);
            class249 var5 = new class249();
            if (var4 != null) {
                var5.method4198(new class300(var4));
            }
            class249.field3285.method3122(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3288;
        int var8 = var3.field3287;
        int var9 = var3.field3290;
        int var10 = field2504[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2507[var7] = field2507[var7] & ~var11 | arg1 << var8 & var11;
    }
}
