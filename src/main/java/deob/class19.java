package deob;

@ObfuscatedName("g")
public class class19 extends class179 {

    @ObfuscatedName("g.x")
    public static class175 field256 = new class175(32);

    @ObfuscatedName("g.p")
    public int[] field262 = new int[] { -1 };

    @ObfuscatedName("g.k")
    public int[] field255 = new int[] { 0 };

    @ObfuscatedName("c.x(IIB)I")
    public static int method126(int arg0, int arg1) {
        class19 var2 = (class19) field256.method3259((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field255.length) {
            return var2.field255[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ed.p(III)I")
    public static int method2886(int arg0, int arg1) {
        class19 var2 = (class19) field256.method3259((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field255.length; var4++) {
                if (var2.field262[var4] == arg1) {
                    var3 += var2.field255[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("cg.k(IIIII)V")
    public static void method1810(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field256.method3259((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field256.method3253(var4, (long) arg0);
        }
        if (var4.field262.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field262.length; var7++) {
                var5[var7] = var4.field262[var7];
                var6[var7] = var4.field255[var7];
            }
            for (int var8 = var4.field262.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field262 = var5;
            var4.field255 = var6;
        }
        var4.field262[arg1] = arg2;
        var4.field255[arg1] = arg3;
    }

    @ObfuscatedName("ba.a(IB)V")
    public static void method1392(int arg0) {
        class19 var1 = (class19) field256.method3259((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field262.length; var2++) {
                var1.field262[var2] = -1;
                var1.field255[var2] = 0;
            }
        }
    }
}
