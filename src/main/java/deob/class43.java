package deob;

@ObfuscatedName("dk")
public class class43 {

    @ObfuscatedName("dk.o")
    public static int field355 = 0;

    @ObfuscatedName("dk.j")
    public static int field356 = 0;

    @ObfuscatedName("dk.h")
    public static byte[][] field357 = new byte[250][];

    @ObfuscatedName("dk.t")
    public static byte[][] field358 = new byte[1000][];

    @ObfuscatedName("dk.r")
    public static byte[][] field354 = new byte[50][];

    @ObfuscatedName("dk.p")
    public static int field361 = 0;

    @ObfuscatedName("dk.j(II)[B")
    public static synchronized byte[] method721(int arg0) {
        if (arg0 == 100 && field356 > 0) {
            byte[] var1 = field358[--field356];
            field358[field356] = null;
            return var1;
        } else if (arg0 == 5000 && field361 > 0) {
            byte[] var2 = field357[--field361];
            field357[field361] = null;
            return var2;
        } else if (arg0 == 30000 && field355 > 0) {
            byte[] var3 = field354[--field355];
            field354[field355] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }

    public class43() throws Throwable {
        throw new Error();
    }
}
