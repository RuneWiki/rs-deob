package deob;

@ObfuscatedName("hv")
public class class223 {

    @ObfuscatedName("hv.w")
    public static final boolean[] field2845 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @ObfuscatedName("hv.a")
    public static int[] field2846 = new int[99];

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field2846[var1] = var0 / 4;
        }
    }

    public class223() throws Throwable {
        throw new Error();
    }
}
