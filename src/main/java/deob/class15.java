package deob;

@ObfuscatedName("x")
public class class15 extends class199 {

    @ObfuscatedName("x.n")
    public static class187 field192 = new class187(32);

    @ObfuscatedName("x.d")
    public int[] field189 = new int[] { -1 };

    @ObfuscatedName("x.z")
    public int[] field190 = new int[] { 0 };

    @ObfuscatedName("cc.d(III)I")
    public static int method1956(int arg0, int arg1) {
        class15 var2 = (class15) field192.method3445((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field190.length) {
            return var2.field190[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("o.z(IIIII)V")
    public static void method539(int arg0, int arg1, int arg2, int arg3) {
        class15 var4 = (class15) field192.method3445((long) arg0);
        if (var4 == null) {
            var4 = new class15();
            field192.method3446(var4, (long) arg0);
        }
        if (var4.field189.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field189.length; var7++) {
                var5[var7] = var4.field189[var7];
                var6[var7] = var4.field190[var7];
            }
            for (int var8 = var4.field189.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field189 = var5;
            var4.field190 = var6;
        }
        var4.field189[arg1] = arg2;
        var4.field190[arg1] = arg3;
    }

    @ObfuscatedName("cp.y(II)V")
    public static void method2065(int arg0) {
        class15 var1 = (class15) field192.method3445((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field189.length; var2++) {
                var1.field189[var2] = -1;
                var1.field190[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ds.e(B)V")
    public static void method2563() {
        field192 = new class187(32);
    }
}
