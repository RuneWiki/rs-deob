package deob;

@ObfuscatedName("fn")
public class class182 {

    @ObfuscatedName("fn.m")
    public static int field2503 = 0;

    @ObfuscatedName("fn.p")
    public static int field2504 = 0;

    @ObfuscatedName("fn.i")
    public static int field2505 = 0;

    @ObfuscatedName("fn.j")
    public static byte[][] field2506 = new byte[1000][];

    @ObfuscatedName("fn.v")
    public static byte[][] field2507 = new byte[250][];

    @ObfuscatedName("fn.x")
    public static byte[][] field2508 = new byte[50][];

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ex.m([I[IB)V")
    public static void method2755(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field3246 = null;
            Statics.field2052 = null;
            Statics.field2514 = (byte[][][]) null;
            return;
        }
        Statics.field3246 = arg0;
        Statics.field2052 = new int[arg0.length];
        Statics.field2514 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field3246.length; var2++) {
            Statics.field2514[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("fn.p(IZI)[B")
    public static synchronized byte[] method3240(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2503 > 0) {
            byte[] var2 = field2506[--field2503];
            field2506[field2503] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2504 > 0) {
            byte[] var3 = field2507[--field2504];
            field2507[field2504] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2505 > 0) {
            byte[] var4 = field2508[--field2505];
            field2508[field2505] = null;
            return var4;
        } else {
            if (Statics.field2514 != null) {
                for (int var5 = 0; var5 < Statics.field3246.length; var5++) {
                    if ((Statics.field3246[var5] == arg0 || arg0 < Statics.field3246[var5] && arg1) && Statics.field2052[var5] > 0) {
                        byte[] var6 = Statics.field2514[var5][--Statics.field2052[var5]];
                        Statics.field2514[var5][Statics.field2052[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field3246 != null) {
                for (int var7 = 0; var7 < Statics.field3246.length; var7++) {
                    if (arg0 <= Statics.field3246[var7] && Statics.field2052[var7] < Statics.field2514[var7].length) {
                        return new byte[Statics.field3246[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("ak.j([BI)V")
    public static synchronized void method495(byte[] arg0) {
        if (arg0.length == 100 && field2503 < 1000) {
            field2506[++field2503 - 1] = arg0;
        } else if (arg0.length == 5000 && field2504 < 250) {
            field2507[++field2504 - 1] = arg0;
        } else if (arg0.length == 30000 && field2505 < 50) {
            field2508[++field2505 - 1] = arg0;
        } else if (Statics.field2514 != null) {
            for (int var1 = 0; var1 < Statics.field3246.length; var1++) {
                if (Statics.field3246[var1] == arg0.length && Statics.field2052[var1] < Statics.field2514[var1].length) {
                    Statics.field2514[var1][Statics.field2052[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
