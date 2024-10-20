package deob;

@ObfuscatedName("kv")
public class class302 {

    @ObfuscatedName("kv.u")
    public static int field3719 = 0;

    @ObfuscatedName("kv.f")
    public static int field3714 = 0;

    @ObfuscatedName("kv.b")
    public static int field3715 = 0;

    @ObfuscatedName("kv.g")
    public static byte[][] field3713 = new byte[1000][];

    @ObfuscatedName("kv.z")
    public static byte[][] field3717 = new byte[250][];

    @ObfuscatedName("kv.p")
    public static byte[][] field3718 = new byte[50][];

    public class302() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kx.u([I[II)V")
    public static void method4897(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field226 = null;
            Statics.field2563 = null;
            Statics.field3716 = (byte[][][]) null;
            return;
        }
        Statics.field226 = arg0;
        Statics.field2563 = new int[arg0.length];
        Statics.field3716 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field226.length; var2++) {
            Statics.field3716[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("kv.f(IZI)[B")
    public static synchronized byte[] method5396(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3719 > 0) {
            byte[] var2 = field3713[--field3719];
            field3713[field3719] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3714 > 0) {
            byte[] var3 = field3717[--field3714];
            field3717[field3714] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3715 > 0) {
            byte[] var4 = field3718[--field3715];
            field3718[field3715] = null;
            return var4;
        } else {
            if (Statics.field3716 != null) {
                for (int var5 = 0; var5 < Statics.field226.length; var5++) {
                    if ((Statics.field226[var5] == arg0 || arg0 < Statics.field226[var5] && arg1) && Statics.field2563[var5] > 0) {
                        byte[] var6 = Statics.field3716[var5][--Statics.field2563[var5]];
                        Statics.field3716[var5][Statics.field2563[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field226 != null) {
                for (int var7 = 0; var7 < Statics.field226.length; var7++) {
                    if (arg0 <= Statics.field226[var7] && Statics.field2563[var7] < Statics.field3716[var7].length) {
                        return new byte[Statics.field226[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("eb.b(II)[B")
    public static synchronized byte[] method3137(int arg0) {
        return method5396(arg0, false);
    }

    @ObfuscatedName("ec.g([BI)V")
    public static synchronized void method2841(byte[] arg0) {
        if (arg0.length == 100 && field3719 < 1000) {
            field3713[++field3719 - 1] = arg0;
        } else if (arg0.length == 5000 && field3714 < 250) {
            field3717[++field3714 - 1] = arg0;
        } else if (arg0.length == 30000 && field3715 < 50) {
            field3718[++field3715 - 1] = arg0;
        } else if (Statics.field3716 != null) {
            for (int var1 = 0; var1 < Statics.field226.length; var1++) {
                if (Statics.field226[var1] == arg0.length && Statics.field2563[var1] < Statics.field3716[var1].length) {
                    Statics.field3716[var1][Statics.field2563[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
