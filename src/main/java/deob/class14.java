package deob;

@ObfuscatedName("w")
public class class14 extends class186 {

    @ObfuscatedName("w.t")
    public static class174 field198 = new class174(32);

    @ObfuscatedName("w.s")
    public int[] field190 = new int[] { -1 };

    @ObfuscatedName("w.f")
    public int[] field191 = new int[] { 0 };

    @ObfuscatedName("ay.t(III)I")
    public static int method871(int arg0, int arg1) {
        class14 var2 = (class14) field198.method3204((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field190.length) {
            return var2.field190[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("v.s(IIIII)V")
    public static void method92(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field198.method3204((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field198.method3212(var4, (long) arg0);
        }
        if (var4.field190.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field190.length; var7++) {
                var5[var7] = var4.field190[var7];
                var6[var7] = var4.field191[var7];
            }
            for (int var8 = var4.field190.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field190 = var5;
            var4.field191 = var6;
        }
        var4.field190[arg1] = arg2;
        var4.field191[arg1] = arg3;
    }

    @ObfuscatedName("ae.f(IB)V")
    public static void method574(int arg0) {
        class14 var1 = (class14) field198.method3204((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field190.length; var2++) {
                var1.field190[var2] = -1;
                var1.field191[var2] = 0;
            }
        }
    }

    @ObfuscatedName("cr.e(II)V")
    public static void method1746(int arg0) {
        class14 var1 = (class14) field198.method3204((long) arg0);
        if (var1 != null) {
            var1.method3316();
        }
    }

    @ObfuscatedName("cu.d(I)V")
    public static void method2050() {
        field198 = new class174(32);
    }
}
