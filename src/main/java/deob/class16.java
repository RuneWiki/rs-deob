package deob;

@ObfuscatedName("n")
public class class16 extends class209 {

    @ObfuscatedName("n.a")
    public static class197 field231 = new class197(32);

    @ObfuscatedName("n.w")
    public int[] field230 = new int[] { -1 };

    @ObfuscatedName("n.d")
    public int[] field235 = new int[] { 0 };

    @ObfuscatedName("k.a(III)I")
    public static int method58(int arg0, int arg1) {
        class16 var2 = (class16) field231.method3607((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field230.length) {
            return var2.field230[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("an.w(III)I")
    public static int method788(int arg0, int arg1) {
        class16 var2 = (class16) field231.method3607((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field235.length) {
            return var2.field235[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("aj.d(IIIIB)V")
    public static void method989(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field231.method3607((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field231.method3614(var4, (long) arg0);
        }
        if (var4.field230.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field230.length; var7++) {
                var5[var7] = var4.field230[var7];
                var6[var7] = var4.field235[var7];
            }
            for (int var8 = var4.field230.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field230 = var5;
            var4.field235 = var6;
        }
        var4.field230[arg1] = arg2;
        var4.field235[arg1] = arg3;
    }

    @ObfuscatedName("gg.c(I)V")
    public static void method3454() {
        field231 = new class197(32);
    }
}
