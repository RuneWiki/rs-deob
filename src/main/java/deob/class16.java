package deob;

@ObfuscatedName("g")
public class class16 extends class208 {

    @ObfuscatedName("g.i")
    public static class196 field215 = new class196(32);

    @ObfuscatedName("g.v")
    public int[] field217 = new int[] { -1 };

    @ObfuscatedName("g.f")
    public int[] field214 = new int[] { 0 };

    @ObfuscatedName("eh.i(III)I")
    public static int method2736(int arg0, int arg1) {
        class16 var2 = (class16) field215.method3509((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field214.length; var4++) {
                if (var2.field217[var4] == arg1) {
                    var3 += var2.field214[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ce.v(IIIIB)V")
    public static void method2007(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field215.method3509((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field215.method3495(var4, (long) arg0);
        }
        if (var4.field217.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field217.length; var7++) {
                var5[var7] = var4.field217[var7];
                var6[var7] = var4.field214[var7];
            }
            for (int var8 = var4.field217.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field217 = var5;
            var4.field214 = var6;
        }
        var4.field217[arg1] = arg2;
        var4.field214[arg1] = arg3;
    }
}
