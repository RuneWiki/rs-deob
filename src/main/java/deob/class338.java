package deob;

@ObfuscatedName("mt")
public class class338 {

    @ObfuscatedName("mt.az")
    public static int[] field3635 = new int[32];

    @ObfuscatedName("mt.af")
    public static int[] field3633;

    @ObfuscatedName("mt.at")
    public static int[] field3634;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3635[var1] = var0 - 1;
            var0 += var0;
        }
        field3633 = new int[5000];
        field3634 = new int[5000];
    }

    public class338() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ie.az(II)I")
    public static int method3618(int arg0) {
        class216 var1 = (class216) class216.field2206.method5336((long) arg0);
        class216 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2202.method6328(14, arg0);
            class216 var4 = new class216();
            if (var3 != null) {
                var4.method3663(new class535(var3));
            }
            class216.field2206.method5346(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field2203;
        int var7 = var2.field2204;
        int var8 = var2.field2201;
        int var9 = field3635[var8 - var7];
        return field3634[var6] >> var7 & var9;
    }

    @ObfuscatedName("jl.ah(III)V")
    public static void method4102(int arg0, int arg1) {
        class216 var2 = (class216) class216.field2206.method5336((long) arg0);
        class216 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2202.method6328(14, arg0);
            class216 var5 = new class216();
            if (var4 != null) {
                var5.method3663(new class535(var4));
            }
            class216.field2206.method5346(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field2203;
        int var8 = var3.field2204;
        int var9 = var3.field2201;
        int var10 = field3635[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field3634[var7] = field3634[var7] & ~var11 | arg1 << var8 & var11;
    }
}
