package deob;

@ObfuscatedName("hc")
public class class222 {

    @ObfuscatedName("hc.h")
    public static int[] field2541 = new int[32];

    @ObfuscatedName("hc.v")
    public static int[] field2540;

    @ObfuscatedName("hc.x")
    public static int[] field2542;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2541[var1] = var0 - 1;
            var0 += var0;
        }
        field2540 = new int[4000];
        field2542 = new int[4000];
    }

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hs.h(II)I")
    public static int method3680(int arg0) {
        class260 var1 = (class260) class260.field3325.method3147((long) arg0);
        class260 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3324.method3834(14, arg0);
            class260 var4 = new class260();
            if (var3 != null) {
                var4.method4148(new class311(var3));
            }
            class260.field3325.method3145(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3327;
        int var7 = var2.field3329;
        int var8 = var2.field3328;
        int var9 = field2541[var8 - var7];
        return field2542[var6] >> var7 & var9;
    }

    @ObfuscatedName("if.v(III)V")
    public static void method4122(int arg0, int arg1) {
        class260 var2 = (class260) class260.field3325.method3147((long) arg0);
        class260 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3324.method3834(14, arg0);
            class260 var5 = new class260();
            if (var4 != null) {
                var5.method4148(new class311(var4));
            }
            class260.field3325.method3145(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3327;
        int var8 = var3.field3329;
        int var9 = var3.field3328;
        int var10 = field2541[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2542[var7] = field2542[var7] & ~var11 | arg1 << var8 & var11;
    }
}
