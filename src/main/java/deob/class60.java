package deob;

@ObfuscatedName("bf")
public class class60 extends class181 {

    @ObfuscatedName("bf.c")
    public static class318 field516 = new class318(32);

    @ObfuscatedName("bf.x")
    public int[] field515 = new int[] { -1 };

    @ObfuscatedName("bf.t")
    public int[] field518 = new int[] { 0 };

    @ObfuscatedName("gc.c(III)I")
    public static int method3594(int arg0, int arg1) {
        class60 var2 = (class60) field516.method5524((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field515.length) {
            return var2.field515[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cj.x(III)I")
    public static int method2019(int arg0, int arg1) {
        class60 var2 = (class60) field516.method5524((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field518.length) {
            return var2.field518[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bo.t(III)I")
    public static int method1558(int arg0, int arg1) {
        class60 var2 = (class60) field516.method5524((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field518.length; var4++) {
                if (var2.field515[var4] == arg1) {
                    var3 += var2.field518[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ag.g(IIIIB)V")
    public static void method272(int arg0, int arg1, int arg2, int arg3) {
        class60 var4 = (class60) field516.method5524((long) arg0);
        if (var4 == null) {
            var4 = new class60();
            field516.method5517(var4, (long) arg0);
        }
        if (var4.field515.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field515.length; var7++) {
                var5[var7] = var4.field515[var7];
                var6[var7] = var4.field518[var7];
            }
            for (int var8 = var4.field515.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field515 = var5;
            var4.field518 = var6;
        }
        var4.field515[arg1] = arg2;
        var4.field518[arg1] = arg3;
    }

    @ObfuscatedName("hv.l(II)V")
    public static void method3801(int arg0) {
        class60 var1 = (class60) field516.method5524((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field515.length; var2++) {
                var1.field515[var2] = -1;
                var1.field518[var2] = 0;
            }
        }
    }

    @ObfuscatedName("eq.u(II)V")
    public static void method3053(int arg0) {
        class60 var1 = (class60) field516.method5524((long) arg0);
        if (var1 != null) {
            var1.method3326();
        }
    }

    @ObfuscatedName("kg.j(I)V")
    public static void method4864() {
        field516 = new class318(32);
    }
}
