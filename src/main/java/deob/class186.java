package deob;

@ObfuscatedName("ge")
public class class186 {

    @ObfuscatedName("ge.a")
    public static int field2522 = 0;

    @ObfuscatedName("ge.w")
    public static int field2520 = 0;

    @ObfuscatedName("ge.e")
    public static int field2521 = 0;

    @ObfuscatedName("ge.k")
    public static byte[][] field2525 = new byte[1000][];

    @ObfuscatedName("ge.u")
    public static byte[][] field2523 = new byte[250][];

    @ObfuscatedName("ge.z")
    public static byte[][] field2524 = new byte[50][];

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.a([I[II)V")
    public static void method161(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field1190 = null;
            Statics.field2519 = null;
            Statics.field325 = (byte[][][]) null;
            return;
        }
        Statics.field1190 = arg0;
        Statics.field2519 = new int[arg0.length];
        Statics.field325 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field1190.length; var2++) {
            Statics.field325[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("ge.w(IZI)[B")
    public static synchronized byte[] method3206(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2522 > 0) {
            byte[] var2 = field2525[--field2522];
            field2525[field2522] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2520 > 0) {
            byte[] var3 = field2523[--field2520];
            field2523[field2520] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2521 > 0) {
            byte[] var4 = field2524[--field2521];
            field2524[field2521] = null;
            return var4;
        } else {
            if (Statics.field325 != null) {
                for (int var5 = 0; var5 < Statics.field1190.length; var5++) {
                    if ((Statics.field1190[var5] == arg0 || arg0 < Statics.field1190[var5] && arg1) && Statics.field2519[var5] > 0) {
                        byte[] var6 = Statics.field325[var5][--Statics.field2519[var5]];
                        Statics.field325[var5][Statics.field2519[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field1190 != null) {
                for (int var7 = 0; var7 < Statics.field1190.length; var7++) {
                    if (arg0 <= Statics.field1190[var7] && Statics.field2519[var7] < Statics.field325[var7].length) {
                        return new byte[Statics.field1190[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("de.e(IB)[B")
    public static synchronized byte[] method1911(int arg0) {
        return method3206(arg0, false);
    }

    @ObfuscatedName("al.k([BI)V")
    public static synchronized void method478(byte[] arg0) {
        if (arg0.length == 100 && field2522 < 1000) {
            field2525[++field2522 - 1] = arg0;
        } else if (arg0.length == 5000 && field2520 < 250) {
            field2523[++field2520 - 1] = arg0;
        } else if (arg0.length == 30000 && field2521 < 50) {
            field2524[++field2521 - 1] = arg0;
        } else if (Statics.field325 != null) {
            for (int var1 = 0; var1 < Statics.field1190.length; var1++) {
                if (Statics.field1190[var1] == arg0.length && Statics.field2519[var1] < Statics.field325[var1].length) {
                    Statics.field325[var1][Statics.field2519[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
