package deob;

@ObfuscatedName("r")
public class class14 extends class189 {

    @ObfuscatedName("r.e")
    public static class177 field197 = new class177(32);

    @ObfuscatedName("r.v")
    public int[] field194 = new int[] { -1 };

    @ObfuscatedName("r.k")
    public int[] field193 = new int[] { 0 };

    @ObfuscatedName("eb.e(III)I")
    public static int method2676(int arg0, int arg1) {
        class14 var2 = (class14) field197.method3192((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field193.length) {
            return var2.field193[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("j.v(IIIIB)V")
    public static void method127(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field197.method3192((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field197.method3193(var4, (long) arg0);
        }
        if (var4.field194.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field194.length; var7++) {
                var5[var7] = var4.field194[var7];
                var6[var7] = var4.field193[var7];
            }
            for (int var8 = var4.field194.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field194 = var5;
            var4.field193 = var6;
        }
        var4.field194[arg1] = arg2;
        var4.field193[arg1] = arg3;
    }

    @ObfuscatedName("ew.k(II)V")
    public static void method2708(int arg0) {
        class14 var1 = (class14) field197.method3192((long) arg0);
        if (var1 != null) {
            var1.method3324();
        }
    }
}
