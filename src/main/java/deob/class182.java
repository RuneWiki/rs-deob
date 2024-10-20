package deob;

@ObfuscatedName("fv")
public class class182 {

    @ObfuscatedName("fv.d")
    public static int field2509 = 0;

    @ObfuscatedName("fv.x")
    public static int field2502 = 0;

    @ObfuscatedName("fv.k")
    public static int field2503 = 0;

    @ObfuscatedName("fv.z")
    public static byte[][] field2504 = new byte[1000][];

    @ObfuscatedName("fv.v")
    public static byte[][] field2508 = new byte[250][];

    @ObfuscatedName("fv.m")
    public static byte[][] field2506 = new byte[50][];

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cn.d([I[IB)V")
    public static void method1616(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field24 = null;
            Statics.field2505 = null;
            Statics.field2510 = (byte[][][]) null;
            return;
        }
        Statics.field24 = arg0;
        Statics.field2505 = new int[arg0.length];
        Statics.field2510 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field24.length; var2++) {
            Statics.field2510[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("fv.x(IZI)[B")
    public static synchronized byte[] method3250(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2509 > 0) {
            byte[] var2 = field2504[--field2509];
            field2504[field2509] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2502 > 0) {
            byte[] var3 = field2508[--field2502];
            field2508[field2502] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2503 > 0) {
            byte[] var4 = field2506[--field2503];
            field2506[field2503] = null;
            return var4;
        } else {
            if (Statics.field2510 != null) {
                for (int var5 = 0; var5 < Statics.field24.length; var5++) {
                    if ((Statics.field24[var5] == arg0 || arg0 < Statics.field24[var5] && arg1) && Statics.field2505[var5] > 0) {
                        byte[] var6 = Statics.field2510[var5][--Statics.field2505[var5]];
                        Statics.field2510[var5][Statics.field2505[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field24 != null) {
                for (int var7 = 0; var7 < Statics.field24.length; var7++) {
                    if (arg0 <= Statics.field24[var7] && Statics.field2505[var7] < Statics.field2510[var7].length) {
                        return new byte[Statics.field24[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("bg.k(IB)[B")
    public static synchronized byte[] method951(int arg0) {
        return method3250(arg0, false);
    }

    @ObfuscatedName("bl.z([BB)V")
    public static synchronized void method1002(byte[] arg0) {
        if (arg0.length == 100 && field2509 < 1000) {
            field2504[++field2509 - 1] = arg0;
        } else if (arg0.length == 5000 && field2502 < 250) {
            field2508[++field2502 - 1] = arg0;
        } else if (arg0.length == 30000 && field2503 < 50) {
            field2506[++field2503 - 1] = arg0;
        } else if (Statics.field2510 != null) {
            for (int var1 = 0; var1 < Statics.field24.length; var1++) {
                if (Statics.field24[var1] == arg0.length && Statics.field2505[var1] < Statics.field2510[var1].length) {
                    Statics.field2510[var1][Statics.field2505[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
