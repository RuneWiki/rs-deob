package deob;

@ObfuscatedName("mq")
public class class323 {

    @ObfuscatedName("mq.aw")
    public static int[] field3534 = new int[32];

    @ObfuscatedName("mq.ay")
    public static int[] field3531;

    @ObfuscatedName("mq.ar")
    public static int[] field3532;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3534[var1] = var0 - 1;
            var0 += var0;
        }
        field3531 = new int[4000];
        field3532 = new int[4000];
    }

    public class323() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jt.aw(IB)I")
    public static int method4655(int arg0) {
        class202 var1 = (class202) class202.field2091.method5152((long) arg0);
        class202 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2092.method6117(14, arg0);
            class202 var4 = new class202();
            if (var3 != null) {
                var4.method3480(new class514(var3));
            }
            class202.field2091.method5149(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field2090;
        int var7 = var2.field2088;
        int var8 = var2.field2089;
        int var9 = field3534[var8 - var7];
        return field3532[var6] >> var7 & var9;
    }

    @ObfuscatedName("gj.ay(IIB)V")
    public static void method3114(int arg0, int arg1) {
        class202 var2 = (class202) class202.field2091.method5152((long) arg0);
        class202 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2092.method6117(14, arg0);
            class202 var5 = new class202();
            if (var4 != null) {
                var5.method3480(new class514(var4));
            }
            class202.field2091.method5149(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field2090;
        int var8 = var3.field2088;
        int var9 = var3.field2089;
        int var10 = field3534[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field3532[var7] = field3532[var7] & ~var11 | arg1 << var8 & var11;
    }
}
