package deob;

@ObfuscatedName("go")
public class class186 {

    @ObfuscatedName("go.a")
    public static final int[] field2388 = new int[2048];

    @ObfuscatedName("go.l")
    public static final int[] field2389 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field2388[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field2389[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class186() throws Throwable {
        throw new Error();
    }
}
