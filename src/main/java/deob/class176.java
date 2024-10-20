package deob;

@ObfuscatedName("ff")
public class class176 {

    @ObfuscatedName("ff.e")
    public static int field2390 = 0;

    @ObfuscatedName("ff.n")
    public static int field2393 = 0;

    @ObfuscatedName("ff.g")
    public static int field2389 = 0;

    @ObfuscatedName("ff.y")
    public static byte[][] field2388 = new byte[1000][];

    @ObfuscatedName("ff.w")
    public static byte[][] field2387 = new byte[250][];

    @ObfuscatedName("ff.k")
    public static byte[][] field2392 = new byte[50][];

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ff.e(IB)[B")
    public static synchronized byte[] method3132(int arg0) {
        if (arg0 == 100 && field2390 > 0) {
            byte[] var1 = field2388[--field2390];
            field2388[field2390] = null;
            return var1;
        } else if (arg0 == 5000 && field2393 > 0) {
            byte[] var2 = field2387[--field2393];
            field2387[field2393] = null;
            return var2;
        } else if (arg0 == 30000 && field2389 > 0) {
            byte[] var3 = field2392[--field2389];
            field2392[field2389] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
