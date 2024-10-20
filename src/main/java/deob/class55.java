package deob;

@ObfuscatedName("bi")
public class class55 extends class207 {

    @ObfuscatedName("bi.v")
    public static class205 field518 = new class205(32);

    @ObfuscatedName("bi.s")
    public int[] field517 = new int[] { -1 };

    @ObfuscatedName("bi.o")
    public int[] field521 = new int[] { 0 };

    @ObfuscatedName("ay.v(IIB)I")
    public static int method496(int arg0, int arg1) {
        class55 var2 = (class55) field518.method3735((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field521.length) {
            return var2.field521[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("c.s(IIIIB)V")
    public static void method117(int arg0, int arg1, int arg2, int arg3) {
        class55 var4 = (class55) field518.method3735((long) arg0);
        if (var4 == null) {
            var4 = new class55();
            field518.method3733(var4, (long) arg0);
        }
        if (var4.field517.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field517.length; var7++) {
                var5[var7] = var4.field517[var7];
                var6[var7] = var4.field521[var7];
            }
            for (int var8 = var4.field517.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field517 = var5;
            var4.field521 = var6;
        }
        var4.field517[arg1] = arg2;
        var4.field521[arg1] = arg3;
    }

    @ObfuscatedName("id.o(II)V")
    public static void method4263(int arg0) {
        class55 var1 = (class55) field518.method3735((long) arg0);
        if (var1 != null) {
            var1.method3787();
        }
    }

    @ObfuscatedName("hm.k(I)V")
    public static void method4165() {
        field518 = new class205(32);
    }
}
