package deob;

@ObfuscatedName("ee")
public class class155 {

    @ObfuscatedName("ee.b")
    public static int field2093 = 0;

    @ObfuscatedName("ee.e")
    public static int field2087 = 0;

    @ObfuscatedName("ee.c")
    public static int field2090 = 0;

    @ObfuscatedName("ee.l")
    public static byte[][] field2089 = new byte[1000][];

    @ObfuscatedName("ee.y")
    public static byte[][] field2088 = new byte[250][];

    @ObfuscatedName("ee.j")
    public static byte[][] field2086 = new byte[50][];

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ee.b(IB)[B")
    public static synchronized byte[] method2887(int arg0) {
        if (arg0 == 100 && field2093 > 0) {
            byte[] var1 = field2089[--field2093];
            field2089[field2093] = null;
            return var1;
        } else if (arg0 == 5000 && field2087 > 0) {
            byte[] var2 = field2088[--field2087];
            field2088[field2087] = null;
            return var2;
        } else if (arg0 == 30000 && field2090 > 0) {
            byte[] var3 = field2086[--field2090];
            field2086[field2090] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
