package deob;

@ObfuscatedName("x")
public class class14 extends class187 {

    @ObfuscatedName("x.g")
    public static class175 field208 = new class175(32);

    @ObfuscatedName("x.i")
    public int[] field207 = new int[] { -1 };

    @ObfuscatedName("x.k")
    public int[] field206 = new int[] { 0 };

    @ObfuscatedName("d.g(III)I")
    public static int method454(int arg0, int arg1) {
        class14 var2 = (class14) field208.method3174((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field206.length) {
            return var2.field206[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("de.i(III)I")
    public static int method2542(int arg0, int arg1) {
        class14 var2 = (class14) field208.method3174((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field206.length; var4++) {
                if (var2.field207[var4] == arg1) {
                    var3 += var2.field206[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("bk.k(IIIIB)V")
    public static void method1389(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field208.method3174((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field208.method3177(var4, (long) arg0);
        }
        if (var4.field207.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field207.length; var7++) {
                var5[var7] = var4.field207[var7];
                var6[var7] = var4.field206[var7];
            }
            for (int var8 = var4.field207.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field207 = var5;
            var4.field206 = var6;
        }
        var4.field207[arg1] = arg2;
        var4.field206[arg1] = arg3;
    }
}
