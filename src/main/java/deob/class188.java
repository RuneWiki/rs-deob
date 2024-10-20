package deob;

@ObfuscatedName("gs")
public class class188 {

    @ObfuscatedName("gs.g")
    public static final int[] field2422 = new int[2048];

    @ObfuscatedName("gs.a")
    public static final int[] field2423 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field2422[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field2423[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class188() throws Throwable {
        throw new Error();
    }
}
