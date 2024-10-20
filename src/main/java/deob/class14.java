package deob;

@ObfuscatedName("b")
public class class14 extends class189 {

    @ObfuscatedName("b.l")
    public static class177 field180 = new class177(32);

    @ObfuscatedName("b.y")
    public int[] field186 = new int[] { -1 };

    @ObfuscatedName("b.g")
    public int[] field181 = new int[] { 0 };

    @ObfuscatedName("c.l(IIIII)V")
    public static void method94(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field180.method3254((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field180.method3260(var4, (long) arg0);
        }
        if (var4.field186.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field186.length; var7++) {
                var5[var7] = var4.field186[var7];
                var6[var7] = var4.field181[var7];
            }
            for (int var8 = var4.field186.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field186 = var5;
            var4.field181 = var6;
        }
        var4.field186[arg1] = arg2;
        var4.field181[arg1] = arg3;
    }

    @ObfuscatedName("bz.y(II)V")
    public static void method1608(int arg0) {
        class14 var1 = (class14) field180.method3254((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field186.length; var2++) {
                var1.field186[var2] = -1;
                var1.field181[var2] = 0;
            }
        }
    }

    @ObfuscatedName("cr.g(II)V")
    public static void method1990(int arg0) {
        class14 var1 = (class14) field180.method3254((long) arg0);
        if (var1 != null) {
            var1.method3375();
        }
    }
}
