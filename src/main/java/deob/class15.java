package deob;

@ObfuscatedName("j")
public class class15 extends class199 {

    @ObfuscatedName("j.y")
    public static class187 field217 = new class187(32);

    @ObfuscatedName("j.k")
    public int[] field215 = new int[] { -1 };

    @ObfuscatedName("j.g")
    public int[] field210 = new int[] { 0 };

    @ObfuscatedName("o.y(IIIII)V")
    public static void method589(int arg0, int arg1, int arg2, int arg3) {
        class15 var4 = (class15) field217.method3357((long) arg0);
        if (var4 == null) {
            var4 = new class15();
            field217.method3358(var4, (long) arg0);
        }
        if (var4.field215.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field215.length; var7++) {
                var5[var7] = var4.field215[var7];
                var6[var7] = var4.field210[var7];
            }
            for (int var8 = var4.field215.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field215 = var5;
            var4.field210 = var6;
        }
        var4.field215[arg1] = arg2;
        var4.field210[arg1] = arg3;
    }

    @ObfuscatedName("o.k(II)V")
    public static void method581(int arg0) {
        class15 var1 = (class15) field217.method3357((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field215.length; var2++) {
                var1.field215[var2] = -1;
                var1.field210[var2] = 0;
            }
        }
    }
}
