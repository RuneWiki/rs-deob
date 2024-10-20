package deob;

@ObfuscatedName("bb")
public class class64 extends class196 {

    @ObfuscatedName("bb.w")
    public static class194 field795 = new class194(32);

    @ObfuscatedName("bb.o")
    public int[] field794 = new int[] { -1 };

    @ObfuscatedName("bb.x")
    public int[] field797 = new int[] { 0 };

    @ObfuscatedName("bf.w(IIIII)V")
    public static void method972(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) field795.method3252((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            field795.method3253(var4, (long) arg0);
        }
        if (var4.field794.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field794.length; var7++) {
                var5[var7] = var4.field794[var7];
                var6[var7] = var4.field797[var7];
            }
            for (int var8 = var4.field794.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field794 = var5;
            var4.field797 = var6;
        }
        var4.field794[arg1] = arg2;
        var4.field797[arg1] = arg3;
    }

    @ObfuscatedName("bn.o(II)V")
    public static void method668(int arg0) {
        class64 var1 = (class64) field795.method3252((long) arg0);
        if (var1 != null) {
            var1.method3294();
        }
    }
}
