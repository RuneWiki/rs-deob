package deob;

@ObfuscatedName("p")
public class class14 extends class186 {

    @ObfuscatedName("p.g")
    public static class174 field195 = new class174(32);

    @ObfuscatedName("p.v")
    public int[] field193 = new int[] { -1 };

    @ObfuscatedName("p.z")
    public int[] field197 = new int[] { 0 };

    @ObfuscatedName("y.g(III)I")
    public static int method128(int arg0, int arg1) {
        class14 var2 = (class14) field195.method3201((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field197.length; var4++) {
                if (var2.field193[var4] == arg1) {
                    var3 += var2.field197[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("v.v(IIIII)V")
    public static void method9(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field195.method3201((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field195.method3202(var4, (long) arg0);
        }
        if (var4.field193.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field193.length; var7++) {
                var5[var7] = var4.field193[var7];
                var6[var7] = var4.field197[var7];
            }
            for (int var8 = var4.field193.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field193 = var5;
            var4.field197 = var6;
        }
        var4.field193[arg1] = arg2;
        var4.field197[arg1] = arg3;
    }

    @ObfuscatedName("bz.z(II)V")
    public static void method1356(int arg0) {
        class14 var1 = (class14) field195.method3201((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field193.length; var2++) {
                var1.field193[var2] = -1;
                var1.field197[var2] = 0;
            }
        }
    }

    @ObfuscatedName("e.h(II)V")
    public static void method83(int arg0) {
        class14 var1 = (class14) field195.method3201((long) arg0);
        if (var1 != null) {
            var1.method3322();
        }
    }
}
