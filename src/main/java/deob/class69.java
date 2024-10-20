package deob;

@ObfuscatedName("bb")
public class class69 extends class190 {

    @ObfuscatedName("bb.z")
    public static class328 field555 = new class328(32);

    @ObfuscatedName("bb.k")
    public int[] field553 = new int[] { -1 };

    @ObfuscatedName("bb.s")
    public int[] field557 = new int[] { 0 };

    @ObfuscatedName("iy.z(III)I")
    public static int method4212(int arg0, int arg1) {
        class69 var2 = (class69) field555.method5611((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field553.length) {
            return var2.field553[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("fk.k(III)I")
    public static int method3233(int arg0, int arg1) {
        class69 var2 = (class69) field555.method5611((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field557.length) {
            return var2.field557[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("fh.s(III)I")
    public static int method3337(int arg0, int arg1) {
        class69 var2 = (class69) field555.method5611((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field557.length; var4++) {
                if (var2.field553[var4] == arg1) {
                    var3 += var2.field557[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ge.t(IIIII)V")
    public static void method3596(int arg0, int arg1, int arg2, int arg3) {
        class69 var4 = (class69) field555.method5611((long) arg0);
        if (var4 == null) {
            var4 = new class69();
            field555.method5606(var4, (long) arg0);
        }
        if (var4.field553.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field553.length; var7++) {
                var5[var7] = var4.field553[var7];
                var6[var7] = var4.field557[var7];
            }
            for (int var8 = var4.field553.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field553 = var5;
            var4.field557 = var6;
        }
        var4.field553[arg1] = arg2;
        var4.field557[arg1] = arg3;
    }

    @ObfuscatedName("l.o(II)V")
    public static void method229(int arg0) {
        class69 var1 = (class69) field555.method5611((long) arg0);
        if (var1 != null) {
            var1.method3401();
        }
    }
}
