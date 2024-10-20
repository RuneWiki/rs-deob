package deob;

@ObfuscatedName("m")
public class class14 extends class186 {

    @ObfuscatedName("m.k")
    public static class174 field197 = new class174(32);

    @ObfuscatedName("m.b")
    public int[] field205 = new int[] { -1 };

    @ObfuscatedName("m.e")
    public int[] field207 = new int[] { 0 };

    @ObfuscatedName("bk.k(III)I")
    public static int method1312(int arg0, int arg1) {
        class14 var2 = (class14) field197.method3197((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field205.length) {
            return var2.field205[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("i.b(III)I")
    public static int method25(int arg0, int arg1) {
        class14 var2 = (class14) field197.method3197((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field207.length) {
            return var2.field207[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("p.e(IIIII)V")
    public static void method152(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field197.method3197((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field197.method3191(var4, (long) arg0);
        }
        if (var4.field205.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field205.length; var7++) {
                var5[var7] = var4.field205[var7];
                var6[var7] = var4.field207[var7];
            }
            for (int var8 = var4.field205.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field205 = var5;
            var4.field207 = var6;
        }
        var4.field205[arg1] = arg2;
        var4.field207[arg1] = arg3;
    }

    @ObfuscatedName("au.i(II)V")
    public static void method557(int arg0) {
        class14 var1 = (class14) field197.method3197((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field205.length; var2++) {
                var1.field205[var2] = -1;
                var1.field207[var2] = 0;
            }
        }
    }
}
