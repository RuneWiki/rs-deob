package deob;

@ObfuscatedName("bv")
public class class60 extends class181 {

    @ObfuscatedName("bv.s")
    public static class318 field521 = new class318(32);

    @ObfuscatedName("bv.j")
    public int[] field517 = new int[] { -1 };

    @ObfuscatedName("bv.i")
    public int[] field518 = new int[] { 0 };

    @ObfuscatedName("gk.s(III)I")
    public static int method3364(int arg0, int arg1) {
        class60 var2 = (class60) field521.method5434((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field517.length) {
            return var2.field517[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("db.j(III)I")
    public static int method2303(int arg0, int arg1) {
        class60 var2 = (class60) field521.method5434((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field518.length) {
            return var2.field518[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ap.i(III)I")
    public static int method638(int arg0, int arg1) {
        class60 var2 = (class60) field521.method5434((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field518.length; var4++) {
                if (var2.field517[var4] == arg1) {
                    var3 += var2.field518[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ah.k(IIIII)V")
    public static void method682(int arg0, int arg1, int arg2, int arg3) {
        class60 var4 = (class60) field521.method5434((long) arg0);
        if (var4 == null) {
            var4 = new class60();
            field521.method5429(var4, (long) arg0);
        }
        if (var4.field517.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field517.length; var7++) {
                var5[var7] = var4.field517[var7];
                var6[var7] = var4.field518[var7];
            }
            for (int var8 = var4.field517.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field517 = var5;
            var4.field518 = var6;
        }
        var4.field517[arg1] = arg2;
        var4.field518[arg1] = arg3;
    }

    @ObfuscatedName("y.u(II)V")
    public static void method138(int arg0) {
        class60 var1 = (class60) field521.method5434((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field517.length; var2++) {
                var1.field517[var2] = -1;
                var1.field518[var2] = 0;
            }
        }
    }

    @ObfuscatedName("j.n(II)V")
    public static void method15(int arg0) {
        class60 var1 = (class60) field521.method5434((long) arg0);
        if (var1 != null) {
            var1.method3304();
        }
    }
}
