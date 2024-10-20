package deob;

@ObfuscatedName("hz")
public class class228 {

    @ObfuscatedName("hz.f")
    public static int[] field2616 = new int[32];

    @ObfuscatedName("hz.h")
    public static int[] field2615;

    @ObfuscatedName("hz.e")
    public static int[] field2617;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2616[var1] = var0 - 1;
            var0 += var0;
        }
        field2615 = new int[2000];
        field2617 = new int[2000];
    }

    public class228() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.f(IB)I")
    public static int method148(int arg0) {
        class266 var1 = (class266) class266.field3377.method3724((long) arg0);
        class266 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field4.method4267(14, arg0);
            class266 var4 = new class266();
            if (var3 != null) {
                var4.method4580(new class185(var3));
            }
            class266.field3377.method3723(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3381;
        int var7 = var2.field3378;
        int var8 = var2.field3379;
        int var9 = field2616[var8 - var7];
        return field2617[var6] >> var7 & var9;
    }

    @ObfuscatedName("ea.h(IIS)V")
    public static void method3037(int arg0, int arg1) {
        class266 var2 = (class266) class266.field3377.method3724((long) arg0);
        class266 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field4.method4267(14, arg0);
            class266 var5 = new class266();
            if (var4 != null) {
                var5.method4580(new class185(var4));
            }
            class266.field3377.method3723(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3381;
        int var8 = var3.field3378;
        int var9 = var3.field3379;
        int var10 = field2616[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2617[var7] = field2617[var7] & ~var11 | arg1 << var8 & var11;
    }
}
