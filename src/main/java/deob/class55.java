package deob;

@ObfuscatedName("bp")
public class class55 extends class207 {

    @ObfuscatedName("bp.y")
    public static class205 field526 = new class205(32);

    @ObfuscatedName("bp.c")
    public int[] field524 = new int[] { -1 };

    @ObfuscatedName("bp.n")
    public int[] field525 = new int[] { 0 };

    @ObfuscatedName("ba.y(IIB)I")
    public static int method1683(int arg0, int arg1) {
        class55 var2 = (class55) field526.method3734((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field524.length) {
            return var2.field524[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("gx.c(III)I")
    public static int method3532(int arg0, int arg1) {
        class55 var2 = (class55) field526.method3734((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field525.length; var4++) {
                if (var2.field524[var4] == arg1) {
                    var3 += var2.field525[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("z.n(IIIIB)V")
    public static void method176(int arg0, int arg1, int arg2, int arg3) {
        class55 var4 = (class55) field526.method3734((long) arg0);
        if (var4 == null) {
            var4 = new class55();
            field526.method3718(var4, (long) arg0);
        }
        if (var4.field524.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field524.length; var7++) {
                var5[var7] = var4.field524[var7];
                var6[var7] = var4.field525[var7];
            }
            for (int var8 = var4.field524.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field524 = var5;
            var4.field525 = var6;
        }
        var4.field524[arg1] = arg2;
        var4.field525[arg1] = arg3;
    }

    @ObfuscatedName("iy.u(II)V")
    public static void method4232(int arg0) {
        class55 var1 = (class55) field526.method3734((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field524.length; var2++) {
                var1.field524[var2] = -1;
                var1.field525[var2] = 0;
            }
        }
    }
}
