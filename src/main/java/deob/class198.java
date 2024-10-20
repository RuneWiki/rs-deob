package deob;

@ObfuscatedName("gp")
public class class198 {

    @ObfuscatedName("gp.x")
    public static final int[] field2597 = new int[2048];

    @ObfuscatedName("gp.m")
    public static final int[] field2594 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field2597[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field2594[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class198() throws Throwable {
        throw new Error();
    }
}
