package deob;

@ObfuscatedName("fs")
public class class175 {

    @ObfuscatedName("fs.d")
    public static int field2379 = 0;

    @ObfuscatedName("fs.q")
    public static int field2373 = 0;

    @ObfuscatedName("fs.x")
    public static int field2377 = 0;

    @ObfuscatedName("fs.y")
    public static byte[][] field2375 = new byte[1000][];

    @ObfuscatedName("fs.e")
    public static byte[][] field2376 = new byte[250][];

    @ObfuscatedName("fs.f")
    public static byte[][] field2372 = new byte[50][];

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.d(IB)[B")
    public static synchronized byte[] method3105(int arg0) {
        if (arg0 == 100 && field2379 > 0) {
            byte[] var1 = field2375[--field2379];
            field2375[field2379] = null;
            return var1;
        } else if (arg0 == 5000 && field2373 > 0) {
            byte[] var2 = field2376[--field2373];
            field2376[field2373] = null;
            return var2;
        } else if (arg0 == 30000 && field2377 > 0) {
            byte[] var3 = field2372[--field2377];
            field2372[field2377] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
