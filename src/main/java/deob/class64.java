package deob;

@ObfuscatedName("bl")
public class class64 extends class193 {

    @ObfuscatedName("bl.n")
    public static class191 field770 = new class191(32);

    @ObfuscatedName("bl.p")
    public int[] field773 = new int[] { -1 };

    @ObfuscatedName("bl.i")
    public int[] field765 = new int[] { 0 };

    @ObfuscatedName("x.n(III)I")
    public static int method68(int arg0, int arg1) {
        class64 var2 = (class64) field770.method3295((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field773.length) {
            return var2.field773[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("o.p(III)I")
    public static int method60(int arg0, int arg1) {
        class64 var2 = (class64) field770.method3295((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field765.length; var4++) {
                if (var2.field773[var4] == arg1) {
                    var3 += var2.field765[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("cs.i(IIIII)V")
    public static void method1399(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) field770.method3295((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            field770.method3296(var4, (long) arg0);
        }
        if (var4.field773.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field773.length; var7++) {
                var5[var7] = var4.field773[var7];
                var6[var7] = var4.field765[var7];
            }
            for (int var8 = var4.field773.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field773 = var5;
            var4.field765 = var6;
        }
        var4.field773[arg1] = arg2;
        var4.field765[arg1] = arg3;
    }

    @ObfuscatedName("iv.j(II)V")
    public static void method4272(int arg0) {
        class64 var1 = (class64) field770.method3295((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field773.length; var2++) {
                var1.field773[var2] = -1;
                var1.field765[var2] = 0;
            }
        }
    }
}
