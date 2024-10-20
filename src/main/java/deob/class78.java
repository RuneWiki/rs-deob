package deob;

@ObfuscatedName("bv")
public class class78 extends class409 {

    @ObfuscatedName("bv.v")
    public static class419 field1017 = new class419(32);

    @ObfuscatedName("bv.c")
    public int[] field1011 = new int[] { -1 };

    @ObfuscatedName("bv.i")
    public int[] field1012 = new int[] { 0 };

    @ObfuscatedName("cf.v(III)I")
    public static int method2001(int arg0, int arg1) {
        class78 var2 = (class78) field1017.method6772((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1011.length) {
            return var2.field1011[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("na.c(III)I")
    public static int method6320(int arg0, int arg1) {
        class78 var2 = (class78) field1017.method6772((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1012.length) {
            return var2.field1012[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bk.i(III)I")
    public static int method1826(int arg0, int arg1) {
        class78 var2 = (class78) field1017.method6772((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1012.length; var4++) {
                if (var2.field1011[var4] == arg1) {
                    var3 += var2.field1012[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("bp.f(IIIII)V")
    public static void method1921(int arg0, int arg1, int arg2, int arg3) {
        class78 var4 = (class78) field1017.method6772((long) arg0);
        if (var4 == null) {
            var4 = new class78();
            field1017.method6773(var4, (long) arg0);
        }
        if (var4.field1011.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1011.length; var7++) {
                var5[var7] = var4.field1011[var7];
                var6[var7] = var4.field1012[var7];
            }
            for (int var8 = var4.field1011.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1011 = var5;
            var4.field1012 = var6;
        }
        var4.field1011[arg1] = arg2;
        var4.field1012[arg1] = arg3;
    }

    @ObfuscatedName("hd.b(IB)V")
    public static void method3953(int arg0) {
        class78 var1 = (class78) field1017.method6772((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1011.length; var2++) {
                var1.field1011[var2] = -1;
                var1.field1012[var2] = 0;
            }
        }
    }

    @ObfuscatedName("cm.n(II)V")
    public static void method1989(int arg0) {
        class78 var1 = (class78) field1017.method6772((long) arg0);
        if (var1 != null) {
            var1.method6503();
        }
    }

    @ObfuscatedName("dp.s(I)V")
    public static void method2500() {
        field1017 = new class419(32);
    }
}
