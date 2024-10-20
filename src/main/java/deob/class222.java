package deob;

@ObfuscatedName("hs")
public class class222 {

    @ObfuscatedName("hs.f")
    public static int[] field2549 = new int[32];

    @ObfuscatedName("hs.b")
    public static int[] field2550;

    @ObfuscatedName("hs.l")
    public static int[] field2551;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2549[var1] = var0 - 1;
            var0 += var0;
        }
        field2550 = new int[4000];
        field2551 = new int[4000];
    }

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bx.f(IB)I")
    public static int method1164(int arg0) {
        class260 var1 = (class260) class260.field3322.method3155((long) arg0);
        class260 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3321.method3905(14, arg0);
            class260 var4 = new class260();
            if (var3 != null) {
                var4.method4257(new class311(var3));
            }
            class260.field3322.method3157(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3323;
        int var7 = var2.field3324;
        int var8 = var2.field3325;
        int var9 = field2549[var8 - var7];
        return field2551[var6] >> var7 & var9;
    }
}
