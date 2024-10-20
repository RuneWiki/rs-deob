package deob;

@ObfuscatedName("nj")
public class class354 {

    @ObfuscatedName("nj.ah")
    public static final boolean[] field3870 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @ObfuscatedName("nj.ar")
    public static int[] field3871 = new int[99];

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field3871[var1] = var0 / 4;
        }
    }

    public class354() throws Throwable {
        throw new Error();
    }
}
