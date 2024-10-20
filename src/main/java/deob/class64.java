package deob;

@ObfuscatedName("bg")
public class class64 extends class194 {

    @ObfuscatedName("bg.j")
    public static class192 field799 = new class192(32);

    @ObfuscatedName("bg.h")
    public int[] field797 = new int[] { -1 };

    @ObfuscatedName("bg.f")
    public int[] field798 = new int[] { 0 };

    @ObfuscatedName("iz.h(IIB)I")
    public static int method4154(int arg0, int arg1) {
        class64 var2 = (class64) field799.method3281((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field798.length) {
            return var2.field798[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("aq.f(IIIIB)V")
    public static void method649(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) field799.method3281((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            field799.method3274(var4, (long) arg0);
        }
        if (var4.field797.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field797.length; var7++) {
                var5[var7] = var4.field797[var7];
                var6[var7] = var4.field798[var7];
            }
            for (int var8 = var4.field797.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field797 = var5;
            var4.field798 = var6;
        }
        var4.field797[arg1] = arg2;
        var4.field798[arg1] = arg3;
    }

    @ObfuscatedName("ix.p(IB)V")
    public static void method3947(int arg0) {
        class64 var1 = (class64) field799.method3281((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field797.length; var2++) {
                var1.field797[var2] = -1;
                var1.field798[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ac.x(II)V")
    public static void method695(int arg0) {
        class64 var1 = (class64) field799.method3281((long) arg0);
        if (var1 != null) {
            var1.method3314();
        }
    }

    @ObfuscatedName("hv.g(B)V")
    public static void method3765() {
        field799 = new class192(32);
    }
}
