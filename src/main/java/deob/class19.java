package deob;

@ObfuscatedName("o")
public class class19 extends class179 {

    @ObfuscatedName("o.q")
    public static class175 field279 = new class175(32);

    @ObfuscatedName("o.c")
    public int[] field277 = new int[] { -1 };

    @ObfuscatedName("o.p")
    public int[] field281 = new int[] { 0 };

    @ObfuscatedName("ck.q(III)I")
    public static int method1853(int arg0, int arg1) {
        class19 var2 = (class19) field279.method3260((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field277.length) {
            return var2.field277[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cj.c(III)I")
    public static int method2097(int arg0, int arg1) {
        class19 var2 = (class19) field279.method3260((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field281.length; var4++) {
                if (var2.field277[var4] == arg1) {
                    var3 += var2.field281[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("u.p(IIIII)V")
    public static void method134(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field279.method3260((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field279.method3261(var4, (long) arg0);
        }
        if (var4.field277.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field277.length; var7++) {
                var5[var7] = var4.field277[var7];
                var6[var7] = var4.field281[var7];
            }
            for (int var8 = var4.field277.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field277 = var5;
            var4.field281 = var6;
        }
        var4.field277[arg1] = arg2;
        var4.field281[arg1] = arg3;
    }

    @ObfuscatedName("dd.z(IB)V")
    public static void method2287(int arg0) {
        class19 var1 = (class19) field279.method3260((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field277.length; var2++) {
                var1.field277[var2] = -1;
                var1.field281[var2] = 0;
            }
        }
    }

    @ObfuscatedName("u.k(I)V")
    public static void method132() {
        field279 = new class175(32);
    }
}
