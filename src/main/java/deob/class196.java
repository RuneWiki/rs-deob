package deob;

@ObfuscatedName("gn")
public class class196 {

    @ObfuscatedName("gn.g")
    public static int field2577 = 0;

    @ObfuscatedName("gn.e")
    public static int field2574 = 0;

    @ObfuscatedName("gn.b")
    public static int field2575 = 0;

    @ObfuscatedName("gn.z")
    public static byte[][] field2579 = new byte[1000][];

    @ObfuscatedName("gn.n")
    public static byte[][] field2576 = new byte[250][];

    @ObfuscatedName("gn.l")
    public static byte[][] field2581 = new byte[50][];

    public class196() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bc.g([I[II)V")
    public static void method1047(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field2573 = null;
            Statics.field2580 = null;
            Statics.field2157 = (byte[][][]) null;
            return;
        }
        Statics.field2573 = arg0;
        Statics.field2580 = new int[arg0.length];
        Statics.field2157 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field2573.length; var2++) {
            Statics.field2157[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("gn.e(IZI)[B")
    public static synchronized byte[] method3520(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2577 > 0) {
            byte[] var2 = field2579[--field2577];
            field2579[field2577] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2574 > 0) {
            byte[] var3 = field2576[--field2574];
            field2576[field2574] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2575 > 0) {
            byte[] var4 = field2581[--field2575];
            field2581[field2575] = null;
            return var4;
        } else {
            if (Statics.field2157 != null) {
                for (int var5 = 0; var5 < Statics.field2573.length; var5++) {
                    if ((Statics.field2573[var5] == arg0 || arg0 < Statics.field2573[var5] && arg1) && Statics.field2580[var5] > 0) {
                        byte[] var6 = Statics.field2157[var5][--Statics.field2580[var5]];
                        Statics.field2157[var5][Statics.field2580[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field2573 != null) {
                for (int var7 = 0; var7 < Statics.field2573.length; var7++) {
                    if (arg0 <= Statics.field2573[var7] && Statics.field2580[var7] < Statics.field2157[var7].length) {
                        return new byte[Statics.field2573[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("ip.b(II)[B")
    public static synchronized byte[] method4251(int arg0) {
        return method3520(arg0, false);
    }

    @ObfuscatedName("eg.z([BB)V")
    public static synchronized void method2573(byte[] arg0) {
        if (arg0.length == 100 && field2577 < 1000) {
            field2579[++field2577 - 1] = arg0;
        } else if (arg0.length == 5000 && field2574 < 250) {
            field2576[++field2574 - 1] = arg0;
        } else if (arg0.length == 30000 && field2575 < 50) {
            field2581[++field2575 - 1] = arg0;
        } else if (Statics.field2157 != null) {
            for (int var1 = 0; var1 < Statics.field2573.length; var1++) {
                if (Statics.field2573[var1] == arg0.length && Statics.field2580[var1] < Statics.field2157[var1].length) {
                    Statics.field2157[var1][Statics.field2580[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
