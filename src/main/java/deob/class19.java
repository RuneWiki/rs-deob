package deob;

@ObfuscatedName("d")
public class class19 extends class179 {

    @ObfuscatedName("d.b")
    public static class175 field295 = new class175(32);

    @ObfuscatedName("d.c")
    public int[] field292 = new int[] { -1 };

    @ObfuscatedName("d.j")
    public int[] field293 = new int[] { 0 };

    @ObfuscatedName("av.b(III)I")
    public static int method264(int arg0, int arg1) {
        class19 var2 = (class19) field295.method3232((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field292.length) {
            return var2.field292[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ce.c(III)I")
    public static int method1646(int arg0, int arg1) {
        class19 var2 = (class19) field295.method3232((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field293.length; var4++) {
                if (var2.field292[var4] == arg1) {
                    var3 += var2.field293[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("y.j(IIIII)V")
    public static void method107(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field295.method3232((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field295.method3228(var4, (long) arg0);
        }
        if (var4.field292.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field292.length; var7++) {
                var5[var7] = var4.field292[var7];
                var6[var7] = var4.field293[var7];
            }
            for (int var8 = var4.field292.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field292 = var5;
            var4.field293 = var6;
        }
        var4.field292[arg1] = arg2;
        var4.field293[arg1] = arg3;
    }

    @ObfuscatedName("by.i(S)V")
    public static void method1504() {
        field295 = new class175(32);
    }
}
