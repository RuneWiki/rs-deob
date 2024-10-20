package deob;

@ObfuscatedName("oh")
public class class405 {

    @ObfuscatedName("oh.x")
    public static final int[] field4493 = new int[2048];

    @ObfuscatedName("oh.j")
    public static final int[] field4494 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4493[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4494[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class405() throws Throwable {
        throw new Error();
    }
}
