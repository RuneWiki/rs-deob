package deob;

@ObfuscatedName("fp")
public class class159 {

    @ObfuscatedName("fp.a")
    public static int[] field2703 = new int[32];

    @ObfuscatedName("fp.r")
    public static int[] field2699;

    @ObfuscatedName("fp.u")
    public static int[] field2700;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2703[var1] = var0 - 1;
            var0 += var0;
        }
        field2699 = new int[2000];
        field2700 = new int[2000];
    }

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.a(II)I")
    public static int method2281(int arg0) {
        class38 var1 = (class38) class38.field937.method3208((long) arg0);
        class38 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field943.method2943(14, arg0);
            class38 var4 = new class38();
            if (var3 != null) {
                var4.method750(new class126(var3));
            }
            class38.field937.method3210(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field936;
        int var7 = var2.field939;
        int var8 = var2.field938;
        int var9 = field2703[var8 - var7];
        return field2700[var6] >> var7 & var9;
    }

    @ObfuscatedName("cd.r(IIB)V")
    public static void method1991(int arg0, int arg1) {
        class38 var2 = (class38) class38.field937.method3208((long) arg0);
        class38 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field943.method2943(14, arg0);
            class38 var5 = new class38();
            if (var4 != null) {
                var5.method750(new class126(var4));
            }
            class38.field937.method3210(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field936;
        int var8 = var3.field939;
        int var9 = var3.field938;
        int var10 = field2703[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2700[var7] = field2700[var7] & ~var11 | arg1 << var8 & var11;
    }
}
