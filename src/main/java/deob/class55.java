package deob;

@ObfuscatedName("bu")
public class class55 extends class207 {

    @ObfuscatedName("bu.c")
    public static class205 field532 = new class205(32);

    @ObfuscatedName("bu.q")
    public int[] field527 = new int[] { -1 };

    @ObfuscatedName("bu.m")
    public int[] field525 = new int[] { 0 };

    @ObfuscatedName("ci.c(III)I")
    public static int method1722(int arg0, int arg1) {
        class55 var2 = (class55) field532.method3687((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field527.length) {
            return var2.field527[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("d.q(IIIII)V")
    public static void method107(int arg0, int arg1, int arg2, int arg3) {
        class55 var4 = (class55) field532.method3687((long) arg0);
        if (var4 == null) {
            var4 = new class55();
            field532.method3691(var4, (long) arg0);
        }
        if (var4.field527.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field527.length; var7++) {
                var5[var7] = var4.field527[var7];
                var6[var7] = var4.field525[var7];
            }
            for (int var8 = var4.field527.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field527 = var5;
            var4.field525 = var6;
        }
        var4.field527[arg1] = arg2;
        var4.field525[arg1] = arg3;
    }

    @ObfuscatedName("fg.m(IB)V")
    public static void method3121(int arg0) {
        class55 var1 = (class55) field532.method3687((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field527.length; var2++) {
                var1.field527[var2] = -1;
                var1.field525[var2] = 0;
            }
        }
    }

    @ObfuscatedName("kq.j(I)V")
    public static void method5126() {
        field532 = new class205(32);
    }
}
