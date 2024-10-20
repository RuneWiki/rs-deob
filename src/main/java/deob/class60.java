package deob;

@ObfuscatedName("bm")
public class class60 extends class212 {

    @ObfuscatedName("bm.n")
    public static class210 field538 = new class210(32);

    @ObfuscatedName("bm.h")
    public int[] field531 = new int[] { -1 };

    @ObfuscatedName("bm.l")
    public int[] field535 = new int[] { 0 };

    @ObfuscatedName("bf.n(III)I")
    public static int method897(int arg0, int arg1) {
        class60 var2 = (class60) field538.method3934((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field531.length) {
            return var2.field531[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bf.h(III)I")
    public static int method894(int arg0, int arg1) {
        class60 var2 = (class60) field538.method3934((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field535.length) {
            return var2.field535[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ii.l(III)I")
    public static int method4361(int arg0, int arg1) {
        class60 var2 = (class60) field538.method3934((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field535.length; var4++) {
                if (var2.field531[var4] == arg1) {
                    var3 += var2.field535[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("er.g(IIIIB)V")
    public static void method3197(int arg0, int arg1, int arg2, int arg3) {
        class60 var4 = (class60) field538.method3934((long) arg0);
        if (var4 == null) {
            var4 = new class60();
            field538.method3935(var4, (long) arg0);
        }
        if (var4.field531.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field531.length; var7++) {
                var5[var7] = var4.field531[var7];
                var6[var7] = var4.field535[var7];
            }
            for (int var8 = var4.field531.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field531 = var5;
            var4.field535 = var6;
        }
        var4.field531[arg1] = arg2;
        var4.field535[arg1] = arg3;
    }

    @ObfuscatedName("jg.b(II)V")
    public static void method4736(int arg0) {
        class60 var1 = (class60) field538.method3934((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field531.length; var2++) {
                var1.field531[var2] = -1;
                var1.field535[var2] = 0;
            }
        }
    }

    @ObfuscatedName("fw.a(II)V")
    public static void method3382(int arg0) {
        class60 var1 = (class60) field538.method3934((long) arg0);
        if (var1 != null) {
            var1.method3973();
        }
    }

    @ObfuscatedName("ae.c(I)V")
    public static void method642() {
        field538 = new class210(32);
    }
}
