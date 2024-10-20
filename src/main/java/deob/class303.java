package deob;

@ObfuscatedName("li")
public class class303 {

    @ObfuscatedName("li.aj")
    public static int[] field3425 = new int[32];

    @ObfuscatedName("li.al")
    public static int[] field3426;

    @ObfuscatedName("li.ac")
    public static int[] field3428;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3425[var1] = var0 - 1;
            var0 += var0;
        }
        field3426 = new int[4000];
        field3428 = new int[4000];
    }

    public class303() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.aj(II)I")
    public static int method233(int arg0) {
        class198 var1 = (class198) class198.field2075.method4921((long) arg0);
        class198 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2081.method5860(14, arg0);
            class198 var4 = new class198();
            if (var3 != null) {
                var4.method3437(new class478(var3));
            }
            class198.field2075.method4923(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field2078;
        int var7 = var2.field2077;
        int var8 = var2.field2074;
        int var9 = field3425[var8 - var7];
        return field3428[var6] >> var7 & var9;
    }

    @ObfuscatedName("ds.al(III)V")
    public static void method2175(int arg0, int arg1) {
        class198 var2 = (class198) class198.field2075.method4921((long) arg0);
        class198 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2081.method5860(14, arg0);
            class198 var5 = new class198();
            if (var4 != null) {
                var5.method3437(new class478(var4));
            }
            class198.field2075.method4923(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field2078;
        int var8 = var3.field2077;
        int var9 = var3.field2074;
        int var10 = field3425[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field3428[var7] = field3428[var7] & ~var11 | arg1 << var8 & var11;
    }
}
