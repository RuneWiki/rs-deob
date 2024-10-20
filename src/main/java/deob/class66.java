package deob;

@ObfuscatedName("by")
public class class66 extends class217 {

    @ObfuscatedName("by.c")
    public static class215 field754 = new class215(32);

    @ObfuscatedName("by.i")
    public int[] field758 = new int[] { -1 };

    @ObfuscatedName("by.o")
    public int[] field753 = new int[] { 0 };

    @ObfuscatedName("ca.c(III)I")
    public static int method1509(int arg0, int arg1) {
        class66 var2 = (class66) field754.method3677((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field753.length) {
            return var2.field753[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("l.i(IIIIB)V")
    public static void method87(int arg0, int arg1, int arg2, int arg3) {
        class66 var4 = (class66) field754.method3677((long) arg0);
        if (var4 == null) {
            var4 = new class66();
            field754.method3668(var4, (long) arg0);
        }
        if (var4.field758.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field758.length; var7++) {
                var5[var7] = var4.field758[var7];
                var6[var7] = var4.field753[var7];
            }
            for (int var8 = var4.field758.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field758 = var5;
            var4.field753 = var6;
        }
        var4.field758[arg1] = arg2;
        var4.field753[arg1] = arg3;
    }

    @ObfuscatedName("hi.o(I)V")
    public static void method3828() {
        field754 = new class215(32);
    }
}
