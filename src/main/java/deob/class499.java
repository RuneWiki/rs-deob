package deob;

@ObfuscatedName("tm")
public class class499 {

    @ObfuscatedName("tm.as")
    public static final int[] field5051 = new int[2048];

    @ObfuscatedName("tm.aw")
    public static final int[] field5052 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field5051[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field5052[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class499() throws Throwable {
        throw new Error();
    }
}
