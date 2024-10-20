package deob;

@ObfuscatedName("bn")
public class class66 extends class217 {

    @ObfuscatedName("bn.d")
    public static class215 field769 = new class215(32);

    @ObfuscatedName("bn.z")
    public int[] field768 = new int[] { -1 };

    @ObfuscatedName("bn.n")
    public int[] field767 = new int[] { 0 };

    @ObfuscatedName("cw.d(III)I")
    public static int method1805(int arg0, int arg1) {
        class66 var2 = (class66) field769.method3736((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field767.length; var4++) {
                if (var2.field768[var4] == arg1) {
                    var3 += var2.field767[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ae.z(IIIII)V")
    public static void method472(int arg0, int arg1, int arg2, int arg3) {
        class66 var4 = (class66) field769.method3736((long) arg0);
        if (var4 == null) {
            var4 = new class66();
            field769.method3745(var4, (long) arg0);
        }
        if (var4.field768.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field768.length; var7++) {
                var5[var7] = var4.field768[var7];
                var6[var7] = var4.field767[var7];
            }
            for (int var8 = var4.field768.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field768 = var5;
            var4.field767 = var6;
        }
        var4.field768[arg1] = arg2;
        var4.field767[arg1] = arg3;
    }

    @ObfuscatedName("ap.n(I)V")
    public static void method213() {
        field769 = new class215(32);
    }
}
