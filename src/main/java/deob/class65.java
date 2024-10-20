package deob;

@ObfuscatedName("ba")
public class class65 extends class204 {

    @ObfuscatedName("ba.s")
    public static class202 field746 = new class202(32);

    @ObfuscatedName("ba.g")
    public int[] field748 = new int[] { -1 };

    @ObfuscatedName("ba.m")
    public int[] field745 = new int[] { 0 };

    @ObfuscatedName("ho.s(III)I")
    public static int method4098(int arg0, int arg1) {
        class65 var2 = (class65) field746.method3704((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field748.length) {
            return var2.field748[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("m.g(III)I")
    public static int method5(int arg0, int arg1) {
        class65 var2 = (class65) field746.method3704((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field745.length) {
            return var2.field745[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bf.m(III)I")
    public static int method693(int arg0, int arg1) {
        class65 var2 = (class65) field746.method3704((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field745.length; var4++) {
                if (var2.field748[var4] == arg1) {
                    var3 += var2.field745[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("jb.h(IIIIB)V")
    public static void method4911(int arg0, int arg1, int arg2, int arg3) {
        class65 var4 = (class65) field746.method3704((long) arg0);
        if (var4 == null) {
            var4 = new class65();
            field746.method3691(var4, (long) arg0);
        }
        if (var4.field748.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field748.length; var7++) {
                var5[var7] = var4.field748[var7];
                var6[var7] = var4.field745[var7];
            }
            for (int var8 = var4.field748.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field748 = var5;
            var4.field745 = var6;
        }
        var4.field748[arg1] = arg2;
        var4.field745[arg1] = arg3;
    }

    @ObfuscatedName("eo.w(I)V")
    public static void method2710() {
        field746 = new class202(32);
    }
}
