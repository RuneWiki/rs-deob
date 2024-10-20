package deob;

@ObfuscatedName("g")
public class class19 extends class179 {

    @ObfuscatedName("g.j")
    public static class175 field276 = new class175(32);

    @ObfuscatedName("g.r")
    public int[] field273 = new int[] { -1 };

    @ObfuscatedName("g.v")
    public int[] field274 = new int[] { 0 };

    @ObfuscatedName("p.j(IIIIB)V")
    public static void method36(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field276.method3302((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field276.method3318(var4, (long) arg0);
        }
        if (var4.field273.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field273.length; var7++) {
                var5[var7] = var4.field273[var7];
                var6[var7] = var4.field274[var7];
            }
            for (int var8 = var4.field273.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field273 = var5;
            var4.field274 = var6;
        }
        var4.field273[arg1] = arg2;
        var4.field274[arg1] = arg3;
    }

    @ObfuscatedName("bm.r(II)V")
    public static void method1564(int arg0) {
        class19 var1 = (class19) field276.method3302((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field273.length; var2++) {
                var1.field273[var2] = -1;
                var1.field274[var2] = 0;
            }
        }
    }

    @ObfuscatedName("dy.v(IB)V")
    public static void method2309(int arg0) {
        class19 var1 = (class19) field276.method3302((long) arg0);
        if (var1 != null) {
            var1.method3359();
        }
    }

    @ObfuscatedName("u.p(B)V")
    public static void method146() {
        field276 = new class175(32);
    }
}
