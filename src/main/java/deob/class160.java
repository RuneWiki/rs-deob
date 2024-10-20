package deob;

@ObfuscatedName("fi")
public class class160 {

    @ObfuscatedName("fi.c")
    public static int[] field2730 = new int[32];

    @ObfuscatedName("fi.q")
    public static int[] field2729;

    @ObfuscatedName("fi.y")
    public static int[] field2731;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2730[var1] = var0 - 1;
            var0 += var0;
        }
        field2729 = new int[2000];
        field2731 = new int[2000];
    }

    public class160() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.c(IB)I")
    public static int method2195(int arg0) {
        class38 var1 = (class38) class38.field971.method3097((long) arg0);
        class38 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1534.method2886(14, arg0);
            class38 var4 = new class38();
            if (var3 != null) {
                var4.method773(new class127(var3));
            }
            class38.field971.method3092(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field979;
        int var7 = var2.field978;
        int var8 = var2.field969;
        int var9 = field2730[var8 - var7];
        return field2731[var6] >> var7 & var9;
    }
}
