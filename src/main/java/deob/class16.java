package deob;

@ObfuscatedName("e")
public class class16 extends class208 {

    @ObfuscatedName("e.c")
    public static class196 field215 = new class196(32);

    @ObfuscatedName("e.h")
    public int[] field210 = new int[] { -1 };

    @ObfuscatedName("e.k")
    public int[] field212 = new int[] { 0 };

    @ObfuscatedName("cv.c(III)I")
    public static int method2001(int arg0, int arg1) {
        class16 var2 = (class16) field215.method3521((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field212.length; var4++) {
                if (var2.field210[var4] == arg1) {
                    var3 += var2.field212[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ep.h(IIIII)V")
    public static void method2898(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field215.method3521((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field215.method3531(var4, (long) arg0);
        }
        if (var4.field210.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field210.length; var7++) {
                var5[var7] = var4.field210[var7];
                var6[var7] = var4.field212[var7];
            }
            for (int var8 = var4.field210.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field210 = var5;
            var4.field212 = var6;
        }
        var4.field210[arg1] = arg2;
        var4.field212[arg1] = arg3;
    }

    @ObfuscatedName("af.k(IB)V")
    public static void method663(int arg0) {
        class16 var1 = (class16) field215.method3521((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field210.length; var2++) {
                var1.field210[var2] = -1;
                var1.field212[var2] = 0;
            }
        }
    }

    @ObfuscatedName("cj.t(II)V")
    public static void method1728(int arg0) {
        class16 var1 = (class16) field215.method3521((long) arg0);
        if (var1 != null) {
            var1.method3646();
        }
    }
}
