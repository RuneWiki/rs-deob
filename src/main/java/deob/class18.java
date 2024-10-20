package deob;

@ObfuscatedName("t")
public class class18 extends class177 {

    @ObfuscatedName("t.c")
    public static class173 field276 = new class173(32);

    @ObfuscatedName("t.j")
    public int[] field274 = new int[] { -1 };

    @ObfuscatedName("t.f")
    public int[] field275 = new int[] { 0 };

    @ObfuscatedName("ey.c(III)I")
    public static int method2706(int arg0, int arg1) {
        class18 var2 = (class18) field276.method3129((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field274.length) {
            return var2.field274[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("t.j(IIB)I")
    public static int method148(int arg0, int arg1) {
        class18 var2 = (class18) field276.method3129((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field275.length) {
            return var2.field275[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("v.f(III)I")
    public static int method208(int arg0, int arg1) {
        class18 var2 = (class18) field276.method3129((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field275.length; var4++) {
                if (var2.field274[var4] == arg1) {
                    var3 += var2.field275[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("y.y(IIIII)V")
    public static void method23(int arg0, int arg1, int arg2, int arg3) {
        class18 var4 = (class18) field276.method3129((long) arg0);
        if (var4 == null) {
            var4 = new class18();
            field276.method3137(var4, (long) arg0);
        }
        if (var4.field274.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field274.length; var7++) {
                var5[var7] = var4.field274[var7];
                var6[var7] = var4.field275[var7];
            }
            for (int var8 = var4.field274.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field274 = var5;
            var4.field275 = var6;
        }
        var4.field274[arg1] = arg2;
        var4.field275[arg1] = arg3;
    }

    @ObfuscatedName("r.x(IS)V")
    public static void method113(int arg0) {
        class18 var1 = (class18) field276.method3129((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field274.length; var2++) {
                var1.field274[var2] = -1;
                var1.field275[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ag.e(I)V")
    public static void method779() {
        field276 = new class173(32);
    }
}
