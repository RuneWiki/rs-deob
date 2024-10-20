package deob;

@ObfuscatedName("b")
public class class14 extends class186 {

    @ObfuscatedName("b.t")
    public static class174 field203 = new class174(32);

    @ObfuscatedName("b.o")
    public int[] field201 = new int[] { -1 };

    @ObfuscatedName("b.i")
    public int[] field202 = new int[] { 0 };

    @ObfuscatedName("y.t(III)I")
    public static int method69(int arg0, int arg1) {
        class14 var2 = (class14) field203.method3138((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field201.length) {
            return var2.field201[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cy.o(III)I")
    public static int method1967(int arg0, int arg1) {
        class14 var2 = (class14) field203.method3138((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field202.length; var4++) {
                if (var2.field201[var4] == arg1) {
                    var3 += var2.field202[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("aj.i(IIIII)V")
    public static void method633(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field203.method3138((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field203.method3132(var4, (long) arg0);
        }
        if (var4.field201.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field201.length; var7++) {
                var5[var7] = var4.field201[var7];
                var6[var7] = var4.field202[var7];
            }
            for (int var8 = var4.field201.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field201 = var5;
            var4.field202 = var6;
        }
        var4.field201[arg1] = arg2;
        var4.field202[arg1] = arg3;
    }

    @ObfuscatedName("en.p(II)V")
    public static void method2630(int arg0) {
        class14 var1 = (class14) field203.method3138((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field201.length; var2++) {
                var1.field201[var2] = -1;
                var1.field202[var2] = 0;
            }
        }
    }

    @ObfuscatedName("cr.c(II)V")
    public static void method1768(int arg0) {
        class14 var1 = (class14) field203.method3138((long) arg0);
        if (var1 != null) {
            var1.method3261();
        }
    }

    @ObfuscatedName("aj.y(B)V")
    public static void method614() {
        field203 = new class174(32);
    }
}
