package deob;

@ObfuscatedName("q")
public class class14 extends class191 {

    @ObfuscatedName("q.p")
    public static class179 field180 = new class179(32);

    @ObfuscatedName("q.y")
    public int[] field178 = new int[] { -1 };

    @ObfuscatedName("q.d")
    public int[] field181 = new int[] { 0 };

    @ObfuscatedName("dj.p(IIB)I")
    public static int method2406(int arg0, int arg1) {
        class14 var2 = (class14) field180.method3224((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field178.length) {
            return var2.field178[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("g.y(III)I")
    public static int method497(int arg0, int arg1) {
        class14 var2 = (class14) field180.method3224((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field181.length) {
            return var2.field181[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cx.d(IIIII)V")
    public static void method1796(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field180.method3224((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field180.method3225(var4, (long) arg0);
        }
        if (var4.field178.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field178.length; var7++) {
                var5[var7] = var4.field178[var7];
                var6[var7] = var4.field181[var7];
            }
            for (int var8 = var4.field178.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field178 = var5;
            var4.field181 = var6;
        }
        var4.field178[arg1] = arg2;
        var4.field181[arg1] = arg3;
    }

    @ObfuscatedName("ek.c(II)V")
    public static void method2706(int arg0) {
        class14 var1 = (class14) field180.method3224((long) arg0);
        if (var1 != null) {
            var1.method3358();
        }
    }
}
