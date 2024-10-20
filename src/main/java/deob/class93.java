package deob;

@ObfuscatedName("cj")
public class class93 extends class352 {

    @ObfuscatedName("cj.v")
    public static class362 field1151 = new class362(32);

    @ObfuscatedName("cj.n")
    public int[] field1150 = new int[] { -1 };

    @ObfuscatedName("cj.f")
    public int[] field1152 = new int[] { 0 };

    @ObfuscatedName("af.v(III)I")
    public static int method439(int arg0, int arg1) {
        class93 var2 = (class93) field1151.method5766((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1150.length) {
            return var2.field1150[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("z.n(III)I")
    public static int method168(int arg0, int arg1) {
        class93 var2 = (class93) field1151.method5766((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1152.length) {
            return var2.field1152[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ca.f(III)I")
    public static int method2034(int arg0, int arg1) {
        class93 var2 = (class93) field1151.method5766((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1152.length; var4++) {
                if (var2.field1150[var4] == arg1) {
                    var3 += var2.field1152[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("p.y(IIIII)V")
    public static void method40(int arg0, int arg1, int arg2, int arg3) {
        class93 var4 = (class93) field1151.method5766((long) arg0);
        if (var4 == null) {
            var4 = new class93();
            field1151.method5768(var4, (long) arg0);
        }
        if (var4.field1150.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1150.length; var7++) {
                var5[var7] = var4.field1150[var7];
                var6[var7] = var4.field1152[var7];
            }
            for (int var8 = var4.field1150.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1150 = var5;
            var4.field1152 = var6;
        }
        var4.field1150[arg1] = arg2;
        var4.field1152[arg1] = arg3;
    }

    @ObfuscatedName("bk.p(II)V")
    public static void method1013(int arg0) {
        class93 var1 = (class93) field1151.method5766((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1150.length; var2++) {
                var1.field1150[var2] = -1;
                var1.field1152[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ge.r(I)V")
    public static void method3567() {
        field1151 = new class362(32);
    }
}
