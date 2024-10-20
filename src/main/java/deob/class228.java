package deob;

@ObfuscatedName("hw")
public class class228 {

    @ObfuscatedName("hw.c")
    public static int[] field2597 = new int[32];

    @ObfuscatedName("hw.q")
    public static int[] field2595;

    @ObfuscatedName("hw.m")
    public static int[] field2596;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2597[var1] = var0 - 1;
            var0 += var0;
        }
        field2595 = new int[2000];
        field2596 = new int[2000];
    }

    public class228() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.c(II)I")
    public static int method1611(int arg0) {
        class266 var1 = (class266) class266.field3361.method3654((long) arg0);
        class266 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3362.method4210(14, arg0);
            class266 var4 = new class266();
            if (var3 != null) {
                var4.method4556(new class185(var3));
            }
            class266.field3361.method3646(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3363;
        int var7 = var2.field3360;
        int var8 = var2.field3364;
        int var9 = field2597[var8 - var7];
        return field2596[var6] >> var7 & var9;
    }
}
