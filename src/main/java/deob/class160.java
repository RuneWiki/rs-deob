package deob;

@ObfuscatedName("fx")
public class class160 {

    @ObfuscatedName("fx.p")
    public static int[] field2708 = new int[32];

    @ObfuscatedName("fx.e")
    public static int[] field2710;

    @ObfuscatedName("fx.a")
    public static int[] field2709;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2708[var1] = var0 - 1;
            var0 += var0;
        }
        field2710 = new int[2000];
        field2709 = new int[2000];
    }

    public class160() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ev.p(II)I")
    public static int method2809(int arg0) {
        class38 var1 = (class38) class38.field950.method3266((long) arg0);
        class38 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field949.method3048(14, arg0);
            class38 var4 = new class38();
            if (var3 != null) {
                var4.method823(new class127(var3));
            }
            class38.field950.method3268(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field947;
        int var7 = var2.field948;
        int var8 = var2.field946;
        int var9 = field2708[var8 - var7];
        return field2709[var6] >> var7 & var9;
    }
}
