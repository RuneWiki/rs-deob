package deob;

@ObfuscatedName("fp")
public class class162 {

    @ObfuscatedName("fp.i")
    public static int[] field2739 = new int[32];

    @ObfuscatedName("fp.b")
    public static int[] field2741;

    @ObfuscatedName("fp.r")
    public static int[] field2740;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2739[var1] = var0 - 1;
            var0 += var0;
        }
        field2741 = new int[2000];
        field2740 = new int[2000];
    }

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.i(II)I")
    public static int method2738(int arg0) {
        class39 var1 = (class39) class39.field961.method3277((long) arg0);
        class39 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field970.method3043(14, arg0);
            class39 var4 = new class39();
            if (var3 != null) {
                var4.method819(new class128(var3));
            }
            class39.field961.method3281(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field963;
        int var7 = var2.field964;
        int var8 = var2.field965;
        int var9 = field2739[var8 - var7];
        return field2740[var6] >> var7 & var9;
    }

    @ObfuscatedName("aq.b(IIB)V")
    public static void method880(int arg0, int arg1) {
        class39 var2 = (class39) class39.field961.method3277((long) arg0);
        class39 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field970.method3043(14, arg0);
            class39 var5 = new class39();
            if (var4 != null) {
                var5.method819(new class128(var4));
            }
            class39.field961.method3281(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field963;
        int var8 = var3.field964;
        int var9 = var3.field965;
        int var10 = field2739[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2740[var7] = field2740[var7] & ~var11 | arg1 << var8 & var11;
    }
}
