package deob;

@ObfuscatedName("cc")
public class class82 extends class433 {

    @ObfuscatedName("cc.h")
    public static class444 field1055 = new class444(32);

    @ObfuscatedName("cc.e")
    public int[] field1053 = new int[] { -1 };

    @ObfuscatedName("cc.v")
    public int[] field1054 = new int[] { 0 };

    @ObfuscatedName("l.h(III)I")
    public static int method258(int arg0, int arg1) {
        class82 var2 = (class82) field1055.method7535((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1053.length) {
            return var2.field1053[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ch.e(III)I")
    public static int method2387(int arg0, int arg1) {
        class82 var2 = (class82) field1055.method7535((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1054.length) {
            return var2.field1054[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("gt.v(III)I")
    public static int method3730(int arg0, int arg1) {
        class82 var2 = (class82) field1055.method7535((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1054.length; var4++) {
                if (var2.field1053[var4] == arg1) {
                    var3 += var2.field1054[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("i.x(IIIIB)V")
    public static void method147(int arg0, int arg1, int arg2, int arg3) {
        class82 var4 = (class82) field1055.method7535((long) arg0);
        if (var4 == null) {
            var4 = new class82();
            field1055.method7528(var4, (long) arg0);
        }
        if (var4.field1053.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1053.length; var7++) {
                var5[var7] = var4.field1053[var7];
                var6[var7] = var4.field1054[var7];
            }
            for (int var8 = var4.field1053.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1053 = var5;
            var4.field1054 = var6;
        }
        var4.field1053[arg1] = arg2;
        var4.field1054[arg1] = arg3;
    }

    @ObfuscatedName("bm.m(IB)V")
    public static void method2020(int arg0) {
        class82 var1 = (class82) field1055.method7535((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1053.length; var2++) {
                var1.field1053[var2] = -1;
                var1.field1054[var2] = 0;
            }
        }
    }

    @ObfuscatedName("bk.q(IB)V")
    public static void method2025(int arg0) {
        class82 var1 = (class82) field1055.method7535((long) arg0);
        if (var1 != null) {
            var1.method7230();
        }
    }

    @ObfuscatedName("ar.f(I)V")
    public static void method450() {
        field1055 = new class444(32);
    }
}
