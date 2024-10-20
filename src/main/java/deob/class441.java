package deob;

@ObfuscatedName("qm")
public class class441 {

    @ObfuscatedName("qm.ax")
    public static final int[] field4722 = new int[2048];

    @ObfuscatedName("qm.ai")
    public static final int[] field4728 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4722[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4728[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class441() throws Throwable {
        throw new Error();
    }
}
