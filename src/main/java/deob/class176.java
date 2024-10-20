package deob;

@ObfuscatedName("fa")
public class class176 {

    @ObfuscatedName("fa.i")
    public static int[] field2893 = new int[32];

    @ObfuscatedName("fa.v")
    public static int[] field2894;

    @ObfuscatedName("fa.f")
    public static int[] field2895;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2893[var1] = var0 - 1;
            var0 += var0;
        }
        field2894 = new int[2000];
        field2895 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }
}
