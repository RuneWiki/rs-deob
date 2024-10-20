package deob;

@ObfuscatedName("m")
public class class19 extends class179 {

    @ObfuscatedName("m.f")
    public static class175 field270 = new class175(32);

    @ObfuscatedName("m.t")
    public int[] field269 = new int[] { -1 };

    @ObfuscatedName("m.n")
    public int[] field273 = new int[] { 0 };

    @ObfuscatedName("cn.f(III)I")
    public static int method1695(int arg0, int arg1) {
        class19 var2 = (class19) field270.method3312((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field273.length; var4++) {
                if (var2.field269[var4] == arg1) {
                    var3 += var2.field273[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ab.t(IIIII)V")
    public static void method817(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field270.method3312((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field270.method3329(var4, (long) arg0);
        }
        if (var4.field269.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field269.length; var7++) {
                var5[var7] = var4.field269[var7];
                var6[var7] = var4.field273[var7];
            }
            for (int var8 = var4.field269.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field269 = var5;
            var4.field273 = var6;
        }
        var4.field269[arg1] = arg2;
        var4.field273[arg1] = arg3;
    }

    @ObfuscatedName("w.n(II)V")
    public static void method220(int arg0) {
        class19 var1 = (class19) field270.method3312((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field269.length; var2++) {
                var1.field269[var2] = -1;
                var1.field273[var2] = 0;
            }
        }
    }

    @ObfuscatedName("q.e(I)V")
    public static void method155() {
        field270 = new class175(32);
    }
}
