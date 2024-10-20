package deob;

@ObfuscatedName("fk")
public class class176 {

    @ObfuscatedName("fk.j")
    public static int field2399 = 0;

    @ObfuscatedName("fk.h")
    public static int field2398 = 0;

    @ObfuscatedName("fk.f")
    public static int field2397 = 0;

    @ObfuscatedName("fk.p")
    public static byte[][] field2400 = new byte[1000][];

    @ObfuscatedName("fk.x")
    public static byte[][] field2401 = new byte[250][];

    @ObfuscatedName("fk.g")
    public static byte[][] field2402 = new byte[50][];

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fk.j(II)[B")
    public static synchronized byte[] method3114(int arg0) {
        if (arg0 == 100 && field2399 > 0) {
            byte[] var1 = field2400[--field2399];
            field2400[field2399] = null;
            return var1;
        } else if (arg0 == 5000 && field2398 > 0) {
            byte[] var2 = field2401[--field2398];
            field2401[field2398] = null;
            return var2;
        } else if (arg0 == 30000 && field2397 > 0) {
            byte[] var3 = field2402[--field2397];
            field2402[field2397] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }
}
