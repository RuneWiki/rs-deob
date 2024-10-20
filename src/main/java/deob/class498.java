package deob;

@ObfuscatedName("tx")
public class class498 {

    @ObfuscatedName("tx.az")
    public static final int[] field5061 = new int[2048];

    @ObfuscatedName("tx.ax")
    public static final int[] field5055 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field5061[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field5055[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class498() throws Throwable {
        throw new Error();
    }
}
