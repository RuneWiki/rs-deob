package deob;

@ObfuscatedName("dk")
public class class83 extends class444 {

    @ObfuscatedName("dk.aj")
    public static class455 field1022 = new class455(32);

    @ObfuscatedName("dk.al")
    public int[] field1021 = new int[] { -1 };

    @ObfuscatedName("dk.ac")
    public int[] field1025 = new int[] { 0 };

    @ObfuscatedName("dc.aj(IIS)I")
    public static int method2120(int arg0, int arg1) {
        class83 var2 = (class83) field1022.method7619((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1021.length) {
            return var2.field1021[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("fz.al(III)I")
    public static int method2884(int arg0, int arg1) {
        class83 var2 = (class83) field1022.method7619((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1025.length) {
            return var2.field1025[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("jo.ac(III)I")
    public static int method4413(int arg0, int arg1) {
        class83 var2 = (class83) field1022.method7619((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1025.length; var4++) {
                if (var2.field1021[var4] == arg1) {
                    var3 += var2.field1025[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ec.ab(IIIIB)V")
    public static void method2735(int arg0, int arg1, int arg2, int arg3) {
        class83 var4 = (class83) field1022.method7619((long) arg0);
        if (var4 == null) {
            var4 = new class83();
            field1022.method7616(var4, (long) arg0);
        }
        if (var4.field1021.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1021.length; var7++) {
                var5[var7] = var4.field1021[var7];
                var6[var7] = var4.field1025[var7];
            }
            for (int var8 = var4.field1021.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1021 = var5;
            var4.field1025 = var6;
        }
        var4.field1021[arg1] = arg2;
        var4.field1025[arg1] = arg3;
    }

    @ObfuscatedName("do.an(IB)V")
    public static void method2532(int arg0) {
        class83 var1 = (class83) field1022.method7619((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1021.length; var2++) {
                var1.field1021[var2] = -1;
                var1.field1025[var2] = 0;
            }
        }
    }

    @ObfuscatedName("od.ao(IB)V")
    public static void method6546(int arg0) {
        class83 var1 = (class83) field1022.method7619((long) arg0);
        if (var1 != null) {
            var1.method7335();
        }
    }

    @ObfuscatedName("hi.av(I)V")
    public static void method3736() {
        field1022 = new class455(32);
    }
}
