package deob;

@ObfuscatedName("ow")
public class class404 {

    @ObfuscatedName("ow.d")
    public static final int[] field4297 = new int[2048];

    @ObfuscatedName("ow.z")
    public static final int[] field4299 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4297[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4299[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class404() throws Throwable {
        throw new Error();
    }
}
