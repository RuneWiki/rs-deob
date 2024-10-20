package deob;

@ObfuscatedName("fu")
public class class178 {

    @ObfuscatedName("fu.s")
    public static int field2418 = 0;

    @ObfuscatedName("fu.c")
    public static int field2413 = 0;

    @ObfuscatedName("fu.f")
    public static int field2420 = 0;

    @ObfuscatedName("fu.m")
    public static byte[][] field2412 = new byte[1000][];

    @ObfuscatedName("fu.h")
    public static byte[][] field2416 = new byte[250][];

    @ObfuscatedName("fu.t")
    public static byte[][] field2417 = new byte[50][];

    public class178() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fu.s(II)[B")
    public static synchronized byte[] method3173(int arg0) {
        if (arg0 == 100 && field2418 > 0) {
            byte[] var1 = field2412[--field2418];
            field2412[field2418] = null;
            return var1;
        } else if (arg0 == 5000 && field2413 > 0) {
            byte[] var2 = field2416[--field2413];
            field2416[field2413] = null;
            return var2;
        } else if (arg0 == 30000 && field2420 > 0) {
            byte[] var3 = field2417[--field2420];
            field2417[field2420] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
