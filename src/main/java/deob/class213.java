package deob;

@ObfuscatedName("hq")
public class class213 {

    @ObfuscatedName("hq.j")
    public static int[] field2603 = new int[32];

    @ObfuscatedName("hq.h")
    public static int[] field2606;

    @ObfuscatedName("hq.f")
    public static int[] field2604;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2603[var1] = var0 - 1;
            var0 += var0;
        }
        field2606 = new int[2000];
        field2604 = new int[2000];
    }

    public class213() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.j(II)I")
    public static int method13(int arg0) {
        class252 var1 = (class252) class252.field3368.method3271((long) arg0);
        class252 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3371.method3773(14, arg0);
            class252 var4 = new class252();
            if (var3 != null) {
                var4.method4087(new class175(var3));
            }
            class252.field3368.method3270(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3367;
        int var7 = var2.field3370;
        int var8 = var2.field3369;
        int var9 = field2603[var8 - var7];
        return field2604[var6] >> var7 & var9;
    }

    @ObfuscatedName("ao.h(IIB)V")
    public static void method219(int arg0, int arg1) {
        class252 var2 = (class252) class252.field3368.method3271((long) arg0);
        class252 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3371.method3773(14, arg0);
            class252 var5 = new class252();
            if (var4 != null) {
                var5.method4087(new class175(var4));
            }
            class252.field3368.method3270(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3367;
        int var8 = var3.field3370;
        int var9 = var3.field3369;
        int var10 = field2603[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2604[var7] = field2604[var7] & ~var11 | arg1 << var8 & var11;
    }
}
