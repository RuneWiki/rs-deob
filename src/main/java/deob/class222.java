package deob;

@ObfuscatedName("hd")
public class class222 {

    @ObfuscatedName("hd.t")
    public static final boolean[] field2728 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @ObfuscatedName("hd.n")
    public static int[] field2729 = new int[99];

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field2729[var1] = var0 / 4;
        }
    }

    public class222() throws Throwable {
        throw new Error();
    }
}
