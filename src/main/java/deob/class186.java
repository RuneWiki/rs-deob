package deob;

@ObfuscatedName("gg")
public class class186 {

    @ObfuscatedName("gg.p")
    public static int field2495 = 0;

    @ObfuscatedName("gg.i")
    public static int field2499 = 0;

    @ObfuscatedName("gg.w")
    public static int field2496 = 0;

    @ObfuscatedName("gg.s")
    public static byte[][] field2494 = new byte[1000][];

    @ObfuscatedName("gg.j")
    public static byte[][] field2498 = new byte[250][];

    @ObfuscatedName("gg.a")
    public static byte[][] field2500 = new byte[50][];

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("io.p([I[IB)V")
    public static void method4166(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field2497 = null;
            Statics.field2501 = null;
            Statics.field2676 = (byte[][][]) null;
            return;
        }
        Statics.field2497 = arg0;
        Statics.field2501 = new int[arg0.length];
        Statics.field2676 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field2497.length; var2++) {
            Statics.field2676[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("gg.i(IZI)[B")
    public static synchronized byte[] method3330(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2495 > 0) {
            byte[] var2 = field2494[--field2495];
            field2494[field2495] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2499 > 0) {
            byte[] var3 = field2498[--field2499];
            field2498[field2499] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2496 > 0) {
            byte[] var4 = field2500[--field2496];
            field2500[field2496] = null;
            return var4;
        } else {
            if (Statics.field2676 != null) {
                for (int var5 = 0; var5 < Statics.field2497.length; var5++) {
                    if ((Statics.field2497[var5] == arg0 || arg0 < Statics.field2497[var5] && arg1) && Statics.field2501[var5] > 0) {
                        byte[] var6 = Statics.field2676[var5][--Statics.field2501[var5]];
                        Statics.field2676[var5][Statics.field2501[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field2497 != null) {
                for (int var7 = 0; var7 < Statics.field2497.length; var7++) {
                    if (arg0 <= Statics.field2497[var7] && Statics.field2501[var7] < Statics.field2676[var7].length) {
                        return new byte[Statics.field2497[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("eq.w(II)[B")
    public static synchronized byte[] method2806(int arg0) {
        return method3330(arg0, false);
    }

    @ObfuscatedName("fl.s([BI)V")
    public static synchronized void method2943(byte[] arg0) {
        if (arg0.length == 100 && field2495 < 1000) {
            field2494[++field2495 - 1] = arg0;
        } else if (arg0.length == 5000 && field2499 < 250) {
            field2498[++field2499 - 1] = arg0;
        } else if (arg0.length == 30000 && field2496 < 50) {
            field2500[++field2496 - 1] = arg0;
        } else if (Statics.field2676 != null) {
            for (int var1 = 0; var1 < Statics.field2497.length; var1++) {
                if (Statics.field2497[var1] == arg0.length && Statics.field2501[var1] < Statics.field2676[var1].length) {
                    Statics.field2676[var1][Statics.field2501[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
