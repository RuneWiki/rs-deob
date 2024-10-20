package deob;

@ObfuscatedName("gk")
public class class186 {

    @ObfuscatedName("gk.v")
    public static int field2391 = 0;

    @ObfuscatedName("gk.s")
    public static int field2396 = 0;

    @ObfuscatedName("gk.o")
    public static int field2389 = 0;

    @ObfuscatedName("gk.k")
    public static byte[][] field2388 = new byte[1000][];

    @ObfuscatedName("gk.u")
    public static byte[][] field2392 = new byte[250][];

    @ObfuscatedName("gk.i")
    public static byte[][] field2393 = new byte[50][];

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ir.v([I[II)V")
    public static void method4249(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field1080 = null;
            Statics.field2314 = null;
            Statics.field2394 = (byte[][][]) null;
            return;
        }
        Statics.field1080 = arg0;
        Statics.field2314 = new int[arg0.length];
        Statics.field2394 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field1080.length; var2++) {
            Statics.field2394[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("gk.s(IZI)[B")
    public static synchronized byte[] method3500(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2391 > 0) {
            byte[] var2 = field2388[--field2391];
            field2388[field2391] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2396 > 0) {
            byte[] var3 = field2392[--field2396];
            field2392[field2396] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2389 > 0) {
            byte[] var4 = field2393[--field2389];
            field2393[field2389] = null;
            return var4;
        } else {
            if (Statics.field2394 != null) {
                for (int var5 = 0; var5 < Statics.field1080.length; var5++) {
                    if ((Statics.field1080[var5] == arg0 || arg0 < Statics.field1080[var5] && arg1) && Statics.field2314[var5] > 0) {
                        byte[] var6 = Statics.field2394[var5][--Statics.field2314[var5]];
                        Statics.field2394[var5][Statics.field2314[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field1080 != null) {
                for (int var7 = 0; var7 < Statics.field1080.length; var7++) {
                    if (arg0 <= Statics.field1080[var7] && Statics.field2314[var7] < Statics.field2394[var7].length) {
                        return new byte[Statics.field1080[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("u.o(II)[B")
    public static synchronized byte[] method52(int arg0) {
        return method3500(arg0, false);
    }

    @ObfuscatedName("kh.k([BB)V")
    public static synchronized void method5063(byte[] arg0) {
        if (arg0.length == 100 && field2391 < 1000) {
            field2388[++field2391 - 1] = arg0;
        } else if (arg0.length == 5000 && field2396 < 250) {
            field2392[++field2396 - 1] = arg0;
        } else if (arg0.length == 30000 && field2389 < 50) {
            field2393[++field2389 - 1] = arg0;
        } else if (Statics.field2394 != null) {
            for (int var1 = 0; var1 < Statics.field1080.length; var1++) {
                if (Statics.field1080[var1] == arg0.length && Statics.field2314[var1] < Statics.field2394[var1].length) {
                    Statics.field2394[var1][Statics.field2314[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
