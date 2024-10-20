package deob;

@ObfuscatedName("hx")
public class class212 {

    @ObfuscatedName("hx.d")
    public static int[] field2620 = new int[32];

    @ObfuscatedName("hx.k")
    public static int[] field2619;

    @ObfuscatedName("hx.e")
    public static int[] field2621;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2620[var1] = var0 - 1;
            var0 += var0;
        }
        field2619 = new int[2000];
        field2621 = new int[2000];
    }

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ck.d(II)I")
    public static int method1633(int arg0) {
        class251 var1 = (class251) class251.field3380.method3341((long) arg0);
        class251 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3381.method3875(14, arg0);
            class251 var4 = new class251();
            if (var3 != null) {
                var4.method4161(new class174(var3));
            }
            class251.field3380.method3343(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3385;
        int var7 = var2.field3382;
        int var8 = var2.field3383;
        int var9 = field2620[var8 - var7];
        return field2621[var6] >> var7 & var9;
    }

    @ObfuscatedName("e.k(IIB)V")
    public static void method8(int arg0, int arg1) {
        class251 var2 = (class251) class251.field3380.method3341((long) arg0);
        class251 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3381.method3875(14, arg0);
            class251 var5 = new class251();
            if (var4 != null) {
                var5.method4161(new class174(var4));
            }
            class251.field3380.method3343(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3385;
        int var8 = var3.field3382;
        int var9 = var3.field3383;
        int var10 = field2620[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2621[var7] = field2621[var7] & ~var11 | arg1 << var8 & var11;
    }
}
