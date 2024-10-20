package deob;

@ObfuscatedName("cu")
public class class93 extends class351 {

    @ObfuscatedName("cu.f")
    public static class361 field1116 = new class361(32);

    @ObfuscatedName("cu.o")
    public int[] field1117 = new int[] { -1 };

    @ObfuscatedName("cu.u")
    public int[] field1115 = new int[] { 0 };

    @ObfuscatedName("jh.o(IIB)I")
    public static int method4139(int arg0, int arg1) {
        class93 var2 = (class93) field1116.method5638((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1115.length) {
            return var2.field1115[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("im.u(IIB)I")
    public static int method3856(int arg0, int arg1) {
        class93 var2 = (class93) field1116.method5638((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1115.length; var4++) {
                if (var2.field1117[var4] == arg1) {
                    var3 += var2.field1115[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("cz.p(IIIII)V")
    public static void method1720(int arg0, int arg1, int arg2, int arg3) {
        class93 var4 = (class93) field1116.method5638((long) arg0);
        if (var4 == null) {
            var4 = new class93();
            field1116.method5640(var4, (long) arg0);
        }
        if (var4.field1117.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1117.length; var7++) {
                var5[var7] = var4.field1117[var7];
                var6[var7] = var4.field1115[var7];
            }
            for (int var8 = var4.field1117.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1117 = var5;
            var4.field1115 = var6;
        }
        var4.field1117[arg1] = arg2;
        var4.field1115[arg1] = arg3;
    }

    @ObfuscatedName("dr.b(IB)V")
    public static void method2138(int arg0) {
        class93 var1 = (class93) field1116.method5638((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1117.length; var2++) {
                var1.field1117[var2] = -1;
                var1.field1115[var2] = 0;
            }
        }
    }

    @ObfuscatedName("aj.e(II)V")
    public static void method217(int arg0) {
        class93 var1 = (class93) field1116.method5638((long) arg0);
        if (var1 != null) {
            var1.method5354();
        }
    }
}
