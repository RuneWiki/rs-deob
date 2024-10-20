package deob;

@ObfuscatedName("fo")
public class class160 {

    @ObfuscatedName("fo.b")
    public static int[] field2728 = new int[32];

    @ObfuscatedName("fo.e")
    public static int[] field2727;

    @ObfuscatedName("fo.g")
    public static int[] field2726;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2728[var1] = var0 - 1;
            var0 += var0;
        }
        field2727 = new int[2000];
        field2726 = new int[2000];
    }

    public class160() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.b(II)I")
    public static int method748(int arg0) {
        class38 var1 = (class38) class38.field936.method3248((long) arg0);
        class38 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field937.method3026(14, arg0);
            class38 var4 = new class38();
            if (var3 != null) {
                var4.method793(new class126(var3));
            }
            class38.field936.method3252(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field935;
        int var7 = var2.field938;
        int var8 = var2.field939;
        int var9 = field2728[var8 - var7];
        return field2726[var6] >> var7 & var9;
    }
}
