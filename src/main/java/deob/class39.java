package deob;

@ObfuscatedName("dg")
public class class39 {

    @ObfuscatedName("dg.d")
    public static byte[][] field469 = new byte[50][];

    @ObfuscatedName("dg.b")
    public static int field467 = 0;

    @ObfuscatedName("dg.k")
    public static int field465 = 0;

    @ObfuscatedName("dg.h")
    public static int field464 = 0;

    @ObfuscatedName("dg.w")
    public static byte[][] field466 = new byte[1000][];

    @ObfuscatedName("dg.t")
    public static byte[][] field463 = new byte[250][];

    @ObfuscatedName("dg.b(IS)[B")
    public static synchronized byte[] method544(int arg0) {
        if (arg0 == 100 && field467 > 0) {
            byte[] var1 = field466[--field467];
            field466[field467] = null;
            return var1;
        } else if (arg0 == 5000 && field464 > 0) {
            byte[] var2 = field463[--field464];
            field463[field464] = null;
            return var2;
        } else if (arg0 == 30000 && field465 > 0) {
            byte[] var3 = field469[--field465];
            field469[field465] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }

    public class39() throws Throwable {
        throw new Error();
    }
}
