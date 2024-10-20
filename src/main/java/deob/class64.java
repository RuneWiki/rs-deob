package deob;

@ObfuscatedName("bh")
public class class64 extends class194 {

    @ObfuscatedName("bh.i")
    public static class192 field790 = new class192(32);

    @ObfuscatedName("bh.j")
    public int[] field789 = new int[] { -1 };

    @ObfuscatedName("bh.a")
    public int[] field795 = new int[] { 0 };

    @ObfuscatedName("cu.j(III)I")
    public static int method1571(int arg0, int arg1) {
        class64 var2 = (class64) field790.method3358((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field795.length; var4++) {
                if (var2.field789[var4] == arg1) {
                    var3 += var2.field795[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("iw.a(IIIII)V")
    public static void method4138(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) field790.method3358((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            field790.method3359(var4, (long) arg0);
        }
        if (var4.field789.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field789.length; var7++) {
                var5[var7] = var4.field789[var7];
                var6[var7] = var4.field795[var7];
            }
            for (int var8 = var4.field789.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field789 = var5;
            var4.field795 = var6;
        }
        var4.field789[arg1] = arg2;
        var4.field795[arg1] = arg3;
    }

    @ObfuscatedName("ea.r(II)V")
    public static void method2408(int arg0) {
        class64 var1 = (class64) field790.method3358((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field789.length; var2++) {
                var1.field789[var2] = -1;
                var1.field795[var2] = 0;
            }
        }
    }

    @ObfuscatedName("j.o(II)V")
    public static void method2(int arg0) {
        class64 var1 = (class64) field790.method3358((long) arg0);
        if (var1 != null) {
            var1.method3397();
        }
    }
}
