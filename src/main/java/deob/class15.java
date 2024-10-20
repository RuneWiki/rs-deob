package deob;

@ObfuscatedName("q")
public class class15 extends class199 {

    @ObfuscatedName("q.n")
    public static class187 field227 = new class187(32);

    @ObfuscatedName("q.g")
    public int[] field224 = new int[] { -1 };

    @ObfuscatedName("q.a")
    public int[] field222 = new int[] { 0 };

    @ObfuscatedName("cl.n(III)I")
    public static int method2053(int arg0, int arg1) {
        class15 var2 = (class15) field227.method3425((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field222.length; var4++) {
                if (var2.field224[var4] == arg1) {
                    var3 += var2.field222[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("client.g(IIIII)V")
    public static void method488(int arg0, int arg1, int arg2, int arg3) {
        class15 var4 = (class15) field227.method3425((long) arg0);
        if (var4 == null) {
            var4 = new class15();
            field227.method3426(var4, (long) arg0);
        }
        if (var4.field224.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field224.length; var7++) {
                var5[var7] = var4.field224[var7];
                var6[var7] = var4.field222[var7];
            }
            for (int var8 = var4.field224.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field224 = var5;
            var4.field222 = var6;
        }
        var4.field224[arg1] = arg2;
        var4.field222[arg1] = arg3;
    }

    @ObfuscatedName("bz.a(I)V")
    public static void method1464() {
        field227 = new class187(32);
    }
}
