package deob;

@ObfuscatedName("bt")
public class class64 extends class193 {

    @ObfuscatedName("bt.w")
    public static class191 field795 = new class191(32);

    @ObfuscatedName("bt.s")
    public int[] field799 = new int[] { -1 };

    @ObfuscatedName("bt.q")
    public int[] field796 = new int[] { 0 };

    @ObfuscatedName("jz.w(III)I")
    public static int method4486(int arg0, int arg1) {
        class64 var2 = (class64) field795.method3387((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field799.length) {
            return var2.field799[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("dg.o(IIIII)V")
    public static void method2342(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) field795.method3387((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            field795.method3374(var4, (long) arg0);
        }
        if (var4.field799.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field799.length; var7++) {
                var5[var7] = var4.field799[var7];
                var6[var7] = var4.field796[var7];
            }
            for (int var8 = var4.field799.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field799 = var5;
            var4.field796 = var6;
        }
        var4.field799[arg1] = arg2;
        var4.field796[arg1] = arg3;
    }

    @ObfuscatedName("ap.g(II)V")
    public static void method199(int arg0) {
        class64 var1 = (class64) field795.method3387((long) arg0);
        if (var1 != null) {
            var1.method3425();
        }
    }

    @ObfuscatedName("ap.v(I)V")
    public static void method189() {
        field795 = new class191(32);
    }
}
