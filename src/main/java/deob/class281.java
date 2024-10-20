package deob;

@ObfuscatedName("jv")
public class class281 {

    @ObfuscatedName("jv.c")
    public static int[] field3223 = new int[32];

    @ObfuscatedName("jv.l")
    public static int[] field3225;

    @ObfuscatedName("jv.s")
    public static int[] field3224;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3223[var1] = var0 - 1;
            var0 += var0;
        }
        field3225 = new int[4000];
        field3224 = new int[4000];
    }

    public class281() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("nh.c(II)I")
    public static int method6117(int arg0) {
        class176 var1 = (class176) class176.field1926.method4472((long) arg0);
        class176 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1927.method5066(14, arg0);
            class176 var4 = new class176();
            if (var3 != null) {
                var4.method3041(new class421(var3));
            }
            class176.field1926.method4482(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1928;
        int var7 = var2.field1925;
        int var8 = var2.field1929;
        int var9 = field3223[var8 - var7];
        return field3224[var6] >> var7 & var9;
    }

    @ObfuscatedName("ag.l(IIB)V")
    public static void method739(int arg0, int arg1) {
        class176 var2 = (class176) class176.field1926.method4472((long) arg0);
        class176 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1927.method5066(14, arg0);
            class176 var5 = new class176();
            if (var4 != null) {
                var5.method3041(new class421(var4));
            }
            class176.field1926.method4482(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field1928;
        int var8 = var3.field1925;
        int var9 = var3.field1929;
        int var10 = field3223[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field3224[var7] = field3224[var7] & ~var11 | arg1 << var8 & var11;
    }
}
