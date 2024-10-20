package deob;

@ObfuscatedName("ex")
public class class154 {

    @ObfuscatedName("ex.t")
    public static int[] field2641 = new int[32];

    @ObfuscatedName("ex.o")
    public static int[] field2644;

    @ObfuscatedName("ex.i")
    public static int[] field2642;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2641[var1] = var0 - 1;
            var0 += var0;
        }
        field2644 = new int[2000];
        field2642 = new int[2000];
    }

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.o(III)V")
    public static void method116(int arg0, int arg1) {
        class42 var2 = (class42) class42.field968.method3099((long) arg0);
        class42 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field969.method2668(14, arg0);
            class42 var5 = new class42();
            if (var4 != null) {
                var5.method806(new class107(var4));
            }
            class42.field968.method3101(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field967;
        int var8 = var3.field970;
        int var9 = var3.field971;
        int var10 = field2641[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2642[var7] = field2642[var7] & ~var11 | arg1 << var8 & var11;
    }
}
