package deob;

@ObfuscatedName("cy")
public class class93 extends class353 {

    @ObfuscatedName("cy.f")
    public static class363 field1125 = new class363(32);

    @ObfuscatedName("cy.e")
    public int[] field1127 = new int[] { -1 };

    @ObfuscatedName("cy.v")
    public int[] field1126 = new int[] { 0 };

    @ObfuscatedName("aj.f(III)I")
    public static int method335(int arg0, int arg1) {
        class93 var2 = (class93) field1125.method5691((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1127.length) {
            return var2.field1127[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("eg.e(III)I")
    public static int method2511(int arg0, int arg1) {
        class93 var2 = (class93) field1125.method5691((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1126.length) {
            return var2.field1126[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("aw.v(III)I")
    public static int method201(int arg0, int arg1) {
        class93 var2 = (class93) field1125.method5691((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1126.length; var4++) {
                if (var2.field1127[var4] == arg1) {
                    var3 += var2.field1126[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ky.y(IIIII)V")
    public static void method5074(int arg0, int arg1, int arg2, int arg3) {
        class93 var4 = (class93) field1125.method5691((long) arg0);
        if (var4 == null) {
            var4 = new class93();
            field1125.method5692(var4, (long) arg0);
        }
        if (var4.field1127.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1127.length; var7++) {
                var5[var7] = var4.field1127[var7];
                var6[var7] = var4.field1126[var7];
            }
            for (int var8 = var4.field1127.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1127 = var5;
            var4.field1126 = var6;
        }
        var4.field1127[arg1] = arg2;
        var4.field1126[arg1] = arg3;
    }

    @ObfuscatedName("dv.j(IB)V")
    public static void method2315(int arg0) {
        class93 var1 = (class93) field1125.method5691((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1127.length; var2++) {
                var1.field1127[var2] = -1;
                var1.field1126[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ai.o(II)V")
    public static void method587(int arg0) {
        class93 var1 = (class93) field1125.method5691((long) arg0);
        if (var1 != null) {
            var1.method5407();
        }
    }
}
