package deob;

@ObfuscatedName("q")
public class class16 extends class209 {

    @ObfuscatedName("q.j")
    public static class197 field211 = new class197(32);

    @ObfuscatedName("q.h")
    public int[] field212 = new int[] { -1 };

    @ObfuscatedName("q.m")
    public int[] field213 = new int[] { 0 };

    @ObfuscatedName("dn.h(IIB)I")
    public static int method2154(int arg0, int arg1) {
        class16 var2 = (class16) field211.method3498((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field213.length) {
            return var2.field213[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("t.m(III)I")
    public static int method187(int arg0, int arg1) {
        class16 var2 = (class16) field211.method3498((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field213.length; var4++) {
                if (var2.field212[var4] == arg1) {
                    var3 += var2.field213[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("be.z(IIIIB)V")
    public static void method1184(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field211.method3498((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field211.method3499(var4, (long) arg0);
        }
        if (var4.field212.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field212.length; var7++) {
                var5[var7] = var4.field212[var7];
                var6[var7] = var4.field213[var7];
            }
            for (int var8 = var4.field212.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field212 = var5;
            var4.field213 = var6;
        }
        var4.field212[arg1] = arg2;
        var4.field213[arg1] = arg3;
    }

    @ObfuscatedName("y.x(II)V")
    public static void method195(int arg0) {
        class16 var1 = (class16) field211.method3498((long) arg0);
        if (var1 != null) {
            var1.method3639();
        }
    }
}
