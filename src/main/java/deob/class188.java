package deob;

@ObfuscatedName("go")
public class class188 {

    @ObfuscatedName("go.b")
    public static final int[] field2403 = new int[2048];

    @ObfuscatedName("go.c")
    public static final int[] field2406 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field2403[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field2406[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class188() throws Throwable {
        throw new Error();
    }
}
