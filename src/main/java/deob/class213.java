package deob;

@ObfuscatedName("hp")
public class class213 {

    @ObfuscatedName("hp.e")
    public static int[] field2584 = new int[32];

    @ObfuscatedName("hp.n")
    public static int[] field2583;

    @ObfuscatedName("hp.g")
    public static int[] field2585;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2584[var1] = var0 - 1;
            var0 += var0;
        }
        field2583 = new int[2000];
        field2585 = new int[2000];
    }

    public class213() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hf.e(II)I")
    public static int method3619(int arg0) {
        class252 var1 = (class252) class252.field3372.method3288((long) arg0);
        class252 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3377.method3817(14, arg0);
            class252 var4 = new class252();
            if (var3 != null) {
                var4.method4124(new class175(var3));
            }
            class252.field3372.method3278(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3371;
        int var7 = var2.field3374;
        int var8 = var2.field3375;
        int var9 = field2584[var8 - var7];
        return field2585[var6] >> var7 & var9;
    }

    @ObfuscatedName("m.n(III)V")
    public static void method108(int arg0, int arg1) {
        class252 var2 = (class252) class252.field3372.method3288((long) arg0);
        class252 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3377.method3817(14, arg0);
            class252 var5 = new class252();
            if (var4 != null) {
                var5.method4124(new class175(var4));
            }
            class252.field3372.method3278(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3371;
        int var8 = var3.field3374;
        int var9 = var3.field3375;
        int var10 = field2584[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2585[var7] = field2585[var7] & ~var11 | arg1 << var8 & var11;
    }
}
