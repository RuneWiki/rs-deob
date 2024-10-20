package deob;

@ObfuscatedName("bm")
public class class64 extends class200 {

    @ObfuscatedName("bm.d")
    public static class198 field754 = new class198(32);

    @ObfuscatedName("bm.x")
    public int[] field756 = new int[] { -1 };

    @ObfuscatedName("bm.k")
    public int[] field751 = new int[] { 0 };

    @ObfuscatedName("cl.d(III)I")
    public static int method1753(int arg0, int arg1) {
        class64 var2 = (class64) field754.method3438((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field751.length; var4++) {
                if (var2.field756[var4] == arg1) {
                    var3 += var2.field751[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("aw.x(IIIIB)V")
    public static void method484(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) field754.method3438((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            field754.method3431(var4, (long) arg0);
        }
        if (var4.field756.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field756.length; var7++) {
                var5[var7] = var4.field756[var7];
                var6[var7] = var4.field751[var7];
            }
            for (int var8 = var4.field756.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field756 = var5;
            var4.field751 = var6;
        }
        var4.field756[arg1] = arg2;
        var4.field751[arg1] = arg3;
    }
}
