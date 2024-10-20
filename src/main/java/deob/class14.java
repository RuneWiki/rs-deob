package deob;

@ObfuscatedName("x")
public class class14 extends class191 {

    @ObfuscatedName("x.b")
    public static class179 field195 = new class179(32);

    @ObfuscatedName("x.e")
    public int[] field191 = new int[] { -1 };

    @ObfuscatedName("x.i")
    public int[] field192 = new int[] { 0 };

    @ObfuscatedName("al.b(III)I")
    public static int method605(int arg0, int arg1) {
        class14 var2 = (class14) field195.method3257((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field191.length) {
            return var2.field191[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cl.e(III)I")
    public static int method1860(int arg0, int arg1) {
        class14 var2 = (class14) field195.method3257((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field192.length; var4++) {
                if (var2.field191[var4] == arg1) {
                    var3 += var2.field192[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("v.i(IIIIB)V")
    public static void method152(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field195.method3257((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field195.method3258(var4, (long) arg0);
        }
        if (var4.field191.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field191.length; var7++) {
                var5[var7] = var4.field191[var7];
                var6[var7] = var4.field192[var7];
            }
            for (int var8 = var4.field191.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field191 = var5;
            var4.field192 = var6;
        }
        var4.field191[arg1] = arg2;
        var4.field192[arg1] = arg3;
    }

    @ObfuscatedName("du.k(IB)V")
    public static void method2456(int arg0) {
        class14 var1 = (class14) field195.method3257((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field191.length; var2++) {
                var1.field191[var2] = -1;
                var1.field192[var2] = 0;
            }
        }
    }

    @ObfuscatedName("et.h(II)V")
    public static void method2740(int arg0) {
        class14 var1 = (class14) field195.method3257((long) arg0);
        if (var1 != null) {
            var1.method3392();
        }
    }

    @ObfuscatedName("al.p(I)V")
    public static void method604() {
        field195 = new class179(32);
    }
}
