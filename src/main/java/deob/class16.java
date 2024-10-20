package deob;

@ObfuscatedName("x")
public class class16 extends class208 {

    @ObfuscatedName("x.v")
    public static class196 field222 = new class196(32);

    @ObfuscatedName("x.f")
    public int[] field216 = new int[] { -1 };

    @ObfuscatedName("x.i")
    public int[] field218 = new int[] { 0 };

    @ObfuscatedName("g.v(III)I")
    public static int method592(int arg0, int arg1) {
        class16 var2 = (class16) field222.method3524((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field216.length) {
            return var2.field216[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("eh.i(IIIII)V")
    public static void method2708(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field222.method3524((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field222.method3526(var4, (long) arg0);
        }
        if (var4.field216.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field216.length; var7++) {
                var5[var7] = var4.field216[var7];
                var6[var7] = var4.field218[var7];
            }
            for (int var8 = var4.field216.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field216 = var5;
            var4.field218 = var6;
        }
        var4.field216[arg1] = arg2;
        var4.field218[arg1] = arg3;
    }

    @ObfuscatedName("b.d(II)V")
    public static void method573(int arg0) {
        class16 var1 = (class16) field222.method3524((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field216.length; var2++) {
                var1.field216[var2] = -1;
                var1.field218[var2] = 0;
            }
        }
    }

    @ObfuscatedName("am.o(I)V")
    public static void method889() {
        field222 = new class196(32);
    }
}
