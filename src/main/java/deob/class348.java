package deob;

@ObfuscatedName("mj")
public class class348 {

    @ObfuscatedName("mj.z")
    public static final int[] field4061 = new int[2048];

    @ObfuscatedName("mj.u")
    public static final int[] field4063 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4061[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4063[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class348() throws Throwable {
        throw new Error();
    }
}
