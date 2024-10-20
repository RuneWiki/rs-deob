package deob;

@ObfuscatedName("mo")
public class class348 {

    @ObfuscatedName("mo.t")
    public static final int[] field4057 = new int[2048];

    @ObfuscatedName("mo.e")
    public static final int[] field4060 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4057[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4060[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class348() throws Throwable {
        throw new Error();
    }
}
