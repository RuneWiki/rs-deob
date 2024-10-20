package deob;

@ObfuscatedName("f")
public class class19 extends class179 {

    @ObfuscatedName("f.c")
    public static class175 field290 = new class175(32);

    @ObfuscatedName("f.q")
    public int[] field287 = new int[] { -1 };

    @ObfuscatedName("f.y")
    public int[] field292 = new int[] { 0 };

    @ObfuscatedName("j.c(III)I")
    public static int method133(int arg0, int arg1) {
        class19 var2 = (class19) field290.method3138((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field287.length) {
            return var2.field287[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("client.q(III)I")
    public static int method288(int arg0, int arg1) {
        class19 var2 = (class19) field290.method3138((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field292.length) {
            return var2.field292[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("t.y(IIIIB)V")
    public static void method104(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field290.method3138((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field290.method3136(var4, (long) arg0);
        }
        if (var4.field287.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field287.length; var7++) {
                var5[var7] = var4.field287[var7];
                var6[var7] = var4.field292[var7];
            }
            for (int var8 = var4.field287.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field287 = var5;
            var4.field292 = var6;
        }
        var4.field287[arg1] = arg2;
        var4.field292[arg1] = arg3;
    }
}
