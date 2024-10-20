package deob;

@ObfuscatedName("lr")
public class class337 {

    @ObfuscatedName("lr.d")
    public static final int[] field4023 = new int[2048];

    @ObfuscatedName("lr.f")
    public static final int[] field4016 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4023[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4016[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class337() throws Throwable {
        throw new Error();
    }
}
