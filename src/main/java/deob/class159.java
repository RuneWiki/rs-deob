package deob;

@ObfuscatedName("ff")
public class class159 {

    @ObfuscatedName("ff.d")
    public static int[] field2717 = new int[32];

    @ObfuscatedName("ff.g")
    public static int[] field2714;

    @ObfuscatedName("ff.a")
    public static int[] field2715;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2717[var1] = var0 - 1;
            var0 += var0;
        }
        field2714 = new int[2000];
        field2715 = new int[2000];
    }

    public class159() throws Throwable {
        throw new Error();
    }
}
