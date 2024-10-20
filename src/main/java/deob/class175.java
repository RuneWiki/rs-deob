package deob;

@ObfuscatedName("fw")
public class class175 {

    @ObfuscatedName("fw.p")
    public static int field2421 = 0;

    @ObfuscatedName("fw.m")
    public static int field2418 = 0;

    @ObfuscatedName("fw.e")
    public static int field2419 = 0;

    @ObfuscatedName("fw.t")
    public static byte[][] field2420 = new byte[1000][];

    @ObfuscatedName("fw.w")
    public static byte[][] field2417 = new byte[250][];

    @ObfuscatedName("fw.z")
    public static byte[][] field2422 = new byte[50][];

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fw.p(II)[B")
    public static synchronized byte[] method3025(int arg0) {
        if (arg0 == 100 && field2421 > 0) {
            byte[] var1 = field2420[--field2421];
            field2420[field2421] = null;
            return var1;
        } else if (arg0 == 5000 && field2418 > 0) {
            byte[] var2 = field2417[--field2418];
            field2417[field2418] = null;
            return var2;
        } else if (arg0 == 30000 && field2419 > 0) {
            byte[] var3 = field2422[--field2419];
            field2422[field2419] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
