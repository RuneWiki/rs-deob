package deob;

@ObfuscatedName("gm")
public class class198 {

    @ObfuscatedName("gm.r")
    public static final int[] field2590 = new int[2048];

    @ObfuscatedName("gm.d")
    public static final int[] field2591 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field2590[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field2591[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class198() throws Throwable {
        throw new Error();
    }
}
