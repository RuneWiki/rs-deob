package deob;

@ObfuscatedName("bv")
public class class69 extends class190 {

    @ObfuscatedName("bv.f")
    public static class329 field578 = new class329(32);

    @ObfuscatedName("bv.b")
    public int[] field568 = new int[] { -1 };

    @ObfuscatedName("bv.l")
    public int[] field569 = new int[] { 0 };

    @ObfuscatedName("s.f(III)I")
    public static int method151(int arg0, int arg1) {
        class69 var2 = (class69) field578.method5597((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field568.length) {
            return var2.field568[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("an.b(III)I")
    public static int method599(int arg0, int arg1) {
        class69 var2 = (class69) field578.method5597((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field569.length) {
            return var2.field569[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("fm.l(IIB)I")
    public static int method3261(int arg0, int arg1) {
        class69 var2 = (class69) field578.method5597((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field569.length; var4++) {
                if (var2.field568[var4] == arg1) {
                    var3 += var2.field569[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("r.m(IIIIB)V")
    public static void method132(int arg0, int arg1, int arg2, int arg3) {
        class69 var4 = (class69) field578.method5597((long) arg0);
        if (var4 == null) {
            var4 = new class69();
            field578.method5596(var4, (long) arg0);
        }
        if (var4.field568.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field568.length; var7++) {
                var5[var7] = var4.field568[var7];
                var6[var7] = var4.field569[var7];
            }
            for (int var8 = var4.field568.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field568 = var5;
            var4.field569 = var6;
        }
        var4.field568[arg1] = arg2;
        var4.field569[arg1] = arg3;
    }

    @ObfuscatedName("m.z(II)V")
    public static void method47(int arg0) {
        class69 var1 = (class69) field578.method5597((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field568.length; var2++) {
                var1.field568[var2] = -1;
                var1.field569[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ae.q(II)V")
    public static void method681(int arg0) {
        class69 var1 = (class69) field578.method5597((long) arg0);
        if (var1 != null) {
            var1.method3407();
        }
    }

    @ObfuscatedName("z.k(B)V")
    public static void method55() {
        field578 = new class329(32);
    }
}
