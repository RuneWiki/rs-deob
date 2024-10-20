package deob;

@ObfuscatedName("z")
public class class14 extends class187 {

    @ObfuscatedName("z.k")
    public static class175 field190 = new class175(32);

    @ObfuscatedName("z.y")
    public int[] field183 = new int[] { -1 };

    @ObfuscatedName("z.s")
    public int[] field184 = new int[] { 0 };

    @ObfuscatedName("cx.k(IIIII)V")
    public static void method2082(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field190.method3244((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field190.method3253(var4, (long) arg0);
        }
        if (var4.field183.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field183.length; var7++) {
                var5[var7] = var4.field183[var7];
                var6[var7] = var4.field184[var7];
            }
            for (int var8 = var4.field183.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field183 = var5;
            var4.field184 = var6;
        }
        var4.field183[arg1] = arg2;
        var4.field184[arg1] = arg3;
    }

    @ObfuscatedName("ex.y(II)V")
    public static void method2712(int arg0) {
        class14 var1 = (class14) field190.method3244((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field183.length; var2++) {
                var1.field183[var2] = -1;
                var1.field184[var2] = 0;
            }
        }
    }
}
