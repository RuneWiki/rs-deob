package deob;

@ObfuscatedName("ba")
public class class55 extends class207 {

    @ObfuscatedName("ba.g")
    public static class205 field535 = new class205(32);

    @ObfuscatedName("ba.r")
    public int[] field534 = new int[] { -1 };

    @ObfuscatedName("ba.e")
    public int[] field533 = new int[] { 0 };

    @ObfuscatedName("c.g(III)I")
    public static int method56(int arg0, int arg1) {
        class55 var2 = (class55) field535.method3905((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field534.length) {
            return var2.field534[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("eg.r(III)I")
    public static int method3058(int arg0, int arg1) {
        class55 var2 = (class55) field535.method3905((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field533.length) {
            return var2.field533[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bk.e(III)I")
    public static int method1140(int arg0, int arg1) {
        class55 var2 = (class55) field535.method3905((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field533.length; var4++) {
                if (var2.field534[var4] == arg1) {
                    var3 += var2.field533[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("an.q(IIIIB)V")
    public static void method473(int arg0, int arg1, int arg2, int arg3) {
        class55 var4 = (class55) field535.method3905((long) arg0);
        if (var4 == null) {
            var4 = new class55();
            field535.method3907(var4, (long) arg0);
        }
        if (var4.field534.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field534.length; var7++) {
                var5[var7] = var4.field534[var7];
                var6[var7] = var4.field533[var7];
            }
            for (int var8 = var4.field534.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field534 = var5;
            var4.field533 = var6;
        }
        var4.field534[arg1] = arg2;
        var4.field533[arg1] = arg3;
    }

    @ObfuscatedName("bx.c(IB)V")
    public static void method1847(int arg0) {
        class55 var1 = (class55) field535.method3905((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field534.length; var2++) {
                var1.field534[var2] = -1;
                var1.field533[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ae.i(II)V")
    public static void method536(int arg0) {
        class55 var1 = (class55) field535.method3905((long) arg0);
        if (var1 != null) {
            var1.method3952();
        }
    }

    @ObfuscatedName("d.p(I)V")
    public static void method126() {
        field535 = new class205(32);
    }
}
