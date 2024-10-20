package deob;

@ObfuscatedName("gi")
public class class186 {

    @ObfuscatedName("gi.c")
    public static int field2393 = 0;

    @ObfuscatedName("gi.q")
    public static int field2392 = 0;

    @ObfuscatedName("gi.m")
    public static int field2391 = 0;

    @ObfuscatedName("gi.j")
    public static byte[][] field2394 = new byte[1000][];

    @ObfuscatedName("gi.g")
    public static byte[][] field2395 = new byte[250][];

    @ObfuscatedName("gi.i")
    public static byte[][] field2389 = new byte[50][];

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.c([I[IB)V")
    public static void method2083(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field2390 = null;
            Statics.field511 = null;
            Statics.field2339 = (byte[][][]) null;
            return;
        }
        Statics.field2390 = arg0;
        Statics.field511 = new int[arg0.length];
        Statics.field2339 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field2390.length; var2++) {
            Statics.field2339[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("gi.q(IZS)[B")
    public static synchronized byte[] method3462(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2393 > 0) {
            byte[] var2 = field2394[--field2393];
            field2394[field2393] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2392 > 0) {
            byte[] var3 = field2395[--field2392];
            field2395[field2392] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2391 > 0) {
            byte[] var4 = field2389[--field2391];
            field2389[field2391] = null;
            return var4;
        } else {
            if (Statics.field2339 != null) {
                for (int var5 = 0; var5 < Statics.field2390.length; var5++) {
                    if ((Statics.field2390[var5] == arg0 || arg0 < Statics.field2390[var5] && arg1) && Statics.field511[var5] > 0) {
                        byte[] var6 = Statics.field2339[var5][--Statics.field511[var5]];
                        Statics.field2339[var5][Statics.field511[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field2390 != null) {
                for (int var7 = 0; var7 < Statics.field2390.length; var7++) {
                    if (arg0 <= Statics.field2390[var7] && Statics.field511[var7] < Statics.field2339[var7].length) {
                        return new byte[Statics.field2390[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("bi.m(IS)[B")
    public static synchronized byte[] method1514(int arg0) {
        return method3462(arg0, false);
    }

    @ObfuscatedName("ab.j([BS)V")
    public static synchronized void method552(byte[] arg0) {
        if (arg0.length == 100 && field2393 < 1000) {
            field2394[++field2393 - 1] = arg0;
        } else if (arg0.length == 5000 && field2392 < 250) {
            field2395[++field2392 - 1] = arg0;
        } else if (arg0.length == 30000 && field2391 < 50) {
            field2389[++field2391 - 1] = arg0;
        } else if (Statics.field2339 != null) {
            for (int var1 = 0; var1 < Statics.field2390.length; var1++) {
                if (Statics.field2390[var1] == arg0.length && Statics.field511[var1] < Statics.field2339[var1].length) {
                    Statics.field2339[var1][Statics.field511[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
