package deob;

@ObfuscatedName("hm")
public class class213 {

    @ObfuscatedName("hm.u")
    public static int[] field2529 = new int[32];

    @ObfuscatedName("hm.f")
    public static int[] field2530;

    @ObfuscatedName("hm.b")
    public static int[] field2531;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2529[var1] = var0 - 1;
            var0 += var0;
        }
        field2530 = new int[4000];
        field2531 = new int[4000];
    }

    public class213() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fr.u(II)I")
    public static int method3238(int arg0) {
        class249 var1 = (class249) class249.field3298.method3076((long) arg0);
        class249 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3302.method3928(14, arg0);
            class249 var4 = new class249();
            if (var3 != null) {
                var4.method4174(new class300(var3));
            }
            class249.field3298.method3078(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3297;
        int var7 = var2.field3296;
        int var8 = var2.field3300;
        int var9 = field2529[var8 - var7];
        return field2531[var6] >> var7 & var9;
    }

    @ObfuscatedName("fs.f(IIB)V")
    public static void method3228(int arg0, int arg1) {
        class249 var2 = (class249) class249.field3298.method3076((long) arg0);
        class249 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3302.method3928(14, arg0);
            class249 var5 = new class249();
            if (var4 != null) {
                var5.method4174(new class300(var4));
            }
            class249.field3298.method3078(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3297;
        int var8 = var3.field3296;
        int var9 = var3.field3300;
        int var10 = field2529[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2531[var7] = field2531[var7] & ~var11 | arg1 << var8 & var11;
    }
}
