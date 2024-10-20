package deob;

@ObfuscatedName("b")
public class class16 extends class208 {

    @ObfuscatedName("b.y")
    public static class196 field228 = new class196(32);

    @ObfuscatedName("b.d")
    public int[] field224 = new int[] { -1 };

    @ObfuscatedName("b.g")
    public int[] field225 = new int[] { 0 };

    @ObfuscatedName("t.y(III)I")
    public static int method586(int arg0, int arg1) {
        class16 var2 = (class16) field228.method3459((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field225.length) {
            return var2.field225[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("es.d(IIIII)V")
    public static void method2704(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field228.method3459((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field228.method3460(var4, (long) arg0);
        }
        if (var4.field224.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field224.length; var7++) {
                var5[var7] = var4.field224[var7];
                var6[var7] = var4.field225[var7];
            }
            for (int var8 = var4.field224.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field224 = var5;
            var4.field225 = var6;
        }
        var4.field224[arg1] = arg2;
        var4.field225[arg1] = arg3;
    }

    @ObfuscatedName("i.g(B)V")
    public static void method612() {
        field228 = new class196(32);
    }
}
