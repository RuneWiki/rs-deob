package deob;

@ObfuscatedName("hb")
public class class223 {

    @ObfuscatedName("hb.p")
    public static int[] field2695 = new int[32];

    @ObfuscatedName("hb.i")
    public static int[] field2690;

    @ObfuscatedName("hb.w")
    public static int[] field2691;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2695[var1] = var0 - 1;
            var0 += var0;
        }
        field2690 = new int[2000];
        field2691 = new int[2000];
    }

    public class223() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fu.p(II)I")
    public static int method3012(int arg0) {
        class262 var1 = (class262) class262.field3441.method3504((long) arg0);
        class262 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3444.method4032(14, arg0);
            class262 var4 = new class262();
            if (var3 != null) {
                var4.method4329(new class185(var3));
            }
            class262.field3441.method3506(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3442;
        int var7 = var2.field3445;
        int var8 = var2.field3440;
        int var9 = field2695[var8 - var7];
        return field2691[var6] >> var7 & var9;
    }

    @ObfuscatedName("eq.i(IIB)V")
    public static void method2801(int arg0, int arg1) {
        class262 var2 = (class262) class262.field3441.method3504((long) arg0);
        class262 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3444.method4032(14, arg0);
            class262 var5 = new class262();
            if (var4 != null) {
                var5.method4329(new class185(var4));
            }
            class262.field3441.method3506(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3442;
        int var8 = var3.field3445;
        int var9 = var3.field3440;
        int var10 = field2695[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2691[var7] = field2691[var7] & ~var11 | arg1 << var8 & var11;
    }
}
