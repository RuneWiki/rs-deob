package deob;

@ObfuscatedName("u")
public class class19 extends class179 {

    @ObfuscatedName("u.y")
    public static class175 field281 = new class175(32);

    @ObfuscatedName("u.m")
    public int[] field284 = new int[] { -1 };

    @ObfuscatedName("u.d")
    public int[] field276 = new int[] { 0 };

    @ObfuscatedName("ax.y(III)I")
    public static int method597(int arg0, int arg1) {
        class19 var2 = (class19) field281.method3337((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field284.length) {
            return var2.field284[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("dd.m(IIS)I")
    public static int method2224(int arg0, int arg1) {
        class19 var2 = (class19) field281.method3337((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field276.length) {
            return var2.field276[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("fp.d(IIS)I")
    public static int method3405(int arg0, int arg1) {
        class19 var2 = (class19) field281.method3337((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field276.length; var4++) {
                if (var2.field284[var4] == arg1) {
                    var3 += var2.field276[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("dy.k(IIIII)V")
    public static void method2230(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field281.method3337((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field281.method3334(var4, (long) arg0);
        }
        if (var4.field284.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field284.length; var7++) {
                var5[var7] = var4.field284[var7];
                var6[var7] = var4.field276[var7];
            }
            for (int var8 = var4.field284.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field284 = var5;
            var4.field276 = var6;
        }
        var4.field284[arg1] = arg2;
        var4.field276[arg1] = arg3;
    }

    @ObfuscatedName("db.n(IB)V")
    public static void method2330(int arg0) {
        class19 var1 = (class19) field281.method3337((long) arg0);
        if (var1 != null) {
            var1.method3395();
        }
    }
}
