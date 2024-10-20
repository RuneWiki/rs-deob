package deob;

@ObfuscatedName("k")
public class class19 extends class179 {

    @ObfuscatedName("k.j")
    public static class175 field281 = new class175(32);

    @ObfuscatedName("k.f")
    public int[] field279 = new int[] { -1 };

    @ObfuscatedName("k.o")
    public int[] field285 = new int[] { 0 };

    @ObfuscatedName("dv.j(III)I")
    public static int method2231(int arg0, int arg1) {
        class19 var2 = (class19) field281.method3296((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field285.length) {
            return var2.field285[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dj.f(IIIII)V")
    public static void method2216(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field281.method3296((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field281.method3297(var4, (long) arg0);
        }
        if (var4.field279.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field279.length; var7++) {
                var5[var7] = var4.field279[var7];
                var6[var7] = var4.field285[var7];
            }
            for (int var8 = var4.field279.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field279 = var5;
            var4.field285 = var6;
        }
        var4.field279[arg1] = arg2;
        var4.field285[arg1] = arg3;
    }

    @ObfuscatedName("bp.o(IB)V")
    public static void method1391(int arg0) {
        class19 var1 = (class19) field281.method3296((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field279.length; var2++) {
                var1.field279[var2] = -1;
                var1.field285[var2] = 0;
            }
        }
    }

    @ObfuscatedName("aw.h(II)V")
    public static void method246(int arg0) {
        class19 var1 = (class19) field281.method3296((long) arg0);
        if (var1 != null) {
            var1.method3349();
        }
    }

    @ObfuscatedName("aa.u(I)V")
    public static void method879() {
        field281 = new class175(32);
    }
}
