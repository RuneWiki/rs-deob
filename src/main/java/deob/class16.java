package deob;

@ObfuscatedName("u")
public class class16 extends class208 {

    @ObfuscatedName("u.a")
    public static class196 field226 = new class196(32);

    @ObfuscatedName("u.r")
    public int[] field216 = new int[] { -1 };

    @ObfuscatedName("u.f")
    public int[] field222 = new int[] { 0 };

    @ObfuscatedName("dg.a(IIB)I")
    public static int method2605(int arg0, int arg1) {
        class16 var2 = (class16) field226.method3539((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field216.length) {
            return var2.field216[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ds.r(IIIIB)V")
    public static void method2415(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field226.method3539((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field226.method3546(var4, (long) arg0);
        }
        if (var4.field216.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field216.length; var7++) {
                var5[var7] = var4.field216[var7];
                var6[var7] = var4.field222[var7];
            }
            for (int var8 = var4.field216.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field216 = var5;
            var4.field222 = var6;
        }
        var4.field216[arg1] = arg2;
        var4.field222[arg1] = arg3;
    }

    @ObfuscatedName("cd.f(II)V")
    public static void method2136(int arg0) {
        class16 var1 = (class16) field226.method3539((long) arg0);
        if (var1 != null) {
            var1.method3661();
        }
    }
}
