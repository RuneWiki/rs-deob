package deob;

@ObfuscatedName("oz")
public class class402 {

    @ObfuscatedName("oz.n")
    public static final int[] field4285 = new int[2048];

    @ObfuscatedName("oz.l")
    public static final int[] field4286 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4285[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4286[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class402() throws Throwable {
        throw new Error();
    }
}
