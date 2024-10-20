package deob;

@ObfuscatedName("c")
public class class15 extends class199 {

    @ObfuscatedName("c.t")
    public static class187 field197 = new class187(32);

    @ObfuscatedName("c.b")
    public int[] field202 = new int[] { -1 };

    @ObfuscatedName("c.p")
    public int[] field203 = new int[] { 0 };

    @ObfuscatedName("dm.t(III)I")
    public static int method2493(int arg0, int arg1) {
        class15 var2 = (class15) field197.method3382((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field202.length) {
            return var2.field202[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("dy.b(IIIII)V")
    public static void method2465(int arg0, int arg1, int arg2, int arg3) {
        class15 var4 = (class15) field197.method3382((long) arg0);
        if (var4 == null) {
            var4 = new class15();
            field197.method3391(var4, (long) arg0);
        }
        if (var4.field202.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field202.length; var7++) {
                var5[var7] = var4.field202[var7];
                var6[var7] = var4.field203[var7];
            }
            for (int var8 = var4.field202.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field202 = var5;
            var4.field203 = var6;
        }
        var4.field202[arg1] = arg2;
        var4.field203[arg1] = arg3;
    }

    @ObfuscatedName("bh.p(IB)V")
    public static void method1391(int arg0) {
        class15 var1 = (class15) field197.method3382((long) arg0);
        if (var1 != null) {
            var1.method3506();
        }
    }
}
