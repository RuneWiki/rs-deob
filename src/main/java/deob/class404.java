package deob;

@ObfuscatedName("ov")
public class class404 {

    @ObfuscatedName("ov.n")
    public static final int[] field4456 = new int[2048];

    @ObfuscatedName("ov.d")
    public static final int[] field4458 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4456[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4458[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class404() throws Throwable {
        throw new Error();
    }
}
