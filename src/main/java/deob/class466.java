package deob;

@ObfuscatedName("rw")
public class class466 {

    @ObfuscatedName("rw.al")
    public static final int[] field4794 = new int[2048];

    @ObfuscatedName("rw.an")
    public static final int[] field4790 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field4794[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field4790[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class466() throws Throwable {
        throw new Error();
    }
}
