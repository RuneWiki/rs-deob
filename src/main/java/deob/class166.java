package deob;

@ObfuscatedName("fh")
public class class166 {

    @ObfuscatedName("fh.u")
    public static int[] field2150 = new int[32];

    @ObfuscatedName("fh.x")
    public static int[] field2149;

    @ObfuscatedName("fh.i")
    public static int[] field2147;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2150[var1] = var0 - 1;
            var0 += var0;
        }
        field2149 = new int[2000];
        field2147 = new int[2000];
    }

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cx.u(II)I")
    public static int method1810(int arg0) {
        class195 var1 = Statics.method1095(arg0);
        int var2 = var1.field2834;
        int var3 = var1.field2832;
        int var4 = var1.field2836;
        int var5 = field2150[var4 - var3];
        return field2147[var2] >> var3 & var5;
    }
}
