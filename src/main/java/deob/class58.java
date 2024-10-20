package deob;

@ObfuscatedName("bu")
public class class58 {

    @ObfuscatedName("bu.q")
    public static int field765 = 0;

    @ObfuscatedName("bu.l")
    public static int field763 = 0;

    @ObfuscatedName("bu.a")
    public static int field762 = 0;

    @ObfuscatedName("bu.o")
    public static byte[][] field767 = new byte[1000][];

    @ObfuscatedName("bu.c")
    public static byte[][] field766 = new byte[250][];

    @ObfuscatedName("bu.h")
    public static byte[][] field764 = new byte[50][];

    public class58() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bu.q(IB)[B")
    public static synchronized byte[] method744(int arg0) {
        if (arg0 == 100 && field765 > 0) {
            byte[] var1 = field767[--field765];
            field767[field765] = null;
            return var1;
        } else if (arg0 == 5000 && field763 > 0) {
            byte[] var2 = field766[--field763];
            field766[field763] = null;
            return var2;
        } else if (arg0 == 30000 && field762 > 0) {
            byte[] var3 = field764[--field762];
            field764[field762] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
