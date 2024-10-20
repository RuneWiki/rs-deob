package deob;

@ObfuscatedName("n")
public class class66 extends class17 {

    @ObfuscatedName("n.b")
    public static class3 field736 = new class3(32);

    @ObfuscatedName("n.k")
    public int[] field729 = new int[] { 0 };

    @ObfuscatedName("n.h")
    public int[] field727 = new int[] { -1 };

    @ObfuscatedName("f.h(IIIIB)V")
    public static void method892(int arg0, int arg1, int arg2, int arg3) {
        class66 var4 = (class66) field736.method20((long) arg0);
        if (var4 == null) {
            var4 = new class66();
            field736.method14(var4, (long) arg0);
        }
        if (var4.field727.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field727.length; var7++) {
                var5[var7] = var4.field727[var7];
                var6[var7] = var4.field729[var7];
            }
            for (int var8 = var4.field727.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field727 = var5;
            var4.field729 = var6;
        }
        var4.field727[arg1] = arg2;
        var4.field729[arg1] = arg3;
    }

    @ObfuscatedName("q.b(IIB)I")
    public static int method1362(int arg0, int arg1) {
        class66 var2 = (class66) field736.method20((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field729.length) {
            return var2.field729[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bb.k(II)V")
    public static void method2306(int arg0) {
        class66 var1 = (class66) field736.method20((long) arg0);
        if (var1 != null) {
            var1.method234();
        }
    }
}
