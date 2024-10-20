package deob;

@ObfuscatedName("oc")
public class class402 {

    @ObfuscatedName("oc.o")
    public static final int[] field4399 = new int[2048];

    @ObfuscatedName("oc.r")
    public static final int[] field4400 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4399[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4400[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class402() throws Throwable {
        throw new Error();
    }
}
