package deob;

@ObfuscatedName("df")
public class class40 {

    @ObfuscatedName("df.b")
    public static int field421 = 0;

    @ObfuscatedName("df.c")
    public static int field420 = 0;

    @ObfuscatedName("df.m")
    public static byte[][] field423 = new byte[250][];

    @ObfuscatedName("df.i")
    public static byte[][] field419 = new byte[1000][];

    @ObfuscatedName("df.v")
    public static int field422 = 0;

    @ObfuscatedName("df.z")
    public static byte[][] field424 = new byte[50][];

    @ObfuscatedName("df.v(II)[B")
    public static synchronized byte[] method739(int arg0) {
        if (arg0 == 100 && field422 > 0) {
            byte[] var1 = field419[--field422];
            field419[field422] = null;
            return var1;
        } else if (arg0 == 5000 && field420 > 0) {
            byte[] var2 = field423[--field420];
            field423[field420] = null;
            return var2;
        } else if (arg0 == 30000 && field421 > 0) {
            byte[] var3 = field424[--field421];
            field424[field421] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }

    public class40() throws Throwable {
        throw new Error();
    }
}
