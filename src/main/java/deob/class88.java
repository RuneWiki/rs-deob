package deob;

@ObfuscatedName("de")
public class class88 extends class508 {

    @ObfuscatedName("de.ac")
    public static class524 field1083 = new class524(32);

    @ObfuscatedName("de.ae")
    public int[] field1080 = new int[] { -1 };

    @ObfuscatedName("de.ag")
    public int[] field1081 = new int[] { 0 };

    @ObfuscatedName("de.ac(IIB)I")
    public static int method2387(int arg0, int arg1) {
        class88 var2 = (class88) field1083.method8688((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1080.length) {
            return var2.field1080[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("at.ae(III)I")
    public static int method51(int arg0, int arg1) {
        class88 var2 = (class88) field1083.method8688((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1081.length) {
            return var2.field1081[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ct.ag(IIB)I")
    public static int method1150(int arg0, int arg1) {
        class88 var2 = (class88) field1083.method8688((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1081.length; var4++) {
                if (var2.field1080[var4] == arg1) {
                    var3 += var2.field1081[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("cy.am(IIIIB)V")
    public static void method1126(int arg0, int arg1, int arg2, int arg3) {
        class88 var4 = (class88) field1083.method8688((long) arg0);
        if (var4 == null) {
            var4 = new class88();
            field1083.method8690(var4, (long) arg0);
        }
        if (var4.field1080.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1080.length; var7++) {
                var5[var7] = var4.field1080[var7];
                var6[var7] = var4.field1081[var7];
            }
            for (int var8 = var4.field1080.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1080 = var5;
            var4.field1081 = var6;
        }
        var4.field1080[arg1] = arg2;
        var4.field1081[arg1] = arg3;
    }

    @ObfuscatedName("oe.ax(II)V")
    public static void method6683(int arg0) {
        class88 var1 = (class88) field1083.method8688((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1080.length; var2++) {
                var1.field1080[var2] = -1;
                var1.field1081[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ci.aq(II)V")
    public static void method1115(int arg0) {
        class88 var1 = (class88) field1083.method8688((long) arg0);
        if (var1 != null) {
            var1.method8362();
        }
    }
}
