package deob;

@ObfuscatedName("hs")
public class class223 {

    @ObfuscatedName("hs.a")
    public static int[] field2721 = new int[32];

    @ObfuscatedName("hs.w")
    public static int[] field2722;

    @ObfuscatedName("hs.e")
    public static int[] field2723;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2721[var1] = var0 - 1;
            var0 += var0;
        }
        field2722 = new int[2000];
        field2723 = new int[2000];
    }

    public class223() throws Throwable {
        throw new Error();
    }
}
