package deob;

@ObfuscatedName("bp")
public class class54 extends class205 {

    @ObfuscatedName("bp.z")
    public static class203 field475 = new class203(32);

    @ObfuscatedName("bp.w")
    public int[] field478 = new int[] { -1 };

    @ObfuscatedName("bp.s")
    public int[] field474 = new int[] { 0 };

    @ObfuscatedName("hi.z(III)I")
    public static int method4193(int arg0, int arg1) {
        class54 var2 = (class54) field475.method3712((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field478.length) {
            return var2.field478[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ec.w(III)I")
    public static int method2913(int arg0, int arg1) {
        class54 var2 = (class54) field475.method3712((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field474.length; var4++) {
                if (var2.field478[var4] == arg1) {
                    var3 += var2.field474[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("p.s(IIIII)V")
    public static void method97(int arg0, int arg1, int arg2, int arg3) {
        class54 var4 = (class54) field475.method3712((long) arg0);
        if (var4 == null) {
            var4 = new class54();
            field475.method3708(var4, (long) arg0);
        }
        if (var4.field478.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field478.length; var7++) {
                var5[var7] = var4.field478[var7];
                var6[var7] = var4.field474[var7];
            }
            for (int var8 = var4.field478.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field478 = var5;
            var4.field474 = var6;
        }
        var4.field478[arg1] = arg2;
        var4.field474[arg1] = arg3;
    }

    @ObfuscatedName("dw.l(IB)V")
    public static void method2578(int arg0) {
        class54 var1 = (class54) field475.method3712((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field478.length; var2++) {
                var1.field478[var2] = -1;
                var1.field474[var2] = 0;
            }
        }
    }

    @ObfuscatedName("fm.u(II)V")
    public static void method3210(int arg0) {
        class54 var1 = (class54) field475.method3712((long) arg0);
        if (var1 != null) {
            var1.method3756();
        }
    }
}
