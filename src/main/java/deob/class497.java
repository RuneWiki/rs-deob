package deob;

@ObfuscatedName("tj")
public class class497 {

    @ObfuscatedName("tj.ap")
    public static final int[] field5027 = new int[2048];

    @ObfuscatedName("tj.ae")
    public static final int[] field5030 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field5027[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field5030[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class497() throws Throwable {
        throw new Error();
    }
}
