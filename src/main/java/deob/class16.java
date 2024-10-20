package deob;

@ObfuscatedName("b")
public class class16 extends class208 {

    @ObfuscatedName("b.n")
    public static class196 field231 = new class196(32);

    @ObfuscatedName("b.q")
    public int[] field230 = new int[] { -1 };

    @ObfuscatedName("b.c")
    public int[] field229 = new int[] { 0 };

    @ObfuscatedName("dm.n(IIIIB)V")
    public static void method2652(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field231.method3518((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field231.method3524(var4, (long) arg0);
        }
        if (var4.field230.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field230.length; var7++) {
                var5[var7] = var4.field230[var7];
                var6[var7] = var4.field229[var7];
            }
            for (int var8 = var4.field230.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field230 = var5;
            var4.field229 = var6;
        }
        var4.field230[arg1] = arg2;
        var4.field229[arg1] = arg3;
    }

    @ObfuscatedName("w.q(II)V")
    public static void method106(int arg0) {
        class16 var1 = (class16) field231.method3518((long) arg0);
        if (var1 != null) {
            var1.method3651();
        }
    }

    @ObfuscatedName("bg.c(I)V")
    public static void method1250() {
        field231 = new class196(32);
    }
}
