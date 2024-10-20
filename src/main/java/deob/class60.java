package deob;

@ObfuscatedName("bc")
public class class60 extends class181 {

    @ObfuscatedName("bc.q")
    public static class319 field553 = new class319(32);

    @ObfuscatedName("bc.w")
    public int[] field551 = new int[] { -1 };

    @ObfuscatedName("bc.e")
    public int[] field552 = new int[] { 0 };

    @ObfuscatedName("o.q(IIB)I")
    public static int method254(int arg0, int arg1) {
        class60 var2 = (class60) field553.method5479((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field551.length) {
            return var2.field551[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("e.w(III)I")
    public static int method18(int arg0, int arg1) {
        class60 var2 = (class60) field553.method5479((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field552.length) {
            return var2.field552[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("mn.e(III)I")
    public static int method6044(int arg0, int arg1) {
        class60 var2 = (class60) field553.method5479((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field552.length; var4++) {
                if (var2.field551[var4] == arg1) {
                    var3 += var2.field552[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("x.p(IIIII)V")
    public static void method120(int arg0, int arg1, int arg2, int arg3) {
        class60 var4 = (class60) field553.method5479((long) arg0);
        if (var4 == null) {
            var4 = new class60();
            field553.method5478(var4, (long) arg0);
        }
        if (var4.field551.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field551.length; var7++) {
                var5[var7] = var4.field551[var7];
                var6[var7] = var4.field552[var7];
            }
            for (int var8 = var4.field551.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field551 = var5;
            var4.field552 = var6;
        }
        var4.field551[arg1] = arg2;
        var4.field552[arg1] = arg3;
    }

    @ObfuscatedName("x.k(II)V")
    public static void method130(int arg0) {
        class60 var1 = (class60) field553.method5479((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field551.length; var2++) {
                var1.field551[var2] = -1;
                var1.field552[var2] = 0;
            }
        }
    }

    @ObfuscatedName("dc.l(IB)V")
    public static void method2507(int arg0) {
        class60 var1 = (class60) field553.method5479((long) arg0);
        if (var1 != null) {
            var1.method3286();
        }
    }
}
