package deob;

@ObfuscatedName("r")
public class class19 extends class179 {

    @ObfuscatedName("r.t")
    public static class175 field302 = new class175(32);

    @ObfuscatedName("r.l")
    public int[] field297 = new int[] { -1 };

    @ObfuscatedName("r.c")
    public int[] field294 = new int[] { 0 };

    @ObfuscatedName("dn.t(IIB)I")
    public static int method2379(int arg0, int arg1) {
        class19 var2 = (class19) field302.method3301((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field294.length) {
            return var2.field294[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("c.l(III)I")
    public static int method20(int arg0, int arg1) {
        class19 var2 = (class19) field302.method3301((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field294.length; var4++) {
                if (var2.field297[var4] == arg1) {
                    var3 += var2.field294[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("c.c(IIIIB)V")
    public static void method34(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field302.method3301((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field302.method3302(var4, (long) arg0);
        }
        if (var4.field297.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field297.length; var7++) {
                var5[var7] = var4.field297[var7];
                var6[var7] = var4.field294[var7];
            }
            for (int var8 = var4.field297.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field297 = var5;
            var4.field294 = var6;
        }
        var4.field297[arg1] = arg2;
        var4.field294[arg1] = arg3;
    }

    @ObfuscatedName("bg.d(I)V")
    public static void method1530() {
        field302 = new class175(32);
    }
}
