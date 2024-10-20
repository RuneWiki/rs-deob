package deob;

@ObfuscatedName("bp")
public class class78 extends class392 {

    @ObfuscatedName("bp.c")
    public static class402 field1023 = new class402(32);

    @ObfuscatedName("bp.l")
    public int[] field1018 = new int[] { -1 };

    @ObfuscatedName("bp.s")
    public int[] field1020 = new int[] { 0 };

    @ObfuscatedName("mf.c(IIB)I")
    public static int method5652(int arg0, int arg1) {
        class78 var2 = (class78) field1023.method6456((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1018.length) {
            return var2.field1018[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("lb.l(III)I")
    public static int method5580(int arg0, int arg1) {
        class78 var2 = (class78) field1023.method6456((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1020.length) {
            return var2.field1020[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("eb.s(III)I")
    public static int method2699(int arg0, int arg1) {
        class78 var2 = (class78) field1023.method6456((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1020.length; var4++) {
                if (var2.field1018[var4] == arg1) {
                    var3 += var2.field1020[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("fr.e(IIIIB)V")
    public static void method2882(int arg0, int arg1, int arg2, int arg3) {
        class78 var4 = (class78) field1023.method6456((long) arg0);
        if (var4 == null) {
            var4 = new class78();
            field1023.method6455(var4, (long) arg0);
        }
        if (var4.field1018.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1018.length; var7++) {
                var5[var7] = var4.field1018[var7];
                var6[var7] = var4.field1020[var7];
            }
            for (int var8 = var4.field1018.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1018 = var5;
            var4.field1020 = var6;
        }
        var4.field1018[arg1] = arg2;
        var4.field1020[arg1] = arg3;
    }

    @ObfuscatedName("mo.r(II)V")
    public static void method5861(int arg0) {
        class78 var1 = (class78) field1023.method6456((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1018.length; var2++) {
                var1.field1018[var2] = -1;
                var1.field1020[var2] = 0;
            }
        }
    }

    @ObfuscatedName("hh.o(II)V")
    public static void method3976(int arg0) {
        class78 var1 = (class78) field1023.method6456((long) arg0);
        if (var1 != null) {
            var1.method6167();
        }
    }
}
