package deob;

@ObfuscatedName("gd")
public class class186 {

    @ObfuscatedName("gd.s")
    public static int field2521 = 0;

    @ObfuscatedName("gd.g")
    public static int field2520 = 0;

    @ObfuscatedName("gd.m")
    public static int field2522 = 0;

    @ObfuscatedName("gd.h")
    public static byte[][] field2523 = new byte[1000][];

    @ObfuscatedName("gd.i")
    public static byte[][] field2519 = new byte[250][];

    @ObfuscatedName("gd.w")
    public static byte[][] field2524 = new byte[50][];

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.s([I[II)V")
    public static void method3130(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field1476 = null;
            Statics.field288 = null;
            Statics.field2732 = (byte[][][]) null;
            return;
        }
        Statics.field1476 = arg0;
        Statics.field288 = new int[arg0.length];
        Statics.field2732 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field1476.length; var2++) {
            Statics.field2732[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("gd.g(IZI)[B")
    public static synchronized byte[] method3484(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2521 > 0) {
            byte[] var2 = field2523[--field2521];
            field2523[field2521] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2520 > 0) {
            byte[] var3 = field2519[--field2520];
            field2519[field2520] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2522 > 0) {
            byte[] var4 = field2524[--field2522];
            field2524[field2522] = null;
            return var4;
        } else {
            if (Statics.field2732 != null) {
                for (int var5 = 0; var5 < Statics.field1476.length; var5++) {
                    if ((Statics.field1476[var5] == arg0 || arg0 < Statics.field1476[var5] && arg1) && Statics.field288[var5] > 0) {
                        byte[] var6 = Statics.field2732[var5][--Statics.field288[var5]];
                        Statics.field2732[var5][Statics.field288[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field1476 != null) {
                for (int var7 = 0; var7 < Statics.field1476.length; var7++) {
                    if (arg0 <= Statics.field1476[var7] && Statics.field288[var7] < Statics.field2732[var7].length) {
                        return new byte[Statics.field1476[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("f.m(IB)[B")
    public static synchronized byte[] method68(int arg0) {
        return method3484(arg0, false);
    }

    @ObfuscatedName("fs.h([BI)V")
    public static synchronized void method3201(byte[] arg0) {
        if (arg0.length == 100 && field2521 < 1000) {
            field2523[++field2521 - 1] = arg0;
        } else if (arg0.length == 5000 && field2520 < 250) {
            field2519[++field2520 - 1] = arg0;
        } else if (arg0.length == 30000 && field2522 < 50) {
            field2524[++field2522 - 1] = arg0;
        } else if (Statics.field2732 != null) {
            for (int var1 = 0; var1 < Statics.field1476.length; var1++) {
                if (Statics.field1476[var1] == arg0.length && Statics.field288[var1] < Statics.field2732[var1].length) {
                    Statics.field2732[var1][Statics.field288[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
