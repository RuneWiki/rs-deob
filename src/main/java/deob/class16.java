package deob;

@ObfuscatedName("j")
public class class16 extends class208 {

    @ObfuscatedName("j.d")
    public static class196 field217 = new class196(32);

    @ObfuscatedName("j.p")
    public int[] field226 = new int[] { -1 };

    @ObfuscatedName("j.v")
    public int[] field218 = new int[] { 0 };

    @ObfuscatedName("r.d(III)I")
    public static int method565(int arg0, int arg1) {
        class16 var2 = (class16) field217.method3588((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field218.length) {
            return var2.field218[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("at.p(IIIII)V")
    public static void method1064(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field217.method3588((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field217.method3596(var4, (long) arg0);
        }
        if (var4.field226.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field226.length; var7++) {
                var5[var7] = var4.field226[var7];
                var6[var7] = var4.field218[var7];
            }
            for (int var8 = var4.field226.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field226 = var5;
            var4.field218 = var6;
        }
        var4.field226[arg1] = arg2;
        var4.field218[arg1] = arg3;
    }

    @ObfuscatedName("ej.v(II)V")
    public static void method2804(int arg0) {
        class16 var1 = (class16) field217.method3588((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field226.length; var2++) {
                var1.field226[var2] = -1;
                var1.field218[var2] = 0;
            }
        }
    }

    @ObfuscatedName("n.l(IB)V")
    public static void method166(int arg0) {
        class16 var1 = (class16) field217.method3588((long) arg0);
        if (var1 != null) {
            var1.method3715();
        }
    }

    @ObfuscatedName("ft.y(I)V")
    public static void method3272() {
        field217 = new class196(32);
    }
}
