package deob;

@ObfuscatedName("z")
public class class16 extends class208 {

    @ObfuscatedName("z.n")
    public static class196 field213 = new class196(32);

    @ObfuscatedName("z.d")
    public int[] field207 = new int[] { -1 };

    @ObfuscatedName("z.s")
    public int[] field209 = new int[] { 0 };

    @ObfuscatedName("fo.n(IIIII)V")
    public static void method3139(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field213.method3519((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field213.method3526(var4, (long) arg0);
        }
        if (var4.field207.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field207.length; var7++) {
                var5[var7] = var4.field207[var7];
                var6[var7] = var4.field209[var7];
            }
            for (int var8 = var4.field207.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field207 = var5;
            var4.field209 = var6;
        }
        var4.field207[arg1] = arg2;
        var4.field209[arg1] = arg3;
    }

    @ObfuscatedName("hw.d(I)V")
    public static void method3712() {
        field213 = new class196(32);
    }
}
