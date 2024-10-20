package deob;

@ObfuscatedName("fy")
public class class166 {

    @ObfuscatedName("fy.q")
    public static int[] field2743 = new int[32];

    @ObfuscatedName("fy.s")
    public static int[] field2741;

    @ObfuscatedName("fy.h")
    public static int[] field2742;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2743[var1] = var0 - 1;
            var0 += var0;
        }
        field2741 = new int[2000];
        field2742 = new int[2000];
    }

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.q(IB)I")
    public static int method531(int arg0) {
        class44 var1 = (class44) class44.field987.method3243((long) arg0);
        class44 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2516.method2811(14, arg0);
            class44 var4 = new class44();
            if (var3 != null) {
                var4.method822(new class111(var3));
            }
            class44.field987.method3253(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field985;
        int var7 = var2.field986;
        int var8 = var2.field990;
        int var9 = field2743[var8 - var7];
        return field2742[var6] >> var7 & var9;
    }

    @ObfuscatedName("j.s(IIB)V")
    public static void method171(int arg0, int arg1) {
        class44 var2 = (class44) class44.field987.method3243((long) arg0);
        class44 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2516.method2811(14, arg0);
            class44 var5 = new class44();
            if (var4 != null) {
                var5.method822(new class111(var4));
            }
            class44.field987.method3253(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field985;
        int var8 = var3.field986;
        int var9 = var3.field990;
        int var10 = field2743[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2742[var7] = field2742[var7] & ~var11 | arg1 << var8 & var11;
    }
}
