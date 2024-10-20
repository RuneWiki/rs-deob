package deob;

@ObfuscatedName("bm")
public class class60 extends class181 {

    @ObfuscatedName("bm.u")
    public static class318 field543 = new class318(32);

    @ObfuscatedName("bm.f")
    public int[] field539 = new int[] { -1 };

    @ObfuscatedName("bm.b")
    public int[] field540 = new int[] { 0 };

    @ObfuscatedName("co.u(III)I")
    public static int method1903(int arg0, int arg1) {
        class60 var2 = (class60) field543.method5549((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field539.length) {
            return var2.field539[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("kx.f(IIB)I")
    public static int method4900(int arg0, int arg1) {
        class60 var2 = (class60) field543.method5549((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field540.length) {
            return var2.field540[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cp.b(III)I")
    public static int method2107(int arg0, int arg1) {
        class60 var2 = (class60) field543.method5549((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field540.length; var4++) {
                if (var2.field539[var4] == arg1) {
                    var3 += var2.field540[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("hh.g(IIIII)V")
    public static void method3806(int arg0, int arg1, int arg2, int arg3) {
        class60 var4 = (class60) field543.method5549((long) arg0);
        if (var4 == null) {
            var4 = new class60();
            field543.method5550(var4, (long) arg0);
        }
        if (var4.field539.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field539.length; var7++) {
                var5[var7] = var4.field539[var7];
                var6[var7] = var4.field540[var7];
            }
            for (int var8 = var4.field539.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field539 = var5;
            var4.field540 = var6;
        }
        var4.field539[arg1] = arg2;
        var4.field540[arg1] = arg3;
    }

    @ObfuscatedName("aq.z(IB)V")
    public static void method586(int arg0) {
        class60 var1 = (class60) field543.method5549((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field539.length; var2++) {
                var1.field539[var2] = -1;
                var1.field540[var2] = 0;
            }
        }
    }

    @ObfuscatedName("y.p(II)V")
    public static void method71(int arg0) {
        class60 var1 = (class60) field543.method5549((long) arg0);
        if (var1 != null) {
            var1.method3332();
        }
    }
}
