package deob;

@ObfuscatedName("w")
public class class14 extends class189 {

    @ObfuscatedName("w.x")
    public static class177 field190 = new class177(32);

    @ObfuscatedName("w.v")
    public int[] field195 = new int[] { -1 };

    @ObfuscatedName("w.m")
    public int[] field189 = new int[] { 0 };

    @ObfuscatedName("d.x(IIIIB)V")
    public static void method507(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field190.method3214((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field190.method3215(var4, (long) arg0);
        }
        if (var4.field195.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field195.length; var7++) {
                var5[var7] = var4.field195[var7];
                var6[var7] = var4.field189[var7];
            }
            for (int var8 = var4.field195.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field195 = var5;
            var4.field189 = var6;
        }
        var4.field195[arg1] = arg2;
        var4.field189[arg1] = arg3;
    }
}
