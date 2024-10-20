package deob;

@ObfuscatedName("o")
public class class14 extends class184 {

    @ObfuscatedName("o.j")
    public static class174 field203 = new class174(32);

    @ObfuscatedName("o.z")
    public int[] field193 = new int[] { -1 };

    @ObfuscatedName("o.y")
    public int[] field194 = new int[] { 0 };

    @ObfuscatedName("u.j(III)I")
    public static int method467(int arg0, int arg1) {
        class14 var2 = (class14) field203.method3214((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field193.length) {
            return var2.field193[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("am.z(III)I")
    public static int method803(int arg0, int arg1) {
        class14 var2 = (class14) field203.method3214((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field194.length) {
            return var2.field194[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("b.y(IIIIB)V")
    public static void method96(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field203.method3214((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field203.method3208(var4, (long) arg0);
        }
        if (var4.field193.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field193.length; var7++) {
                var5[var7] = var4.field193[var7];
                var6[var7] = var4.field194[var7];
            }
            for (int var8 = var4.field193.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field193 = var5;
            var4.field194 = var6;
        }
        var4.field193[arg1] = arg2;
        var4.field194[arg1] = arg3;
    }
}
