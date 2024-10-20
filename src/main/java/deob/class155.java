package deob;

@ObfuscatedName("ev")
public class class155 {

    @ObfuscatedName("ev.f")
    public static int field2119 = 0;

    @ObfuscatedName("ev.i")
    public static int field2118 = 0;

    @ObfuscatedName("ev.u")
    public static int field2128 = 0;

    @ObfuscatedName("ev.h")
    public static byte[][] field2117 = new byte[1000][];

    @ObfuscatedName("ev.r")
    public static byte[][] field2120 = new byte[250][];

    @ObfuscatedName("ev.o")
    public static byte[][] field2122 = new byte[50][];

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ev.f(II)[B")
    public static synchronized byte[] method2866(int arg0) {
        if (arg0 == 100 && field2119 > 0) {
            byte[] var1 = field2117[--field2119];
            field2117[field2119] = null;
            return var1;
        } else if (arg0 == 5000 && field2118 > 0) {
            byte[] var2 = field2120[--field2118];
            field2120[field2118] = null;
            return var2;
        } else if (arg0 == 30000 && field2128 > 0) {
            byte[] var3 = field2122[--field2128];
            field2122[field2128] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
