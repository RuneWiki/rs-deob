package deob;

@ObfuscatedName("py")
public class class426 {

    @ObfuscatedName("py.b")
    public static final int[] field4673 = new int[2048];

    @ObfuscatedName("py.j")
    public static final int[] field4674 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4673[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4674[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class426() throws Throwable {
        throw new Error();
    }
}
