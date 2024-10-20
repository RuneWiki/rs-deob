package deob;

@ObfuscatedName("oc")
public class class403 {

    @ObfuscatedName("oc.i")
    public static final int[] field4450 = new int[2048];

    @ObfuscatedName("oc.s")
    public static final int[] field4451 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4450[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4451[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class403() throws Throwable {
        throw new Error();
    }
}
