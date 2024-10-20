package deob;

@ObfuscatedName("dl")
public class class46 {

    @ObfuscatedName("dl.b")
    public static int[] field522 = new int[99];

    @ObfuscatedName("dl.c")
    public static final boolean[] field524 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field522[var1] = var0 / 4;
        }
    }

    public class46() throws Throwable {
        throw new Error();
    }
}
