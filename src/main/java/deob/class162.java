package deob;

@ObfuscatedName("fq")
public class class162 {

    @ObfuscatedName("fq.k")
    public static int field2269 = 0;

    @ObfuscatedName("fq.y")
    public static int field2273 = 0;

    @ObfuscatedName("fq.o")
    public static int field2270 = 0;

    @ObfuscatedName("fq.r")
    public static byte[][] field2271 = new byte[1000][];

    @ObfuscatedName("fq.w")
    public static byte[][] field2272 = new byte[250][];

    @ObfuscatedName("fq.j")
    public static byte[][] field2274 = new byte[50][];

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fq.k(II)[B")
    public static synchronized byte[] method2942(int arg0) {
        if (arg0 == 100 && field2269 > 0) {
            byte[] var1 = field2271[--field2269];
            field2271[field2269] = null;
            return var1;
        } else if (arg0 == 5000 && field2273 > 0) {
            byte[] var2 = field2272[--field2273];
            field2272[field2273] = null;
            return var2;
        } else if (arg0 == 30000 && field2270 > 0) {
            byte[] var3 = field2274[--field2270];
            field2274[field2270] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
