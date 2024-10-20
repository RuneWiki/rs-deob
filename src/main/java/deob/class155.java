package deob;

@ObfuscatedName("ef")
public class class155 {

    @ObfuscatedName("ef.x")
    public static int field2097 = 0;

    @ObfuscatedName("ef.n")
    public static int field2099 = 0;

    @ObfuscatedName("ef.g")
    public static int field2101 = 0;

    @ObfuscatedName("ef.v")
    public static byte[][] field2098 = new byte[1000][];

    @ObfuscatedName("ef.y")
    public static byte[][] field2096 = new byte[250][];

    @ObfuscatedName("ef.p")
    public static byte[][] field2100 = new byte[50][];

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.x(II)[B")
    public static synchronized byte[] method2922(int arg0) {
        if (arg0 == 100 && field2097 > 0) {
            byte[] var1 = field2098[--field2097];
            field2098[field2097] = null;
            return var1;
        } else if (arg0 == 5000 && field2099 > 0) {
            byte[] var2 = field2096[--field2099];
            field2096[field2099] = null;
            return var2;
        } else if (arg0 == 30000 && field2101 > 0) {
            byte[] var3 = field2100[--field2101];
            field2100[field2101] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
