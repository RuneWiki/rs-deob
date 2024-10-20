package deob;

@ObfuscatedName("be")
public class class78 extends class387 {

    @ObfuscatedName("be.c")
    public static class397 field994 = new class397(32);

    @ObfuscatedName("be.b")
    public int[] field992 = new int[] { -1 };

    @ObfuscatedName("be.p")
    public int[] field993 = new int[] { 0 };

    @ObfuscatedName("d.c(III)I")
    public static int method181(int arg0, int arg1) {
        class78 var2 = (class78) field994.method6446((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field992.length) {
            return var2.field992[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("av.b(III)I")
    public static int method657(int arg0, int arg1) {
        class78 var2 = (class78) field994.method6446((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field993.length) {
            return var2.field993[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cd.p(IIB)I")
    public static int method2063(int arg0, int arg1) {
        class78 var2 = (class78) field994.method6446((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field993.length; var4++) {
                if (var2.field992[var4] == arg1) {
                    var3 += var2.field993[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("bs.m(IIIII)V")
    public static void method1867(int arg0, int arg1, int arg2, int arg3) {
        class78 var4 = (class78) field994.method6446((long) arg0);
        if (var4 == null) {
            var4 = new class78();
            field994.method6447(var4, (long) arg0);
        }
        if (var4.field992.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field992.length; var7++) {
                var5[var7] = var4.field992[var7];
                var6[var7] = var4.field993[var7];
            }
            for (int var8 = var4.field992.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field992 = var5;
            var4.field993 = var6;
        }
        var4.field992[arg1] = arg2;
        var4.field993[arg1] = arg3;
    }

    @ObfuscatedName("eo.t(II)V")
    public static void method2713(int arg0) {
        class78 var1 = (class78) field994.method6446((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field992.length; var2++) {
                var1.field992[var2] = -1;
                var1.field993[var2] = 0;
            }
        }
    }

    @ObfuscatedName("av.s(II)V")
    public static void method654(int arg0) {
        class78 var1 = (class78) field994.method6446((long) arg0);
        if (var1 != null) {
            var1.method6163();
        }
    }
}
