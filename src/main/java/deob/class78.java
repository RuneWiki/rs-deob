package deob;

@ObfuscatedName("bd")
public class class78 extends class410 {

    @ObfuscatedName("bd.c")
    public static class420 field1027 = new class420(32);

    @ObfuscatedName("bd.v")
    public int[] field1025 = new int[] { -1 };

    @ObfuscatedName("bd.q")
    public int[] field1026 = new int[] { 0 };

    @ObfuscatedName("ef.c(III)I")
    public static int method2869(int arg0, int arg1) {
        class78 var2 = (class78) field1027.method6765((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1025.length) {
            return var2.field1025[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("lc.v(IIB)I")
    public static int method5288(int arg0, int arg1) {
        class78 var2 = (class78) field1027.method6765((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1026.length) {
            return var2.field1026[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ns.q(IIB)I")
    public static int method6294(int arg0, int arg1) {
        class78 var2 = (class78) field1027.method6765((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1026.length; var4++) {
                if (var2.field1025[var4] == arg1) {
                    var3 += var2.field1026[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("aj.f(IIIIS)V")
    public static void method573(int arg0, int arg1, int arg2, int arg3) {
        class78 var4 = (class78) field1027.method6765((long) arg0);
        if (var4 == null) {
            var4 = new class78();
            field1027.method6774(var4, (long) arg0);
        }
        if (var4.field1025.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1025.length; var7++) {
                var5[var7] = var4.field1025[var7];
                var6[var7] = var4.field1026[var7];
            }
            for (int var8 = var4.field1025.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1025 = var5;
            var4.field1026 = var6;
        }
        var4.field1025[arg1] = arg2;
        var4.field1026[arg1] = arg3;
    }

    @ObfuscatedName("ft.j(II)V")
    public static void method3203(int arg0) {
        class78 var1 = (class78) field1027.method6765((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1025.length; var2++) {
                var1.field1025[var2] = -1;
                var1.field1026[var2] = 0;
            }
        }
    }

    @ObfuscatedName("lv.e(II)V")
    public static void method5412(int arg0) {
        class78 var1 = (class78) field1027.method6765((long) arg0);
        if (var1 != null) {
            var1.method6497();
        }
    }

    @ObfuscatedName("dk.g(I)V")
    public static void method2690() {
        field1027 = new class420(32);
    }
}
