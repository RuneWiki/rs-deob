package deob;

@ObfuscatedName("gd")
public class class188 {

    @ObfuscatedName("gd.i")
    public static final int[] field2432 = new int[2048];

    @ObfuscatedName("gd.p")
    public static final int[] field2433 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field2432[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field2433[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class188() throws Throwable {
        throw new Error();
    }
}
