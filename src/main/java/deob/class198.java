package deob;

@ObfuscatedName("gb")
public class class198 {

    @ObfuscatedName("gb.x")
    public static final int[] field2589 = new int[2048];

    @ObfuscatedName("gb.y")
    public static final int[] field2596 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field2589[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field2596[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class198() throws Throwable {
        throw new Error();
    }
}
