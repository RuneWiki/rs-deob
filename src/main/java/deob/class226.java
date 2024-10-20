package deob;

@ObfuscatedName("hy")
public class class226 {

    @ObfuscatedName("hy.z")
    public static int[] field2558 = new int[32];

    @ObfuscatedName("hy.w")
    public static int[] field2560;

    @ObfuscatedName("hy.s")
    public static int[] field2559;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2558[var1] = var0 - 1;
            var0 += var0;
        }
        field2560 = new int[2000];
        field2559 = new int[2000];
    }

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fc.z(II)I")
    public static int method3095(int arg0) {
        class264 var1 = (class264) class264.field3322.method3681((long) arg0);
        class264 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3323.method4247(14, arg0);
            class264 var4 = new class264();
            if (var3 != null) {
                var4.method4550(new class183(var3));
            }
            class264.field3322.method3675(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3321;
        int var7 = var2.field3324;
        int var8 = var2.field3327;
        int var9 = field2558[var8 - var7];
        return field2559[var6] >> var7 & var9;
    }

    @ObfuscatedName("bc.w(III)V")
    public static void method1578(int arg0, int arg1) {
        class264 var2 = (class264) class264.field3322.method3681((long) arg0);
        class264 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3323.method4247(14, arg0);
            class264 var5 = new class264();
            if (var4 != null) {
                var5.method4550(new class183(var4));
            }
            class264.field3322.method3675(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3321;
        int var8 = var3.field3324;
        int var9 = var3.field3327;
        int var10 = field2558[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2559[var7] = field2559[var7] & ~var11 | arg1 << var8 & var11;
    }
}
