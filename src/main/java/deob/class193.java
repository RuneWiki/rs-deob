package deob;

@ObfuscatedName("gm")
public class class193 {

    @ObfuscatedName("gm.b")
    public static final int[] field2448 = new int[2048];

    @ObfuscatedName("gm.n")
    public static final int[] field2449 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field2448[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field2449[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class193() throws Throwable {
        throw new Error();
    }
}
