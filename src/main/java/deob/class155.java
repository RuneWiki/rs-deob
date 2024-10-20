package deob;

@ObfuscatedName("em")
public class class155 {

    @ObfuscatedName("em.o")
    public static int field2117 = 0;

    @ObfuscatedName("em.m")
    public static int field2122 = 0;

    @ObfuscatedName("em.b")
    public static int field2114 = 0;

    @ObfuscatedName("em.g")
    public static byte[][] field2115 = new byte[1000][];

    @ObfuscatedName("em.h")
    public static byte[][] field2116 = new byte[250][];

    @ObfuscatedName("em.v")
    public static byte[][] field2112 = new byte[50][];

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("em.o(IB)[B")
    public static synchronized byte[] method2755(int arg0) {
        if (arg0 == 100 && field2117 > 0) {
            byte[] var1 = field2115[--field2117];
            field2115[field2117] = null;
            return var1;
        } else if (arg0 == 5000 && field2122 > 0) {
            byte[] var2 = field2116[--field2122];
            field2116[field2122] = null;
            return var2;
        } else if (arg0 == 30000 && field2114 > 0) {
            byte[] var3 = field2112[--field2114];
            field2112[field2114] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
