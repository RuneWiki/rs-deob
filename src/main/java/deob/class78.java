package deob;

@ObfuscatedName("bq")
public class class78 extends class370 {

    @ObfuscatedName("bq.i")
    public static class380 field996 = new class380(32);

    @ObfuscatedName("bq.w")
    public int[] field993 = new int[] { -1 };

    @ObfuscatedName("bq.s")
    public int[] field991 = new int[] { 0 };

    @ObfuscatedName("bp.i(III)I")
    public static int method1887(int arg0, int arg1) {
        class78 var2 = (class78) field996.method6034((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field993.length) {
            return var2.field993[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bt.w(IIB)I")
    public static int method1045(int arg0, int arg1) {
        class78 var2 = (class78) field996.method6034((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field991.length) {
            return var2.field991[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("gc.s(III)I")
    public static int method3535(int arg0, int arg1) {
        class78 var2 = (class78) field996.method6034((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field991.length; var4++) {
                if (var2.field993[var4] == arg1) {
                    var3 += var2.field991[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("bn.a(IIIII)V")
    public static void method1894(int arg0, int arg1, int arg2, int arg3) {
        class78 var4 = (class78) field996.method6034((long) arg0);
        if (var4 == null) {
            var4 = new class78();
            field996.method6027(var4, (long) arg0);
        }
        if (var4.field993.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field993.length; var7++) {
                var5[var7] = var4.field993[var7];
                var6[var7] = var4.field991[var7];
            }
            for (int var8 = var4.field993.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field993 = var5;
            var4.field991 = var6;
        }
        var4.field993[arg1] = arg2;
        var4.field991[arg1] = arg3;
    }

    @ObfuscatedName("r.o(II)V")
    public static void method292(int arg0) {
        class78 var1 = (class78) field996.method6034((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field993.length; var2++) {
                var1.field993[var2] = -1;
                var1.field991[var2] = 0;
            }
        }
    }

    @ObfuscatedName("dm.g(II)V")
    public static void method2496(int arg0) {
        class78 var1 = (class78) field996.method6034((long) arg0);
        if (var1 != null) {
            var1.method5752();
        }
    }

    @ObfuscatedName("kp.e(B)V")
    public static void method4916() {
        field996 = new class380(32);
    }
}
