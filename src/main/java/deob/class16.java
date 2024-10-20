package deob;

@ObfuscatedName("f")
public class class16 extends class208 {

    @ObfuscatedName("f.l")
    public static class196 field225 = new class196(32);

    @ObfuscatedName("f.e")
    public int[] field230 = new int[] { -1 };

    @ObfuscatedName("f.q")
    public int[] field226 = new int[] { 0 };

    @ObfuscatedName("an.l(III)I")
    public static int method941(int arg0, int arg1) {
        class16 var2 = (class16) field225.method3509((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field230.length) {
            return var2.field230[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("dw.e(III)I")
    public static int method2326(int arg0, int arg1) {
        class16 var2 = (class16) field225.method3509((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field226.length) {
            return var2.field226[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("v.q(III)I")
    public static int method154(int arg0, int arg1) {
        class16 var2 = (class16) field225.method3509((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field226.length; var4++) {
                if (var2.field230[var4] == arg1) {
                    var3 += var2.field226[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ap.o(IIIIB)V")
    public static void method945(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field225.method3509((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field225.method3518(var4, (long) arg0);
        }
        if (var4.field230.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field230.length; var7++) {
                var5[var7] = var4.field230[var7];
                var6[var7] = var4.field226[var7];
            }
            for (int var8 = var4.field230.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field230 = var5;
            var4.field226 = var6;
        }
        var4.field230[arg1] = arg2;
        var4.field226[arg1] = arg3;
    }

    @ObfuscatedName("cn.g(II)V")
    public static void method1962(int arg0) {
        class16 var1 = (class16) field225.method3509((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field230.length; var2++) {
                var1.field230[var2] = -1;
                var1.field226[var2] = 0;
            }
        }
    }
}
