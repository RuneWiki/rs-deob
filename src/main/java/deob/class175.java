package deob;

@ObfuscatedName("fb")
public class class175 {

    @ObfuscatedName("fb.w")
    public static int field2400 = 0;

    @ObfuscatedName("fb.s")
    public static int field2399 = 0;

    @ObfuscatedName("fb.q")
    public static int field2402 = 0;

    @ObfuscatedName("fb.o")
    public static byte[][] field2397 = new byte[1000][];

    @ObfuscatedName("fb.g")
    public static byte[][] field2398 = new byte[250][];

    @ObfuscatedName("fb.v")
    public static byte[][] field2394 = new byte[50][];

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fb.w(II)[B")
    public static synchronized byte[] method3196(int arg0) {
        if (arg0 == 100 && field2400 > 0) {
            byte[] var1 = field2397[--field2400];
            field2397[field2400] = null;
            return var1;
        } else if (arg0 == 5000 && field2399 > 0) {
            byte[] var2 = field2398[--field2399];
            field2398[field2399] = null;
            return var2;
        } else if (arg0 == 30000 && field2402 > 0) {
            byte[] var3 = field2394[--field2402];
            field2394[field2402] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
