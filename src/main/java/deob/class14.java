package deob;

@ObfuscatedName("s")
public class class14 extends class191 {

    @ObfuscatedName("s.v")
    public static class179 field201 = new class179(32);

    @ObfuscatedName("s.t")
    public int[] field196 = new int[] { -1 };

    @ObfuscatedName("s.f")
    public int[] field198 = new int[] { 0 };

    @ObfuscatedName("ax.v(III)I")
    public static int method750(int arg0, int arg1) {
        class14 var2 = (class14) field201.method3274((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field198.length) {
            return var2.field198[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("an.t(III)I")
    public static int method621(int arg0, int arg1) {
        class14 var2 = (class14) field201.method3274((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field198.length; var4++) {
                if (var2.field196[var4] == arg1) {
                    var3 += var2.field198[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("aj.f(IIIII)V")
    public static void method603(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field201.method3274((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field201.method3282(var4, (long) arg0);
        }
        if (var4.field196.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field196.length; var7++) {
                var5[var7] = var4.field196[var7];
                var6[var7] = var4.field198[var7];
            }
            for (int var8 = var4.field196.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field196 = var5;
            var4.field198 = var6;
        }
        var4.field196[arg1] = arg2;
        var4.field198[arg1] = arg3;
    }

    @ObfuscatedName("k.j(B)V")
    public static void method70() {
        field201 = new class179(32);
    }
}
