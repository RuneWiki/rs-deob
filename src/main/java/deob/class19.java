package deob;

@ObfuscatedName("m")
public class class19 extends class179 {

    @ObfuscatedName("m.a")
    public static class175 field267 = new class175(32);

    @ObfuscatedName("m.r")
    public int[] field266 = new int[] { -1 };

    @ObfuscatedName("m.u")
    public int[] field265 = new int[] { 0 };

    @ObfuscatedName("co.a(III)I")
    public static int method1615(int arg0, int arg1) {
        class19 var2 = (class19) field267.method3252((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field266.length) {
            return var2.field266[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("fr.r(III)I")
    public static int method3204(int arg0, int arg1) {
        class19 var2 = (class19) field267.method3252((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field265.length) {
            return var2.field265[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ee.u(IIIII)V")
    public static void method2620(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field267.method3252((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field267.method3254(var4, (long) arg0);
        }
        if (var4.field266.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field266.length; var7++) {
                var5[var7] = var4.field266[var7];
                var6[var7] = var4.field265[var7];
            }
            for (int var8 = var4.field266.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field266 = var5;
            var4.field265 = var6;
        }
        var4.field266[arg1] = arg2;
        var4.field265[arg1] = arg3;
    }

    @ObfuscatedName("bz.t(IB)V")
    public static void method1287(int arg0) {
        class19 var1 = (class19) field267.method3252((long) arg0);
        if (var1 != null) {
            var1.method3311();
        }
    }
}
