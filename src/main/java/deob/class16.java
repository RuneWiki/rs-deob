package deob;

@ObfuscatedName("w")
public class class16 extends class212 {

    @ObfuscatedName("w.a")
    public static class200 field216 = new class200(32);

    @ObfuscatedName("w.d")
    public int[] field214 = new int[] { -1 };

    @ObfuscatedName("w.v")
    public int[] field215 = new int[] { 0 };

    @ObfuscatedName("client.a(IIIII)V")
    public static void method550(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field216.method3580((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field216.method3586(var4, (long) arg0);
        }
        if (var4.field214.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field214.length; var7++) {
                var5[var7] = var4.field214[var7];
                var6[var7] = var4.field215[var7];
            }
            for (int var8 = var4.field214.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field214 = var5;
            var4.field215 = var6;
        }
        var4.field214[arg1] = arg2;
        var4.field215[arg1] = arg3;
    }

    @ObfuscatedName("i.v(I)V")
    public static void method106() {
        field216 = new class200(32);
    }
}
