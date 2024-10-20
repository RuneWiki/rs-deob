package deob;

@ObfuscatedName("qz")
public class class437 {

    @ObfuscatedName("qz.as")
    public static final int[] field4661 = new int[2048];

    @ObfuscatedName("qz.ay")
    public static final int[] field4662 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4661[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4662[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class437() throws Throwable {
        throw new Error();
    }
}
