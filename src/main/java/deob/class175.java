package deob;

@ObfuscatedName("fz")
public class class175 {

    @ObfuscatedName("fz.i")
    public static int field2395 = 0;

    @ObfuscatedName("fz.h")
    public static int field2389 = 0;

    @ObfuscatedName("fz.u")
    public static int field2390 = 0;

    @ObfuscatedName("fz.q")
    public static byte[][] field2391 = new byte[1000][];

    @ObfuscatedName("fz.g")
    public static byte[][] field2388 = new byte[250][];

    @ObfuscatedName("fz.v")
    public static byte[][] field2393 = new byte[50][];

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fz.i(IB)[B")
    public static synchronized byte[] method3145(int arg0) {
        if (arg0 == 100 && field2395 > 0) {
            byte[] var1 = field2391[--field2395];
            field2391[field2395] = null;
            return var1;
        } else if (arg0 == 5000 && field2389 > 0) {
            byte[] var2 = field2388[--field2389];
            field2388[field2389] = null;
            return var2;
        } else if (arg0 == 30000 && field2390 > 0) {
            byte[] var3 = field2393[--field2390];
            field2393[field2390] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
