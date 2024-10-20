package deob;

@ObfuscatedName("n")
public class class18 extends class177 {

    @ObfuscatedName("n.z")
    public static class173 field279 = new class173(32);

    @ObfuscatedName("n.h")
    public int[] field275 = new int[] { -1 };

    @ObfuscatedName("n.c")
    public int[] field276 = new int[] { 0 };

    @ObfuscatedName("dm.z(IIS)I")
    public static int method2341(int arg0, int arg1) {
        class18 var2 = (class18) field279.method3281((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field275.length) {
            return var2.field275[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("aj.h(IIB)I")
    public static int method646(int arg0, int arg1) {
        class18 var2 = (class18) field279.method3281((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field276.length) {
            return var2.field276[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("t.c(IIIII)V")
    public static void method117(int arg0, int arg1, int arg2, int arg3) {
        class18 var4 = (class18) field279.method3281((long) arg0);
        if (var4 == null) {
            var4 = new class18();
            field279.method3283(var4, (long) arg0);
        }
        if (var4.field275.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field275.length; var7++) {
                var5[var7] = var4.field275[var7];
                var6[var7] = var4.field276[var7];
            }
            for (int var8 = var4.field275.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field275 = var5;
            var4.field276 = var6;
        }
        var4.field275[arg1] = arg2;
        var4.field276[arg1] = arg3;
    }

    @ObfuscatedName("cp.p(II)V")
    public static void method1653(int arg0) {
        class18 var1 = (class18) field279.method3281((long) arg0);
        if (var1 != null) {
            var1.method3346();
        }
    }

    @ObfuscatedName("da.i(I)V")
    public static void method2302() {
        field279 = new class173(32);
    }
}
