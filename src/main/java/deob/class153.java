package deob;

@ObfuscatedName("es")
public class class153 {

    @ObfuscatedName("es.e")
    public static int[] field2644 = new int[32];

    @ObfuscatedName("es.p")
    public static int[] field2643;

    @ObfuscatedName("es.a")
    public static int[] field2645;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2644[var1] = var0 - 1;
            var0 += var0;
        }
        field2643 = new int[2000];
        field2645 = new int[2000];
    }

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gd.e(II)I")
    public static int method3431(int arg0) {
        class42 var1 = (class42) class42.field967.method3166((long) arg0);
        class42 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field972.method2717(14, arg0);
            class42 var4 = new class42();
            if (var3 != null) {
                var4.method826(new class107(var3));
            }
            class42.field967.method3161(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field968;
        int var7 = var2.field969;
        int var8 = var2.field970;
        int var9 = field2644[var8 - var7];
        return field2645[var6] >> var7 & var9;
    }
}
