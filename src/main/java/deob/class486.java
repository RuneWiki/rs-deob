package deob;

@ObfuscatedName("sw")
public class class486 {

    @ObfuscatedName("sw.ai")
    public static final int[] field4927 = new int[2048];

    @ObfuscatedName("sw.ax")
    public static final int[] field4928 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4927[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4928[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class486() throws Throwable {
        throw new Error();
    }
}
