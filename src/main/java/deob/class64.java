package deob;

@ObfuscatedName("bd")
public class class64 extends class200 {

    @ObfuscatedName("bd.m")
    public static class198 field750 = new class198(32);

    @ObfuscatedName("bd.p")
    public int[] field747 = new int[] { -1 };

    @ObfuscatedName("bd.i")
    public int[] field748 = new int[] { 0 };

    @ObfuscatedName("bx.m(IIB)I")
    public static int method1058(int arg0, int arg1) {
        class64 var2 = (class64) field750.method3444((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field747.length) {
            return var2.field747[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("c.p(IIIII)V")
    public static void method48(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) field750.method3444((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            field750.method3431(var4, (long) arg0);
        }
        if (var4.field747.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field747.length; var7++) {
                var5[var7] = var4.field747[var7];
                var6[var7] = var4.field748[var7];
            }
            for (int var8 = var4.field747.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field747 = var5;
            var4.field748 = var6;
        }
        var4.field747[arg1] = arg2;
        var4.field748[arg1] = arg3;
    }

    @ObfuscatedName("ah.i(II)V")
    public static void method510(int arg0) {
        class64 var1 = (class64) field750.method3444((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field747.length; var2++) {
                var1.field747[var2] = -1;
                var1.field748[var2] = 0;
            }
        }
    }

    @ObfuscatedName("bo.j(I)V")
    public static void method742() {
        field750 = new class198(32);
    }
}
