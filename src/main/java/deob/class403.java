package deob;

@ObfuscatedName("oo")
public class class403 {

    @ObfuscatedName("oo.s")
    public static final int[] field4281 = new int[2048];

    @ObfuscatedName("oo.u")
    public static final int[] field4280 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4281[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4280[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class403() throws Throwable {
        throw new Error();
    }
}
