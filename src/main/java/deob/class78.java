package deob;

@ObfuscatedName("br")
public class class78 extends class370 {

    @ObfuscatedName("br.l")
    public static class380 field1008 = new class380(32);

    @ObfuscatedName("br.q")
    public int[] field1011 = new int[] { -1 };

    @ObfuscatedName("br.f")
    public int[] field1009 = new int[] { 0 };

    @ObfuscatedName("cm.l(III)I")
    public static int method2314(int arg0, int arg1) {
        class78 var2 = (class78) field1008.method6061((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1011.length) {
            return var2.field1011[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cq.q(III)I")
    public static int method2114(int arg0, int arg1) {
        class78 var2 = (class78) field1008.method6061((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1009.length) {
            return var2.field1009[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ee.f(III)I")
    public static int method2505(int arg0, int arg1) {
        class78 var2 = (class78) field1008.method6061((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1009.length; var4++) {
                if (var2.field1011[var4] == arg1) {
                    var3 += var2.field1009[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("bd.j(IIIIB)V")
    public static void method1794(int arg0, int arg1, int arg2, int arg3) {
        class78 var4 = (class78) field1008.method6061((long) arg0);
        if (var4 == null) {
            var4 = new class78();
            field1008.method6065(var4, (long) arg0);
        }
        if (var4.field1011.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1011.length; var7++) {
                var5[var7] = var4.field1011[var7];
                var6[var7] = var4.field1009[var7];
            }
            for (int var8 = var4.field1011.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1011 = var5;
            var4.field1009 = var6;
        }
        var4.field1011[arg1] = arg2;
        var4.field1009[arg1] = arg3;
    }

    @ObfuscatedName("kn.m(II)V")
    public static void method4997(int arg0) {
        class78 var1 = (class78) field1008.method6061((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1011.length; var2++) {
                var1.field1011[var2] = -1;
                var1.field1009[var2] = 0;
            }
        }
    }

    @ObfuscatedName("is.k(II)V")
    public static void method4244(int arg0) {
        class78 var1 = (class78) field1008.method6061((long) arg0);
        if (var1 != null) {
            var1.method5775();
        }
    }
}
