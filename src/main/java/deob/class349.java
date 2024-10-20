package deob;

@ObfuscatedName("ny")
public class class349 {

    @ObfuscatedName("ny.ab")
    public static int[] field3701 = new int[32];

    @ObfuscatedName("ny.an")
    public static int[] field3699;

    @ObfuscatedName("ny.au")
    public static int[] field3702;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3701[var1] = var0 - 1;
            var0 += var0;
        }
        field3699 = new int[5000];
        field3702 = new int[5000];
    }

    public class349() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.ab(II)I")
    public static int method3159(int arg0) {
        class255 var1 = (class255) class255.field2684.method5586((long) arg0);
        class255 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2682.method6670(14, arg0);
            class255 var4 = new class255();
            if (var3 != null) {
                var4.method4619(new class549(var3));
            }
            class255.field2684.method5589(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field2683;
        int var7 = var2.field2686;
        int var8 = var2.field2685;
        int var9 = field3701[var8 - var7];
        return field3702[var6] >> var7 & var9;
    }

    @ObfuscatedName("ee.ay(III)V")
    public static void method2899(int arg0, int arg1) {
        class255 var2 = Statics.method4245(arg0);
        int var3 = var2.field2683;
        int var4 = var2.field2686;
        int var5 = var2.field2685;
        int var6 = field3701[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field3702[var3] = field3702[var3] & ~var7 | arg1 << var4 & var7;
    }
}
