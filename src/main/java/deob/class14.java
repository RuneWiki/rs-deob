package deob;

@ObfuscatedName("a")
public class class14 extends class187 {

    @ObfuscatedName("a.g")
    public static class175 field192 = new class175(32);

    @ObfuscatedName("a.s")
    public int[] field186 = new int[] { -1 };

    @ObfuscatedName("a.h")
    public int[] field187 = new int[] { 0 };

    @ObfuscatedName("w.g(III)I")
    public static int method131(int arg0, int arg1) {
        class14 var2 = (class14) field192.method3171((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field187.length; var4++) {
                if (var2.field186[var4] == arg1) {
                    var3 += var2.field187[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ay.s(IIIIB)V")
    public static void method800(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field192.method3171((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field192.method3161(var4, (long) arg0);
        }
        if (var4.field186.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field186.length; var7++) {
                var5[var7] = var4.field186[var7];
                var6[var7] = var4.field187[var7];
            }
            for (int var8 = var4.field186.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field186 = var5;
            var4.field187 = var6;
        }
        var4.field186[arg1] = arg2;
        var4.field187[arg1] = arg3;
    }

    @ObfuscatedName("x.h(IB)V")
    public static void method135(int arg0) {
        class14 var1 = (class14) field192.method3171((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field186.length; var2++) {
                var1.field186[var2] = -1;
                var1.field187[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ap.m(I)V")
    public static void method636() {
        field192 = new class175(32);
    }
}
