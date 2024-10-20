package deob;

@ObfuscatedName("in")
public class class244 {

    @ObfuscatedName("in.s")
    public static int[] field2917 = new int[32];

    @ObfuscatedName("in.t")
    public static int[] field2912;

    @ObfuscatedName("in.v")
    public static int[] field2911;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2917[var1] = var0 - 1;
            var0 += var0;
        }
        field2912 = new int[4000];
        field2911 = new int[4000];
    }

    public class244() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fu.s(II)I")
    public static int method3219(int arg0) {
        class152 var1 = (class152) class152.field1689.method3927((long) arg0);
        class152 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1692.method4459(14, arg0);
            class152 var4 = new class152();
            if (var3 != null) {
                var4.method2577(new class385(var3));
            }
            class152.field1689.method3929(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1690;
        int var7 = var2.field1695;
        int var8 = var2.field1688;
        int var9 = field2917[var8 - var7];
        return field2911[var6] >> var7 & var9;
    }

    @ObfuscatedName("ca.t(IIB)V")
    public static void method2110(int arg0, int arg1) {
        class152 var2 = (class152) class152.field1689.method3927((long) arg0);
        class152 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1692.method4459(14, arg0);
            class152 var5 = new class152();
            if (var4 != null) {
                var5.method2577(new class385(var4));
            }
            class152.field1689.method3929(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field1690;
        int var8 = var3.field1695;
        int var9 = var3.field1688;
        int var10 = field2917[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2911[var7] = field2911[var7] & ~var11 | arg1 << var8 & var11;
    }
}
