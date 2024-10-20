package deob;

@ObfuscatedName("x")
public class class16 extends class208 {

    @ObfuscatedName("x.h")
    public static class196 field233 = new class196(32);

    @ObfuscatedName("x.q")
    public int[] field226 = new int[] { -1 };

    @ObfuscatedName("x.v")
    public int[] field227 = new int[] { 0 };

    @ObfuscatedName("a.h(IIB)I")
    public static int method618(int arg0, int arg1) {
        class16 var2 = (class16) field233.method3584((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field226.length) {
            return var2.field226[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ff.q(IIIII)V")
    public static void method3186(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field233.method3584((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field233.method3575(var4, (long) arg0);
        }
        if (var4.field226.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field226.length; var7++) {
                var5[var7] = var4.field226[var7];
                var6[var7] = var4.field227[var7];
            }
            for (int var8 = var4.field226.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field226 = var5;
            var4.field227 = var6;
        }
        var4.field226[arg1] = arg2;
        var4.field227[arg1] = arg3;
    }

    @ObfuscatedName("el.v(II)V")
    public static void method2887(int arg0) {
        class16 var1 = (class16) field233.method3584((long) arg0);
        if (var1 != null) {
            var1.method3711();
        }
    }

    @ObfuscatedName("p.n(B)V")
    public static void method161() {
        field233 = new class196(32);
    }
}
