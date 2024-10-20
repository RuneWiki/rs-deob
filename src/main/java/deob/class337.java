package deob;

@ObfuscatedName("lt")
public class class337 {

    @ObfuscatedName("lt.d")
    public static final int[] field4021 = new int[2048];

    @ObfuscatedName("lt.c")
    public static final int[] field4022 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4021[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4022[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class337() throws Throwable {
        throw new Error();
    }
}
