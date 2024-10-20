package deob;

@ObfuscatedName("fy")
public class class175 {

    @ObfuscatedName("fy.c")
    public static int field2363 = 0;

    @ObfuscatedName("fy.o")
    public static int field2367 = 0;

    @ObfuscatedName("fy.i")
    public static int field2362 = 0;

    @ObfuscatedName("fy.u")
    public static byte[][] field2364 = new byte[1000][];

    @ObfuscatedName("fy.g")
    public static byte[][] field2366 = new byte[250][];

    @ObfuscatedName("fy.m")
    public static byte[][] field2365 = new byte[50][];

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fy.c(IB)[B")
    public static synchronized byte[] method3071(int arg0) {
        if (arg0 == 100 && field2363 > 0) {
            byte[] var1 = field2364[--field2363];
            field2364[field2363] = null;
            return var1;
        } else if (arg0 == 5000 && field2367 > 0) {
            byte[] var2 = field2366[--field2367];
            field2366[field2367] = null;
            return var2;
        } else if (arg0 == 30000 && field2362 > 0) {
            byte[] var3 = field2365[--field2362];
            field2365[field2362] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
