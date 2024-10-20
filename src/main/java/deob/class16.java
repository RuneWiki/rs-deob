package deob;

@ObfuscatedName("j")
public class class16 extends class209 {

    @ObfuscatedName("j.t")
    public static class197 field223 = new class197(32);

    @ObfuscatedName("j.i")
    public int[] field221 = new int[] { -1 };

    @ObfuscatedName("j.g")
    public int[] field222 = new int[] { 0 };

    @ObfuscatedName("ew.t(IIB)I")
    public static int method2908(int arg0, int arg1) {
        class16 var2 = (class16) field223.method3485((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field221.length) {
            return var2.field221[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cq.i(III)I")
    public static int method2004(int arg0, int arg1) {
        class16 var2 = (class16) field223.method3485((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field222.length) {
            return var2.field222[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("at.g(III)I")
    public static int method940(int arg0, int arg1) {
        class16 var2 = (class16) field223.method3485((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field222.length; var4++) {
                if (var2.field221[var4] == arg1) {
                    var3 += var2.field222[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ab.h(IIIIB)V")
    public static void method917(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field223.method3485((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field223.method3486(var4, (long) arg0);
        }
        if (var4.field221.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field221.length; var7++) {
                var5[var7] = var4.field221[var7];
                var6[var7] = var4.field222[var7];
            }
            for (int var8 = var4.field221.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field221 = var5;
            var4.field222 = var6;
        }
        var4.field221[arg1] = arg2;
        var4.field222[arg1] = arg3;
    }
}
