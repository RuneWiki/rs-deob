package deob;

@ObfuscatedName("ez")
public class class155 {

    @ObfuscatedName("ez.p")
    public static int field2101 = 0;

    @ObfuscatedName("ez.g")
    public static int field2100 = 0;

    @ObfuscatedName("ez.x")
    public static int field2099 = 0;

    @ObfuscatedName("ez.q")
    public static byte[][] field2102 = new byte[1000][];

    @ObfuscatedName("ez.d")
    public static byte[][] field2103 = new byte[250][];

    @ObfuscatedName("ez.k")
    public static byte[][] field2104 = new byte[50][];

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ez.p(II)[B")
    public static synchronized byte[] method2785(int arg0) {
        if (arg0 == 100 && field2101 > 0) {
            byte[] var1 = field2102[--field2101];
            field2102[field2101] = null;
            return var1;
        } else if (arg0 == 5000 && field2100 > 0) {
            byte[] var2 = field2103[--field2100];
            field2103[field2100] = null;
            return var2;
        } else if (arg0 == 30000 && field2099 > 0) {
            byte[] var3 = field2104[--field2099];
            field2104[field2099] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
