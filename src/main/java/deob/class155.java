package deob;

@ObfuscatedName("ej")
public class class155 {

    @ObfuscatedName("ej.b")
    public static int field2093 = 0;

    @ObfuscatedName("ej.l")
    public static int field2094 = 0;

    @ObfuscatedName("ej.i")
    public static int field2100 = 0;

    @ObfuscatedName("ej.t")
    public static byte[][] field2095 = new byte[1000][];

    @ObfuscatedName("ej.k")
    public static byte[][] field2096 = new byte[250][];

    @ObfuscatedName("ej.h")
    public static byte[][] field2097 = new byte[50][];

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ej.b(II)[B")
    public static synchronized byte[] method2897(int arg0) {
        if (arg0 == 100 && field2093 > 0) {
            byte[] var1 = field2095[--field2093];
            field2095[field2093] = null;
            return var1;
        } else if (arg0 == 5000 && field2094 > 0) {
            byte[] var2 = field2096[--field2094];
            field2096[field2094] = null;
            return var2;
        } else if (arg0 == 30000 && field2100 > 0) {
            byte[] var3 = field2097[--field2100];
            field2097[field2100] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
