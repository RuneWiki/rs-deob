package deob;

@ObfuscatedName("bm")
public class class64 extends class193 {

    @ObfuscatedName("bm.c")
    public static class191 field775 = new class191(32);

    @ObfuscatedName("bm.o")
    public int[] field780 = new int[] { -1 };

    @ObfuscatedName("bm.i")
    public int[] field776 = new int[] { 0 };

    @ObfuscatedName("jp.c(III)I")
    public static int method4304(int arg0, int arg1) {
        class64 var2 = (class64) field775.method3251((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field780.length) {
            return var2.field780[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("hz.o(IIIII)V")
    public static void method3696(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) field775.method3251((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            field775.method3239(var4, (long) arg0);
        }
        if (var4.field780.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field780.length; var7++) {
                var5[var7] = var4.field780[var7];
                var6[var7] = var4.field776[var7];
            }
            for (int var8 = var4.field780.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field780 = var5;
            var4.field776 = var6;
        }
        var4.field780[arg1] = arg2;
        var4.field776[arg1] = arg3;
    }
}
