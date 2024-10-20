package deob;

@ObfuscatedName("x")
public class class16 extends class212 {

    @ObfuscatedName("x.e")
    public static class200 field228 = new class200(32);

    @ObfuscatedName("x.l")
    public int[] field227 = new int[] { -1 };

    @ObfuscatedName("x.c")
    public int[] field229 = new int[] { 0 };

    @ObfuscatedName("ac.e(IIIII)V")
    public static void method1090(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field228.method3619((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field228.method3620(var4, (long) arg0);
        }
        if (var4.field227.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field227.length; var7++) {
                var5[var7] = var4.field227[var7];
                var6[var7] = var4.field229[var7];
            }
            for (int var8 = var4.field227.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field227 = var5;
            var4.field229 = var6;
        }
        var4.field227[arg1] = arg2;
        var4.field229[arg1] = arg3;
    }

    @ObfuscatedName("ax.l(IB)V")
    public static void method853(int arg0) {
        class16 var1 = (class16) field228.method3619((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field227.length; var2++) {
                var1.field227[var2] = -1;
                var1.field229[var2] = 0;
            }
        }
    }

    @ObfuscatedName("fp.c(II)V")
    public static void method3326(int arg0) {
        class16 var1 = (class16) field228.method3619((long) arg0);
        if (var1 != null) {
            var1.method3755();
        }
    }

    @ObfuscatedName("b.h(I)V")
    public static void method88() {
        field228 = new class200(32);
    }
}
