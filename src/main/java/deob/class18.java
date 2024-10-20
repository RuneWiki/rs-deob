package deob;

@ObfuscatedName("t")
public class class18 extends class178 {

    @ObfuscatedName("t.v")
    public static class174 field266 = new class174(32);

    @ObfuscatedName("t.f")
    public int[] field268 = new int[] { -1 };

    @ObfuscatedName("t.n")
    public int[] field267 = new int[] { 0 };

    @ObfuscatedName("cj.v(IIS)I")
    public static int method1667(int arg0, int arg1) {
        class18 var2 = (class18) field266.method3270((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field268.length) {
            return var2.field268[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bd.n(III)I")
    public static int method1398(int arg0, int arg1) {
        class18 var2 = (class18) field266.method3270((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field267.length; var4++) {
                if (var2.field268[var4] == arg1) {
                    var3 += var2.field267[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("dt.c(IIIII)V")
    public static void method2393(int arg0, int arg1, int arg2, int arg3) {
        class18 var4 = (class18) field266.method3270((long) arg0);
        if (var4 == null) {
            var4 = new class18();
            field266.method3284(var4, (long) arg0);
        }
        if (var4.field268.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field268.length; var7++) {
                var5[var7] = var4.field268[var7];
                var6[var7] = var4.field267[var7];
            }
            for (int var8 = var4.field268.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field268 = var5;
            var4.field267 = var6;
        }
        var4.field268[arg1] = arg2;
        var4.field267[arg1] = arg3;
    }

    @ObfuscatedName("dx.r(II)V")
    public static void method2382(int arg0) {
        class18 var1 = (class18) field266.method3270((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field268.length; var2++) {
                var1.field268[var2] = -1;
                var1.field267[var2] = 0;
            }
        }
    }

    @ObfuscatedName("i.k(B)V")
    public static void method161() {
        field266 = new class174(32);
    }
}
