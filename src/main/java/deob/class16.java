package deob;

@ObfuscatedName("v")
public class class16 extends class208 {

    @ObfuscatedName("v.o")
    public static class196 field210 = new class196(32);

    @ObfuscatedName("v.e")
    public int[] field209 = new int[] { -1 };

    @ObfuscatedName("v.u")
    public int[] field211 = new int[] { 0 };

    @ObfuscatedName("ef.o(IIB)I")
    public static int method2778(int arg0, int arg1) {
        class16 var2 = (class16) field210.method3545((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field211.length) {
            return var2.field211[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cs.e(III)I")
    public static int method1742(int arg0, int arg1) {
        class16 var2 = (class16) field210.method3545((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field211.length; var4++) {
                if (var2.field209[var4] == arg1) {
                    var3 += var2.field211[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("z.u(IIIII)V")
    public static void method578(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field210.method3545((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field210.method3544(var4, (long) arg0);
        }
        if (var4.field209.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field209.length; var7++) {
                var5[var7] = var4.field209[var7];
                var6[var7] = var4.field211[var7];
            }
            for (int var8 = var4.field209.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field209 = var5;
            var4.field211 = var6;
        }
        var4.field209[arg1] = arg2;
        var4.field211[arg1] = arg3;
    }

    @ObfuscatedName("s.b(IB)V")
    public static void method90(int arg0) {
        class16 var1 = (class16) field210.method3545((long) arg0);
        if (var1 != null) {
            var1.method3670();
        }
    }

    @ObfuscatedName("ca.p(I)V")
    public static void method2032() {
        field210 = new class196(32);
    }
}
