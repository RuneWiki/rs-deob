package deob;

@ObfuscatedName("w")
public class class14 extends class186 {

    @ObfuscatedName("w.i")
    public static class174 field209 = new class174(32);

    @ObfuscatedName("w.c")
    public int[] field207 = new int[] { -1 };

    @ObfuscatedName("w.h")
    public int[] field206 = new int[] { 0 };

    @ObfuscatedName("bn.i(III)I")
    public static int method1424(int arg0, int arg1) {
        class14 var2 = (class14) field209.method3218((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field207.length) {
            return var2.field207[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ag.c(IIIII)V")
    public static void method577(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field209.method3218((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field209.method3229(var4, (long) arg0);
        }
        if (var4.field207.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field207.length; var7++) {
                var5[var7] = var4.field207[var7];
                var6[var7] = var4.field206[var7];
            }
            for (int var8 = var4.field207.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field207 = var5;
            var4.field206 = var6;
        }
        var4.field207[arg1] = arg2;
        var4.field206[arg1] = arg3;
    }

    @ObfuscatedName("b.h(IB)V")
    public static void method163(int arg0) {
        class14 var1 = (class14) field209.method3218((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field207.length; var2++) {
                var1.field207[var2] = -1;
                var1.field206[var2] = 0;
            }
        }
    }

    @ObfuscatedName("n.v(II)V")
    public static void method515(int arg0) {
        class14 var1 = (class14) field209.method3218((long) arg0);
        if (var1 != null) {
            var1.method3334();
        }
    }
}
