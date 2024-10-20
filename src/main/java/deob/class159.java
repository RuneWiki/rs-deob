package deob;

@ObfuscatedName("fv")
public class class159 {

    @ObfuscatedName("fv.i")
    public static int[] field2696 = new int[32];

    @ObfuscatedName("fv.w")
    public static int[] field2695;

    @ObfuscatedName("fv.f")
    public static int[] field2697;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2696[var1] = var0 - 1;
            var0 += var0;
        }
        field2695 = new int[2000];
        field2697 = new int[2000];
    }

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ex.i(II)I")
    public static int method2663(int arg0) {
        class38 var1 = (class38) class38.field959.method3235((long) arg0);
        class38 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field963.method2970(14, arg0);
            class38 var4 = new class38();
            if (var3 != null) {
                var4.method807(new class127(var3));
            }
            class38.field959.method3234(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field961;
        int var7 = var2.field962;
        int var8 = var2.field960;
        int var9 = field2696[var8 - var7];
        return field2697[var6] >> var7 & var9;
    }
}
