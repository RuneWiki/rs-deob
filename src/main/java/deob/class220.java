package deob;

@ObfuscatedName("hw")
public class class220 {

    @ObfuscatedName("hw.f")
    public static int[] field2580 = new int[32];

    @ObfuscatedName("hw.o")
    public static int[] field2579;

    @ObfuscatedName("hw.u")
    public static int[] field2578;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2580[var1] = var0 - 1;
            var0 += var0;
        }
        field2579 = new int[4000];
        field2578 = new int[4000];
    }

    public class220() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.f(IB)I")
    public static int method29(int arg0) {
        class291 var1 = (class291) class291.field3546.method3398((long) arg0);
        class291 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3547.method3933(14, arg0);
            class291 var4 = new class291();
            if (var3 != null) {
                var4.method4505(new class382(var3));
            }
            class291.field3546.method3400(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3552;
        int var7 = var2.field3548;
        int var8 = var2.field3549;
        int var9 = field2580[var8 - var7];
        return field2578[var6] >> var7 & var9;
    }

    @ObfuscatedName("lr.o(III)V")
    public static void method5313(int arg0, int arg1) {
        class291 var2 = (class291) class291.field3546.method3398((long) arg0);
        class291 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3547.method3933(14, arg0);
            class291 var5 = new class291();
            if (var4 != null) {
                var5.method4505(new class382(var4));
            }
            class291.field3546.method3400(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3552;
        int var8 = var3.field3548;
        int var9 = var3.field3549;
        int var10 = field2580[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2578[var7] = field2578[var7] & ~var11 | arg1 << var8 & var11;
    }
}
