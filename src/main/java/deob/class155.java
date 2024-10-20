package deob;

@ObfuscatedName("ex")
public class class155 {

    @ObfuscatedName("ex.s")
    public static int field2112 = 0;

    @ObfuscatedName("ex.c")
    public static int field2107 = 0;

    @ObfuscatedName("ex.f")
    public static int field2108 = 0;

    @ObfuscatedName("ex.h")
    public static byte[][] field2109 = new byte[1000][];

    @ObfuscatedName("ex.a")
    public static byte[][] field2110 = new byte[250][];

    @ObfuscatedName("ex.g")
    public static byte[][] field2111 = new byte[50][];

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ex.s(II)[B")
    public static synchronized byte[] method2746(int arg0) {
        if (arg0 == 100 && field2112 > 0) {
            byte[] var1 = field2109[--field2112];
            field2109[field2112] = null;
            return var1;
        } else if (arg0 == 5000 && field2107 > 0) {
            byte[] var2 = field2110[--field2107];
            field2110[field2107] = null;
            return var2;
        } else if (arg0 == 30000 && field2108 > 0) {
            byte[] var3 = field2111[--field2108];
            field2111[field2108] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
