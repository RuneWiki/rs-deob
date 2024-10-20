package deob;

@ObfuscatedName("ek")
public class class154 {

    @ObfuscatedName("ek.k")
    public static int[] field2664 = new int[32];

    @ObfuscatedName("ek.b")
    public static int[] field2662;

    @ObfuscatedName("ek.e")
    public static int[] field2661;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2664[var1] = var0 - 1;
            var0 += var0;
        }
        field2662 = new int[2000];
        field2661 = new int[2000];
    }

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eo.k(II)I")
    public static int method2880(int arg0) {
        class42 var1 = (class42) class42.field976.method3166((long) arg0);
        class42 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field987.method2759(14, arg0);
            class42 var4 = new class42();
            if (var3 != null) {
                var4.method808(new class107(var3));
            }
            class42.field976.method3161(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field981;
        int var7 = var2.field978;
        int var8 = var2.field979;
        int var9 = field2664[var8 - var7];
        return field2661[var6] >> var7 & var9;
    }

    @ObfuscatedName("i.b(III)V")
    public static void method27(int arg0, int arg1) {
        class42 var2 = (class42) class42.field976.method3166((long) arg0);
        class42 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field987.method2759(14, arg0);
            class42 var5 = new class42();
            if (var4 != null) {
                var5.method808(new class107(var4));
            }
            class42.field976.method3161(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field981;
        int var8 = var3.field978;
        int var9 = var3.field979;
        int var10 = field2664[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2661[var7] = field2661[var7] & ~var11 | arg1 << var8 & var11;
    }
}
