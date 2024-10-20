package deob;

@ObfuscatedName("fg")
public class class180 {

    @ObfuscatedName("fg.e")
    public static int[] field2946 = new int[32];

    @ObfuscatedName("fg.l")
    public static int[] field2947;

    @ObfuscatedName("fg.c")
    public static int[] field2945;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2946[var1] = var0 - 1;
            var0 += var0;
        }
        field2947 = new int[2000];
        field2945 = new int[2000];
    }

    public class180() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fz.e(IB)I")
    public static int method3258(int arg0) {
        class51 var1 = (class51) class51.field1111.method3589((long) arg0);
        class51 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1116.method3130(14, arg0);
            class51 var4 = new class51();
            if (var3 != null) {
                var4.method1048(new class123(var3));
            }
            class51.field1111.method3591(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1113;
        int var7 = var2.field1114;
        int var8 = var2.field1115;
        int var9 = field2946[var8 - var7];
        return field2945[var6] >> var7 & var9;
    }
}
