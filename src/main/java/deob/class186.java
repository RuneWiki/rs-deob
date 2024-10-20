package deob;

@ObfuscatedName("gs")
public class class186 {

    @ObfuscatedName("gs.g")
    public static int field2416 = 0;

    @ObfuscatedName("gs.r")
    public static int field2413 = 0;

    @ObfuscatedName("gs.e")
    public static int field2414 = 0;

    @ObfuscatedName("gs.q")
    public static byte[][] field2415 = new byte[1000][];

    @ObfuscatedName("gs.c")
    public static byte[][] field2419 = new byte[250][];

    @ObfuscatedName("gs.l")
    public static byte[][] field2417 = new byte[50][];

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iz.g([I[II)V")
    public static void method4426(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field254 = null;
            Statics.field2412 = null;
            Statics.field3738 = (byte[][][]) null;
            return;
        }
        Statics.field254 = arg0;
        Statics.field2412 = new int[arg0.length];
        Statics.field3738 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field254.length; var2++) {
            Statics.field3738[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("gs.r(IZI)[B")
    public static synchronized byte[] method3695(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2416 > 0) {
            byte[] var2 = field2415[--field2416];
            field2415[field2416] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2413 > 0) {
            byte[] var3 = field2419[--field2413];
            field2419[field2413] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2414 > 0) {
            byte[] var4 = field2417[--field2414];
            field2417[field2414] = null;
            return var4;
        } else {
            if (Statics.field3738 != null) {
                for (int var5 = 0; var5 < Statics.field254.length; var5++) {
                    if ((Statics.field254[var5] == arg0 || arg0 < Statics.field254[var5] && arg1) && Statics.field2412[var5] > 0) {
                        byte[] var6 = Statics.field3738[var5][--Statics.field2412[var5]];
                        Statics.field3738[var5][Statics.field2412[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field254 != null) {
                for (int var7 = 0; var7 < Statics.field254.length; var7++) {
                    if (arg0 <= Statics.field254[var7] && Statics.field2412[var7] < Statics.field3738[var7].length) {
                        return new byte[Statics.field254[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("ca.e(II)[B")
    public static synchronized byte[] method2051(int arg0) {
        return method3695(arg0, false);
    }

    @ObfuscatedName("an.q([BI)V")
    public static synchronized void method476(byte[] arg0) {
        if (arg0.length == 100 && field2416 < 1000) {
            field2415[++field2416 - 1] = arg0;
        } else if (arg0.length == 5000 && field2413 < 250) {
            field2419[++field2413 - 1] = arg0;
        } else if (arg0.length == 30000 && field2414 < 50) {
            field2417[++field2414 - 1] = arg0;
        } else if (Statics.field3738 != null) {
            for (int var1 = 0; var1 < Statics.field254.length; var1++) {
                if (Statics.field254[var1] == arg0.length && Statics.field2412[var1] < Statics.field3738[var1].length) {
                    Statics.field3738[var1][Statics.field2412[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
