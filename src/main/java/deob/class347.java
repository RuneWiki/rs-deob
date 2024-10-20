package deob;

@ObfuscatedName("mp")
public class class347 {

    @ObfuscatedName("mp.m")
    public static final int[] field4051 = new int[2048];

    @ObfuscatedName("mp.n")
    public static final int[] field4054 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4051[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4054[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class347() throws Throwable {
        throw new Error();
    }
}
