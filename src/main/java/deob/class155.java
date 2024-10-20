package deob;

@ObfuscatedName("eg")
public class class155 {

    @ObfuscatedName("eg.x")
    public static int field2096 = 0;

    @ObfuscatedName("eg.j")
    public static int field2094 = 0;

    @ObfuscatedName("eg.c")
    public static int field2093 = 0;

    @ObfuscatedName("eg.d")
    public static byte[][] field2095 = new byte[1000][];

    @ObfuscatedName("eg.w")
    public static byte[][] field2100 = new byte[250][];

    @ObfuscatedName("eg.h")
    public static byte[][] field2098 = new byte[50][];

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eg.x(II)[B")
    public static synchronized byte[] method2847(int arg0) {
        if (arg0 == 100 && field2096 > 0) {
            byte[] var1 = field2095[--field2096];
            field2095[field2096] = null;
            return var1;
        } else if (arg0 == 5000 && field2094 > 0) {
            byte[] var2 = field2100[--field2094];
            field2100[field2094] = null;
            return var2;
        } else if (arg0 == 30000 && field2093 > 0) {
            byte[] var3 = field2098[--field2093];
            field2098[field2093] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
