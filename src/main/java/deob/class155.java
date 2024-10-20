package deob;

@ObfuscatedName("ez")
public class class155 {

    @ObfuscatedName("ez.u")
    public static int field2089 = 0;

    @ObfuscatedName("ez.x")
    public static int field2083 = 0;

    @ObfuscatedName("ez.i")
    public static int field2084 = 0;

    @ObfuscatedName("ez.a")
    public static byte[][] field2085 = new byte[1000][];

    @ObfuscatedName("ez.f")
    public static byte[][] field2086 = new byte[250][];

    @ObfuscatedName("ez.c")
    public static byte[][] field2090 = new byte[50][];

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ez.u(IB)[B")
    public static synchronized byte[] method2805(int arg0) {
        if (arg0 == 100 && field2089 > 0) {
            byte[] var1 = field2085[--field2089];
            field2085[field2089] = null;
            return var1;
        } else if (arg0 == 5000 && field2083 > 0) {
            byte[] var2 = field2086[--field2083];
            field2086[field2083] = null;
            return var2;
        } else if (arg0 == 30000 && field2084 > 0) {
            byte[] var3 = field2090[--field2084];
            field2090[field2084] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
