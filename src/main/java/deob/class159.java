package deob;

@ObfuscatedName("fm")
public class class159 {

    @ObfuscatedName("fm.e")
    public static final boolean[] field2337 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @ObfuscatedName("fm.n")
    public static int[] field2341 = new int[99];

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field2341[var1] = var0 / 4;
        }
    }

    public class159() throws Throwable {
        throw new Error();
    }
}
