package deob;

@ObfuscatedName("b")
public class class19 extends class179 {

    @ObfuscatedName("b.i")
    public static class175 field293 = new class175(32);

    @ObfuscatedName("b.v")
    public int[] field297 = new int[] { -1 };

    @ObfuscatedName("b.m")
    public int[] field287 = new int[] { 0 };

    @ObfuscatedName("ak.i(III)I")
    public static int method663(int arg0, int arg1) {
        class19 var2 = (class19) field293.method3348((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field287.length; var4++) {
                if (var2.field297[var4] == arg1) {
                    var3 += var2.field287[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("cc.v(IIIII)V")
    public static void method2168(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field293.method3348((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field293.method3349(var4, (long) arg0);
        }
        if (var4.field297.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field297.length; var7++) {
                var5[var7] = var4.field297[var7];
                var6[var7] = var4.field287[var7];
            }
            for (int var8 = var4.field297.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field297 = var5;
            var4.field287 = var6;
        }
        var4.field297[arg1] = arg2;
        var4.field287[arg1] = arg3;
    }

    @ObfuscatedName("r.m(IB)V")
    public static void method220(int arg0) {
        class19 var1 = (class19) field293.method3348((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field297.length; var2++) {
                var1.field297[var2] = -1;
                var1.field287[var2] = 0;
            }
        }
    }

    @ObfuscatedName("c.j(B)V")
    public static void method90() {
        field293 = new class175(32);
    }
}
