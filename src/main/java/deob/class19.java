package deob;

@ObfuscatedName("j")
public class class19 extends class179 {

    @ObfuscatedName("j.i")
    public static class175 field291 = new class175(32);

    @ObfuscatedName("j.w")
    public int[] field288 = new int[] { -1 };

    @ObfuscatedName("j.f")
    public int[] field289 = new int[] { 0 };

    @ObfuscatedName("r.i(III)I")
    public static int method96(int arg0, int arg1) {
        class19 var2 = (class19) field291.method3273((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field289.length) {
            return var2.field289[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bo.w(IIS)I")
    public static int method1406(int arg0, int arg1) {
        class19 var2 = (class19) field291.method3273((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field289.length; var4++) {
                if (var2.field288[var4] == arg1) {
                    var3 += var2.field289[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ab.f(IIIII)V")
    public static void method783(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field291.method3273((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field291.method3278(var4, (long) arg0);
        }
        if (var4.field288.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field288.length; var7++) {
                var5[var7] = var4.field288[var7];
                var6[var7] = var4.field289[var7];
            }
            for (int var8 = var4.field288.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field288 = var5;
            var4.field289 = var6;
        }
        var4.field288[arg1] = arg2;
        var4.field289[arg1] = arg3;
    }

    @ObfuscatedName("dy.e(II)V")
    public static void method2214(int arg0) {
        class19 var1 = (class19) field291.method3273((long) arg0);
        if (var1 != null) {
            var1.method3328();
        }
    }
}
