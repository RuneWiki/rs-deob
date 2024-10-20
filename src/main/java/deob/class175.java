package deob;

@ObfuscatedName("fh")
public class class175 {

    @ObfuscatedName("fh.d")
    public static int field2415 = 0;

    @ObfuscatedName("fh.k")
    public static int field2413 = 0;

    @ObfuscatedName("fh.e")
    public static int field2418 = 0;

    @ObfuscatedName("fh.p")
    public static byte[][] field2416 = new byte[1000][];

    @ObfuscatedName("fh.q")
    public static byte[][] field2417 = new byte[250][];

    @ObfuscatedName("fh.s")
    public static byte[][] field2414 = new byte[50][];

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fh.d(IB)[B")
    public static synchronized byte[] method3182(int arg0) {
        if (arg0 == 100 && field2415 > 0) {
            byte[] var1 = field2416[--field2415];
            field2416[field2415] = null;
            return var1;
        } else if (arg0 == 5000 && field2413 > 0) {
            byte[] var2 = field2417[--field2413];
            field2417[field2413] = null;
            return var2;
        } else if (arg0 == 30000 && field2418 > 0) {
            byte[] var3 = field2414[--field2418];
            field2414[field2418] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
