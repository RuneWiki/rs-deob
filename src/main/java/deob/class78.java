package deob;

@ObfuscatedName("bf")
public class class78 extends class411 {

    @ObfuscatedName("bf.s")
    public static class421 field1001 = new class421(32);

    @ObfuscatedName("bf.h")
    public int[] field999 = new int[] { -1 };

    @ObfuscatedName("bf.w")
    public int[] field1000 = new int[] { 0 };

    @ObfuscatedName("pk.s(III)I")
    public static int method6794(int arg0, int arg1) {
        class78 var2 = (class78) field1001.method6695((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field999.length) {
            return var2.field999[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("fc.h(III)I")
    public static int method2915(int arg0, int arg1) {
        class78 var2 = (class78) field1001.method6695((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1000.length) {
            return var2.field1000[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("x.w(III)I")
    public static int method291(int arg0, int arg1) {
        class78 var2 = (class78) field1001.method6695((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1000.length; var4++) {
                if (var2.field999[var4] == arg1) {
                    var3 += var2.field1000[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ef.v(IIIIB)V")
    public static void method2667(int arg0, int arg1, int arg2, int arg3) {
        class78 var4 = (class78) field1001.method6695((long) arg0);
        if (var4 == null) {
            var4 = new class78();
            field1001.method6683(var4, (long) arg0);
        }
        if (var4.field999.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field999.length; var7++) {
                var5[var7] = var4.field999[var7];
                var6[var7] = var4.field1000[var7];
            }
            for (int var8 = var4.field999.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field999 = var5;
            var4.field1000 = var6;
        }
        var4.field999[arg1] = arg2;
        var4.field1000[arg1] = arg3;
    }

    @ObfuscatedName("bb.c(II)V")
    public static void method980(int arg0) {
        class78 var1 = (class78) field1001.method6695((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field999.length; var2++) {
                var1.field999[var2] = -1;
                var1.field1000[var2] = 0;
            }
        }
    }
}
