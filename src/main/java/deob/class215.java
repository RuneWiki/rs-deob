package deob;

@ObfuscatedName("hc")
public class class215 {

    @ObfuscatedName("hc.s")
    public static int[] field2622 = new int[32];

    @ObfuscatedName("hc.c")
    public static int[] field2625;

    @ObfuscatedName("hc.f")
    public static int[] field2623;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2622[var1] = var0 - 1;
            var0 += var0;
        }
        field2625 = new int[2000];
        field2623 = new int[2000];
    }

    public class215() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ec.s(II)I")
    public static int method2427(int arg0) {
        class254 var1 = (class254) class254.field3397.method3319((long) arg0);
        class254 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3396.method3840(14, arg0);
            class254 var4 = new class254();
            if (var3 != null) {
                var4.method4147(new class177(var3));
            }
            class254.field3397.method3315(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3395;
        int var7 = var2.field3398;
        int var8 = var2.field3393;
        int var9 = field2622[var8 - var7];
        return field2623[var6] >> var7 & var9;
    }
}
