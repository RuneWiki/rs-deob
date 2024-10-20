package deob;

@ObfuscatedName("d")
public class class16 extends class212 {

    @ObfuscatedName("d.l")
    public static class200 field226 = new class200(32);

    @ObfuscatedName("d.g")
    public int[] field222 = new int[] { -1 };

    @ObfuscatedName("d.r")
    public int[] field225 = new int[] { 0 };

    @ObfuscatedName("aq.l(IIB)I")
    public static int method682(int arg0, int arg1) {
        class16 var2 = (class16) field226.method3684((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field222.length) {
            return var2.field222[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ad.g(IIB)I")
    public static int method616(int arg0, int arg1) {
        class16 var2 = (class16) field226.method3684((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field225.length) {
            return var2.field225[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("o.r(IIB)I")
    public static int method170(int arg0, int arg1) {
        class16 var2 = (class16) field226.method3684((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field225.length; var4++) {
                if (var2.field222[var4] == arg1) {
                    var3 += var2.field225[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ag.e(IIIIB)V")
    public static void method739(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field226.method3684((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field226.method3688(var4, (long) arg0);
        }
        if (var4.field222.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field222.length; var7++) {
                var5[var7] = var4.field222[var7];
                var6[var7] = var4.field225[var7];
            }
            for (int var8 = var4.field222.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field222 = var5;
            var4.field225 = var6;
        }
        var4.field222[arg1] = arg2;
        var4.field225[arg1] = arg3;
    }

    @ObfuscatedName("en.h(II)V")
    public static void method2828(int arg0) {
        class16 var1 = (class16) field226.method3684((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field222.length; var2++) {
                var1.field222[var2] = -1;
                var1.field225[var2] = 0;
            }
        }
    }

    @ObfuscatedName("u.s(II)V")
    public static void method108(int arg0) {
        class16 var1 = (class16) field226.method3684((long) arg0);
        if (var1 != null) {
            var1.method3815();
        }
    }

    @ObfuscatedName("x.k(I)V")
    public static void method574() {
        field226 = new class200(32);
    }
}
