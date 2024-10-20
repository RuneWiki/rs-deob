package deob;

@ObfuscatedName("u")
public class class19 extends class179 {

    @ObfuscatedName("u.d")
    public static class175 field277 = new class175(32);

    @ObfuscatedName("u.g")
    public int[] field268 = new int[] { -1 };

    @ObfuscatedName("u.a")
    public int[] field270 = new int[] { 0 };

    @ObfuscatedName("d.d(IIB)I")
    public static int method6(int arg0, int arg1) {
        class19 var2 = (class19) field277.method3255((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field270.length) {
            return var2.field270[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("h.g(IIB)I")
    public static int method147(int arg0, int arg1) {
        class19 var2 = (class19) field277.method3255((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field270.length; var4++) {
                if (var2.field268[var4] == arg1) {
                    var3 += var2.field270[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("o.a(IIIIB)V")
    public static void method215(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field277.method3255((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field277.method3268(var4, (long) arg0);
        }
        if (var4.field268.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field268.length; var7++) {
                var5[var7] = var4.field268[var7];
                var6[var7] = var4.field270[var7];
            }
            for (int var8 = var4.field268.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field268 = var5;
            var4.field270 = var6;
        }
        var4.field268[arg1] = arg2;
        var4.field270[arg1] = arg3;
    }

    @ObfuscatedName("ap.f(I)V")
    public static void method551() {
        field277 = new class175(32);
    }
}
