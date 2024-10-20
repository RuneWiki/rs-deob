package deob;

@ObfuscatedName("kr")
public class class300 {

    @ObfuscatedName("kr.p")
    public static final boolean[] field3587 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @ObfuscatedName("kr.f")
    public static int[] field3588 = new int[99];

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field3588[var1] = var0 / 4;
        }
    }

    public class300() throws Throwable {
        throw new Error();
    }
}
