package deob;

@ObfuscatedName("bw")
public class class78 extends class411 {

    @ObfuscatedName("bw.o")
    public static class421 field1021 = new class421(32);

    @ObfuscatedName("bw.q")
    public int[] field1019 = new int[] { -1 };

    @ObfuscatedName("bw.l")
    public int[] field1018 = new int[] { 0 };

    @ObfuscatedName("bo.o(III)I")
    public static int method1010(int arg0, int arg1) {
        class78 var2 = (class78) field1021.method6687((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1019.length) {
            return var2.field1019[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("kh.q(III)I")
    public static int method4925(int arg0, int arg1) {
        class78 var2 = (class78) field1021.method6687((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1018.length) {
            return var2.field1018[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("gf.l(III)I")
    public static int method3716(int arg0, int arg1) {
        class78 var2 = (class78) field1021.method6687((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1018.length; var4++) {
                if (var2.field1019[var4] == arg1) {
                    var3 += var2.field1018[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ft.k(IIIII)V")
    public static void method2966(int arg0, int arg1, int arg2, int arg3) {
        class78 var4 = (class78) field1021.method6687((long) arg0);
        if (var4 == null) {
            var4 = new class78();
            field1021.method6688(var4, (long) arg0);
        }
        if (var4.field1019.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1019.length; var7++) {
                var5[var7] = var4.field1019[var7];
                var6[var7] = var4.field1018[var7];
            }
            for (int var8 = var4.field1019.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1019 = var5;
            var4.field1018 = var6;
        }
        var4.field1019[arg1] = arg2;
        var4.field1018[arg1] = arg3;
    }

    @ObfuscatedName("ac.a(IB)V")
    public static void method382(int arg0) {
        class78 var1 = (class78) field1021.method6687((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1019.length; var2++) {
                var1.field1019[var2] = -1;
                var1.field1018[var2] = 0;
            }
        }
    }

    @ObfuscatedName("bc.m(IB)V")
    public static void method997(int arg0) {
        class78 var1 = (class78) field1021.method6687((long) arg0);
        if (var1 != null) {
            var1.method6399();
        }
    }
}
