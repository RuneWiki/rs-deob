package deob;

@ObfuscatedName("ly")
public class class337 {

    @ObfuscatedName("ly.d")
    public static final int[] field4023 = new int[2048];

    @ObfuscatedName("ly.m")
    public static final int[] field4018 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4023[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4018[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class337() throws Throwable {
        throw new Error();
    }
}
