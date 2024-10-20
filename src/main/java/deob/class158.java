package deob;

@ObfuscatedName("fc")
public class class158 {

    @ObfuscatedName("fc.v")
    public static int[] field2691 = new int[32];

    @ObfuscatedName("fc.f")
    public static int[] field2692;

    @ObfuscatedName("fc.n")
    public static int[] field2693;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2691[var1] = var0 - 1;
            var0 += var0;
        }
        field2692 = new int[2000];
        field2693 = new int[2000];
    }

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.v(IB)I")
    public static int method2233(int arg0) {
        class37 var1 = (class37) class37.field932.method3224((long) arg0);
        class37 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field931.method3020(14, arg0);
            class37 var4 = new class37();
            if (var3 != null) {
                var4.method821(new class126(var3));
            }
            class37.field932.method3231(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field933;
        int var7 = var2.field934;
        int var8 = var2.field935;
        int var9 = field2691[var8 - var7];
        return field2693[var6] >> var7 & var9;
    }
}
