package deob;

@ObfuscatedName("gg")
public class class184 {

    @ObfuscatedName("gg.z")
    public static int field2345 = 0;

    @ObfuscatedName("gg.w")
    public static int field2347 = 0;

    @ObfuscatedName("gg.s")
    public static int field2343 = 0;

    @ObfuscatedName("gg.l")
    public static byte[][] field2341 = new byte[1000][];

    @ObfuscatedName("gg.u")
    public static byte[][] field2344 = new byte[250][];

    @ObfuscatedName("gg.q")
    public static byte[][] field2346 = new byte[50][];

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fi.z([I[II)V")
    public static void method3149(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field2349 = null;
            Statics.field2348 = null;
            Statics.field2342 = (byte[][][]) null;
            return;
        }
        Statics.field2349 = arg0;
        Statics.field2348 = new int[arg0.length];
        Statics.field2342 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field2349.length; var2++) {
            Statics.field2342[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("gg.w(IZI)[B")
    public static synchronized byte[] method3476(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2345 > 0) {
            byte[] var2 = field2341[--field2345];
            field2341[field2345] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2347 > 0) {
            byte[] var3 = field2344[--field2347];
            field2344[field2347] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2343 > 0) {
            byte[] var4 = field2346[--field2343];
            field2346[field2343] = null;
            return var4;
        } else {
            if (Statics.field2342 != null) {
                for (int var5 = 0; var5 < Statics.field2349.length; var5++) {
                    if ((Statics.field2349[var5] == arg0 || arg0 < Statics.field2349[var5] && arg1) && Statics.field2348[var5] > 0) {
                        byte[] var6 = Statics.field2342[var5][--Statics.field2348[var5]];
                        Statics.field2342[var5][Statics.field2348[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field2349 != null) {
                for (int var7 = 0; var7 < Statics.field2349.length; var7++) {
                    if (arg0 <= Statics.field2349[var7] && Statics.field2348[var7] < Statics.field2342[var7].length) {
                        return new byte[Statics.field2349[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("ce.s(II)[B")
    public static synchronized byte[] method1814(int arg0) {
        return method3476(arg0, false);
    }

    @ObfuscatedName("ki.l([BI)V")
    public static synchronized void method5239(byte[] arg0) {
        if (arg0.length == 100 && field2345 < 1000) {
            field2341[++field2345 - 1] = arg0;
        } else if (arg0.length == 5000 && field2347 < 250) {
            field2344[++field2347 - 1] = arg0;
        } else if (arg0.length == 30000 && field2343 < 50) {
            field2346[++field2343 - 1] = arg0;
        } else if (Statics.field2342 != null) {
            for (int var1 = 0; var1 < Statics.field2349.length; var1++) {
                if (Statics.field2349[var1] == arg0.length && Statics.field2348[var1] < Statics.field2342[var1].length) {
                    Statics.field2342[var1][Statics.field2348[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
