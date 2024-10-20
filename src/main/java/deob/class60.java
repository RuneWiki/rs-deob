package deob;

@ObfuscatedName("bl")
public class class60 extends class181 {

    @ObfuscatedName("bl.c")
    public static class319 field545 = new class319(32);

    @ObfuscatedName("bl.t")
    public int[] field544 = new int[] { -1 };

    @ObfuscatedName("bl.o")
    public int[] field546 = new int[] { 0 };

    @ObfuscatedName("hb.c(III)I")
    public static int method3667(int arg0, int arg1) {
        class60 var2 = (class60) field545.method5527((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field544.length) {
            return var2.field544[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("a.o(III)I")
    public static int method279(int arg0, int arg1) {
        class60 var2 = (class60) field545.method5527((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field546.length; var4++) {
                if (var2.field544[var4] == arg1) {
                    var3 += var2.field546[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("hp.e(IIIII)V")
    public static void method3718(int arg0, int arg1, int arg2, int arg3) {
        class60 var4 = (class60) field545.method5527((long) arg0);
        if (var4 == null) {
            var4 = new class60();
            field545.method5535(var4, (long) arg0);
        }
        if (var4.field544.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field544.length; var7++) {
                var5[var7] = var4.field544[var7];
                var6[var7] = var4.field546[var7];
            }
            for (int var8 = var4.field544.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field544 = var5;
            var4.field546 = var6;
        }
        var4.field544[arg1] = arg2;
        var4.field546[arg1] = arg3;
    }

    @ObfuscatedName("r.i(II)V")
    public static void method263(int arg0) {
        class60 var1 = (class60) field545.method5527((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field544.length; var2++) {
                var1.field544[var2] = -1;
                var1.field546[var2] = 0;
            }
        }
    }

    @ObfuscatedName("q.d(I)V")
    public static void method178() {
        field545 = new class319(32);
    }
}
