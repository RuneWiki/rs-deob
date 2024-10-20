package deob;

@ObfuscatedName("ph")
public class class433 {

    @ObfuscatedName("ph.k")
    public static final int[] field4698 = new int[2048];

    @ObfuscatedName("ph.c")
    public static final int[] field4699 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4698[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4699[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class433() throws Throwable {
        throw new Error();
    }
}
