package deob;

@ObfuscatedName("a")
public class class19 extends class179 {

    @ObfuscatedName("a.g")
    public static class175 field289 = new class175(32);

    @ObfuscatedName("a.h")
    public int[] field288 = new int[] { -1 };

    @ObfuscatedName("a.s")
    public int[] field290 = new int[] { 0 };

    @ObfuscatedName("fe.g(III)I")
    public static int method3195(int arg0, int arg1) {
        class19 var2 = (class19) field289.method3354((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field290.length) {
            return var2.field290[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("br.h(III)I")
    public static int method1360(int arg0, int arg1) {
        class19 var2 = (class19) field289.method3354((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field290.length; var4++) {
                if (var2.field288[var4] == arg1) {
                    var3 += var2.field290[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("dj.s(IIIIB)V")
    public static void method2268(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field289.method3354((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field289.method3364(var4, (long) arg0);
        }
        if (var4.field288.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field288.length; var7++) {
                var5[var7] = var4.field288[var7];
                var6[var7] = var4.field290[var7];
            }
            for (int var8 = var4.field288.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field288 = var5;
            var4.field290 = var6;
        }
        var4.field288[arg1] = arg2;
        var4.field290[arg1] = arg3;
    }

    @ObfuscatedName("ap.o(II)V")
    public static void method807(int arg0) {
        class19 var1 = (class19) field289.method3354((long) arg0);
        if (var1 != null) {
            var1.method3404();
        }
    }
}
