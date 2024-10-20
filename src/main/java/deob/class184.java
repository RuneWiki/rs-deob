package deob;

@ObfuscatedName("gn")
public class class184 {

    @ObfuscatedName("gn.w")
    public static int field2372 = 0;

    @ObfuscatedName("gn.m")
    public static int field2368 = 0;

    @ObfuscatedName("gn.q")
    public static int field2373 = 0;

    @ObfuscatedName("gn.b")
    public static byte[][] field2370 = new byte[1000][];

    @ObfuscatedName("gn.f")
    public static byte[][] field2367 = new byte[250][];

    @ObfuscatedName("gn.n")
    public static byte[][] field2369 = new byte[50][];

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.w([I[II)V")
    public static void method2684(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field1124 = null;
            Statics.field2371 = null;
            Statics.field2374 = (byte[][][]) null;
            return;
        }
        Statics.field1124 = arg0;
        Statics.field2371 = new int[arg0.length];
        Statics.field2374 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field1124.length; var2++) {
            Statics.field2374[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("gn.m(IZI)[B")
    public static synchronized byte[] method3507(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2372 > 0) {
            byte[] var2 = field2370[--field2372];
            field2370[field2372] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2368 > 0) {
            byte[] var3 = field2367[--field2368];
            field2367[field2368] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2373 > 0) {
            byte[] var4 = field2369[--field2373];
            field2369[field2373] = null;
            return var4;
        } else {
            if (Statics.field2374 != null) {
                for (int var5 = 0; var5 < Statics.field1124.length; var5++) {
                    if ((Statics.field1124[var5] == arg0 || arg0 < Statics.field1124[var5] && arg1) && Statics.field2371[var5] > 0) {
                        byte[] var6 = Statics.field2374[var5][--Statics.field2371[var5]];
                        Statics.field2374[var5][Statics.field2371[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field1124 != null) {
                for (int var7 = 0; var7 < Statics.field1124.length; var7++) {
                    if (arg0 <= Statics.field1124[var7] && Statics.field2371[var7] < Statics.field2374[var7].length) {
                        return new byte[Statics.field1124[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("dr.q(II)[B")
    public static synchronized byte[] method2401(int arg0) {
        return method3507(arg0, false);
    }

    @ObfuscatedName("gy.x([BI)V")
    public static synchronized void method3371(byte[] arg0) {
        if (arg0.length == 100 && field2372 < 1000) {
            field2370[++field2372 - 1] = arg0;
        } else if (arg0.length == 5000 && field2368 < 250) {
            field2367[++field2368 - 1] = arg0;
        } else if (arg0.length == 30000 && field2373 < 50) {
            field2369[++field2373 - 1] = arg0;
        } else if (Statics.field2374 != null) {
            for (int var1 = 0; var1 < Statics.field1124.length; var1++) {
                if (Statics.field1124[var1] == arg0.length && Statics.field2371[var1] < Statics.field2374[var1].length) {
                    Statics.field2374[var1][Statics.field2371[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
