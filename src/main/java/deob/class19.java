package deob;

@ObfuscatedName("j")
public class class19 extends class179 {

    @ObfuscatedName("j.g")
    public static class175 field272 = new class175(32);

    @ObfuscatedName("j.m")
    public int[] field266 = new int[] { -1 };

    @ObfuscatedName("j.v")
    public int[] field268 = new int[] { 0 };

    @ObfuscatedName("ew.g(III)I")
    public static int method2880(int arg0, int arg1) {
        class19 var2 = (class19) field272.method3293((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field268.length) {
            return var2.field268[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cy.m(IIB)I")
    public static int method1844(int arg0, int arg1) {
        class19 var2 = (class19) field272.method3293((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field268.length; var4++) {
                if (var2.field266[var4] == arg1) {
                    var3 += var2.field268[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ak.v(IIIII)V")
    public static void method705(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field272.method3293((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field272.method3303(var4, (long) arg0);
        }
        if (var4.field266.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field266.length; var7++) {
                var5[var7] = var4.field266[var7];
                var6[var7] = var4.field268[var7];
            }
            for (int var8 = var4.field266.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field266 = var5;
            var4.field268 = var6;
        }
        var4.field266[arg1] = arg2;
        var4.field268[arg1] = arg3;
    }

    @ObfuscatedName("v.r(II)V")
    public static void method31(int arg0) {
        class19 var1 = (class19) field272.method3293((long) arg0);
        if (var1 != null) {
            var1.method3346();
        }
    }

    @ObfuscatedName("fs.n(I)V")
    public static void method3149() {
        field272 = new class175(32);
    }
}
