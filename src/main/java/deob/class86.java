package deob;

@ObfuscatedName("du")
public class class86 extends class492 {

    @ObfuscatedName("du.aq")
    public static class508 field1075 = new class508(32);

    @ObfuscatedName("du.aw")
    public int[] field1073 = new int[] { -1 };

    @ObfuscatedName("du.al")
    public int[] field1076 = new int[] { 0 };

    @ObfuscatedName("ix.aq(III)I")
    public static int method3908(int arg0, int arg1) {
        class86 var2 = (class86) field1075.method8322((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1073.length) {
            return var2.field1073[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ia.aw(IIB)I")
    public static int method3997(int arg0, int arg1) {
        class86 var2 = (class86) field1075.method8322((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1076.length) {
            return var2.field1076[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ps.al(III)I")
    public static int method6865(int arg0, int arg1) {
        class86 var2 = (class86) field1075.method8322((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1076.length; var4++) {
                if (var2.field1073[var4] == arg1) {
                    var3 += var2.field1076[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("aw.ai(IIIIB)V")
    public static void method10(int arg0, int arg1, int arg2, int arg3) {
        class86 var4 = (class86) field1075.method8322((long) arg0);
        if (var4 == null) {
            var4 = new class86();
            field1075.method8324(var4, (long) arg0);
        }
        if (var4.field1073.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1073.length; var7++) {
                var5[var7] = var4.field1073[var7];
                var6[var7] = var4.field1076[var7];
            }
            for (int var8 = var4.field1073.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1073 = var5;
            var4.field1076 = var6;
        }
        var4.field1073[arg1] = arg2;
        var4.field1076[arg1] = arg3;
    }

    @ObfuscatedName("kn.ar(IB)V")
    public static void method4839(int arg0) {
        class86 var1 = (class86) field1075.method8322((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1073.length; var2++) {
                var1.field1073[var2] = -1;
                var1.field1076[var2] = 0;
            }
        }
    }

    @ObfuscatedName("fi.as(IB)V")
    public static void method2928(int arg0) {
        class86 var1 = (class86) field1075.method8322((long) arg0);
        if (var1 != null) {
            var1.method7996();
        }
    }

    @ObfuscatedName("dy.aa(I)V")
    public static void method2345() {
        field1075 = new class508(32);
    }
}
