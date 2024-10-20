package deob;

@ObfuscatedName("dk")
public class class87 extends class488 {

    @ObfuscatedName("dk.ac")
    public static class504 field1057 = new class504(32);

    @ObfuscatedName("dk.al")
    public int[] field1061 = new int[] { -1 };

    @ObfuscatedName("dk.ak")
    public int[] field1059 = new int[] { 0 };

    @ObfuscatedName("oa.ac(III)I")
    public static int method6503(int arg0, int arg1) {
        class87 var2 = (class87) field1057.method8104((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1061.length) {
            return var2.field1061[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bk.al(III)I")
    public static int method377(int arg0, int arg1) {
        class87 var2 = (class87) field1057.method8104((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1059.length) {
            return var2.field1059[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("gi.ak(IIB)I")
    public static int method3090(int arg0, int arg1) {
        class87 var2 = (class87) field1057.method8104((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1059.length; var4++) {
                if (var2.field1061[var4] == arg1) {
                    var3 += var2.field1059[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("dm.ax(IIIII)V")
    public static void method2091(int arg0, int arg1, int arg2, int arg3) {
        class87 var4 = (class87) field1057.method8104((long) arg0);
        if (var4 == null) {
            var4 = new class87();
            field1057.method8098(var4, (long) arg0);
        }
        if (var4.field1061.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1061.length; var7++) {
                var5[var7] = var4.field1061[var7];
                var6[var7] = var4.field1059[var7];
            }
            for (int var8 = var4.field1061.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1061 = var5;
            var4.field1059 = var6;
        }
        var4.field1061[arg1] = arg2;
        var4.field1059[arg1] = arg3;
    }

    @ObfuscatedName("fx.ao(IB)V")
    public static void method3015(int arg0) {
        class87 var1 = (class87) field1057.method8104((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1061.length; var2++) {
                var1.field1061[var2] = -1;
                var1.field1059[var2] = 0;
            }
        }
    }

    @ObfuscatedName("oj.ah(IB)V")
    public static void method6463(int arg0) {
        class87 var1 = (class87) field1057.method8104((long) arg0);
        if (var1 != null) {
            var1.method7776();
        }
    }

    @ObfuscatedName("jh.ar(I)V")
    public static void method4150() {
        field1057 = new class504(32);
    }
}
