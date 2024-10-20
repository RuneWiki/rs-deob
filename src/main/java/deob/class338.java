package deob;

@ObfuscatedName("ls")
public class class338 {

    @ObfuscatedName("ls.m")
    public static final int[] field4017 = new int[2048];

    @ObfuscatedName("ls.p")
    public static final int[] field4026 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4017[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4026[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class338() throws Throwable {
        throw new Error();
    }
}
