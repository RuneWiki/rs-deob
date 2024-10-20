package deob;

@ObfuscatedName("i")
public class class18 extends class178 {

    @ObfuscatedName("i.u")
    public static class174 field279 = new class174(32);

    @ObfuscatedName("i.k")
    public int[] field277 = new int[] { -1 };

    @ObfuscatedName("i.x")
    public int[] field285 = new int[] { 0 };

    @ObfuscatedName("a.u(III)I")
    public static int method63(int arg0, int arg1) {
        class18 var2 = (class18) field279.method3311((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field277.length) {
            return var2.field277[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("u.k(IIIII)V")
    public static void method4(int arg0, int arg1, int arg2, int arg3) {
        class18 var4 = (class18) field279.method3311((long) arg0);
        if (var4 == null) {
            var4 = new class18();
            field279.method3317(var4, (long) arg0);
        }
        if (var4.field277.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field277.length; var7++) {
                var5[var7] = var4.field277[var7];
                var6[var7] = var4.field285[var7];
            }
            for (int var8 = var4.field277.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field277 = var5;
            var4.field285 = var6;
        }
        var4.field277[arg1] = arg2;
        var4.field285[arg1] = arg3;
    }

    @ObfuscatedName("k.x(II)V")
    public static void method11(int arg0) {
        class18 var1 = (class18) field279.method3311((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field277.length; var2++) {
                var1.field277[var2] = -1;
                var1.field285[var2] = 0;
            }
        }
    }

    @ObfuscatedName("et.m(II)V")
    public static void method2912(int arg0) {
        class18 var1 = (class18) field279.method3311((long) arg0);
        if (var1 != null) {
            var1.method3357();
        }
    }

    @ObfuscatedName("n.n(B)V")
    public static void method41() {
        field279 = new class174(32);
    }
}
