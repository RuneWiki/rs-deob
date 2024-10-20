package deob;

@ObfuscatedName("l")
public class class16 extends class208 {

    @ObfuscatedName("l.i")
    public static class196 field213 = new class196(32);

    @ObfuscatedName("l.v")
    public int[] field216 = new int[] { -1 };

    @ObfuscatedName("l.r")
    public int[] field210 = new int[] { 0 };

    @ObfuscatedName("ad.i(IIIII)V")
    public static void method1071(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field213.method3496((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field213.method3497(var4, (long) arg0);
        }
        if (var4.field216.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field216.length; var7++) {
                var5[var7] = var4.field216[var7];
                var6[var7] = var4.field210[var7];
            }
            for (int var8 = var4.field216.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field216 = var5;
            var4.field210 = var6;
        }
        var4.field216[arg1] = arg2;
        var4.field210[arg1] = arg3;
    }
}
