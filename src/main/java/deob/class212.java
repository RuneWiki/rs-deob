package deob;

@ObfuscatedName("hz")
public class class212 {

    @ObfuscatedName("hz.p")
    public static int[] field2615 = new int[32];

    @ObfuscatedName("hz.m")
    public static int[] field2614;

    @ObfuscatedName("hz.e")
    public static int[] field2616;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2615[var1] = var0 - 1;
            var0 += var0;
        }
        field2614 = new int[2000];
        field2616 = new int[2000];
    }

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.p(II)I")
    public static int method659(int arg0) {
        class251 var1 = (class251) class251.field3390.method3182((long) arg0);
        class251 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3391.method3720(14, arg0);
            class251 var4 = new class251();
            if (var3 != null) {
                var4.method3993(new class174(var3));
            }
            class251.field3390.method3179(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3394;
        int var7 = var2.field3389;
        int var8 = var2.field3393;
        int var9 = field2615[var8 - var7];
        return field2616[var6] >> var7 & var9;
    }
}
