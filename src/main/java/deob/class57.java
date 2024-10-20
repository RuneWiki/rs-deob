package deob;

@ObfuscatedName("bz")
public class class57 {

    @ObfuscatedName("bz.t")
    public static int field741 = 0;

    @ObfuscatedName("bz.n")
    public static int field738 = 0;

    @ObfuscatedName("bz.q")
    public static int field739 = 0;

    @ObfuscatedName("bz.h")
    public static byte[][] field740 = new byte[1000][];

    @ObfuscatedName("bz.k")
    public static byte[][] field742 = new byte[250][];

    @ObfuscatedName("bz.r")
    public static byte[][] field737 = new byte[50][];

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.t(II)[B")
    public static synchronized byte[] method743(int arg0) {
        if (arg0 == 100 && field741 > 0) {
            byte[] var1 = field740[--field741];
            field740[field741] = null;
            return var1;
        } else if (arg0 == 5000 && field738 > 0) {
            byte[] var2 = field742[--field738];
            field742[field738] = null;
            return var2;
        } else if (arg0 == 30000 && field739 > 0) {
            byte[] var3 = field737[--field739];
            field737[field739] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
