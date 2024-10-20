package deob;

@ObfuscatedName("sh")
public class class485 {

    @ObfuscatedName("sh.aj")
    public static final int[] field4896 = new int[2048];

    @ObfuscatedName("sh.af")
    public static final int[] field4898 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4896[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4898[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class485() throws Throwable {
        throw new Error();
    }
}
