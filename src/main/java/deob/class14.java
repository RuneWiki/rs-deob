package deob;

@ObfuscatedName("x")
public class class14 extends class191 {

    @ObfuscatedName("x.a")
    public static class179 field213 = new class179(32);

    @ObfuscatedName("x.v")
    public int[] field199 = new int[] { -1 };

    @ObfuscatedName("x.i")
    public int[] field198 = new int[] { 0 };

    @ObfuscatedName("dp.a(IIS)I")
    public static int method2080(int arg0, int arg1) {
        class14 var2 = (class14) field213.method3231((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field198.length) {
            return var2.field198[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ak.v(IIB)I")
    public static int method907(int arg0, int arg1) {
        class14 var2 = (class14) field213.method3231((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field198.length; var4++) {
                if (var2.field199[var4] == arg1) {
                    var3 += var2.field198[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ep.i(IIIII)V")
    public static void method2587(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field213.method3231((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field213.method3211(var4, (long) arg0);
        }
        if (var4.field199.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field199.length; var7++) {
                var5[var7] = var4.field199[var7];
                var6[var7] = var4.field198[var7];
            }
            for (int var8 = var4.field199.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field199 = var5;
            var4.field198 = var6;
        }
        var4.field199[arg1] = arg2;
        var4.field198[arg1] = arg3;
    }

    @ObfuscatedName("dx.b(II)V")
    public static void method2537(int arg0) {
        class14 var1 = (class14) field213.method3231((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field199.length; var2++) {
                var1.field199[var2] = -1;
                var1.field198[var2] = 0;
            }
        }
    }

    @ObfuscatedName("cu.l(II)V")
    public static void method2060(int arg0) {
        class14 var1 = (class14) field213.method3231((long) arg0);
        if (var1 != null) {
            var1.method3343();
        }
    }

    @ObfuscatedName("gv.m(S)V")
    public static void method3403() {
        field213 = new class179(32);
    }
}
