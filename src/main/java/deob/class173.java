package deob;

@ObfuscatedName("fn")
public class class173 {

    @ObfuscatedName("fn.g")
    public static final boolean[] field2351 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @ObfuscatedName("fn.x")
    public static int[] field2346 = new int[99];

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field2346[var1] = var0 / 4;
        }
    }

    public class173() throws Throwable {
        throw new Error();
    }
}
