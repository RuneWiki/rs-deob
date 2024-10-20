package deob;

@ObfuscatedName("nk")
public class class380 {

    @ObfuscatedName("nk.r")
    public static final int[] field4239 = new int[2048];

    @ObfuscatedName("nk.o")
    public static final int[] field4245 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4239[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4245[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class380() throws Throwable {
        throw new Error();
    }
}
