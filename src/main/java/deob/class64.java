package deob;

@ObfuscatedName("bx")
public class class64 extends class193 {

    @ObfuscatedName("bx.p")
    public static class191 field776 = new class191(32);

    @ObfuscatedName("bx.m")
    public int[] field773 = new int[] { -1 };

    @ObfuscatedName("bx.e")
    public int[] field774 = new int[] { 0 };

    @ObfuscatedName("as.p(III)I")
    public static int method541(int arg0, int arg1) {
        class64 var2 = (class64) field776.method3190((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field774.length; var4++) {
                if (var2.field773[var4] == arg1) {
                    var3 += var2.field774[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ct.m(IIIII)V")
    public static void method1542(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) field776.method3190((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            field776.method3191(var4, (long) arg0);
        }
        if (var4.field773.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field773.length; var7++) {
                var5[var7] = var4.field773[var7];
                var6[var7] = var4.field774[var7];
            }
            for (int var8 = var4.field773.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field773 = var5;
            var4.field774 = var6;
        }
        var4.field773[arg1] = arg2;
        var4.field774[arg1] = arg3;
    }

    @ObfuscatedName("bi.e(II)V")
    public static void method679(int arg0) {
        class64 var1 = (class64) field776.method3190((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field773.length; var2++) {
                var1.field773[var2] = -1;
                var1.field774[var2] = 0;
            }
        }
    }

    @ObfuscatedName("hz.t(II)V")
    public static void method3551(int arg0) {
        class64 var1 = (class64) field776.method3190((long) arg0);
        if (var1 != null) {
            var1.method3234();
        }
    }
}
