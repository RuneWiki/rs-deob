package deob;

@ObfuscatedName("ez")
public class class155 {

    @ObfuscatedName("ez.p")
    public static int[] field2666 = new int[32];

    @ObfuscatedName("ez.g")
    public static int[] field2663;

    @ObfuscatedName("ez.x")
    public static int[] field2662;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2666[var1] = var0 - 1;
            var0 += var0;
        }
        field2663 = new int[2000];
        field2662 = new int[2000];
    }

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.p(II)I")
    public static int method2483(int arg0) {
        class42 var1 = (class42) class42.field973.method3225((long) arg0);
        class42 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field970.method2855(14, arg0);
            class42 var4 = new class42();
            if (var3 != null) {
                var4.method844(new class107(var3));
            }
            class42.field973.method3234(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field980;
        int var7 = var2.field972;
        int var8 = var2.field969;
        int var9 = field2666[var8 - var7];
        return field2662[var6] >> var7 & var9;
    }
}
