package deob;

@ObfuscatedName("ff")
public class class160 {

    @ObfuscatedName("ff.f")
    public static int[] field2718 = new int[32];

    @ObfuscatedName("ff.t")
    public static int[] field2716;

    @ObfuscatedName("ff.n")
    public static int[] field2717;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2718[var1] = var0 - 1;
            var0 += var0;
        }
        field2716 = new int[2000];
        field2717 = new int[2000];
    }

    public class160() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.f(II)I")
    public static int method315(int arg0) {
        class38 var1 = (class38) class38.field944.method3276((long) arg0);
        class38 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field951.method3035(14, arg0);
            class38 var4 = new class38();
            if (var3 != null) {
                var4.method794(new class127(var3));
            }
            class38.field944.method3275(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field947;
        int var7 = var2.field946;
        int var8 = var2.field943;
        int var9 = field2718[var8 - var7];
        return field2717[var6] >> var7 & var9;
    }

    @ObfuscatedName("l.t(III)V")
    public static void method35(int arg0, int arg1) {
        class38 var2 = (class38) class38.field944.method3276((long) arg0);
        class38 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field951.method3035(14, arg0);
            class38 var5 = new class38();
            if (var4 != null) {
                var5.method794(new class127(var4));
            }
            class38.field944.method3275(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field947;
        int var8 = var3.field946;
        int var9 = var3.field943;
        int var10 = field2718[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2717[var7] = field2717[var7] & ~var11 | arg1 << var8 & var11;
    }
}
