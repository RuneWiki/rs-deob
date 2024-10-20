package deob;

@ObfuscatedName("pm")
public class class423 {

    @ObfuscatedName("pm.r")
    public static final int[] field4624 = new int[2048];

    @ObfuscatedName("pm.l")
    public static final int[] field4618 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4624[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4618[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class423() throws Throwable {
        throw new Error();
    }
}
