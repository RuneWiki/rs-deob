package deob;

@ObfuscatedName("bx")
public class class55 extends class207 {

    @ObfuscatedName("bx.f")
    public static class205 field529 = new class205(32);

    @ObfuscatedName("bx.l")
    public int[] field526 = new int[] { -1 };

    @ObfuscatedName("bx.w")
    public int[] field530 = new int[] { 0 };

    @ObfuscatedName("ha.f(IIB)I")
    public static int method4255(int arg0, int arg1) {
        class55 var2 = (class55) field529.method3774((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field526.length) {
            return var2.field526[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ah.l(III)I")
    public static int method757(int arg0, int arg1) {
        class55 var2 = (class55) field529.method3774((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field530.length) {
            return var2.field530[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("client.w(IIB)I")
    public static int method1485(int arg0, int arg1) {
        class55 var2 = (class55) field529.method3774((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field530.length; var4++) {
                if (var2.field526[var4] == arg1) {
                    var3 += var2.field530[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("at.s(IIIII)V")
    public static void method504(int arg0, int arg1, int arg2, int arg3) {
        class55 var4 = (class55) field529.method3774((long) arg0);
        if (var4 == null) {
            var4 = new class55();
            field529.method3773(var4, (long) arg0);
        }
        if (var4.field526.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field526.length; var7++) {
                var5[var7] = var4.field526[var7];
                var6[var7] = var4.field530[var7];
            }
            for (int var8 = var4.field526.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field526 = var5;
            var4.field530 = var6;
        }
        var4.field526[arg1] = arg2;
        var4.field530[arg1] = arg3;
    }

    @ObfuscatedName("d.e(II)V")
    public static void method105(int arg0) {
        class55 var1 = (class55) field529.method3774((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field526.length; var2++) {
                var1.field526[var2] = -1;
                var1.field530[var2] = 0;
            }
        }
    }

    @ObfuscatedName("i.c(II)V")
    public static void method279(int arg0) {
        class55 var1 = (class55) field529.method3774((long) arg0);
        if (var1 != null) {
            var1.method3818();
        }
    }
}
