package deob;

@ObfuscatedName("o")
public class class15 extends class199 {

    @ObfuscatedName("o.p")
    public static class187 field213 = new class187(32);

    @ObfuscatedName("o.k")
    public int[] field207 = new int[] { -1 };

    @ObfuscatedName("o.e")
    public int[] field208 = new int[] { 0 };

    @ObfuscatedName("x.p(III)I")
    public static int method142(int arg0, int arg1) {
        class15 var2 = (class15) field213.method3405((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field207.length) {
            return var2.field207[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("do.k(IIB)I")
    public static int method2412(int arg0, int arg1) {
        class15 var2 = (class15) field213.method3405((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field208.length; var4++) {
                if (var2.field207[var4] == arg1) {
                    var3 += var2.field208[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("bq.e(IIIII)V")
    public static void method1439(int arg0, int arg1, int arg2, int arg3) {
        class15 var4 = (class15) field213.method3405((long) arg0);
        if (var4 == null) {
            var4 = new class15();
            field213.method3406(var4, (long) arg0);
        }
        if (var4.field207.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field207.length; var7++) {
                var5[var7] = var4.field207[var7];
                var6[var7] = var4.field208[var7];
            }
            for (int var8 = var4.field207.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field207 = var5;
            var4.field208 = var6;
        }
        var4.field207[arg1] = arg2;
        var4.field208[arg1] = arg3;
    }

    @ObfuscatedName("b.f(II)V")
    public static void method564(int arg0) {
        class15 var1 = (class15) field213.method3405((long) arg0);
        if (var1 != null) {
            var1.method3533();
        }
    }

    @ObfuscatedName("j.w(I)V")
    public static void method519() {
        field213 = new class187(32);
    }
}
