package deob;

@ObfuscatedName("ht")
public class class222 {

    @ObfuscatedName("ht.x")
    public static int[] field2524 = new int[32];

    @ObfuscatedName("ht.m")
    public static int[] field2525;

    @ObfuscatedName("ht.k")
    public static int[] field2527;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2524[var1] = var0 - 1;
            var0 += var0;
        }
        field2525 = new int[4000];
        field2527 = new int[4000];
    }

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.x(II)I")
    public static int method2013(int arg0) {
        class259 var1 = (class259) class259.field3289.method3146((long) arg0);
        class259 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3292.method3869(14, arg0);
            class259 var4 = new class259();
            if (var3 != null) {
                var4.method4168(new class310(var3));
            }
            class259.field3289.method3152(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3294;
        int var7 = var2.field3291;
        int var8 = var2.field3288;
        int var9 = field2524[var8 - var7];
        return field2527[var6] >> var7 & var9;
    }
}
