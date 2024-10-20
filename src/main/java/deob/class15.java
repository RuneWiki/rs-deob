package deob;

@ObfuscatedName("y")
public class class15 extends class198 {

    @ObfuscatedName("y.q")
    public static class186 field213 = new class186(32);

    @ObfuscatedName("y.s")
    public int[] field214 = new int[] { -1 };

    @ObfuscatedName("y.h")
    public int[] field210 = new int[] { 0 };

    @ObfuscatedName("g.s(IIIII)V")
    public static void method140(int arg0, int arg1, int arg2, int arg3) {
        class15 var4 = (class15) field213.method3273((long) arg0);
        if (var4 == null) {
            var4 = new class15();
            field213.method3274(var4, (long) arg0);
        }
        if (var4.field214.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field214.length; var7++) {
                var5[var7] = var4.field214[var7];
                var6[var7] = var4.field210[var7];
            }
            for (int var8 = var4.field214.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field214 = var5;
            var4.field210 = var6;
        }
        var4.field214[arg1] = arg2;
        var4.field210[arg1] = arg3;
    }
}
