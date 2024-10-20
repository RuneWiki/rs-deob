package deob;

@ObfuscatedName("hb")
public class class213 {

    @ObfuscatedName("hb.c")
    public static int[] field2536 = new int[32];

    @ObfuscatedName("hb.t")
    public static int[] field2535;

    @ObfuscatedName("hb.o")
    public static int[] field2534;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2536[var1] = var0 - 1;
            var0 += var0;
        }
        field2535 = new int[4000];
        field2534 = new int[4000];
    }

    public class213() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gc.t(IIB)V")
    public static void method3635(int arg0, int arg1) {
        class250 var2 = (class250) class250.field3289.method3100((long) arg0);
        class250 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3637.method3845(14, arg0);
            class250 var5 = new class250();
            if (var4 != null) {
                var5.method4177(new class301(var4));
            }
            class250.field3289.method3102(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3291;
        int var8 = var3.field3294;
        int var9 = var3.field3292;
        int var10 = field2536[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2534[var7] = field2534[var7] & ~var11 | arg1 << var8 & var11;
    }
}
