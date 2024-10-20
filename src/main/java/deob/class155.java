package deob;

@ObfuscatedName("ek")
public class class155 {

    @ObfuscatedName("ek.k")
    public static int[] field2672 = new int[32];

    @ObfuscatedName("ek.y")
    public static int[] field2669;

    @ObfuscatedName("ek.s")
    public static int[] field2670;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2672[var1] = var0 - 1;
            var0 += var0;
        }
        field2669 = new int[2000];
        field2670 = new int[2000];
    }

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aj.k(II)I")
    public static int method549(int arg0) {
        class42 var1 = (class42) class42.field956.method3202((long) arg0);
        class42 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field965.method2729(14, arg0);
            class42 var4 = new class42();
            if (var3 != null) {
                var4.method799(new class107(var3));
            }
            class42.field956.method3204(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field957;
        int var7 = var2.field955;
        int var8 = var2.field958;
        int var9 = field2672[var8 - var7];
        return field2670[var6] >> var7 & var9;
    }
}
