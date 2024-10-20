package deob;

@ObfuscatedName("y")
public class class16 extends class208 {

    @ObfuscatedName("y.j")
    public static class196 field226 = new class196(32);

    @ObfuscatedName("y.l")
    public int[] field224 = new int[] { -1 };

    @ObfuscatedName("y.a")
    public int[] field230 = new int[] { 0 };

    @ObfuscatedName("o.j(III)I")
    public static int method93(int arg0, int arg1) {
        class16 var2 = (class16) field226.method3499((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field224.length) {
            return var2.field224[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("m.l(III)I")
    public static int method78(int arg0, int arg1) {
        class16 var2 = (class16) field226.method3499((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field230.length) {
            return var2.field230[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("q.a(IIB)I")
    public static int method150(int arg0, int arg1) {
        class16 var2 = (class16) field226.method3499((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field230.length; var4++) {
                if (var2.field224[var4] == arg1) {
                    var3 += var2.field230[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("h.i(IIIII)V")
    public static void method94(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field226.method3499((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field226.method3501(var4, (long) arg0);
        }
        if (var4.field224.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field224.length; var7++) {
                var5[var7] = var4.field224[var7];
                var6[var7] = var4.field230[var7];
            }
            for (int var8 = var4.field224.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field224 = var5;
            var4.field230 = var6;
        }
        var4.field224[arg1] = arg2;
        var4.field230[arg1] = arg3;
    }

    @ObfuscatedName("dh.f(I)V")
    public static void method2260() {
        field226 = new class196(32);
    }
}
