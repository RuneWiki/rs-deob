package deob;

@ObfuscatedName("b")
public class class19 extends class179 {

    @ObfuscatedName("b.p")
    public static class175 field272 = new class175(32);

    @ObfuscatedName("b.i")
    public int[] field269 = new int[] { -1 };

    @ObfuscatedName("b.o")
    public int[] field270 = new int[] { 0 };

    @ObfuscatedName("be.i(IIIII)V")
    public static void method1266(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field272.method3312((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field272.method3313(var4, (long) arg0);
        }
        if (var4.field269.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field269.length; var7++) {
                var5[var7] = var4.field269[var7];
                var6[var7] = var4.field270[var7];
            }
            for (int var8 = var4.field269.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field269 = var5;
            var4.field270 = var6;
        }
        var4.field269[arg1] = arg2;
        var4.field270[arg1] = arg3;
    }

    @ObfuscatedName("b.o(II)V")
    public static void method171(int arg0) {
        class19 var1 = (class19) field272.method3312((long) arg0);
        if (var1 != null) {
            var1.method3360();
        }
    }
}
