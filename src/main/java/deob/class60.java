package deob;

@ObfuscatedName("bv")
public class class60 extends class212 {

    @ObfuscatedName("bv.a")
    public static class210 field556 = new class210(32);

    @ObfuscatedName("bv.s")
    public int[] field549 = new int[] { -1 };

    @ObfuscatedName("bv.g")
    public int[] field550 = new int[] { 0 };

    @ObfuscatedName("dx.a(IIS)I")
    public static int method2536(int arg0, int arg1) {
        class60 var2 = (class60) field556.method3911((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field549.length) {
            return var2.field549[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("az.s(III)I")
    public static int method695(int arg0, int arg1) {
        class60 var2 = (class60) field556.method3911((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field550.length) {
            return var2.field550[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("fv.g(IIB)I")
    public static int method3360(int arg0, int arg1) {
        class60 var2 = (class60) field556.method3911((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field550.length; var4++) {
                if (var2.field549[var4] == arg1) {
                    var3 += var2.field550[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("l.x(IIIII)V")
    public static void method164(int arg0, int arg1, int arg2, int arg3) {
        class60 var4 = (class60) field556.method3911((long) arg0);
        if (var4 == null) {
            var4 = new class60();
            field556.method3920(var4, (long) arg0);
        }
        if (var4.field549.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field549.length; var7++) {
                var5[var7] = var4.field549[var7];
                var6[var7] = var4.field550[var7];
            }
            for (int var8 = var4.field549.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field549 = var5;
            var4.field550 = var6;
        }
        var4.field549[arg1] = arg2;
        var4.field550[arg1] = arg3;
    }

    @ObfuscatedName("ac.h(II)V")
    public static void method701(int arg0) {
        class60 var1 = (class60) field556.method3911((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field549.length; var2++) {
                var1.field549[var2] = -1;
                var1.field550[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ay.f(II)V")
    public static void method381(int arg0) {
        class60 var1 = (class60) field556.method3911((long) arg0);
        if (var1 != null) {
            var1.method3960();
        }
    }

    @ObfuscatedName("eo.p(I)V")
    public static void method3067() {
        field556 = new class210(32);
    }
}
