package deob;

@ObfuscatedName("fw")
public class class167 {

    @ObfuscatedName("fw.p")
    public static int[] field2808 = new int[32];

    @ObfuscatedName("fw.k")
    public static int[] field2803;

    @ObfuscatedName("fw.e")
    public static int[] field2804;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2808[var1] = var0 - 1;
            var0 += var0;
        }
        field2803 = new int[2000];
        field2804 = new int[2000];
    }

    public class167() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.p(II)I")
    public static int method2494(int arg0) {
        class44 var1 = (class44) class44.field1012.method3371((long) arg0);
        class44 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1015.method2896(14, arg0);
            class44 var4 = new class44();
            if (var3 != null) {
                var4.method846(new class111(var3));
            }
            class44.field1012.method3370(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1011;
        int var7 = var2.field1016;
        int var8 = var2.field1014;
        int var9 = field2808[var8 - var7];
        return field2804[var6] >> var7 & var9;
    }

    @ObfuscatedName("x.k(III)V")
    public static void method141(int arg0, int arg1) {
        class44 var2 = (class44) class44.field1012.method3371((long) arg0);
        class44 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1015.method2896(14, arg0);
            class44 var5 = new class44();
            if (var4 != null) {
                var5.method846(new class111(var4));
            }
            class44.field1012.method3370(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field1011;
        int var8 = var3.field1016;
        int var9 = var3.field1014;
        int var10 = field2808[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2804[var7] = field2804[var7] & ~var11 | arg1 << var8 & var11;
    }
}
