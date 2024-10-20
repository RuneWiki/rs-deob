package deob;

@ObfuscatedName("mu")
public class class362 {

    @ObfuscatedName("mu.e")
    public static final int[] field4042 = new int[2048];

    @ObfuscatedName("mu.l")
    public static final int[] field4039 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4042[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4039[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class362() throws Throwable {
        throw new Error();
    }
}
