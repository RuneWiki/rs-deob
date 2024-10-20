package deob;

@ObfuscatedName("bz")
public class class60 extends class181 {

    @ObfuscatedName("bz.z")
    public static class318 field530 = new class318(32);

    @ObfuscatedName("bz.n")
    public int[] field532 = new int[] { -1 };

    @ObfuscatedName("bz.v")
    public int[] field529 = new int[] { 0 };

    @ObfuscatedName("k.z(III)I")
    public static int method280(int arg0, int arg1) {
        class60 var2 = (class60) field530.method5393((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field532.length) {
            return var2.field532[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("iu.n(IIB)I")
    public static int method4004(int arg0, int arg1) {
        class60 var2 = (class60) field530.method5393((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field529.length) {
            return var2.field529[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("aq.v(III)I")
    public static int method668(int arg0, int arg1) {
        class60 var2 = (class60) field530.method5393((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field529.length; var4++) {
                if (var2.field532[var4] == arg1) {
                    var3 += var2.field529[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("r.u(IIIIB)V")
    public static void method49(int arg0, int arg1, int arg2, int arg3) {
        class60 var4 = (class60) field530.method5393((long) arg0);
        if (var4 == null) {
            var4 = new class60();
            field530.method5394(var4, (long) arg0);
        }
        if (var4.field532.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field532.length; var7++) {
                var5[var7] = var4.field532[var7];
                var6[var7] = var4.field529[var7];
            }
            for (int var8 = var4.field532.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field532 = var5;
            var4.field529 = var6;
        }
        var4.field532[arg1] = arg2;
        var4.field529[arg1] = arg3;
    }

    @ObfuscatedName("fk.r(II)V")
    public static void method3113(int arg0) {
        class60 var1 = (class60) field530.method5393((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field532.length; var2++) {
                var1.field532[var2] = -1;
                var1.field529[var2] = 0;
            }
        }
    }

    @ObfuscatedName("an.p(II)V")
    public static void method589(int arg0) {
        class60 var1 = (class60) field530.method5393((long) arg0);
        if (var1 != null) {
            var1.method3249();
        }
    }

    @ObfuscatedName("ko.q(B)V")
    public static void method4822() {
        field530 = new class318(32);
    }
}
