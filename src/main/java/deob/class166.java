package deob;

@ObfuscatedName("ff")
public class class166 {

    @ObfuscatedName("ff.o")
    public static int[] field2177 = new int[32];

    @ObfuscatedName("ff.m")
    public static int[] field2173;

    @ObfuscatedName("ff.b")
    public static int[] field2174;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2177[var1] = var0 - 1;
            var0 += var0;
        }
        field2173 = new int[2000];
        field2174 = new int[2000];
    }

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.o(II)I")
    public static int method162(int arg0) {
        class195 var1 = (class195) class195.field2848.method2130((long) arg0);
        class195 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2852.method3012(14, arg0);
            class195 var4 = new class195();
            if (var3 != null) {
                var4.method3253(new class154(var3));
            }
            class195.field2848.method2132(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field2851;
        int var7 = var2.field2850;
        int var8 = var2.field2847;
        int var9 = field2177[var8 - var7];
        return field2174[var6] >> var7 & var9;
    }
}
