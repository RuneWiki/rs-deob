package deob;

@ObfuscatedName("s")
public class class14 extends class186 {

    @ObfuscatedName("s.k")
    public static class174 field200 = new class174(32);

    @ObfuscatedName("s.r")
    public int[] field201 = new int[] { -1 };

    @ObfuscatedName("s.y")
    public int[] field202 = new int[] { 0 };

    @ObfuscatedName("ad.k(III)I")
    public static int method831(int arg0, int arg1) {
        class14 var2 = (class14) field200.method3163((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field201.length) {
            return var2.field201[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ab.r(IIB)I")
    public static int method899(int arg0, int arg1) {
        class14 var2 = (class14) field200.method3163((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field202.length) {
            return var2.field202[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("z.y(IIB)I")
    public static int method518(int arg0, int arg1) {
        class14 var2 = (class14) field200.method3163((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field202.length; var4++) {
                if (var2.field201[var4] == arg1) {
                    var3 += var2.field202[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("w.w(IIIIB)V")
    public static void method26(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field200.method3163((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field200.method3164(var4, (long) arg0);
        }
        if (var4.field201.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field201.length; var7++) {
                var5[var7] = var4.field201[var7];
                var6[var7] = var4.field202[var7];
            }
            for (int var8 = var4.field201.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field201 = var5;
            var4.field202 = var6;
        }
        var4.field201[arg1] = arg2;
        var4.field202[arg1] = arg3;
    }

    @ObfuscatedName("aw.m(IB)V")
    public static void method569(int arg0) {
        class14 var1 = (class14) field200.method3163((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field201.length; var2++) {
                var1.field201[var2] = -1;
                var1.field202[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ez.j(I)V")
    public static void method2639() {
        field200 = new class174(32);
    }
}
