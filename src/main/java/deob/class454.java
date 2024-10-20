package deob;

@ObfuscatedName("rt")
public class class454 {

    @ObfuscatedName("rt.aj")
    public static final int[] field4736 = new int[2048];

    @ObfuscatedName("rt.ad")
    public static final int[] field4734 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4736[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4734[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class454() throws Throwable {
        throw new Error();
    }
}
