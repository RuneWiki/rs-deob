package deob;

@ObfuscatedName("fv")
public class class167 {

    @ObfuscatedName("fv.n")
    public static int[] field2812 = new int[32];

    @ObfuscatedName("fv.o")
    public static int[] field2810;

    @ObfuscatedName("fv.a")
    public static int[] field2811;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2812[var1] = var0 - 1;
            var0 += var0;
        }
        field2810 = new int[2000];
        field2811 = new int[2000];
    }

    public class167() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.n(II)I")
    public static int method792(int arg0) {
        class44 var1 = class44.method3574(arg0);
        int var2 = var1.field1027;
        int var3 = var1.field1033;
        int var4 = var1.field1028;
        int var5 = field2812[var4 - var3];
        return field2811[var2] >> var3 & var5;
    }
}
