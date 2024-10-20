package deob;

@ObfuscatedName("ox")
public class class404 {

    @ObfuscatedName("ox.v")
    public static final int[] field4454 = new int[2048];

    @ObfuscatedName("ox.y")
    public static final int[] field4451 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4454[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4451[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class404() throws Throwable {
        throw new Error();
    }
}
