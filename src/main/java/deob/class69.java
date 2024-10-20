package deob;

@ObfuscatedName("bv")
public class class69 extends class190 {

    @ObfuscatedName("bv.m")
    public static class328 field564 = new class328(32);

    @ObfuscatedName("bv.o")
    public int[] field562 = new int[] { -1 };

    @ObfuscatedName("bv.q")
    public int[] field563 = new int[] { 0 };

    @ObfuscatedName("ik.m(IIB)I")
    public static int method4242(int arg0, int arg1) {
        class69 var2 = (class69) field564.method5641((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field562.length) {
            return var2.field562[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("fo.o(IIB)I")
    public static int method3242(int arg0, int arg1) {
        class69 var2 = (class69) field564.method5641((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field563.length) {
            return var2.field563[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bl.q(III)I")
    public static int method1044(int arg0, int arg1) {
        class69 var2 = (class69) field564.method5641((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field563.length; var4++) {
                if (var2.field562[var4] == arg1) {
                    var3 += var2.field563[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("as.j(IIIII)V")
    public static void method401(int arg0, int arg1, int arg2, int arg3) {
        class69 var4 = (class69) field564.method5641((long) arg0);
        if (var4 == null) {
            var4 = new class69();
            field564.method5643(var4, (long) arg0);
        }
        if (var4.field562.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field562.length; var7++) {
                var5[var7] = var4.field562[var7];
                var6[var7] = var4.field563[var7];
            }
            for (int var8 = var4.field562.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field562 = var5;
            var4.field563 = var6;
        }
        var4.field562[arg1] = arg2;
        var4.field563[arg1] = arg3;
    }

    @ObfuscatedName("do.p(IB)V")
    public static void method2393(int arg0) {
        class69 var1 = (class69) field564.method5641((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field562.length; var2++) {
                var1.field562[var2] = -1;
                var1.field563[var2] = 0;
            }
        }
    }

    @ObfuscatedName("cw.g(IB)V")
    public static void method1714(int arg0) {
        class69 var1 = (class69) field564.method5641((long) arg0);
        if (var1 != null) {
            var1.method3388();
        }
    }
}
