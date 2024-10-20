package deob;

@ObfuscatedName("dx")
public class class86 extends class493 {

    @ObfuscatedName("dx.az")
    public static class509 field1057 = new class509(32);

    @ObfuscatedName("dx.ah")
    public int[] field1058 = new int[] { -1 };

    @ObfuscatedName("dx.af")
    public int[] field1061 = new int[] { 0 };

    @ObfuscatedName("hp.az(III)I")
    public static int method3358(int arg0, int arg1) {
        class86 var2 = (class86) field1057.method8206((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1058.length) {
            return var2.field1058[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ck.ah(IIB)I")
    public static int method1753(int arg0, int arg1) {
        class86 var2 = (class86) field1057.method8206((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1061.length) {
            return var2.field1061[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ee.af(IIB)I")
    public static int method2738(int arg0, int arg1) {
        class86 var2 = (class86) field1057.method8206((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1061.length; var4++) {
                if (var2.field1058[var4] == arg1) {
                    var3 += var2.field1061[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("da.at(IIIII)V")
    public static void method2172(int arg0, int arg1, int arg2, int arg3) {
        class86 var4 = (class86) field1057.method8206((long) arg0);
        if (var4 == null) {
            var4 = new class86();
            field1057.method8204(var4, (long) arg0);
        }
        if (var4.field1058.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1058.length; var7++) {
                var5[var7] = var4.field1058[var7];
                var6[var7] = var4.field1061[var7];
            }
            for (int var8 = var4.field1058.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1058 = var5;
            var4.field1061 = var6;
        }
        var4.field1058[arg1] = arg2;
        var4.field1061[arg1] = arg3;
    }

    @ObfuscatedName("kv.an(IB)V")
    public static void method5152(int arg0) {
        class86 var1 = (class86) field1057.method8206((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1058.length; var2++) {
                var1.field1058[var2] = -1;
                var1.field1061[var2] = 0;
            }
        }
    }

    @ObfuscatedName("tg.ao(IB)V")
    public static void method8152(int arg0) {
        class86 var1 = (class86) field1057.method8206((long) arg0);
        if (var1 != null) {
            var1.method7855();
        }
    }

    @ObfuscatedName("gx.ab(I)V")
    public static void method3094() {
        field1057 = new class509(32);
    }
}
