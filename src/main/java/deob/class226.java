package deob;

@ObfuscatedName("ha")
public class class226 {

    @ObfuscatedName("ha.w")
    public static int[] field2580 = new int[32];

    @ObfuscatedName("ha.m")
    public static int[] field2577;

    @ObfuscatedName("ha.q")
    public static int[] field2579;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2580[var1] = var0 - 1;
            var0 += var0;
        }
        field2577 = new int[2000];
        field2579 = new int[2000];
    }

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ek.w(II)I")
    public static int method2926(int arg0) {
        class264 var1 = (class264) class264.field3339.method3707((long) arg0);
        class264 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3338.method4250(14, arg0);
            class264 var4 = new class264();
            if (var3 != null) {
                var4.method4558(new class183(var3));
            }
            class264.field3339.method3712(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3343;
        int var7 = var2.field3340;
        int var8 = var2.field3342;
        int var9 = field2580[var8 - var7];
        return field2579[var6] >> var7 & var9;
    }
}
