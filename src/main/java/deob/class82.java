package deob;

@ObfuscatedName("ci")
public class class82 extends class430 {

    @ObfuscatedName("ci.a")
    public static class441 field1022 = new class441(32);

    @ObfuscatedName("ci.f")
    public int[] field1019 = new int[] { -1 };

    @ObfuscatedName("ci.c")
    public int[] field1023 = new int[] { 0 };

    @ObfuscatedName("qq.a(III)I")
    public static int method7616(int arg0, int arg1) {
        class82 var2 = (class82) field1022.method7466((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1019.length) {
            return var2.field1019[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("eo.f(IIB)I")
    public static int method2854(int arg0, int arg1) {
        class82 var2 = (class82) field1022.method7466((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1023.length) {
            return var2.field1023[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("iw.c(IIB)I")
    public static int method4757(int arg0, int arg1) {
        class82 var2 = (class82) field1022.method7466((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1023.length; var4++) {
                if (var2.field1019[var4] == arg1) {
                    var3 += var2.field1023[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("hy.x(IIIIB)V")
    public static void method4110(int arg0, int arg1, int arg2, int arg3) {
        class82 var4 = (class82) field1022.method7466((long) arg0);
        if (var4 == null) {
            var4 = new class82();
            field1022.method7468(var4, (long) arg0);
        }
        if (var4.field1019.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1019.length; var7++) {
                var5[var7] = var4.field1019[var7];
                var6[var7] = var4.field1023[var7];
            }
            for (int var8 = var4.field1019.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1019 = var5;
            var4.field1023 = var6;
        }
        var4.field1019[arg1] = arg2;
        var4.field1023[arg1] = arg3;
    }

    @ObfuscatedName("ie.h(II)V")
    public static void method4703(int arg0) {
        class82 var1 = (class82) field1022.method7466((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1019.length; var2++) {
                var1.field1019[var2] = -1;
                var1.field1023[var2] = 0;
            }
        }
    }

    @ObfuscatedName("or.j(IB)V")
    public static void method6930(int arg0) {
        class82 var1 = (class82) field1022.method7466((long) arg0);
        if (var1 != null) {
            var1.method7170();
        }
    }

    @ObfuscatedName("eb.y(I)V")
    public static void method2839() {
        field1022 = new class441(32);
    }
}
