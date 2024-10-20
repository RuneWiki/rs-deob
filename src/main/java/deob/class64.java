package deob;

@ObfuscatedName("bt")
public class class64 extends class193 {

    @ObfuscatedName("bt.i")
    public static class191 field797 = new class191(32);

    @ObfuscatedName("bt.c")
    public int[] field788 = new int[] { -1 };

    @ObfuscatedName("bt.e")
    public int[] field789 = new int[] { 0 };

    @ObfuscatedName("aa.i(III)I")
    public static int method448(int arg0, int arg1) {
        class64 var2 = (class64) field797.method3238((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field788.length) {
            return var2.field788[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bp.c(IIB)I")
    public static int method1384(int arg0, int arg1) {
        class64 var2 = (class64) field797.method3238((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field789.length) {
            return var2.field789[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ch.e(III)I")
    public static int method1718(int arg0, int arg1) {
        class64 var2 = (class64) field797.method3238((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field789.length; var4++) {
                if (var2.field788[var4] == arg1) {
                    var3 += var2.field789[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("am.v(IIIIB)V")
    public static void method647(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) field797.method3238((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            field797.method3234(var4, (long) arg0);
        }
        if (var4.field788.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field788.length; var7++) {
                var5[var7] = var4.field788[var7];
                var6[var7] = var4.field789[var7];
            }
            for (int var8 = var4.field788.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field788 = var5;
            var4.field789 = var6;
        }
        var4.field788[arg1] = arg2;
        var4.field789[arg1] = arg3;
    }

    @ObfuscatedName("al.b(B)V")
    public static void method437() {
        field797 = new class191(32);
    }
}
