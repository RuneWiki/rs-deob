package deob;

@ObfuscatedName("ks")
public class class296 {

    @ObfuscatedName("ks.h")
    public static int[] field3448 = new int[32];

    @ObfuscatedName("ks.e")
    public static int[] field3444;

    @ObfuscatedName("ks.v")
    public static int[] field3445;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3448[var1] = var0 - 1;
            var0 += var0;
        }
        field3444 = new int[4000];
        field3445 = new int[4000];
    }

    public class296() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fx.h(II)I")
    public static int method3182(int arg0) {
        class192 var1 = (class192) class192.field2108.method4917((long) arg0);
        class192 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2107.method5909(14, arg0);
            class192 var4 = new class192();
            if (var3 != null) {
                var4.method3424(new class467(var3));
            }
            class192.field2108.method4925(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field2109;
        int var7 = var2.field2110;
        int var8 = var2.field2111;
        int var9 = field3448[var8 - var7];
        return field3445[var6] >> var7 & var9;
    }

    @ObfuscatedName("bu.e(III)V")
    public static void method1957(int arg0, int arg1) {
        class192 var2 = (class192) class192.field2108.method4917((long) arg0);
        class192 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2107.method5909(14, arg0);
            class192 var5 = new class192();
            if (var4 != null) {
                var5.method3424(new class467(var4));
            }
            class192.field2108.method4925(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field2109;
        int var8 = var3.field2110;
        int var9 = var3.field2111;
        int var10 = field3448[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field3445[var7] = field3445[var7] & ~var11 | arg1 << var8 & var11;
    }
}
