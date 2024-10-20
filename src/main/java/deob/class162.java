package deob;

@ObfuscatedName("fp")
public class class162 {

    @ObfuscatedName("fp.e")
    public static int[] field2746 = new int[32];

    @ObfuscatedName("fp.i")
    public static int[] field2745;

    @ObfuscatedName("fp.k")
    public static int[] field2748;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2746[var1] = var0 - 1;
            var0 += var0;
        }
        field2745 = new int[2000];
        field2748 = new int[2000];
    }

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ex.e(II)I")
    public static int method3010(int arg0) {
        class39 var1 = (class39) class39.field974.method3262((long) arg0);
        class39 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field981.method3069(14, arg0);
            class39 var4 = new class39();
            if (var3 != null) {
                var4.method859(new class128(var3));
            }
            class39.field974.method3264(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field973;
        int var7 = var2.field977;
        int var8 = var2.field975;
        int var9 = field2746[var8 - var7];
        return field2748[var6] >> var7 & var9;
    }

    @ObfuscatedName("m.i(IIB)V")
    public static void method43(int arg0, int arg1) {
        class39 var2 = (class39) class39.field974.method3262((long) arg0);
        class39 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field981.method3069(14, arg0);
            class39 var5 = new class39();
            if (var4 != null) {
                var5.method859(new class128(var4));
            }
            class39.field974.method3264(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field973;
        int var8 = var3.field977;
        int var9 = var3.field975;
        int var10 = field2746[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2748[var7] = field2748[var7] & ~var11 | arg1 << var8 & var11;
    }
}
