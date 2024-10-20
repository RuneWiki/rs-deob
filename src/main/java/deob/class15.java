package deob;

@ObfuscatedName("q")
public class class15 extends class199 {

    @ObfuscatedName("q.n")
    public static class187 field214 = new class187(32);

    @ObfuscatedName("q.o")
    public int[] field211 = new int[] { -1 };

    @ObfuscatedName("q.a")
    public int[] field208 = new int[] { 0 };

    @ObfuscatedName("df.n(IIB)I")
    public static int method2181(int arg0, int arg1) {
        class15 var2 = (class15) field214.method3418((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field211.length) {
            return var2.field211[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cf.o(III)I")
    public static int method2157(int arg0, int arg1) {
        class15 var2 = (class15) field214.method3418((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field208.length; var4++) {
                if (var2.field211[var4] == arg1) {
                    var3 += var2.field208[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("e.a(IIIIS)V")
    public static void method128(int arg0, int arg1, int arg2, int arg3) {
        class15 var4 = (class15) field214.method3418((long) arg0);
        if (var4 == null) {
            var4 = new class15();
            field214.method3410(var4, (long) arg0);
        }
        if (var4.field211.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field211.length; var7++) {
                var5[var7] = var4.field211[var7];
                var6[var7] = var4.field208[var7];
            }
            for (int var8 = var4.field211.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field211 = var5;
            var4.field208 = var6;
        }
        var4.field211[arg1] = arg2;
        var4.field208[arg1] = arg3;
    }

    @ObfuscatedName("eo.w(I)V")
    public static void method2897() {
        field214 = new class187(32);
    }
}
