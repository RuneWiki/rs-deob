package deob;

@ObfuscatedName("jg")
public class class276 {

    @ObfuscatedName("jg.c")
    public static int[] field3186 = new int[32];

    @ObfuscatedName("jg.b")
    public static int[] field3184;

    @ObfuscatedName("jg.p")
    public static int[] field3185;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3186[var1] = var0 - 1;
            var0 += var0;
        }
        field3184 = new int[4000];
        field3185 = new int[4000];
    }

    public class276() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jj.c(IB)I")
    public static int method4820(int arg0) {
        class176 var1 = (class176) class176.field1907.method4514((long) arg0);
        class176 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1911.method5053(14, arg0);
            class176 var4 = new class176();
            if (var3 != null) {
                var4.method3077(new class419(var3));
            }
            class176.field1907.method4515(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1909;
        int var7 = var2.field1908;
        int var8 = var2.field1910;
        int var9 = field3186[var8 - var7];
        return field3185[var6] >> var7 & var9;
    }

    @ObfuscatedName("gb.b(IIB)V")
    public static void method3527(int arg0, int arg1) {
        class176 var2 = (class176) class176.field1907.method4514((long) arg0);
        class176 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1911.method5053(14, arg0);
            class176 var5 = new class176();
            if (var4 != null) {
                var5.method3077(new class419(var4));
            }
            class176.field1907.method4515(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field1909;
        int var8 = var3.field1908;
        int var9 = var3.field1910;
        int var10 = field3186[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field3185[var7] = field3185[var7] & ~var11 | arg1 << var8 & var11;
    }
}
