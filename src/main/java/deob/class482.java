package deob;

@ObfuscatedName("sh")
public class class482 {

    @ObfuscatedName("sh.ad")
    public static final int[] field4865 = new int[2048];

    @ObfuscatedName("sh.ax")
    public static final int[] field4863 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4865[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4863[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class482() throws Throwable {
        throw new Error();
    }
}
