package deob;

@ObfuscatedName("bq")
public class class55 extends class207 {

    @ObfuscatedName("bq.f")
    public static class205 field499 = new class205(32);

    @ObfuscatedName("bq.h")
    public int[] field497 = new int[] { -1 };

    @ObfuscatedName("bq.e")
    public int[] field495 = new int[] { 0 };

    @ObfuscatedName("hl.f(IIB)I")
    public static int method4161(int arg0, int arg1) {
        class55 var2 = (class55) field499.method3759((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field495.length) {
            return var2.field495[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cc.h(IIIII)V")
    public static void method1782(int arg0, int arg1, int arg2, int arg3) {
        class55 var4 = (class55) field499.method3759((long) arg0);
        if (var4 == null) {
            var4 = new class55();
            field499.method3761(var4, (long) arg0);
        }
        if (var4.field497.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field497.length; var7++) {
                var5[var7] = var4.field497[var7];
                var6[var7] = var4.field495[var7];
            }
            for (int var8 = var4.field497.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field497 = var5;
            var4.field495 = var6;
        }
        var4.field497[arg1] = arg2;
        var4.field495[arg1] = arg3;
    }

    @ObfuscatedName("ic.e(II)V")
    public static void method4473(int arg0) {
        class55 var1 = (class55) field499.method3759((long) arg0);
        if (var1 != null) {
            var1.method3812();
        }
    }
}
