package deob;

@ObfuscatedName("mg")
public class class347 {

    @ObfuscatedName("mg.x")
    public static final int[] field3952 = new int[2048];

    @ObfuscatedName("mg.r")
    public static final int[] field3954 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field3952[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field3954[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class347() throws Throwable {
        throw new Error();
    }
}
