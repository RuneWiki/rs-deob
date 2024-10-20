package deob;

@ObfuscatedName("fs")
public class class178 {

    @ObfuscatedName("fs.w")
    public static int field2426 = 0;

    @ObfuscatedName("fs.o")
    public static int field2428 = 0;

    @ObfuscatedName("fs.x")
    public static int field2422 = 0;

    @ObfuscatedName("fs.k")
    public static byte[][] field2423 = new byte[1000][];

    @ObfuscatedName("fs.f")
    public static byte[][] field2424 = new byte[250][];

    @ObfuscatedName("fs.i")
    public static byte[][] field2420 = new byte[50][];

    public class178() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.w(II)[B")
    public static synchronized byte[] method3087(int arg0) {
        if (arg0 == 100 && field2426 > 0) {
            byte[] var1 = field2423[--field2426];
            field2423[field2426] = null;
            return var1;
        } else if (arg0 == 5000 && field2428 > 0) {
            byte[] var2 = field2424[--field2428];
            field2424[field2428] = null;
            return var2;
        } else if (arg0 == 30000 && field2422 > 0) {
            byte[] var3 = field2420[--field2422];
            field2420[field2422] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
