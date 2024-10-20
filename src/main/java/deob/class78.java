package deob;

@ObfuscatedName("bs")
public class class78 extends class412 {

    @ObfuscatedName("bs.c")
    public static class422 field1022 = new class422(32);

    @ObfuscatedName("bs.p")
    public int[] field1024 = new int[] { -1 };

    @ObfuscatedName("bs.f")
    public int[] field1021 = new int[] { 0 };

    @ObfuscatedName("ew.c(IIS)I")
    public static int method2995(int arg0, int arg1) {
        class78 var2 = (class78) field1022.method6941((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1024.length) {
            return var2.field1024[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ai.p(III)I")
    public static int method584(int arg0, int arg1) {
        class78 var2 = (class78) field1022.method6941((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1021.length) {
            return var2.field1021[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("nh.f(IIS)I")
    public static int method6203(int arg0, int arg1) {
        class78 var2 = (class78) field1022.method6941((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1021.length; var4++) {
                if (var2.field1024[var4] == arg1) {
                    var3 += var2.field1021[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ao.n(IIIII)V")
    public static void method403(int arg0, int arg1, int arg2, int arg3) {
        class78 var4 = (class78) field1022.method6941((long) arg0);
        if (var4 == null) {
            var4 = new class78();
            field1022.method6948(var4, (long) arg0);
        }
        if (var4.field1024.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1024.length; var7++) {
                var5[var7] = var4.field1024[var7];
                var6[var7] = var4.field1021[var7];
            }
            for (int var8 = var4.field1024.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1024 = var5;
            var4.field1021 = var6;
        }
        var4.field1024[arg1] = arg2;
        var4.field1021[arg1] = arg3;
    }

    @ObfuscatedName("fo.k(IB)V")
    public static void method3172(int arg0) {
        class78 var1 = (class78) field1022.method6941((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1024.length; var2++) {
                var1.field1024[var2] = -1;
                var1.field1021[var2] = 0;
            }
        }
    }

    @ObfuscatedName("aa.w(II)V")
    public static void method633(int arg0) {
        class78 var1 = (class78) field1022.method6941((long) arg0);
        if (var1 != null) {
            var1.method6657();
        }
    }

    @ObfuscatedName("aa.s(I)V")
    public static void method634() {
        field1022 = new class422(32);
    }
}
