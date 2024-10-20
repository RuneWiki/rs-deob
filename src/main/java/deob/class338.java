package deob;

@ObfuscatedName("li")
public class class338 {

    @ObfuscatedName("li.f")
    public static final int[] field4047 = new int[2048];

    @ObfuscatedName("li.m")
    public static final int[] field4048 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4047[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4048[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class338() throws Throwable {
        throw new Error();
    }
}
