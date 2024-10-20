package deob;

@ObfuscatedName("br")
public class class65 extends class204 {

    @ObfuscatedName("br.p")
    public static class202 field724 = new class202(32);

    @ObfuscatedName("br.i")
    public int[] field728 = new int[] { -1 };

    @ObfuscatedName("br.w")
    public int[] field725 = new int[] { 0 };

    @ObfuscatedName("h.p(IIB)I")
    public static int method57(int arg0, int arg1) {
        class65 var2 = (class65) field724.method3517((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field728.length) {
            return var2.field728[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bb.i(III)I")
    public static int method900(int arg0, int arg1) {
        class65 var2 = (class65) field724.method3517((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field725.length; var4++) {
                if (var2.field728[var4] == arg1) {
                    var3 += var2.field725[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ar.w(IIIII)V")
    public static void method247(int arg0, int arg1, int arg2, int arg3) {
        class65 var4 = (class65) field724.method3517((long) arg0);
        if (var4 == null) {
            var4 = new class65();
            field724.method3518(var4, (long) arg0);
        }
        if (var4.field728.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field728.length; var7++) {
                var5[var7] = var4.field728[var7];
                var6[var7] = var4.field725[var7];
            }
            for (int var8 = var4.field728.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field728 = var5;
            var4.field725 = var6;
        }
        var4.field728[arg1] = arg2;
        var4.field725[arg1] = arg3;
    }

    @ObfuscatedName("x.s(II)V")
    public static void method64(int arg0) {
        class65 var1 = (class65) field724.method3517((long) arg0);
        if (var1 != null) {
            var1.method3561();
        }
    }

    @ObfuscatedName("i.j(I)V")
    public static void method1() {
        field724 = new class202(32);
    }
}
