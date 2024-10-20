package deob;

@ObfuscatedName("x")
public class class16 extends class208 {

    @ObfuscatedName("x.g")
    public static class196 field226 = new class196(32);

    @ObfuscatedName("x.b")
    public int[] field227 = new int[] { -1 };

    @ObfuscatedName("x.w")
    public int[] field228 = new int[] { 0 };

    @ObfuscatedName("eg.g(III)I")
    public static int method2805(int arg0, int arg1) {
        class16 var2 = (class16) field226.method3573((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field228.length) {
            return var2.field228[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bk.b(IIIIB)V")
    public static void method1517(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field226.method3573((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field226.method3569(var4, (long) arg0);
        }
        if (var4.field227.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field227.length; var7++) {
                var5[var7] = var4.field227[var7];
                var6[var7] = var4.field228[var7];
            }
            for (int var8 = var4.field227.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field227 = var5;
            var4.field228 = var6;
        }
        var4.field227[arg1] = arg2;
        var4.field228[arg1] = arg3;
    }

    @ObfuscatedName("eg.w(II)V")
    public static void method2806(int arg0) {
        class16 var1 = (class16) field226.method3573((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field227.length; var2++) {
                var1.field227[var2] = -1;
                var1.field228[var2] = 0;
            }
        }
    }

    @ObfuscatedName("b.d(II)V")
    public static void method15(int arg0) {
        class16 var1 = (class16) field226.method3573((long) arg0);
        if (var1 != null) {
            var1.method3693();
        }
    }
}
