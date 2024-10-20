package deob;

@ObfuscatedName("d")
public class class14 extends class183 {

    @ObfuscatedName("d.e")
    public static class173 field209 = new class173(32);

    @ObfuscatedName("d.p")
    public int[] field211 = new int[] { -1 };

    @ObfuscatedName("d.a")
    public int[] field206 = new int[] { 0 };

    @ObfuscatedName("w.e(IIB)I")
    public static int method468(int arg0, int arg1) {
        class14 var2 = (class14) field209.method3192((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field206.length) {
            return var2.field206[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cv.p(IIIIB)V")
    public static void method2065(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field209.method3192((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field209.method3191(var4, (long) arg0);
        }
        if (var4.field211.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field211.length; var7++) {
                var5[var7] = var4.field211[var7];
                var6[var7] = var4.field206[var7];
            }
            for (int var8 = var4.field211.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field211 = var5;
            var4.field206 = var6;
        }
        var4.field211[arg1] = arg2;
        var4.field206[arg1] = arg3;
    }
}
