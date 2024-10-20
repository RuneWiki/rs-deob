package deob;

@ObfuscatedName("fn")
public class class160 {

    @ObfuscatedName("fn.q")
    public static int[] field2732 = new int[32];

    @ObfuscatedName("fn.c")
    public static int[] field2730;

    @ObfuscatedName("fn.p")
    public static int[] field2731;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2732[var1] = var0 - 1;
            var0 += var0;
        }
        field2730 = new int[2000];
        field2731 = new int[2000];
    }

    public class160() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.q(IB)I")
    public static int method2965(int arg0) {
        class38 var1 = (class38) class38.field948.method3215((long) arg0);
        class38 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field955.method2952(14, arg0);
            class38 var4 = new class38();
            if (var3 != null) {
                var4.method800(new class127(var3));
            }
            class38.field948.method3225(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field957;
        int var7 = var2.field950;
        int var8 = var2.field951;
        int var9 = field2732[var8 - var7];
        return field2731[var6] >> var7 & var9;
    }
}
