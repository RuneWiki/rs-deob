package deob;

@ObfuscatedName("bc")
public class class66 extends class217 {

    @ObfuscatedName("bc.g")
    public static class215 field753 = new class215(32);

    @ObfuscatedName("bc.e")
    public int[] field756 = new int[] { -1 };

    @ObfuscatedName("bc.b")
    public int[] field754 = new int[] { 0 };

    @ObfuscatedName("i.g(IIB)I")
    public static int method46(int arg0, int arg1) {
        class66 var2 = (class66) field753.method3740((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field754.length) {
            return var2.field754[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("as.e(IIIII)V")
    public static void method329(int arg0, int arg1, int arg2, int arg3) {
        class66 var4 = (class66) field753.method3740((long) arg0);
        if (var4 == null) {
            var4 = new class66();
            field753.method3741(var4, (long) arg0);
        }
        if (var4.field756.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field756.length; var7++) {
                var5[var7] = var4.field756[var7];
                var6[var7] = var4.field754[var7];
            }
            for (int var8 = var4.field756.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field756 = var5;
            var4.field754 = var6;
        }
        var4.field756[arg1] = arg2;
        var4.field754[arg1] = arg3;
    }

    @ObfuscatedName("ey.b(II)V")
    public static void method2930(int arg0) {
        class66 var1 = (class66) field753.method3740((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field756.length; var2++) {
                var1.field756[var2] = -1;
                var1.field754[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ie.z(II)V")
    public static void method4094(int arg0) {
        class66 var1 = (class66) field753.method3740((long) arg0);
        if (var1 != null) {
            var1.method3796();
        }
    }
}
