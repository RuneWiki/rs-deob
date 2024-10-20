package deob;

@ObfuscatedName("fw")
public class class175 {

    @ObfuscatedName("fw.i")
    public static int field2421 = 0;

    @ObfuscatedName("fw.c")
    public static int field2416 = 0;

    @ObfuscatedName("fw.e")
    public static int field2418 = 0;

    @ObfuscatedName("fw.v")
    public static byte[][] field2422 = new byte[1000][];

    @ObfuscatedName("fw.b")
    public static byte[][] field2420 = new byte[250][];

    @ObfuscatedName("fw.y")
    public static byte[][] field2419 = new byte[50][];

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fw.i(II)[B")
    public static synchronized byte[] method3078(int arg0) {
        if (arg0 == 100 && field2421 > 0) {
            byte[] var1 = field2422[--field2421];
            field2422[field2421] = null;
            return var1;
        } else if (arg0 == 5000 && field2416 > 0) {
            byte[] var2 = field2420[--field2416];
            field2420[field2416] = null;
            return var2;
        } else if (arg0 == 30000 && field2418 > 0) {
            byte[] var3 = field2419[--field2418];
            field2419[field2418] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
