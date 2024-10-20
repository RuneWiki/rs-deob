package deob;

@ObfuscatedName("gt")
public class class198 {

    @ObfuscatedName("gt.g")
    public static final int[] field2578 = new int[2048];

    @ObfuscatedName("gt.n")
    public static final int[] field2579 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field2578[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field2579[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class198() throws Throwable {
        throw new Error();
    }
}
