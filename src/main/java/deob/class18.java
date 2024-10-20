package deob;

@ObfuscatedName("y")
public class class18 extends class178 {

    @ObfuscatedName("y.p")
    public static class174 field275 = new class174(32);

    @ObfuscatedName("y.j")
    public int[] field272 = new int[] { -1 };

    @ObfuscatedName("y.w")
    public int[] field273 = new int[] { 0 };

    @ObfuscatedName("h.p(III)I")
    public static int method33(int arg0, int arg1) {
        class18 var2 = (class18) field275.method3261((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field273.length) {
            return var2.field273[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("v.j(IIIII)V")
    public static void method38(int arg0, int arg1, int arg2, int arg3) {
        class18 var4 = (class18) field275.method3261((long) arg0);
        if (var4 == null) {
            var4 = new class18();
            field275.method3262(var4, (long) arg0);
        }
        if (var4.field272.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field272.length; var7++) {
                var5[var7] = var4.field272[var7];
                var6[var7] = var4.field273[var7];
            }
            for (int var8 = var4.field272.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field272 = var5;
            var4.field273 = var6;
        }
        var4.field272[arg1] = arg2;
        var4.field273[arg1] = arg3;
    }

    @ObfuscatedName("bv.w(IB)V")
    public static void method1356(int arg0) {
        class18 var1 = (class18) field275.method3261((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field272.length; var2++) {
                var1.field272[var2] = -1;
                var1.field273[var2] = 0;
            }
        }
    }

    @ObfuscatedName("o.h(I)V")
    public static void method117() {
        field275 = new class174(32);
    }
}
