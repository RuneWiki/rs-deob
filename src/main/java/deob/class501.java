package deob;

@ObfuscatedName("ti")
public class class501 {

    @ObfuscatedName("ti.ap")
    public static final int[] field5103 = new int[2048];

    @ObfuscatedName("ti.ab")
    public static final int[] field5104 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field5103[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field5104[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class501() throws Throwable {
        throw new Error();
    }
}
