package deob;

@ObfuscatedName("bs")
public class class69 extends class190 {

    @ObfuscatedName("bs.x")
    public static class328 field571 = new class328(32);

    @ObfuscatedName("bs.m")
    public int[] field572 = new int[] { -1 };

    @ObfuscatedName("bs.k")
    public int[] field577 = new int[] { 0 };

    @ObfuscatedName("gd.x(III)I")
    public static int method3433(int arg0, int arg1) {
        class69 var2 = (class69) field571.method5561((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field572.length) {
            return var2.field572[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("gq.m(III)I")
    public static int method3388(int arg0, int arg1) {
        class69 var2 = (class69) field571.method5561((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field577.length) {
            return var2.field577[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cb.k(III)I")
    public static int method1966(int arg0, int arg1) {
        class69 var2 = (class69) field571.method5561((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field577.length; var4++) {
                if (var2.field572[var4] == arg1) {
                    var3 += var2.field577[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ck.d(IIIII)V")
    public static void method2129(int arg0, int arg1, int arg2, int arg3) {
        class69 var4 = (class69) field571.method5561((long) arg0);
        if (var4 == null) {
            var4 = new class69();
            field571.method5548(var4, (long) arg0);
        }
        if (var4.field572.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field572.length; var7++) {
                var5[var7] = var4.field572[var7];
                var6[var7] = var4.field577[var7];
            }
            for (int var8 = var4.field572.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field572 = var5;
            var4.field577 = var6;
        }
        var4.field572[arg1] = arg2;
        var4.field577[arg1] = arg3;
    }

    @ObfuscatedName("bl.w(II)V")
    public static void method1242(int arg0) {
        class69 var1 = (class69) field571.method5561((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field572.length; var2++) {
                var1.field572[var2] = -1;
                var1.field577[var2] = 0;
            }
        }
    }

    @ObfuscatedName("bv.v(II)V")
    public static void method1086(int arg0) {
        class69 var1 = (class69) field571.method5561((long) arg0);
        if (var1 != null) {
            var1.method3355();
        }
    }
}
