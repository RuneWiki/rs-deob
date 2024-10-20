package deob;

@ObfuscatedName("w")
public class class14 extends class189 {

    @ObfuscatedName("w.c")
    public static class177 field194 = new class177(32);

    @ObfuscatedName("w.j")
    public int[] field203 = new int[] { -1 };

    @ObfuscatedName("w.y")
    public int[] field196 = new int[] { 0 };

    @ObfuscatedName("r.j(IIIIB)V")
    public static void method22(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field194.method3206((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field194.method3207(var4, (long) arg0);
        }
        if (var4.field203.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field203.length; var7++) {
                var5[var7] = var4.field203[var7];
                var6[var7] = var4.field196[var7];
            }
            for (int var8 = var4.field203.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field203 = var5;
            var4.field196 = var6;
        }
        var4.field203[arg1] = arg2;
        var4.field196[arg1] = arg3;
    }
}
