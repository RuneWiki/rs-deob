package deob;

@ObfuscatedName("dm")
public class class45 {

    @ObfuscatedName("dm.k")
    public static int[] field496 = new int[99];

    @ObfuscatedName("dm.h")
    public static final boolean[] field495 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    public class45() throws Throwable {
        throw new Error();
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field496[var1] = var0 / 4;
        }
    }
}
