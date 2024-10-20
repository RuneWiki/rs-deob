package deob;

@ObfuscatedName("r")
public class class15 extends class202 {

    @ObfuscatedName("r.j")
    public static class190 field228 = new class190(32);

    @ObfuscatedName("r.y")
    public int[] field222 = new int[] { -1 };

    @ObfuscatedName("r.z")
    public int[] field223 = new int[] { 0 };

    @ObfuscatedName("dl.j(IIB)I")
    public static int method2611(int arg0, int arg1) {
        class15 var2 = (class15) field228.method3459((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field223.length) {
            return var2.field223[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("r.y(III)I")
    public static int method164(int arg0, int arg1) {
        class15 var2 = (class15) field228.method3459((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field223.length; var4++) {
                if (var2.field222[var4] == arg1) {
                    var3 += var2.field223[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("o.z(IIIIB)V")
    public static void method126(int arg0, int arg1, int arg2, int arg3) {
        class15 var4 = (class15) field228.method3459((long) arg0);
        if (var4 == null) {
            var4 = new class15();
            field228.method3463(var4, (long) arg0);
        }
        if (var4.field222.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field222.length; var7++) {
                var5[var7] = var4.field222[var7];
                var6[var7] = var4.field223[var7];
            }
            for (int var8 = var4.field222.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field222 = var5;
            var4.field223 = var6;
        }
        var4.field222[arg1] = arg2;
        var4.field223[arg1] = arg3;
    }

    @ObfuscatedName("f.l(II)V")
    public static void method91(int arg0) {
        class15 var1 = (class15) field228.method3459((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field222.length; var2++) {
                var1.field222[var2] = -1;
                var1.field223[var2] = 0;
            }
        }
    }

    @ObfuscatedName("w.w(I)V")
    public static void method40() {
        field228 = new class190(32);
    }
}
