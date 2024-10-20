package deob;

@ObfuscatedName("gu")
public class class196 {

    @ObfuscatedName("gu.o")
    public static int field2584 = 0;

    @ObfuscatedName("gu.k")
    public static int field2580 = 0;

    @ObfuscatedName("gu.t")
    public static int field2579 = 0;

    @ObfuscatedName("gu.d")
    public static byte[][] field2581 = new byte[1000][];

    @ObfuscatedName("gu.h")
    public static byte[][] field2582 = new byte[250][];

    @ObfuscatedName("gu.m")
    public static byte[][] field2586 = new byte[50][];

    public class196() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ed.o([I[IB)V")
    public static void method2823(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field2585 = null;
            Statics.field867 = null;
            Statics.field3931 = (byte[][][]) null;
            return;
        }
        Statics.field2585 = arg0;
        Statics.field867 = new int[arg0.length];
        Statics.field3931 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field2585.length; var2++) {
            Statics.field3931[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("gu.k(IZB)[B")
    public static synchronized byte[] method3417(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2584 > 0) {
            byte[] var2 = field2581[--field2584];
            field2581[field2584] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2580 > 0) {
            byte[] var3 = field2582[--field2580];
            field2582[field2580] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2579 > 0) {
            byte[] var4 = field2586[--field2579];
            field2586[field2579] = null;
            return var4;
        } else {
            if (Statics.field3931 != null) {
                for (int var5 = 0; var5 < Statics.field2585.length; var5++) {
                    if ((Statics.field2585[var5] == arg0 || arg0 < Statics.field2585[var5] && arg1) && Statics.field867[var5] > 0) {
                        byte[] var6 = Statics.field3931[var5][--Statics.field867[var5]];
                        Statics.field3931[var5][Statics.field867[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field2585 != null) {
                for (int var7 = 0; var7 < Statics.field2585.length; var7++) {
                    if (arg0 <= Statics.field2585[var7] && Statics.field867[var7] < Statics.field3931[var7].length) {
                        return new byte[Statics.field2585[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("v.t(IB)[B")
    public static synchronized byte[] method116(int arg0) {
        return method3417(arg0, false);
    }

    @ObfuscatedName("er.d([BI)V")
    public static synchronized void method2861(byte[] arg0) {
        if (arg0.length == 100 && field2584 < 1000) {
            field2581[++field2584 - 1] = arg0;
        } else if (arg0.length == 5000 && field2580 < 250) {
            field2582[++field2580 - 1] = arg0;
        } else if (arg0.length == 30000 && field2579 < 50) {
            field2586[++field2579 - 1] = arg0;
        } else if (Statics.field3931 != null) {
            for (int var1 = 0; var1 < Statics.field2585.length; var1++) {
                if (Statics.field2585[var1] == arg0.length && Statics.field867[var1] < Statics.field3931[var1].length) {
                    Statics.field3931[var1][Statics.field867[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
