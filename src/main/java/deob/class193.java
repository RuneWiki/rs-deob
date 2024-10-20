package deob;

@ObfuscatedName("ga")
public class class193 {

    @ObfuscatedName("ga.d")
    public static final int[] field2444 = new int[2048];

    @ObfuscatedName("ga.t")
    public static final int[] field2443 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field2444[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field2443[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class193() throws Throwable {
        throw new Error();
    }
}
