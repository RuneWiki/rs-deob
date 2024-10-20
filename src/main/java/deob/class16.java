package deob;

@ObfuscatedName("s")
public class class16 extends class212 {

    @ObfuscatedName("s.k")
    public static class200 field217 = new class200(32);

    @ObfuscatedName("s.q")
    public int[] field216 = new int[] { -1 };

    @ObfuscatedName("s.f")
    public int[] field221 = new int[] { 0 };

    @ObfuscatedName("ho.k(III)I")
    public static int method3794(int arg0, int arg1) {
        class16 var2 = (class16) field217.method3580((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field221.length) {
            return var2.field221[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cs.q(IIS)I")
    public static int method1621(int arg0, int arg1) {
        class16 var2 = (class16) field217.method3580((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field221.length; var4++) {
                if (var2.field216[var4] == arg1) {
                    var3 += var2.field221[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("h.f(IIIIB)V")
    public static void method113(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field217.method3580((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field217.method3574(var4, (long) arg0);
        }
        if (var4.field216.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field216.length; var7++) {
                var5[var7] = var4.field216[var7];
                var6[var7] = var4.field221[var7];
            }
            for (int var8 = var4.field216.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field216 = var5;
            var4.field221 = var6;
        }
        var4.field216[arg1] = arg2;
        var4.field221[arg1] = arg3;
    }

    @ObfuscatedName("hw.c(IS)V")
    public static void method3748(int arg0) {
        class16 var1 = (class16) field217.method3580((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field216.length; var2++) {
                var1.field216[var2] = -1;
                var1.field221[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ef.v(I)V")
    public static void method2856() {
        field217 = new class200(32);
    }
}
