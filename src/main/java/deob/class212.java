package deob;

@ObfuscatedName("he")
public class class212 {

    @ObfuscatedName("he.e")
    public static int[] field2594 = new int[32];

    @ObfuscatedName("he.o")
    public static int[] field2590;

    @ObfuscatedName("he.m")
    public static int[] field2589;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2594[var1] = var0 - 1;
            var0 += var0;
        }
        field2590 = new int[2000];
        field2589 = new int[2000];
    }

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.e(II)I")
    public static int method56(int arg0) {
        class251 var1 = (class251) class251.field3356.method3248((long) arg0);
        class251 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3361.method3760(14, arg0);
            class251 var4 = new class251();
            if (var3 != null) {
                var4.method4049(new class174(var3));
            }
            class251.field3356.method3250(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3359;
        int var7 = var2.field3357;
        int var8 = var2.field3355;
        int var9 = field2594[var8 - var7];
        return field2589[var6] >> var7 & var9;
    }
}
