package deob;

@ObfuscatedName("lc")
public class class337 {

    @ObfuscatedName("lc.i")
    public static final int[] field4020 = new int[2048];

    @ObfuscatedName("lc.c")
    public static final int[] field4024 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4020[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4024[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class337() throws Throwable {
        throw new Error();
    }
}
