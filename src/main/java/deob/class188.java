package deob;

@ObfuscatedName("gb")
public class class188 {

    @ObfuscatedName("gb.s")
    public static final int[] field2399 = new int[2048];

    @ObfuscatedName("gb.v")
    public static final int[] field2398 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field2399[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field2398[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class188() throws Throwable {
        throw new Error();
    }
}
