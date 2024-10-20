package deob;

@ObfuscatedName("m")
public class class15 extends class198 {

    @ObfuscatedName("m.e")
    public static class186 field194 = new class186(32);

    @ObfuscatedName("m.a")
    public int[] field201 = new int[] { -1 };

    @ObfuscatedName("m.l")
    public int[] field193 = new int[] { 0 };

    @ObfuscatedName("cu.e(III)I")
    public static int method1929(int arg0, int arg1) {
        class15 var2 = (class15) field194.method3339((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field201.length) {
            return var2.field201[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("am.a(III)I")
    public static int method618(int arg0, int arg1) {
        class15 var2 = (class15) field194.method3339((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field193.length) {
            return var2.field193[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("e.l(IIIII)V")
    public static void method5(int arg0, int arg1, int arg2, int arg3) {
        class15 var4 = (class15) field194.method3339((long) arg0);
        if (var4 == null) {
            var4 = new class15();
            field194.method3338(var4, (long) arg0);
        }
        if (var4.field201.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field201.length; var7++) {
                var5[var7] = var4.field201[var7];
                var6[var7] = var4.field193[var7];
            }
            for (int var8 = var4.field201.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field201 = var5;
            var4.field193 = var6;
        }
        var4.field201[arg1] = arg2;
        var4.field193[arg1] = arg3;
    }

    @ObfuscatedName("x.c(IB)V")
    public static void method536(int arg0) {
        class15 var1 = (class15) field194.method3339((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field201.length; var2++) {
                var1.field201[var2] = -1;
                var1.field193[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ch.u(I)V")
    public static void method1655() {
        field194 = new class186(32);
    }
}
