package deob;

@ObfuscatedName("b")
public class class19 extends class179 {

    @ObfuscatedName("b.p")
    public static class175 field272 = new class175(32);

    @ObfuscatedName("b.l")
    public int[] field267 = new int[] { -1 };

    @ObfuscatedName("b.d")
    public int[] field266 = new int[] { 0 };

    @ObfuscatedName("dh.l(III)I")
    public static int method2266(int arg0, int arg1) {
        class19 var2 = (class19) field272.method3405((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field266.length; var4++) {
                if (var2.field267[var4] == arg1) {
                    var3 += var2.field266[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("cf.d(IIIII)V")
    public static void method2074(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field272.method3405((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field272.method3406(var4, (long) arg0);
        }
        if (var4.field267.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field267.length; var7++) {
                var5[var7] = var4.field267[var7];
                var6[var7] = var4.field266[var7];
            }
            for (int var8 = var4.field267.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field267 = var5;
            var4.field266 = var6;
        }
        var4.field267[arg1] = arg2;
        var4.field266[arg1] = arg3;
    }

    @ObfuscatedName("bw.x(IB)V")
    public static void method1369(int arg0) {
        class19 var1 = (class19) field272.method3405((long) arg0);
        if (var1 != null) {
            var1.method3455();
        }
    }
}
