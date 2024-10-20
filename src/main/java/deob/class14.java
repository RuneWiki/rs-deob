package deob;

@ObfuscatedName("t")
public class class14 extends class189 {

    @ObfuscatedName("t.f")
    public static class177 field199 = new class177(32);

    @ObfuscatedName("t.k")
    public int[] field189 = new int[] { -1 };

    @ObfuscatedName("t.y")
    public int[] field190 = new int[] { 0 };

    @ObfuscatedName("j.f(IIB)I")
    public static int method479(int arg0, int arg1) {
        class14 var2 = (class14) field199.method3244((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field189.length) {
            return var2.field189[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("dg.k(III)I")
    public static int method2503(int arg0, int arg1) {
        class14 var2 = (class14) field199.method3244((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field190.length) {
            return var2.field190[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("da.y(IIIIB)V")
    public static void method2579(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field199.method3244((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field199.method3245(var4, (long) arg0);
        }
        if (var4.field189.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field189.length; var7++) {
                var5[var7] = var4.field189[var7];
                var6[var7] = var4.field190[var7];
            }
            for (int var8 = var4.field189.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field189 = var5;
            var4.field190 = var6;
        }
        var4.field189[arg1] = arg2;
        var4.field190[arg1] = arg3;
    }

    @ObfuscatedName("o.e(II)V")
    public static void method138(int arg0) {
        class14 var1 = (class14) field199.method3244((long) arg0);
        if (var1 != null) {
            var1.method3367();
        }
    }

    @ObfuscatedName("n.r(I)V")
    public static void method95() {
        field199 = new class177(32);
    }
}
