package deob;

@ObfuscatedName("ep")
public class class155 {

    @ObfuscatedName("ep.g")
    public static int[] field2666 = new int[32];

    @ObfuscatedName("ep.s")
    public static int[] field2662;

    @ObfuscatedName("ep.h")
    public static int[] field2664;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2666[var1] = var0 - 1;
            var0 += var0;
        }
        field2662 = new int[2000];
        field2664 = new int[2000];
    }

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cx.g(II)I")
    public static int method1855(int arg0) {
        class42 var1 = (class42) class42.field977.method3130((long) arg0);
        class42 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field980.method2667(14, arg0);
            class42 var4 = new class42();
            if (var3 != null) {
                var4.method802(new class107(var3));
            }
            class42.field977.method3126(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field973;
        int var7 = var2.field974;
        int var8 = var2.field979;
        int var9 = field2666[var8 - var7];
        return field2664[var6] >> var7 & var9;
    }
}
