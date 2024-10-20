package deob;

@ObfuscatedName("q")
public class class14 extends class187 {

    @ObfuscatedName("q.g")
    public static class175 field208 = new class175(32);

    @ObfuscatedName("q.s")
    public int[] field203 = new int[] { -1 };

    @ObfuscatedName("q.v")
    public int[] field207 = new int[] { 0 };

    @ObfuscatedName("cw.g(IIB)I")
    public static int method1835(int arg0, int arg1) {
        class14 var2 = (class14) field208.method3155((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field207.length) {
            return var2.field207[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cw.s(IIIIB)V")
    public static void method1838(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field208.method3155((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field208.method3152(var4, (long) arg0);
        }
        if (var4.field203.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field203.length; var7++) {
                var5[var7] = var4.field203[var7];
                var6[var7] = var4.field207[var7];
            }
            for (int var8 = var4.field203.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field203 = var5;
            var4.field207 = var6;
        }
        var4.field203[arg1] = arg2;
        var4.field207[arg1] = arg3;
    }

    @ObfuscatedName("ax.v(II)V")
    public static void method573(int arg0) {
        class14 var1 = (class14) field208.method3155((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field203.length; var2++) {
                var1.field203[var2] = -1;
                var1.field207[var2] = 0;
            }
        }
    }
}
