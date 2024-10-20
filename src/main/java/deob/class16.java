package deob;

@ObfuscatedName("h")
public class class16 extends class209 {

    @ObfuscatedName("h.f")
    public static class197 field230 = new class197(32);

    @ObfuscatedName("h.u")
    public int[] field222 = new int[] { -1 };

    @ObfuscatedName("h.x")
    public int[] field224 = new int[] { 0 };

    @ObfuscatedName("bn.f(IIS)I")
    public static int method1623(int arg0, int arg1) {
        class16 var2 = (class16) field230.method3555((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field222.length) {
            return var2.field222[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ak.u(III)I")
    public static int method974(int arg0, int arg1) {
        class16 var2 = (class16) field230.method3555((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field224.length) {
            return var2.field224[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ag.x(IIIII)V")
    public static void method670(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field230.method3555((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field230.method3559(var4, (long) arg0);
        }
        if (var4.field222.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field222.length; var7++) {
                var5[var7] = var4.field222[var7];
                var6[var7] = var4.field224[var7];
            }
            for (int var8 = var4.field222.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field222 = var5;
            var4.field224 = var6;
        }
        var4.field222[arg1] = arg2;
        var4.field224[arg1] = arg3;
    }

    @ObfuscatedName("b.b(I)V")
    public static void method48() {
        field230 = new class197(32);
    }
}
