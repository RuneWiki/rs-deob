package deob;

@ObfuscatedName("sf")
public class class481 {

    @ObfuscatedName("sf.ap")
    public static final int[] field4829 = new int[2048];

    @ObfuscatedName("sf.ay")
    public static final int[] field4835 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4829[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4835[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class481() throws Throwable {
        throw new Error();
    }
}
