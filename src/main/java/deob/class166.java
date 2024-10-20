package deob;

@ObfuscatedName("fv")
public class class166 {

    @ObfuscatedName("fv.b")
    public static int[] field2154 = new int[32];

    @ObfuscatedName("fv.l")
    public static int[] field2155;

    @ObfuscatedName("fv.i")
    public static int[] field2156;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2154[var1] = var0 - 1;
            var0 += var0;
        }
        field2155 = new int[2000];
        field2156 = new int[2000];
    }

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.b(IB)I")
    public static int method2904(int arg0) {
        class195 var1 = (class195) class195.field2851.method2256((long) arg0);
        class195 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2854.method3226(14, arg0);
            class195 var4 = new class195();
            if (var3 != null) {
                var4.method3412(new class154(var3));
            }
            class195.field2851.method2258(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field2850;
        int var7 = var2.field2853;
        int var8 = var2.field2855;
        int var9 = field2154[var8 - var7];
        return field2156[var6] >> var7 & var9;
    }
}
