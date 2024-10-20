package deob;

@ObfuscatedName("bz")
public class class64 extends class196 {

    @ObfuscatedName("bz.s")
    public static class194 field775 = new class194(32);

    @ObfuscatedName("bz.c")
    public int[] field774 = new int[] { -1 };

    @ObfuscatedName("bz.f")
    public int[] field772 = new int[] { 0 };

    @ObfuscatedName("ax.s(III)I")
    public static int method489(int arg0, int arg1) {
        class64 var2 = (class64) field775.method3339((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field774.length) {
            return var2.field774[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ag.c(IIIII)V")
    public static void method462(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) field775.method3339((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            field775.method3330(var4, (long) arg0);
        }
        if (var4.field774.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field774.length; var7++) {
                var5[var7] = var4.field774[var7];
                var6[var7] = var4.field772[var7];
            }
            for (int var8 = var4.field774.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field774 = var5;
            var4.field772 = var6;
        }
        var4.field774[arg1] = arg2;
        var4.field772[arg1] = arg3;
    }

    @ObfuscatedName("af.f(II)V")
    public static void method246(int arg0) {
        class64 var1 = (class64) field775.method3339((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field774.length; var2++) {
                var1.field774[var2] = -1;
                var1.field772[var2] = 0;
            }
        }
    }

    @ObfuscatedName("fm.m(II)V")
    public static void method2882(int arg0) {
        class64 var1 = (class64) field775.method3339((long) arg0);
        if (var1 != null) {
            var1.method3372();
        }
    }
}
