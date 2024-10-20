package deob;

@ObfuscatedName("du")
public class class85 extends class485 {

    @ObfuscatedName("du.at")
    public static class501 field1025 = new class501(32);

    @ObfuscatedName("du.ah")
    public int[] field1027 = new int[] { -1 };

    @ObfuscatedName("du.ar")
    public int[] field1026 = new int[] { 0 };

    @ObfuscatedName("dl.at(III)I")
    public static int method2442(int arg0, int arg1) {
        class85 var2 = (class85) field1025.method8154((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1027.length) {
            return var2.field1027[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("hb.ah(III)I")
    public static int method3355(int arg0, int arg1) {
        class85 var2 = (class85) field1025.method8154((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1026.length) {
            return var2.field1026[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bd.ar(IIB)I")
    public static int method440(int arg0, int arg1) {
        class85 var2 = (class85) field1025.method8154((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1026.length; var4++) {
                if (var2.field1027[var4] == arg1) {
                    var3 += var2.field1026[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("hi.ao(IIIIB)V")
    public static void method3371(int arg0, int arg1, int arg2, int arg3) {
        class85 var4 = (class85) field1025.method8154((long) arg0);
        if (var4 == null) {
            var4 = new class85();
            field1025.method8156(var4, (long) arg0);
        }
        if (var4.field1027.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1027.length; var7++) {
                var5[var7] = var4.field1027[var7];
                var6[var7] = var4.field1026[var7];
            }
            for (int var8 = var4.field1027.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1027 = var5;
            var4.field1026 = var6;
        }
        var4.field1027[arg1] = arg2;
        var4.field1026[arg1] = arg3;
    }

    @ObfuscatedName("bl.ab(IB)V")
    public static void method441(int arg0) {
        class85 var1 = (class85) field1025.method8154((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1027.length; var2++) {
                var1.field1027[var2] = -1;
                var1.field1026[var2] = 0;
            }
        }
    }

    @ObfuscatedName("jt.au(II)V")
    public static void method4570(int arg0) {
        class85 var1 = (class85) field1025.method8154((long) arg0);
        if (var1 != null) {
            var1.method7828();
        }
    }

    @ObfuscatedName("ct.aa(I)V")
    public static void method1104() {
        field1025 = new class501(32);
    }
}
