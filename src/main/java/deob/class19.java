package deob;

@ObfuscatedName("y")
public class class19 extends class179 {

    @ObfuscatedName("y.b")
    public static class175 field280 = new class175(32);

    @ObfuscatedName("y.e")
    public int[] field277 = new int[] { -1 };

    @ObfuscatedName("y.g")
    public int[] field278 = new int[] { 0 };

    @ObfuscatedName("eg.b(III)I")
    public static int method2861(int arg0, int arg1) {
        class19 var2 = (class19) field280.method3291((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field277.length) {
            return var2.field277[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("at.e(IIIII)V")
    public static void method259(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field280.method3291((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field280.method3292(var4, (long) arg0);
        }
        if (var4.field277.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field277.length; var7++) {
                var5[var7] = var4.field277[var7];
                var6[var7] = var4.field278[var7];
            }
            for (int var8 = var4.field277.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field277 = var5;
            var4.field278 = var6;
        }
        var4.field277[arg1] = arg2;
        var4.field278[arg1] = arg3;
    }

    @ObfuscatedName("ch.g(II)V")
    public static void method1560(int arg0) {
        class19 var1 = (class19) field280.method3291((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field277.length; var2++) {
                var1.field277[var2] = -1;
                var1.field278[var2] = 0;
            }
        }
    }

    @ObfuscatedName("dd.o(II)V")
    public static void method2178(int arg0) {
        class19 var1 = (class19) field280.method3291((long) arg0);
        if (var1 != null) {
            var1.method3341();
        }
    }

    @ObfuscatedName("bp.a(I)V")
    public static void method1356() {
        field280 = new class175(32);
    }
}
