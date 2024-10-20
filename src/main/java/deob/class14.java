package deob;

@ObfuscatedName("t")
public class class14 extends class184 {

    @ObfuscatedName("t.b")
    public static class174 field203 = new class174(32);

    @ObfuscatedName("t.u")
    public int[] field202 = new int[] { -1 };

    @ObfuscatedName("t.x")
    public int[] field209 = new int[] { 0 };

    @ObfuscatedName("dv.b(IIB)I")
    public static int method2462(int arg0, int arg1) {
        class14 var2 = (class14) field203.method3157((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field209.length) {
            return var2.field209[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("n.u(III)I")
    public static int method76(int arg0, int arg1) {
        class14 var2 = (class14) field203.method3157((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field209.length; var4++) {
                if (var2.field202[var4] == arg1) {
                    var3 += var2.field209[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("l.x(IIIII)V")
    public static void method122(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field203.method3157((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field203.method3147(var4, (long) arg0);
        }
        if (var4.field202.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field202.length; var7++) {
                var5[var7] = var4.field202[var7];
                var6[var7] = var4.field209[var7];
            }
            for (int var8 = var4.field202.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field202 = var5;
            var4.field209 = var6;
        }
        var4.field202[arg1] = arg2;
        var4.field209[arg1] = arg3;
    }

    @ObfuscatedName("n.j(IB)V")
    public static void method56(int arg0) {
        class14 var1 = (class14) field203.method3157((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field202.length; var2++) {
                var1.field202[var2] = -1;
                var1.field209[var2] = 0;
            }
        }
    }
}
