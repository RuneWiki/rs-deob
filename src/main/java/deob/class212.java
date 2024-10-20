package deob;

@ObfuscatedName("hx")
public class class212 {

    @ObfuscatedName("hx.w")
    public static int[] field2597 = new int[32];

    @ObfuscatedName("hx.s")
    public static int[] field2598;

    @ObfuscatedName("hx.q")
    public static int[] field2599;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2597[var1] = var0 - 1;
            var0 += var0;
        }
        field2598 = new int[2000];
        field2599 = new int[2000];
    }

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.s(IIB)V")
    public static void method2004(int arg0, int arg1) {
        class251 var2 = (class251) class251.field3378.method3357((long) arg0);
        class251 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3380.method3876(14, arg0);
            class251 var5 = new class251();
            if (var4 != null) {
                var5.method4165(new class174(var4));
            }
            class251.field3378.method3371(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3379;
        int var8 = var3.field3381;
        int var9 = var3.field3382;
        int var10 = field2597[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2599[var7] = field2599[var7] & ~var11 | arg1 << var8 & var11;
    }
}
