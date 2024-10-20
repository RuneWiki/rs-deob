package deob;

@ObfuscatedName("bx")
public class class64 extends class194 {

    @ObfuscatedName("bx.e")
    public static class192 field775 = new class192(32);

    @ObfuscatedName("bx.n")
    public int[] field772 = new int[] { -1 };

    @ObfuscatedName("bx.g")
    public int[] field773 = new int[] { 0 };

    @ObfuscatedName("ex.e(III)I")
    public static int method2509(int arg0, int arg1) {
        class64 var2 = (class64) field775.method3294((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field773.length) {
            return var2.field773[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ak.n(IIIII)V")
    public static void method475(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) field775.method3294((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            field775.method3293(var4, (long) arg0);
        }
        if (var4.field772.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field772.length; var7++) {
                var5[var7] = var4.field772[var7];
                var6[var7] = var4.field773[var7];
            }
            for (int var8 = var4.field772.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field772 = var5;
            var4.field773 = var6;
        }
        var4.field772[arg1] = arg2;
        var4.field773[arg1] = arg3;
    }

    @ObfuscatedName("v.g(II)V")
    public static void method25(int arg0) {
        class64 var1 = (class64) field775.method3294((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field772.length; var2++) {
                var1.field772[var2] = -1;
                var1.field773[var2] = 0;
            }
        }
    }
}
