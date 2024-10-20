package deob;

@ObfuscatedName("fp")
public class class176 {

    @ObfuscatedName("fp.y")
    public static int[] field2873 = new int[32];

    @ObfuscatedName("fp.d")
    public static int[] field2872;

    @ObfuscatedName("fp.g")
    public static int[] field2875;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2873[var1] = var0 - 1;
            var0 += var0;
        }
        field2872 = new int[2000];
        field2875 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eg.y(II)I")
    public static int method2749(int arg0) {
        class48 var1 = (class48) class48.field1067.method3425((long) arg0);
        class48 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1072.method3045(14, arg0);
            class48 var4 = new class48();
            if (var3 != null) {
                var4.method953(new class119(var3));
            }
            class48.field1067.method3427(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1068;
        int var7 = var2.field1070;
        int var8 = var2.field1066;
        int var9 = field2873[var8 - var7];
        return field2875[var6] >> var7 & var9;
    }
}
