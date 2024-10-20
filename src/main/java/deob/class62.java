package deob;

@ObfuscatedName("c")
public class class62 extends class4 {

    @ObfuscatedName("c.o")
    public int[] field553 = new int[] { 0 };

    @ObfuscatedName("c.j")
    public static class2 field569 = new class2(32);

    @ObfuscatedName("c.p")
    public int[] field552 = new int[] { -1 };

    @ObfuscatedName("ee.j(III)I")
    public static int method1181(int arg0, int arg1) {
        class62 var2 = (class62) field569.method20((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field552.length) {
            return var2.field552[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bd.p(IIIII)V")
    public static void method2208(int arg0, int arg1, int arg2, int arg3) {
        class62 var4 = (class62) field569.method20((long) arg0);
        if (var4 == null) {
            var4 = new class62();
            field569.method22(var4, (long) arg0);
        }
        if (var4.field552.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field552.length; var7++) {
                var5[var7] = var4.field552[var7];
                var6[var7] = var4.field553[var7];
            }
            for (int var8 = var4.field552.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field552 = var5;
            var4.field553 = var6;
        }
        var4.field552[arg1] = arg2;
        var4.field553[arg1] = arg3;
    }

    @ObfuscatedName("au.o(II)V")
    public static void method3283(int arg0) {
        class62 var1 = (class62) field569.method20((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field552.length; var2++) {
                var1.field552[var2] = -1;
                var1.field553[var2] = 0;
            }
        }
    }
}
