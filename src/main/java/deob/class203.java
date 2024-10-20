package deob;

@ObfuscatedName("gi")
public class class203 {

    @ObfuscatedName("gi.m")
    public static int field2446 = 0;

    @ObfuscatedName("gi.f")
    public static int field2444 = 0;

    @ObfuscatedName("gi.q")
    public static int field2442 = 0;

    @ObfuscatedName("gi.w")
    public static byte[][] field2445 = new byte[1000][];

    @ObfuscatedName("gi.o")
    public static byte[][] field2443 = new byte[250][];

    @ObfuscatedName("gi.u")
    public static byte[][] field2447 = new byte[50][];

    public class203() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.m([I[II)V")
    public static void method542(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field2448 = null;
            Statics.field279 = null;
            Statics.field2129 = (byte[][][]) null;
            return;
        }
        Statics.field2448 = arg0;
        Statics.field279 = new int[arg0.length];
        Statics.field2129 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field2448.length; var2++) {
            Statics.field2129[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("gi.f(IZI)[B")
    public static synchronized byte[] method3645(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2446 > 0) {
            byte[] var2 = field2445[--field2446];
            field2445[field2446] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2444 > 0) {
            byte[] var3 = field2443[--field2444];
            field2443[field2444] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2442 > 0) {
            byte[] var4 = field2447[--field2442];
            field2447[field2442] = null;
            return var4;
        } else {
            if (Statics.field2129 != null) {
                for (int var5 = 0; var5 < Statics.field2448.length; var5++) {
                    if ((Statics.field2448[var5] == arg0 || arg0 < Statics.field2448[var5] && arg1) && Statics.field279[var5] > 0) {
                        byte[] var6 = Statics.field2129[var5][--Statics.field279[var5]];
                        Statics.field2129[var5][Statics.field279[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field2448 != null) {
                for (int var7 = 0; var7 < Statics.field2448.length; var7++) {
                    if (arg0 <= Statics.field2448[var7] && Statics.field279[var7] < Statics.field2129[var7].length) {
                        return new byte[Statics.field2448[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("ao.q(II)[B")
    public static synchronized byte[] method724(int arg0) {
        return method3645(arg0, false);
    }

    @ObfuscatedName("dq.w([BB)V")
    public static synchronized void method2733(byte[] arg0) {
        if (arg0.length == 100 && field2446 < 1000) {
            field2445[++field2446 - 1] = arg0;
        } else if (arg0.length == 5000 && field2444 < 250) {
            field2443[++field2444 - 1] = arg0;
        } else if (arg0.length == 30000 && field2442 < 50) {
            field2447[++field2442 - 1] = arg0;
        } else if (Statics.field2129 != null) {
            for (int var1 = 0; var1 < Statics.field2448.length; var1++) {
                if (Statics.field2448[var1] == arg0.length && Statics.field279[var1] < Statics.field2129[var1].length) {
                    Statics.field2129[var1][Statics.field279[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
