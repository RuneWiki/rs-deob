package deob;

@ObfuscatedName("o")
public class class16 extends class209 {

    @ObfuscatedName("o.b")
    public static class197 field222 = new class197(32);

    @ObfuscatedName("o.g")
    public int[] field217 = new int[] { -1 };

    @ObfuscatedName("o.j")
    public int[] field218 = new int[] { 0 };

    @ObfuscatedName("do.b(IIIII)V")
    public static void method2281(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field222.method3538((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field222.method3528(var4, (long) arg0);
        }
        if (var4.field217.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field217.length; var7++) {
                var5[var7] = var4.field217[var7];
                var6[var7] = var4.field218[var7];
            }
            for (int var8 = var4.field217.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field217 = var5;
            var4.field218 = var6;
        }
        var4.field217[arg1] = arg2;
        var4.field218[arg1] = arg3;
    }

    @ObfuscatedName("cc.g(II)V")
    public static void method1751(int arg0) {
        class16 var1 = (class16) field222.method3538((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field217.length; var2++) {
                var1.field217[var2] = -1;
                var1.field218[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ed.j(II)V")
    public static void method2766(int arg0) {
        class16 var1 = (class16) field222.method3538((long) arg0);
        if (var1 != null) {
            var1.method3647();
        }
    }
}
