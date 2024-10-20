package deob;

@ObfuscatedName("fo")
public class class166 {

    @ObfuscatedName("fo.p")
    public static int[] field2163 = new int[32];

    @ObfuscatedName("fo.g")
    public static int[] field2160;

    @ObfuscatedName("fo.x")
    public static int[] field2159;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2163[var1] = var0 - 1;
            var0 += var0;
        }
        field2160 = new int[2000];
        field2159 = new int[2000];
    }

    public class166() throws Throwable {
        throw new Error();
    }
}
