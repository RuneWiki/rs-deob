package deob;

@ObfuscatedName("bc")
public class class60 extends class188 {

    @ObfuscatedName("bc.f")
    public static class318 field522 = new class318(32);

    @ObfuscatedName("bc.i")
    public int[] field519 = new int[] { -1 };

    @ObfuscatedName("bc.y")
    public int[] field521 = new int[] { 0 };

    @ObfuscatedName("fy.f(III)I")
    public static int method3155(int arg0, int arg1) {
        class60 var2 = (class60) field522.method5499((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field519.length) {
            return var2.field519[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("e.i(III)I")
    public static int method55(int arg0, int arg1) {
        class60 var2 = (class60) field522.method5499((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field521.length) {
            return var2.field521[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("c.y(III)I")
    public static int method98(int arg0, int arg1) {
        class60 var2 = (class60) field522.method5499((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field521.length; var4++) {
                if (var2.field519[var4] == arg1) {
                    var3 += var2.field521[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("af.w(IIIIB)V")
    public static void method715(int arg0, int arg1, int arg2, int arg3) {
        class60 var4 = (class60) field522.method5499((long) arg0);
        if (var4 == null) {
            var4 = new class60();
            field522.method5502(var4, (long) arg0);
        }
        if (var4.field519.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field519.length; var7++) {
                var5[var7] = var4.field519[var7];
                var6[var7] = var4.field521[var7];
            }
            for (int var8 = var4.field519.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field519 = var5;
            var4.field521 = var6;
        }
        var4.field519[arg1] = arg2;
        var4.field521[arg1] = arg3;
    }

    @ObfuscatedName("b.b(II)V")
    public static void method50(int arg0) {
        class60 var1 = (class60) field522.method5499((long) arg0);
        if (var1 != null) {
            var1.method3292();
        }
    }
}
