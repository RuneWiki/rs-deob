package deob;

@ObfuscatedName("z")
public class class15 extends class199 {

    @ObfuscatedName("z.n")
    public static class187 field199 = new class187(32);

    @ObfuscatedName("z.w")
    public int[] field200 = new int[] { -1 };

    @ObfuscatedName("z.i")
    public int[] field201 = new int[] { 0 };

    @ObfuscatedName("b.n(III)I")
    public static int method130(int arg0, int arg1) {
        class15 var2 = (class15) field199.method3354((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field200.length) {
            return var2.field200[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cd.w(III)I")
    public static int method1617(int arg0, int arg1) {
        class15 var2 = (class15) field199.method3354((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field201.length) {
            return var2.field201[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("da.i(IIIIB)V")
    public static void method2440(int arg0, int arg1, int arg2, int arg3) {
        class15 var4 = (class15) field199.method3354((long) arg0);
        if (var4 == null) {
            var4 = new class15();
            field199.method3346(var4, (long) arg0);
        }
        if (var4.field200.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field200.length; var7++) {
                var5[var7] = var4.field200[var7];
                var6[var7] = var4.field201[var7];
            }
            for (int var8 = var4.field200.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field200 = var5;
            var4.field201 = var6;
        }
        var4.field200[arg1] = arg2;
        var4.field201[arg1] = arg3;
    }

    @ObfuscatedName("cn.e(IB)V")
    public static void method1878(int arg0) {
        class15 var1 = (class15) field199.method3354((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field200.length; var2++) {
                var1.field200[var2] = -1;
                var1.field201[var2] = 0;
            }
        }
    }

    @ObfuscatedName("az.h(I)V")
    public static void method932() {
        field199 = new class187(32);
    }
}
