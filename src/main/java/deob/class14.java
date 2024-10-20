package deob;

@ObfuscatedName("p")
public class class14 extends class183 {

    @ObfuscatedName("p.y")
    public static class173 field200 = new class173(32);

    @ObfuscatedName("p.u")
    public int[] field203 = new int[] { -1 };

    @ObfuscatedName("p.k")
    public int[] field199 = new int[] { 0 };

    @ObfuscatedName("en.u(IIIIB)V")
    public static void method2801(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field200.method3171((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field200.method3172(var4, (long) arg0);
        }
        if (var4.field203.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field203.length; var7++) {
                var5[var7] = var4.field203[var7];
                var6[var7] = var4.field199[var7];
            }
            for (int var8 = var4.field203.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field203 = var5;
            var4.field199 = var6;
        }
        var4.field203[arg1] = arg2;
        var4.field199[arg1] = arg3;
    }

    @ObfuscatedName("aw.k(IB)V")
    public static void method883(int arg0) {
        class14 var1 = (class14) field200.method3171((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field203.length; var2++) {
                var1.field203[var2] = -1;
                var1.field199[var2] = 0;
            }
        }
    }

    @ObfuscatedName("dq.v(I)V")
    public static void method2403() {
        field200 = new class173(32);
    }
}
