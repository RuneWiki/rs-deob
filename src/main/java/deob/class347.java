package deob;

@ObfuscatedName("mc")
public class class347 {

    @ObfuscatedName("mc.e")
    public static final int[] field4044 = new int[2048];

    @ObfuscatedName("mc.s")
    public static final int[] field4048 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4044[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4048[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class347() throws Throwable {
        throw new Error();
    }
}
