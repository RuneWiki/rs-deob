package deob;

@ObfuscatedName("fu")
public class class176 {

    @ObfuscatedName("fu.i")
    public static int field2404 = 0;

    @ObfuscatedName("fu.j")
    public static int field2400 = 0;

    @ObfuscatedName("fu.a")
    public static int field2406 = 0;

    @ObfuscatedName("fu.r")
    public static byte[][] field2399 = new byte[1000][];

    @ObfuscatedName("fu.o")
    public static byte[][] field2402 = new byte[250][];

    @ObfuscatedName("fu.n")
    public static byte[][] field2403 = new byte[50][];

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fu.i(II)[B")
    public static synchronized byte[] method3199(int arg0) {
        if (arg0 == 100 && field2404 > 0) {
            byte[] var1 = field2399[--field2404];
            field2399[field2404] = null;
            return var1;
        } else if (arg0 == 5000 && field2400 > 0) {
            byte[] var2 = field2402[--field2400];
            field2402[field2400] = null;
            return var2;
        } else if (arg0 == 30000 && field2406 > 0) {
            byte[] var3 = field2403[--field2406];
            field2403[field2406] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
