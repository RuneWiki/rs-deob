package deob;

@ObfuscatedName("u")
public class class14 extends class184 {

    @ObfuscatedName("u.z")
    public static class174 field191 = new class174(32);

    @ObfuscatedName("u.j")
    public int[] field192 = new int[] { -1 };

    @ObfuscatedName("u.a")
    public int[] field193 = new int[] { 0 };

    @ObfuscatedName("aa.z(IIB)I")
    public static int method881(int arg0, int arg1) {
        class14 var2 = (class14) field191.method3204((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field192.length) {
            return var2.field192[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("gd.j(IIB)I")
    public static int method3324(int arg0, int arg1) {
        class14 var2 = (class14) field191.method3204((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field193.length; var4++) {
                if (var2.field192[var4] == arg1) {
                    var3 += var2.field193[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("cs.a(IIIII)V")
    public static void method1879(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = (class14) field191.method3204((long) arg0);
        if (var4 == null) {
            var4 = new class14();
            field191.method3205(var4, (long) arg0);
        }
        if (var4.field192.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field192.length; var7++) {
                var5[var7] = var4.field192[var7];
                var6[var7] = var4.field193[var7];
            }
            for (int var8 = var4.field192.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field192 = var5;
            var4.field193 = var6;
        }
        var4.field192[arg1] = arg2;
        var4.field193[arg1] = arg3;
    }

    @ObfuscatedName("dt.y(II)V")
    public static void method2507(int arg0) {
        class14 var1 = (class14) field191.method3204((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field192.length; var2++) {
                var1.field192[var2] = -1;
                var1.field193[var2] = 0;
            }
        }
    }

    @ObfuscatedName("f.i(IB)V")
    public static void method127(int arg0) {
        class14 var1 = (class14) field191.method3204((long) arg0);
        if (var1 != null) {
            var1.method3311();
        }
    }
}
