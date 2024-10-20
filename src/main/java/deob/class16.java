package deob;

@ObfuscatedName("e")
public class class16 extends class209 {

    @ObfuscatedName("e.s")
    public static class197 field205 = new class197(32);

    @ObfuscatedName("e.j")
    public int[] field211 = new int[] { -1 };

    @ObfuscatedName("e.p")
    public int[] field207 = new int[] { 0 };

    @ObfuscatedName("g.s(III)I")
    public static int method549(int arg0, int arg1) {
        class16 var2 = (class16) field205.method3518((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field207.length) {
            return var2.field207[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("as.j(III)I")
    public static int method692(int arg0, int arg1) {
        class16 var2 = (class16) field205.method3518((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field207.length; var4++) {
                if (var2.field211[var4] == arg1) {
                    var3 += var2.field207[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("az.p(IIIII)V")
    public static void method1027(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field205.method3518((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field205.method3519(var4, (long) arg0);
        }
        if (var4.field211.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field211.length; var7++) {
                var5[var7] = var4.field211[var7];
                var6[var7] = var4.field207[var7];
            }
            for (int var8 = var4.field211.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field211 = var5;
            var4.field207 = var6;
        }
        var4.field211[arg1] = arg2;
        var4.field207[arg1] = arg3;
    }

    @ObfuscatedName("l.x(S)V")
    public static void method133() {
        field205 = new class197(32);
    }
}
