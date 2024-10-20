package deob;

@ObfuscatedName("ht")
public class class222 {

    @ObfuscatedName("ht.m")
    public static int[] field2564 = new int[32];

    @ObfuscatedName("ht.o")
    public static int[] field2561;

    @ObfuscatedName("ht.q")
    public static int[] field2562;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2564[var1] = var0 - 1;
            var0 += var0;
        }
        field2561 = new int[4000];
        field2562 = new int[4000];
    }

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hd.m(II)I")
    public static int method3842(int arg0) {
        class259 var1 = (class259) class259.field3331.method3127((long) arg0);
        class259 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3333.method3891(14, arg0);
            class259 var4 = new class259();
            if (var3 != null) {
                var4.method4258(new class310(var3));
            }
            class259.field3331.method3137(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3329;
        int var7 = var2.field3332;
        int var8 = var2.field3330;
        int var9 = field2564[var8 - var7];
        return field2562[var6] >> var7 & var9;
    }

    @ObfuscatedName("iz.o(III)V")
    public static void method4248(int arg0, int arg1) {
        class259 var2 = (class259) class259.field3331.method3127((long) arg0);
        class259 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3333.method3891(14, arg0);
            class259 var5 = new class259();
            if (var4 != null) {
                var5.method4258(new class310(var4));
            }
            class259.field3331.method3137(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3329;
        int var8 = var3.field3332;
        int var9 = var3.field3330;
        int var10 = field2564[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2562[var7] = field2562[var7] & ~var11 | arg1 << var8 & var11;
    }
}
