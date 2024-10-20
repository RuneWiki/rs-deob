package deob;

@ObfuscatedName("bz")
public class class78 extends class369 {

    @ObfuscatedName("bz.n")
    public static class379 field999 = new class379(32);

    @ObfuscatedName("bz.c")
    public int[] field1003 = new int[] { -1 };

    @ObfuscatedName("bz.m")
    public int[] field1004 = new int[] { 0 };

    @ObfuscatedName("cs.n(III)I")
    public static int method2233(int arg0, int arg1) {
        class78 var2 = (class78) field999.method6016((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1003.length) {
            return var2.field1003[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("l.c(III)I")
    public static int method91(int arg0, int arg1) {
        class78 var2 = (class78) field999.method6016((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1004.length) {
            return var2.field1004[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("jk.m(IIB)I")
    public static int method4645(int arg0, int arg1) {
        class78 var2 = (class78) field999.method6016((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1004.length; var4++) {
                if (var2.field1003[var4] == arg1) {
                    var3 += var2.field1004[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("bg.k(IIIII)V")
    public static void method1850(int arg0, int arg1, int arg2, int arg3) {
        class78 var4 = (class78) field999.method6016((long) arg0);
        if (var4 == null) {
            var4 = new class78();
            field999.method6015(var4, (long) arg0);
        }
        if (var4.field1003.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1003.length; var7++) {
                var5[var7] = var4.field1003[var7];
                var6[var7] = var4.field1004[var7];
            }
            for (int var8 = var4.field1003.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1003 = var5;
            var4.field1004 = var6;
        }
        var4.field1003[arg1] = arg2;
        var4.field1004[arg1] = arg3;
    }

    @ObfuscatedName("ct.o(II)V")
    public static void method2261(int arg0) {
        class78 var1 = (class78) field999.method6016((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1003.length; var2++) {
                var1.field1003[var2] = -1;
                var1.field1004[var2] = 0;
            }
        }
    }

    @ObfuscatedName("et.g(II)V")
    public static void method2530(int arg0) {
        class78 var1 = (class78) field999.method6016((long) arg0);
        if (var1 != null) {
            var1.method5732();
        }
    }

    @ObfuscatedName("fk.z(I)V")
    public static void method3109() {
        field999 = new class379(32);
    }
}
