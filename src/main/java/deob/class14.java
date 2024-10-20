package deob;

@ObfuscatedName("j")
public class class14 extends class187 {

    @ObfuscatedName("j.n")
    public static class175 field209 = new class175(32);

    @ObfuscatedName("j.x")
    public int[] field208 = new int[] { -1 };

    @ObfuscatedName("j.k")
    public int[] field210 = new int[] { 0 };

    @ObfuscatedName("dj.n(III)I")
    public static int method2498(int arg0, int arg1) {
        class14 var2 = (class14) field209.method3149((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field210.length) {
            return var2.field210[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("m.x(IIIII)V")
    public static void method97(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field209.method3149((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field209.method3156(var4, (long) arg0);
        }
        if (var4.field208.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field208.length; var7++) {
                var5[var7] = var4.field208[var7];
                var6[var7] = var4.field210[var7];
            }
            for (int var8 = var4.field208.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field208 = var5;
            var4.field210 = var6;
        }
        var4.field208[arg1] = arg2;
        var4.field210[arg1] = arg3;
    }

    @ObfuscatedName("d.k(II)V")
    public static void method33(int arg0) {
        class14 var1 = (class14) field209.method3149((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field208.length; var2++) {
                var1.field208[var2] = -1;
                var1.field210[var2] = 0;
            }
        }
    }
}
