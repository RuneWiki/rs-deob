package deob;

@ObfuscatedName("fn")
public class class175 {

    @ObfuscatedName("fn.a")
    public static int field2403 = 0;

    @ObfuscatedName("fn.j")
    public static int field2402 = 0;

    @ObfuscatedName("fn.n")
    public static int field2405 = 0;

    @ObfuscatedName("fn.r")
    public static byte[][] field2404 = new byte[1000][];

    @ObfuscatedName("fn.v")
    public static byte[][] field2401 = new byte[250][];

    @ObfuscatedName("fn.e")
    public static byte[][] field2406 = new byte[50][];

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fn.a(IB)[B")
    public static synchronized byte[] method3081(int arg0) {
        if (arg0 == 100 && field2403 > 0) {
            byte[] var1 = field2404[--field2403];
            field2404[field2403] = null;
            return var1;
        } else if (arg0 == 5000 && field2402 > 0) {
            byte[] var2 = field2401[--field2402];
            field2401[field2402] = null;
            return var2;
        } else if (arg0 == 30000 && field2405 > 0) {
            byte[] var3 = field2406[--field2405];
            field2406[field2405] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
