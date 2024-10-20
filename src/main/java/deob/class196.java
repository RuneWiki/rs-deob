package deob;

@ObfuscatedName("gv")
public class class196 {

    @ObfuscatedName("gv.d")
    public static int field2577 = 0;

    @ObfuscatedName("gv.z")
    public static int field2573 = 0;

    @ObfuscatedName("gv.n")
    public static int field2575 = 0;

    @ObfuscatedName("gv.r")
    public static byte[][] field2576 = new byte[1000][];

    @ObfuscatedName("gv.e")
    public static byte[][] field2584 = new byte[250][];

    @ObfuscatedName("gv.y")
    public static byte[][] field2574 = new byte[50][];

    public class196() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fb.d([I[II)V")
    public static void method3122(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field2579 = null;
            Statics.field1397 = null;
            Statics.field2580 = (byte[][][]) null;
            return;
        }
        Statics.field2579 = arg0;
        Statics.field1397 = new int[arg0.length];
        Statics.field2580 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field2579.length; var2++) {
            Statics.field2580[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("gv.z(IZB)[B")
    public static synchronized byte[] method3498(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2577 > 0) {
            byte[] var2 = field2576[--field2577];
            field2576[field2577] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2573 > 0) {
            byte[] var3 = field2584[--field2573];
            field2584[field2573] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2575 > 0) {
            byte[] var4 = field2574[--field2575];
            field2574[field2575] = null;
            return var4;
        } else {
            if (Statics.field2580 != null) {
                for (int var5 = 0; var5 < Statics.field2579.length; var5++) {
                    if ((Statics.field2579[var5] == arg0 || arg0 < Statics.field2579[var5] && arg1) && Statics.field1397[var5] > 0) {
                        byte[] var6 = Statics.field2580[var5][--Statics.field1397[var5]];
                        Statics.field2580[var5][Statics.field1397[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field2579 != null) {
                for (int var7 = 0; var7 < Statics.field2579.length; var7++) {
                    if (arg0 <= Statics.field2579[var7] && Statics.field1397[var7] < Statics.field2580[var7].length) {
                        return new byte[Statics.field2579[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("m.n(II)[B")
    public static synchronized byte[] method52(int arg0) {
        return method3498(arg0, false);
    }

    @ObfuscatedName("fx.r([BB)V")
    public static synchronized void method3079(byte[] arg0) {
        if (arg0.length == 100 && field2577 < 1000) {
            field2576[++field2577 - 1] = arg0;
        } else if (arg0.length == 5000 && field2573 < 250) {
            field2584[++field2573 - 1] = arg0;
        } else if (arg0.length == 30000 && field2575 < 50) {
            field2574[++field2575 - 1] = arg0;
        } else if (Statics.field2580 != null) {
            for (int var1 = 0; var1 < Statics.field2579.length; var1++) {
                if (Statics.field2579[var1] == arg0.length && Statics.field1397[var1] < Statics.field2580[var1].length) {
                    Statics.field2580[var1][Statics.field1397[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
