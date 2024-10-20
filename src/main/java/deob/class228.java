package deob;

@ObfuscatedName("ho")
public class class228 {

    @ObfuscatedName("ho.v")
    public static int[] field2601 = new int[32];

    @ObfuscatedName("ho.s")
    public static int[] field2597;

    @ObfuscatedName("ho.o")
    public static int[] field2596;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2601[var1] = var0 - 1;
            var0 += var0;
        }
        field2597 = new int[2000];
        field2596 = new int[2000];
    }

    public class228() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hs.v(II)I")
    public static int method3899(int arg0) {
        class266 var1 = (class266) class266.field3349.method3687((long) arg0);
        class266 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3348.method4270(14, arg0);
            class266 var4 = new class266();
            if (var3 != null) {
                var4.method4604(new class185(var3));
            }
            class266.field3349.method3689(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3352;
        int var7 = var2.field3351;
        int var8 = var2.field3350;
        int var9 = field2601[var8 - var7];
        return field2596[var6] >> var7 & var9;
    }

    @ObfuscatedName("gr.s(III)V")
    public static void method3538(int arg0, int arg1) {
        class266 var2 = (class266) class266.field3349.method3687((long) arg0);
        class266 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3348.method4270(14, arg0);
            class266 var5 = new class266();
            if (var4 != null) {
                var5.method4604(new class185(var4));
            }
            class266.field3349.method3689(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3352;
        int var8 = var3.field3351;
        int var9 = var3.field3350;
        int var10 = field2601[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2596[var7] = field2596[var7] & ~var11 | arg1 << var8 & var11;
    }
}
