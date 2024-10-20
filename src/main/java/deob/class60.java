package deob;

@ObfuscatedName("bc")
public class class60 extends class186 {

    @ObfuscatedName("bc.m")
    public static class319 field514 = new class319(32);

    @ObfuscatedName("bc.f")
    public int[] field515 = new int[] { -1 };

    @ObfuscatedName("bc.q")
    public int[] field516 = new int[] { 0 };

    @ObfuscatedName("cm.m(III)I")
    public static int method1852(int arg0, int arg1) {
        class60 var2 = (class60) field514.method5416((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field515.length) {
            return var2.field515[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("aj.f(III)I")
    public static int method385(int arg0, int arg1) {
        class60 var2 = (class60) field514.method5416((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field516.length) {
            return var2.field516[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("f.q(III)I")
    public static int method13(int arg0, int arg1) {
        class60 var2 = (class60) field514.method5416((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field516.length; var4++) {
                if (var2.field515[var4] == arg1) {
                    var3 += var2.field516[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("al.w(IIIII)V")
    public static void method579(int arg0, int arg1, int arg2, int arg3) {
        class60 var4 = (class60) field514.method5416((long) arg0);
        if (var4 == null) {
            var4 = new class60();
            field514.method5412(var4, (long) arg0);
        }
        if (var4.field515.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field515.length; var7++) {
                var5[var7] = var4.field515[var7];
                var6[var7] = var4.field516[var7];
            }
            for (int var8 = var4.field515.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field515 = var5;
            var4.field516 = var6;
        }
        var4.field515[arg1] = arg2;
        var4.field516[arg1] = arg3;
    }

    @ObfuscatedName("ij.o(II)V")
    public static void method4147(int arg0) {
        class60 var1 = (class60) field514.method5416((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field515.length; var2++) {
                var1.field515[var2] = -1;
                var1.field516[var2] = 0;
            }
        }
    }

    @ObfuscatedName("cg.u(IB)V")
    public static void method2032(int arg0) {
        class60 var1 = (class60) field514.method5416((long) arg0);
        if (var1 != null) {
            var1.method3306();
        }
    }

    @ObfuscatedName("hp.g(I)V")
    public static void method3995() {
        field514 = new class319(32);
    }
}
