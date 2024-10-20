package deob;

@ObfuscatedName("bm")
public class class64 extends class193 {

    @ObfuscatedName("bm.i")
    public static class191 field806 = new class191(32);

    @ObfuscatedName("bm.w")
    public int[] field804 = new int[] { -1 };

    @ObfuscatedName("bm.a")
    public int[] field805 = new int[] { 0 };

    @ObfuscatedName("s.i(III)I")
    public static int method18(int arg0, int arg1) {
        class64 var2 = (class64) field806.method3249((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field805.length; var4++) {
                if (var2.field804[var4] == arg1) {
                    var3 += var2.field805[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("bk.w(IIIII)V")
    public static void method1399(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) field806.method3249((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            field806.method3248(var4, (long) arg0);
        }
        if (var4.field804.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field804.length; var7++) {
                var5[var7] = var4.field804[var7];
                var6[var7] = var4.field805[var7];
            }
            for (int var8 = var4.field804.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field804 = var5;
            var4.field805 = var6;
        }
        var4.field804[arg1] = arg2;
        var4.field805[arg1] = arg3;
    }

    @ObfuscatedName("if.a(II)V")
    public static void method3955(int arg0) {
        class64 var1 = (class64) field806.method3249((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field804.length; var2++) {
                var1.field804[var2] = -1;
                var1.field805[var2] = 0;
            }
        }
    }

    @ObfuscatedName("w.t(I)V")
    public static void method1() {
        field806 = new class191(32);
    }
}
