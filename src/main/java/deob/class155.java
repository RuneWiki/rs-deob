package deob;

@ObfuscatedName("ey")
public class class155 {

    @ObfuscatedName("ey.i")
    public static int field2102 = 0;

    @ObfuscatedName("ey.e")
    public static int field2101 = 0;

    @ObfuscatedName("ey.f")
    public static int field2105 = 0;

    @ObfuscatedName("ey.k")
    public static byte[][] field2103 = new byte[1000][];

    @ObfuscatedName("ey.g")
    public static byte[][] field2104 = new byte[250][];

    @ObfuscatedName("ey.n")
    public static byte[][] field2108 = new byte[50][];

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.i(IS)[B")
    public static synchronized byte[] method2759(int arg0) {
        if (arg0 == 100 && field2102 > 0) {
            byte[] var1 = field2103[--field2102];
            field2103[field2102] = null;
            return var1;
        } else if (arg0 == 5000 && field2101 > 0) {
            byte[] var2 = field2104[--field2101];
            field2104[field2101] = null;
            return var2;
        } else if (arg0 == 30000 && field2105 > 0) {
            byte[] var3 = field2108[--field2105];
            field2108[field2105] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
