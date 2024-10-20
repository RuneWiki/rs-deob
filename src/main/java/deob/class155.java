package deob;

@ObfuscatedName("er")
public class class155 {

    @ObfuscatedName("er.q")
    public static int field2111 = 0;

    @ObfuscatedName("er.d")
    public static int field2107 = 0;

    @ObfuscatedName("er.h")
    public static int field2103 = 0;

    @ObfuscatedName("er.p")
    public static byte[][] field2106 = new byte[1000][];

    @ObfuscatedName("er.j")
    public static byte[][] field2105 = new byte[250][];

    @ObfuscatedName("er.n")
    public static byte[][] field2108 = new byte[50][];

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("er.q(IB)[B")
    public static synchronized byte[] method2868(int arg0) {
        if (arg0 == 100 && field2111 > 0) {
            byte[] var1 = field2106[--field2111];
            field2106[field2111] = null;
            return var1;
        } else if (arg0 == 5000 && field2107 > 0) {
            byte[] var2 = field2105[--field2107];
            field2105[field2107] = null;
            return var2;
        } else if (arg0 == 30000 && field2103 > 0) {
            byte[] var3 = field2108[--field2103];
            field2108[field2103] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
