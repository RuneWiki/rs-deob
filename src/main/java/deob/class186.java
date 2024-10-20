package deob;

@ObfuscatedName("ge")
public class class186 {

    @ObfuscatedName("ge.e")
    public static final int[] field2362 = new int[2048];

    @ObfuscatedName("ge.p")
    public static final int[] field2363 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field2362[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field2363[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class186() throws Throwable {
        throw new Error();
    }
}
