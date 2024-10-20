package deob;

@ObfuscatedName("i")
public class class15 extends class199 {

    @ObfuscatedName("i.o")
    public static class187 field206 = new class187(32);

    @ObfuscatedName("i.l")
    public int[] field205 = new int[] { -1 };

    @ObfuscatedName("i.g")
    public int[] field204 = new int[] { 0 };

    @ObfuscatedName("i.o(III)I")
    public static int method166(int arg0, int arg1) {
        class15 var2 = (class15) field206.method3435((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field205.length) {
            return var2.field205[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ap.l(III)I")
    public static int method746(int arg0, int arg1) {
        class15 var2 = (class15) field206.method3435((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field204.length; var4++) {
                if (var2.field205[var4] == arg1) {
                    var3 += var2.field204[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("a.g(IIIII)V")
    public static void method143(int arg0, int arg1, int arg2, int arg3) {
        class15 var4 = (class15) field206.method3435((long) arg0);
        if (var4 == null) {
            var4 = new class15();
            field206.method3436(var4, (long) arg0);
        }
        if (var4.field205.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field205.length; var7++) {
                var5[var7] = var4.field205[var7];
                var6[var7] = var4.field204[var7];
            }
            for (int var8 = var4.field205.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field205 = var5;
            var4.field204 = var6;
        }
        var4.field205[arg1] = arg2;
        var4.field204[arg1] = arg3;
    }

    @ObfuscatedName("cm.q(II)V")
    public static void method1844(int arg0) {
        class15 var1 = (class15) field206.method3435((long) arg0);
        if (var1 != null) {
            var1.method3564();
        }
    }

    @ObfuscatedName("a.r(B)V")
    public static void method145() {
        field206 = new class187(32);
    }
}
