package deob;

@ObfuscatedName("ei")
public class class154 {

    @ObfuscatedName("ei.t")
    public static int[] field2654 = new int[32];

    @ObfuscatedName("ei.s")
    public static int[] field2658;

    @ObfuscatedName("ei.f")
    public static int[] field2650;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2654[var1] = var0 - 1;
            var0 += var0;
        }
        field2658 = new int[2000];
        field2650 = new int[2000];
    }

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dr.t(II)I")
    public static int method2402(int arg0) {
        class42 var1 = (class42) class42.field965.method3170((long) arg0);
        class42 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field976.method2709(14, arg0);
            class42 var4 = new class42();
            if (var3 != null) {
                var4.method790(new class107(var3));
            }
            class42.field965.method3168(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field975;
        int var7 = var2.field964;
        int var8 = var2.field968;
        int var9 = field2654[var8 - var7];
        return field2650[var6] >> var7 & var9;
    }
}
