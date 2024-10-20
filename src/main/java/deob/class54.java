package deob;

@ObfuscatedName("bo")
public class class54 extends class205 {

    @ObfuscatedName("bo.w")
    public static class203 field479 = new class203(32);

    @ObfuscatedName("bo.m")
    public int[] field483 = new int[] { -1 };

    @ObfuscatedName("bo.q")
    public int[] field481 = new int[] { 0 };

    @ObfuscatedName("fo.w(IIIII)V")
    public static void method3074(int arg0, int arg1, int arg2, int arg3) {
        class54 var4 = (class54) field479.method3748((long) arg0);
        if (var4 == null) {
            var4 = new class54();
            field479.method3747(var4, (long) arg0);
        }
        if (var4.field483.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field483.length; var7++) {
                var5[var7] = var4.field483[var7];
                var6[var7] = var4.field481[var7];
            }
            for (int var8 = var4.field483.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field483 = var5;
            var4.field481 = var6;
        }
        var4.field483[arg1] = arg2;
        var4.field481[arg1] = arg3;
    }

    @ObfuscatedName("ej.m(II)V")
    public static void method2915(int arg0) {
        class54 var1 = (class54) field479.method3748((long) arg0);
        if (var1 != null) {
            var1.method3782();
        }
    }
}
