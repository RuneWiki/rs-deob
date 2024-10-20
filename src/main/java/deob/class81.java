package deob;

@ObfuscatedName("dc")
public class class81 extends class449 {

    @ObfuscatedName("dc.af")
    public static class465 field1022 = new class465(32);

    @ObfuscatedName("dc.an")
    public int[] field1023 = new int[] { -1 };

    @ObfuscatedName("dc.aw")
    public int[] field1027 = new int[] { 0 };

    @ObfuscatedName("dv.af(IIB)I")
    public static int method2238(int arg0, int arg1) {
        class81 var2 = (class81) field1022.method7966((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1023.length) {
            return var2.field1023[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("qb.an(III)I")
    public static int method7581(int arg0, int arg1) {
        class81 var2 = (class81) field1022.method7966((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1027.length) {
            return var2.field1027[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("pv.aw(III)I")
    public static int method7307(int arg0, int arg1) {
        class81 var2 = (class81) field1022.method7966((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1027.length; var4++) {
                if (var2.field1023[var4] == arg1) {
                    var3 += var2.field1027[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("oy.ac(IIIIB)V")
    public static void method6567(int arg0, int arg1, int arg2, int arg3) {
        class81 var4 = (class81) field1022.method7966((long) arg0);
        if (var4 == null) {
            var4 = new class81();
            field1022.method7967(var4, (long) arg0);
        }
        if (var4.field1023.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1023.length; var7++) {
                var5[var7] = var4.field1023[var7];
                var6[var7] = var4.field1027[var7];
            }
            for (int var8 = var4.field1023.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1023 = var5;
            var4.field1027 = var6;
        }
        var4.field1023[arg1] = arg2;
        var4.field1027[arg1] = arg3;
    }

    @ObfuscatedName("jr.au(II)V")
    public static void method4768(int arg0) {
        class81 var1 = (class81) field1022.method7966((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1023.length; var2++) {
                var1.field1023[var2] = -1;
                var1.field1027[var2] = 0;
            }
        }
    }

    @ObfuscatedName("pw.ab(IS)V")
    public static void method7180(int arg0) {
        class81 var1 = (class81) field1022.method7966((long) arg0);
        if (var1 != null) {
            var1.method7651();
        }
    }
}
