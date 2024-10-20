package deob;

@ObfuscatedName("gx")
public class class188 {

    @ObfuscatedName("gx.m")
    public static final int[] field2437 = new int[2048];

    @ObfuscatedName("gx.d")
    public static final int[] field2438 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field2437[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field2438[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class188() throws Throwable {
        throw new Error();
    }
}
