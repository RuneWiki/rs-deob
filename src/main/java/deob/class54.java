package deob;

@ObfuscatedName("f")
public class class54 extends class13 {

    @ObfuscatedName("f.b")
    public int[] field584 = new int[] { 0 };

    @ObfuscatedName("f.c")
    public int[] field576 = new int[] { -1 };

    @ObfuscatedName("f.v")
    public static class3 field583 = new class3(32);

    @ObfuscatedName("fv.c(III)I")
    public static int method6(int arg0, int arg1) {
        class54 var2 = (class54) field583.method8((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field584.length) {
            return var2.field584[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dj.v(III)I")
    public static int method843(int arg0, int arg1) {
        class54 var2 = (class54) field583.method8((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field576.length) {
            return var2.field576[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("m.z(B)V")
    public static void method1092() {
        field583 = new class3(32);
    }

    @ObfuscatedName("q.m(II)V")
    public static void method1386(int arg0) {
        class54 var1 = (class54) field583.method8((long) arg0);
        if (var1 != null) {
            var1.method76();
        }
    }

    @ObfuscatedName("av.i(II)V")
    public static void method3047(int arg0) {
        class54 var1 = (class54) field583.method8((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field576.length; var2++) {
                var1.field576[var2] = -1;
                var1.field584[var2] = 0;
            }
        }
    }

    @ObfuscatedName("aj.b(IIIIS)V")
    public static void method3168(int arg0, int arg1, int arg2, int arg3) {
        class54 var4 = (class54) field583.method8((long) arg0);
        if (var4 == null) {
            var4 = new class54();
            field583.method9(var4, (long) arg0);
        }
        if (var4.field576.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field576.length; var7++) {
                var5[var7] = var4.field576[var7];
                var6[var7] = var4.field584[var7];
            }
            for (int var8 = var4.field576.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field576 = var5;
            var4.field584 = var6;
        }
        var4.field576[arg1] = arg2;
        var4.field584[arg1] = arg3;
    }
}
