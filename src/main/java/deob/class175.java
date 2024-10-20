package deob;

@ObfuscatedName("fk")
public class class175 {

    @ObfuscatedName("fk.n")
    public static int field2405 = 0;

    @ObfuscatedName("fk.p")
    public static int field2404 = 0;

    @ObfuscatedName("fk.i")
    public static int field2410 = 0;

    @ObfuscatedName("fk.j")
    public static byte[][] field2406 = new byte[1000][];

    @ObfuscatedName("fk.f")
    public static byte[][] field2407 = new byte[250][];

    @ObfuscatedName("fk.m")
    public static byte[][] field2403 = new byte[50][];

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fk.n(IB)[B")
    public static synchronized byte[] method3119(int arg0) {
        if (arg0 == 100 && field2405 > 0) {
            byte[] var1 = field2406[--field2405];
            field2406[field2405] = null;
            return var1;
        } else if (arg0 == 5000 && field2404 > 0) {
            byte[] var2 = field2407[--field2404];
            field2407[field2404] = null;
            return var2;
        } else if (arg0 == 30000 && field2410 > 0) {
            byte[] var3 = field2403[--field2410];
            field2403[field2410] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
