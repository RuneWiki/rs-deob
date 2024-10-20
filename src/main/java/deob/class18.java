package deob;

@ObfuscatedName("m")
public class class18 extends class177 {

    @ObfuscatedName("m.g")
    public static class173 field267 = new class173(32);

    @ObfuscatedName("m.e")
    public int[] field264 = new int[] { -1 };

    @ObfuscatedName("m.n")
    public int[] field265 = new int[] { 0 };

    @ObfuscatedName("dt.g(IIB)I")
    public static int method2709(int arg0, int arg1) {
        class18 var2 = (class18) field267.method3354((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field264.length) {
            return var2.field264[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("db.e(III)I")
    public static int method2349(int arg0, int arg1) {
        class18 var2 = (class18) field267.method3354((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field265.length) {
            return var2.field265[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("t.n(IIB)I")
    public static int method94(int arg0, int arg1) {
        class18 var2 = (class18) field267.method3354((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field265.length; var4++) {
                if (var2.field264[var4] == arg1) {
                    var3 += var2.field265[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("i.j(IIIII)V")
    public static void method36(int arg0, int arg1, int arg2, int arg3) {
        class18 var4 = (class18) field267.method3354((long) arg0);
        if (var4 == null) {
            var4 = new class18();
            field267.method3353(var4, (long) arg0);
        }
        if (var4.field264.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field264.length; var7++) {
                var5[var7] = var4.field264[var7];
                var6[var7] = var4.field265[var7];
            }
            for (int var8 = var4.field264.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field264 = var5;
            var4.field265 = var6;
        }
        var4.field264[arg1] = arg2;
        var4.field265[arg1] = arg3;
    }

    @ObfuscatedName("db.i(II)V")
    public static void method2348(int arg0) {
        class18 var1 = (class18) field267.method3354((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field264.length; var2++) {
                var1.field264[var2] = -1;
                var1.field265[var2] = 0;
            }
        }
    }

    @ObfuscatedName("p.o(IB)V")
    public static void method62(int arg0) {
        class18 var1 = (class18) field267.method3354((long) arg0);
        if (var1 != null) {
            var1.method3415();
        }
    }

    @ObfuscatedName("o.l(I)V")
    public static void method41() {
        field267 = new class173(32);
    }
}
