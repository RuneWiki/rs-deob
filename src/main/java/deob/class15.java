package deob;

@ObfuscatedName("i")
public class class15 extends class199 {

    @ObfuscatedName("i.b")
    public static class187 field194 = new class187(32);

    @ObfuscatedName("i.e")
    public int[] field196 = new int[] { -1 };

    @ObfuscatedName("i.a")
    public int[] field195 = new int[] { 0 };

    @ObfuscatedName("dt.b(IIB)I")
    public static int method2370(int arg0, int arg1) {
        class15 var2 = (class15) field194.method3297((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field196.length) {
            return var2.field196[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("n.e(III)I")
    public static int method142(int arg0, int arg1) {
        class15 var2 = (class15) field194.method3297((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field195.length) {
            return var2.field195[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ex.a(III)I")
    public static int method2737(int arg0, int arg1) {
        class15 var2 = (class15) field194.method3297((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field195.length; var4++) {
                if (var2.field196[var4] == arg1) {
                    var3 += var2.field195[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("t.k(IIIIB)V")
    public static void method183(int arg0, int arg1, int arg2, int arg3) {
        class15 var4 = (class15) field194.method3297((long) arg0);
        if (var4 == null) {
            var4 = new class15();
            field194.method3288(var4, (long) arg0);
        }
        if (var4.field196.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field196.length; var7++) {
                var5[var7] = var4.field196[var7];
                var6[var7] = var4.field195[var7];
            }
            for (int var8 = var4.field196.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field196 = var5;
            var4.field195 = var6;
        }
        var4.field196[arg1] = arg2;
        var4.field195[arg1] = arg3;
    }

    @ObfuscatedName("cj.p(II)V")
    public static void method2056(int arg0) {
        class15 var1 = (class15) field194.method3297((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field196.length; var2++) {
                var1.field196[var2] = -1;
                var1.field195[var2] = 0;
            }
        }
    }

    @ObfuscatedName("m.l(IB)V")
    public static void method104(int arg0) {
        class15 var1 = (class15) field194.method3297((long) arg0);
        if (var1 != null) {
            var1.method3414();
        }
    }
}
