package deob;

@ObfuscatedName("fk")
public class class160 {

    @ObfuscatedName("fk.p")
    public static int[] field2723 = new int[32];

    @ObfuscatedName("fk.l")
    public static int[] field2722;

    @ObfuscatedName("fk.d")
    public static int[] field2725;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2723[var1] = var0 - 1;
            var0 += var0;
        }
        field2722 = new int[2000];
        field2725 = new int[2000];
    }

    public class160() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("az.p(II)I")
    public static int method905(int arg0) {
        class38 var1 = (class38) class38.field953.method3357((long) arg0);
        class38 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field941.method3078(14, arg0);
            class38 var4 = new class38();
            if (var3 != null) {
                var4.method812(new class127(var3));
            }
            class38.field953.method3364(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field943;
        int var7 = var2.field942;
        int var8 = var2.field944;
        int var9 = field2723[var8 - var7];
        return field2725[var6] >> var7 & var9;
    }

    @ObfuscatedName("dh.l(III)V")
    public static void method2267(int arg0, int arg1) {
        class38 var2 = (class38) class38.field953.method3357((long) arg0);
        class38 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field941.method3078(14, arg0);
            class38 var5 = new class38();
            if (var4 != null) {
                var5.method812(new class127(var4));
            }
            class38.field953.method3364(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field943;
        int var8 = var3.field942;
        int var9 = var3.field944;
        int var10 = field2723[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2725[var7] = field2725[var7] & ~var11 | arg1 << var8 & var11;
    }
}
