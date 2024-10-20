package deob;

@ObfuscatedName("hf")
public class class213 {

    @ObfuscatedName("hf.i")
    public static int[] field2608 = new int[32];

    @ObfuscatedName("hf.j")
    public static int[] field2615;

    @ObfuscatedName("hf.a")
    public static int[] field2609;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2608[var1] = var0 - 1;
            var0 += var0;
        }
        field2615 = new int[2000];
        field2609 = new int[2000];
    }

    public class213() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.i(IB)I")
    public static int method1008(int arg0) {
        class252 var1 = (class252) class252.field3381.method3347((long) arg0);
        class252 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3384.method3824(14, arg0);
            class252 var4 = new class252();
            if (var3 != null) {
                var4.method4102(new class175(var3));
            }
            class252.field3381.method3346(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3383;
        int var7 = var2.field3385;
        int var8 = var2.field3382;
        int var9 = field2608[var8 - var7];
        return field2609[var6] >> var7 & var9;
    }
}
