package deob;

@ObfuscatedName("gz")
public class class195 {

    @ObfuscatedName("gz.b")
    public static int field2552 = 0;

    @ObfuscatedName("gz.q")
    public static int field2545 = 0;

    @ObfuscatedName("gz.o")
    public static int field2546 = 0;

    @ObfuscatedName("gz.p")
    public static byte[][] field2547 = new byte[1000][];

    @ObfuscatedName("gz.a")
    public static byte[][] field2550 = new byte[250][];

    @ObfuscatedName("gz.h")
    public static byte[][] field2549 = new byte[50][];

    public class195() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gz.b(IZI)[B")
    public static synchronized byte[] method3483(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2552 > 0) {
            byte[] var2 = field2547[--field2552];
            field2547[field2552] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2545 > 0) {
            byte[] var3 = field2550[--field2545];
            field2550[field2545] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2546 > 0) {
            byte[] var4 = field2549[--field2546];
            field2549[field2546] = null;
            return var4;
        } else {
            if (Statics.field3874 != null) {
                for (int var5 = 0; var5 < Statics.field2548.length; var5++) {
                    if ((Statics.field2548[var5] == arg0 || arg0 < Statics.field2548[var5] && arg1) && Statics.field3285[var5] > 0) {
                        byte[] var6 = Statics.field3874[var5][--Statics.field3285[var5]];
                        Statics.field3874[var5][Statics.field3285[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field2548 != null) {
                for (int var7 = 0; var7 < Statics.field2548.length; var7++) {
                    if (arg0 <= Statics.field2548[var7] && Statics.field3285[var7] < Statics.field3874[var7].length) {
                        return new byte[Statics.field2548[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("bz.q(II)[B")
    public static synchronized byte[] method1049(int arg0) {
        return method3483(arg0, false);
    }

    @ObfuscatedName("am.o([BI)V")
    public static synchronized void method250(byte[] arg0) {
        if (arg0.length == 100 && field2552 < 1000) {
            field2547[++field2552 - 1] = arg0;
        } else if (arg0.length == 5000 && field2545 < 250) {
            field2550[++field2545 - 1] = arg0;
        } else if (arg0.length == 30000 && field2546 < 50) {
            field2549[++field2546 - 1] = arg0;
        } else if (Statics.field3874 != null) {
            for (int var1 = 0; var1 < Statics.field2548.length; var1++) {
                if (Statics.field2548[var1] == arg0.length && Statics.field3285[var1] < Statics.field3874[var1].length) {
                    Statics.field3874[var1][Statics.field3285[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
