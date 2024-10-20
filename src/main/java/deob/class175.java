package deob;

@ObfuscatedName("fm")
public class class175 {

    @ObfuscatedName("fm.i")
    public static int field2411 = 0;

    @ObfuscatedName("fm.w")
    public static int field2409 = 0;

    @ObfuscatedName("fm.a")
    public static int field2412 = 0;

    @ObfuscatedName("fm.t")
    public static byte[][] field2413 = new byte[1000][];

    @ObfuscatedName("fm.s")
    public static byte[][] field2408 = new byte[250][];

    @ObfuscatedName("fm.r")
    public static byte[][] field2410 = new byte[50][];

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fm.i(II)[B")
    public static synchronized byte[] method3076(int arg0) {
        if (arg0 == 100 && field2411 > 0) {
            byte[] var1 = field2413[--field2411];
            field2413[field2411] = null;
            return var1;
        } else if (arg0 == 5000 && field2409 > 0) {
            byte[] var2 = field2408[--field2409];
            field2408[field2409] = null;
            return var2;
        } else if (arg0 == 30000 && field2412 > 0) {
            byte[] var3 = field2410[--field2412];
            field2410[field2412] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
