package deob;

@ObfuscatedName("fx")
public class class175 {

    @ObfuscatedName("fx.e")
    public static int field2386 = 0;

    @ObfuscatedName("fx.o")
    public static int field2379 = 0;

    @ObfuscatedName("fx.m")
    public static int field2377 = 0;

    @ObfuscatedName("fx.g")
    public static byte[][] field2383 = new byte[1000][];

    @ObfuscatedName("fx.d")
    public static byte[][] field2381 = new byte[250][];

    @ObfuscatedName("fx.b")
    public static byte[][] field2382 = new byte[50][];

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fx.e(II)[B")
    public static synchronized byte[] method3091(int arg0) {
        if (arg0 == 100 && field2386 > 0) {
            byte[] var1 = field2383[--field2386];
            field2383[field2386] = null;
            return var1;
        } else if (arg0 == 5000 && field2379 > 0) {
            byte[] var2 = field2381[--field2379];
            field2381[field2379] = null;
            return var2;
        } else if (arg0 == 30000 && field2377 > 0) {
            byte[] var3 = field2382[--field2377];
            field2382[field2377] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
