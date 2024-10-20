package deob;

@ObfuscatedName("fj")
public class class162 {

    @ObfuscatedName("fj.n")
    public static int field2298 = 0;

    @ObfuscatedName("fj.d")
    public static int field2302 = 0;

    @ObfuscatedName("fj.m")
    public static int field2299 = 0;

    @ObfuscatedName("fj.h")
    public static byte[][] field2300 = new byte[1000][];

    @ObfuscatedName("fj.w")
    public static byte[][] field2301 = new byte[250][];

    @ObfuscatedName("fj.r")
    public static byte[][] field2305 = new byte[50][];

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.n(II)[B")
    public static synchronized byte[] method2977(int arg0) {
        if (arg0 == 100 && field2298 > 0) {
            byte[] var1 = field2300[--field2298];
            field2300[field2298] = null;
            return var1;
        } else if (arg0 == 5000 && field2302 > 0) {
            byte[] var2 = field2301[--field2302];
            field2301[field2302] = null;
            return var2;
        } else if (arg0 == 30000 && field2299 > 0) {
            byte[] var3 = field2305[--field2299];
            field2305[field2299] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
