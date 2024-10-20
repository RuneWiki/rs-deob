package deob;

@ObfuscatedName("r")
public class class16 extends class208 {

    @ObfuscatedName("r.m")
    public static class196 field200 = new class196(32);

    @ObfuscatedName("r.l")
    public int[] field196 = new int[] { -1 };

    @ObfuscatedName("r.y")
    public int[] field198 = new int[] { 0 };

    @ObfuscatedName("p.m(IIB)I")
    public static int method130(int arg0, int arg1) {
        class16 var2 = (class16) field200.method3571((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field198.length; var4++) {
                if (var2.field196[var4] == arg1) {
                    var3 += var2.field198[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("du.l(IIIII)V")
    public static void method2264(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field200.method3571((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field200.method3572(var4, (long) arg0);
        }
        if (var4.field196.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field196.length; var7++) {
                var5[var7] = var4.field196[var7];
                var6[var7] = var4.field198[var7];
            }
            for (int var8 = var4.field196.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field196 = var5;
            var4.field198 = var6;
        }
        var4.field196[arg1] = arg2;
        var4.field198[arg1] = arg3;
    }

    @ObfuscatedName("el.y(II)V")
    public static void method2861(int arg0) {
        class16 var1 = (class16) field200.method3571((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field196.length; var2++) {
                var1.field196[var2] = -1;
                var1.field198[var2] = 0;
            }
        }
    }

    @ObfuscatedName("et.u(II)V")
    public static void method2819(int arg0) {
        class16 var1 = (class16) field200.method3571((long) arg0);
        if (var1 != null) {
            var1.method3702();
        }
    }

    @ObfuscatedName("fi.k(I)V")
    public static void method3017() {
        field200 = new class196(32);
    }
}
