package deob;

@ObfuscatedName("s")
public class class16 extends class212 {

    @ObfuscatedName("s.m")
    public static class200 field205 = new class200(32);

    @ObfuscatedName("s.w")
    public int[] field207 = new int[] { -1 };

    @ObfuscatedName("s.e")
    public int[] field200 = new int[] { 0 };

    @ObfuscatedName("cc.m(III)I")
    public static int method1626(int arg0, int arg1) {
        class16 var2 = (class16) field205.method3595((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field200.length) {
            return var2.field200[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("aj.w(III)I")
    public static int method604(int arg0, int arg1) {
        class16 var2 = (class16) field205.method3595((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field200.length; var4++) {
                if (var2.field207[var4] == arg1) {
                    var3 += var2.field200[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("p.e(IIIII)V")
    public static void method153(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field205.method3595((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field205.method3588(var4, (long) arg0);
        }
        if (var4.field207.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field207.length; var7++) {
                var5[var7] = var4.field207[var7];
                var6[var7] = var4.field200[var7];
            }
            for (int var8 = var4.field207.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field207 = var5;
            var4.field200 = var6;
        }
        var4.field207[arg1] = arg2;
        var4.field200[arg1] = arg3;
    }

    @ObfuscatedName("ab.o(IB)V")
    public static void method652(int arg0) {
        class16 var1 = (class16) field205.method3595((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field207.length; var2++) {
                var1.field207[var2] = -1;
                var1.field200[var2] = 0;
            }
        }
    }

    @ObfuscatedName("db.g(II)V")
    public static void method2687(int arg0) {
        class16 var1 = (class16) field205.method3595((long) arg0);
        if (var1 != null) {
            var1.method3729();
        }
    }

    @ObfuscatedName("o.l(I)V")
    public static void method41() {
        field205 = new class200(32);
    }
}
