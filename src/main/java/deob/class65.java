package deob;

@ObfuscatedName("bg")
public class class65 extends class213 {

    @ObfuscatedName("bg.b")
    public static class211 field720 = new class211(32);

    @ObfuscatedName("bg.q")
    public int[] field721 = new int[] { -1 };

    @ObfuscatedName("bg.o")
    public int[] field723 = new int[] { 0 };

    @ObfuscatedName("cp.q(IIIII)V")
    public static void method1883(int arg0, int arg1, int arg2, int arg3) {
        class65 var4 = (class65) field720.method3674((long) arg0);
        if (var4 == null) {
            var4 = new class65();
            field720.method3675(var4, (long) arg0);
        }
        if (var4.field721.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field721.length; var7++) {
                var5[var7] = var4.field721[var7];
                var6[var7] = var4.field723[var7];
            }
            for (int var8 = var4.field721.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field721 = var5;
            var4.field723 = var6;
        }
        var4.field721[arg1] = arg2;
        var4.field723[arg1] = arg3;
    }

    @ObfuscatedName("ar.o(II)V")
    public static void method504(int arg0) {
        class65 var1 = (class65) field720.method3674((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field721.length; var2++) {
                var1.field721[var2] = -1;
                var1.field723[var2] = 0;
            }
        }
    }

    @ObfuscatedName("at.p(IB)V")
    public static void method600(int arg0) {
        class65 var1 = (class65) field720.method3674((long) arg0);
        if (var1 != null) {
            var1.method3726();
        }
    }
}
