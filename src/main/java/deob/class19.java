package deob;

@ObfuscatedName("c")
public class class19 extends class181 {

    @ObfuscatedName("c.i")
    public static class177 field273 = new class177(32);

    @ObfuscatedName("c.b")
    public int[] field271 = new int[] { -1 };

    @ObfuscatedName("c.r")
    public int[] field272 = new int[] { 0 };

    @ObfuscatedName("bo.i(III)I")
    public static int method1278(int arg0, int arg1) {
        class19 var2 = (class19) field273.method3315((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field271.length) {
            return var2.field271[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bi.b(IIB)I")
    public static int method1181(int arg0, int arg1) {
        class19 var2 = (class19) field273.method3315((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field272.length; var4++) {
                if (var2.field271[var4] == arg1) {
                    var3 += var2.field272[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("g.r(IIIII)V")
    public static void method242(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field273.method3315((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field273.method3329(var4, (long) arg0);
        }
        if (var4.field271.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field271.length; var7++) {
                var5[var7] = var4.field271[var7];
                var6[var7] = var4.field272[var7];
            }
            for (int var8 = var4.field271.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field271 = var5;
            var4.field272 = var6;
        }
        var4.field271[arg1] = arg2;
        var4.field272[arg1] = arg3;
    }

    @ObfuscatedName("af.l(II)V")
    public static void method264(int arg0) {
        class19 var1 = (class19) field273.method3315((long) arg0);
        if (var1 != null) {
            var1.method3363();
        }
    }

    @ObfuscatedName("bk.s(I)V")
    public static void method1551() {
        field273 = new class177(32);
    }
}
