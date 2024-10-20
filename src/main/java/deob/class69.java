package deob;

@ObfuscatedName("bf")
public class class69 extends class190 {

    @ObfuscatedName("bf.n")
    public static class329 field557 = new class329(32);

    @ObfuscatedName("bf.v")
    public int[] field559 = new int[] { -1 };

    @ObfuscatedName("bf.d")
    public int[] field558 = new int[] { 0 };

    @ObfuscatedName("bu.n(IIB)I")
    public static int method1237(int arg0, int arg1) {
        class69 var2 = (class69) field557.method5682((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field559.length) {
            return var2.field559[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("az.v(III)I")
    public static int method584(int arg0, int arg1) {
        class69 var2 = (class69) field557.method5682((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field558.length) {
            return var2.field558[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("hk.d(III)I")
    public static int method3952(int arg0, int arg1) {
        class69 var2 = (class69) field557.method5682((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field558.length; var4++) {
                if (var2.field559[var4] == arg1) {
                    var3 += var2.field558[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("aa.c(IIIII)V")
    public static void method437(int arg0, int arg1, int arg2, int arg3) {
        class69 var4 = (class69) field557.method5682((long) arg0);
        if (var4 == null) {
            var4 = new class69();
            field557.method5683(var4, (long) arg0);
        }
        if (var4.field559.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field559.length; var7++) {
                var5[var7] = var4.field559[var7];
                var6[var7] = var4.field558[var7];
            }
            for (int var8 = var4.field559.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field559 = var5;
            var4.field558 = var6;
        }
        var4.field559[arg1] = arg2;
        var4.field558[arg1] = arg3;
    }

    @ObfuscatedName("az.y(II)V")
    public static void method586(int arg0) {
        class69 var1 = (class69) field557.method5682((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field559.length; var2++) {
                var1.field559[var2] = -1;
                var1.field558[var2] = 0;
            }
        }
    }

    @ObfuscatedName("aa.h(II)V")
    public static void method438(int arg0) {
        class69 var1 = (class69) field557.method5682((long) arg0);
        if (var1 != null) {
            var1.method3486();
        }
    }
}
