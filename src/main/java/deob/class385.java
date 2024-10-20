package deob;

@ObfuscatedName("nx")
public class class385 {

    @ObfuscatedName("nx.a")
    public static final int[] field4288 = new int[2048];

    @ObfuscatedName("nx.y")
    public static final int[] field4289 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4288[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4289[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class385() throws Throwable {
        throw new Error();
    }
}
