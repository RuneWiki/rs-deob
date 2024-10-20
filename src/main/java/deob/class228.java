package deob;

@ObfuscatedName("hj")
public class class228 {

    @ObfuscatedName("hj.f")
    public static int[] field2629 = new int[32];

    @ObfuscatedName("hj.l")
    public static int[] field2626;

    @ObfuscatedName("hj.w")
    public static int[] field2628;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2629[var1] = var0 - 1;
            var0 += var0;
        }
        field2626 = new int[2000];
        field2628 = new int[2000];
    }

    public class228() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.f(IB)I")
    public static int method2155(int arg0) {
        class266 var1 = (class266) class266.field3388.method3737((long) arg0);
        class266 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3393.method4289(14, arg0);
            class266 var4 = new class266();
            if (var3 != null) {
                var4.method4626(new class185(var3));
            }
            class266.field3388.method3744(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3389;
        int var7 = var2.field3391;
        int var8 = var2.field3392;
        int var9 = field2629[var8 - var7];
        return field2628[var6] >> var7 & var9;
    }
}
