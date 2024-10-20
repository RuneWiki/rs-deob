package deob;

@ObfuscatedName("d")
public class class16 extends class209 {

    @ObfuscatedName("d.w")
    public static class197 field235 = new class197(32);

    @ObfuscatedName("d.x")
    public int[] field229 = new int[] { -1 };

    @ObfuscatedName("d.t")
    public int[] field230 = new int[] { 0 };

    @ObfuscatedName("fn.w(III)I")
    public static int method3179(int arg0, int arg1) {
        class16 var2 = (class16) field235.method3555((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field230.length) {
            return var2.field230[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("d.x(IIB)I")
    public static int method175(int arg0, int arg1) {
        class16 var2 = (class16) field235.method3555((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field230.length; var4++) {
                if (var2.field229[var4] == arg1) {
                    var3 += var2.field230[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("cd.t(IIIIB)V")
    public static void method1955(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field235.method3555((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field235.method3556(var4, (long) arg0);
        }
        if (var4.field229.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field229.length; var7++) {
                var5[var7] = var4.field229[var7];
                var6[var7] = var4.field230[var7];
            }
            for (int var8 = var4.field229.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field229 = var5;
            var4.field230 = var6;
        }
        var4.field229[arg1] = arg2;
        var4.field230[arg1] = arg3;
    }
}
