package deob;

@ObfuscatedName("c")
public class class16 extends class212 {

    @ObfuscatedName("c.i")
    public static class200 field240 = new class200(32);

    @ObfuscatedName("c.h")
    public int[] field232 = new int[] { -1 };

    @ObfuscatedName("c.e")
    public int[] field233 = new int[] { 0 };

    @ObfuscatedName("ak.i(III)I")
    public static int method647(int arg0, int arg1) {
        class16 var2 = (class16) field240.method3564((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field233.length; var4++) {
                if (var2.field232[var4] == arg1) {
                    var3 += var2.field233[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("k.h(IIIII)V")
    public static void method191(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field240.method3564((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field240.method3565(var4, (long) arg0);
        }
        if (var4.field232.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field232.length; var7++) {
                var5[var7] = var4.field232[var7];
                var6[var7] = var4.field233[var7];
            }
            for (int var8 = var4.field232.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field232 = var5;
            var4.field233 = var6;
        }
        var4.field232[arg1] = arg2;
        var4.field233[arg1] = arg3;
    }

    @ObfuscatedName("u.e(I)V")
    public static void method88() {
        field240 = new class200(32);
    }
}
