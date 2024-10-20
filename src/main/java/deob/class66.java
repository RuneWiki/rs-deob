package deob;

@ObfuscatedName("bb")
public class class66 extends class217 {

    @ObfuscatedName("bb.t")
    public static class215 field744 = new class215(32);

    @ObfuscatedName("bb.q")
    public int[] field745 = new int[] { -1 };

    @ObfuscatedName("bb.i")
    public int[] field748 = new int[] { 0 };

    @ObfuscatedName("o.t(IIB)I")
    public static int method51(int arg0, int arg1) {
        class66 var2 = (class66) field744.method3677((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field745.length) {
            return var2.field745[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("o.i(III)I")
    public static int method48(int arg0, int arg1) {
        class66 var2 = (class66) field744.method3677((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field748.length; var4++) {
                if (var2.field745[var4] == arg1) {
                    var3 += var2.field748[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("f.a(IIIIB)V")
    public static void method158(int arg0, int arg1, int arg2, int arg3) {
        class66 var4 = (class66) field744.method3677((long) arg0);
        if (var4 == null) {
            var4 = new class66();
            field744.method3669(var4, (long) arg0);
        }
        if (var4.field745.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field745.length; var7++) {
                var5[var7] = var4.field745[var7];
                var6[var7] = var4.field748[var7];
            }
            for (int var8 = var4.field745.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field745 = var5;
            var4.field748 = var6;
        }
        var4.field745[arg1] = arg2;
        var4.field748[arg1] = arg3;
    }

    @ObfuscatedName("fl.l(II)V")
    public static void method2964(int arg0) {
        class66 var1 = (class66) field744.method3677((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field745.length; var2++) {
                var1.field745[var2] = -1;
                var1.field748[var2] = 0;
            }
        }
    }

    @ObfuscatedName("m.b(II)V")
    public static void method185(int arg0) {
        class66 var1 = (class66) field744.method3677((long) arg0);
        if (var1 != null) {
            var1.method3721();
        }
    }

    @ObfuscatedName("ec.e(I)V")
    public static void method2845() {
        field744 = new class215(32);
    }
}
