package deob;

@ObfuscatedName("fj")
public class class160 {

    @ObfuscatedName("fj.j")
    public static int[] field2718 = new int[32];

    @ObfuscatedName("fj.f")
    public static int[] field2717;

    @ObfuscatedName("fj.o")
    public static int[] field2716;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2718[var1] = var0 - 1;
            var0 += var0;
        }
        field2717 = new int[2000];
        field2716 = new int[2000];
    }

    public class160() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bc.j(IS)I")
    public static int method1486(int arg0) {
        class38 var1 = (class38) class38.field960.method3256((long) arg0);
        class38 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2026.method3027(14, arg0);
            class38 var4 = new class38();
            if (var3 != null) {
                var4.method818(new class127(var3));
            }
            class38.field960.method3257(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field961;
        int var7 = var2.field953;
        int var8 = var2.field954;
        int var9 = field2718[var8 - var7];
        return field2716[var6] >> var7 & var9;
    }
}
