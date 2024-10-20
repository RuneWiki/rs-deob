package deob;

@ObfuscatedName("bs")
public class class64 extends class200 {

    @ObfuscatedName("bs.b")
    public static class198 field734 = new class198(32);

    @ObfuscatedName("bs.s")
    public int[] field733 = new int[] { -1 };

    @ObfuscatedName("bs.r")
    public int[] field737 = new int[] { 0 };

    @ObfuscatedName("ax.b(III)I")
    public static int method598(int arg0, int arg1) {
        class64 var2 = (class64) field734.method3340((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field737.length) {
            return var2.field737[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("hj.s(III)I")
    public static int method3586(int arg0, int arg1) {
        class64 var2 = (class64) field734.method3340((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field737.length; var4++) {
                if (var2.field733[var4] == arg1) {
                    var3 += var2.field737[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ad.r(IIIII)V")
    public static void method633(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) field734.method3340((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            field734.method3352(var4, (long) arg0);
        }
        if (var4.field733.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field733.length; var7++) {
                var5[var7] = var4.field733[var7];
                var6[var7] = var4.field737[var7];
            }
            for (int var8 = var4.field733.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field733 = var5;
            var4.field737 = var6;
        }
        var4.field733[arg1] = arg2;
        var4.field737[arg1] = arg3;
    }

    @ObfuscatedName("in.g(II)V")
    public static void method4158(int arg0) {
        class64 var1 = (class64) field734.method3340((long) arg0);
        if (var1 != null) {
            var1.method3392();
        }
    }

    @ObfuscatedName("c.x(I)V")
    public static void method112() {
        field734 = new class198(32);
    }
}
