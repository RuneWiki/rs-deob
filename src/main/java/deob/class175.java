package deob;

@ObfuscatedName("fq")
public class class175 {

    @ObfuscatedName("fq.c")
    public static final boolean[] field2355 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @ObfuscatedName("fq.n")
    public static int[] field2356 = new int[99];

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field2356[var1] = var0 / 4;
        }
    }

    public class175() throws Throwable {
        throw new Error();
    }
}
