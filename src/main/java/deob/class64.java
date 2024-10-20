package deob;

@ObfuscatedName("bx")
public class class64 extends class193 {

    @ObfuscatedName("bx.d")
    public static class191 field799 = new class191(32);

    @ObfuscatedName("bx.k")
    public int[] field796 = new int[] { -1 };

    @ObfuscatedName("bx.e")
    public int[] field801 = new int[] { 0 };

    @ObfuscatedName("aj.d(III)I")
    public static int method534(int arg0, int arg1) {
        class64 var2 = (class64) field799.method3352((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field796.length) {
            return var2.field796[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("as.k(IIIII)V")
    public static void method251(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) field799.method3352((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            field799.method3358(var4, (long) arg0);
        }
        if (var4.field796.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field796.length; var7++) {
                var5[var7] = var4.field796[var7];
                var6[var7] = var4.field801[var7];
            }
            for (int var8 = var4.field796.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field796 = var5;
            var4.field801 = var6;
        }
        var4.field796[arg1] = arg2;
        var4.field801[arg1] = arg3;
    }
}
