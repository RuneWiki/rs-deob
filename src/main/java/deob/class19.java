package deob;

@ObfuscatedName("x")
public class class19 extends class179 {

    @ObfuscatedName("x.p")
    public static class175 field274 = new class175(32);

    @ObfuscatedName("x.e")
    public int[] field281 = new int[] { -1 };

    @ObfuscatedName("x.a")
    public int[] field275 = new int[] { 0 };

    @ObfuscatedName("k.p(IIB)I")
    public static int method121(int arg0, int arg1) {
        class19 var2 = (class19) field274.method3311((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field281.length) {
            return var2.field281[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("w.e(III)I")
    public static int method132(int arg0, int arg1) {
        class19 var2 = (class19) field274.method3311((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field275.length; var4++) {
                if (var2.field281[var4] == arg1) {
                    var3 += var2.field275[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ag.a(IIIIB)V")
    public static void method755(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field274.method3311((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field274.method3310(var4, (long) arg0);
        }
        if (var4.field281.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field281.length; var7++) {
                var5[var7] = var4.field281[var7];
                var6[var7] = var4.field275[var7];
            }
            for (int var8 = var4.field281.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field281 = var5;
            var4.field275 = var6;
        }
        var4.field281[arg1] = arg2;
        var4.field275[arg1] = arg3;
    }

    @ObfuscatedName("cz.h(II)V")
    public static void method2148(int arg0) {
        class19 var1 = (class19) field274.method3311((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field281.length; var2++) {
                var1.field281[var2] = -1;
                var1.field275[var2] = 0;
            }
        }
    }
}
