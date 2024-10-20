package deob;

@ObfuscatedName("rd")
public class class467 {

    @ObfuscatedName("rd.ah")
    public static final int[] field4791 = new int[2048];

    @ObfuscatedName("rd.ax")
    public static final int[] field4792 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4791[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4792[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class467() throws Throwable {
        throw new Error();
    }
}
