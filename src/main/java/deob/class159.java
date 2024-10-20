package deob;

@ObfuscatedName("fl")
public class class159 {

    @ObfuscatedName("fl.j")
    public static int[] field2692 = new int[32];

    @ObfuscatedName("fl.r")
    public static int[] field2694;

    @ObfuscatedName("fl.v")
    public static int[] field2693;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2692[var1] = var0 - 1;
            var0 += var0;
        }
        field2694 = new int[2000];
        field2693 = new int[2000];
    }

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.j(II)I")
    public static int method791(int arg0) {
        class38 var1 = (class38) class38.field956.method3264((long) arg0);
        class38 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field957.method3016(14, arg0);
            class38 var4 = new class38();
            if (var3 != null) {
                var4.method794(new class127(var3));
            }
            class38.field956.method3257(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field961;
        int var7 = var2.field958;
        int var8 = var2.field959;
        int var9 = field2692[var8 - var7];
        return field2693[var6] >> var7 & var9;
    }
}
