package deob;

@ObfuscatedName("kg")
public class class312 {

    @ObfuscatedName("kg.z")
    public static int field3743 = 0;

    @ObfuscatedName("kg.k")
    public static int field3746 = 0;

    @ObfuscatedName("kg.s")
    public static int field3740 = 0;

    @ObfuscatedName("kg.t")
    public static byte[][] field3741 = new byte[1000][];

    @ObfuscatedName("kg.i")
    public static byte[][] field3738 = new byte[250][];

    @ObfuscatedName("kg.o")
    public static byte[][] field3747 = new byte[50][];

    public class312() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jr.z([I[II)V")
    public static void method4699(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field3744 = null;
            Statics.field3745 = null;
            Statics.field3742 = (byte[][][]) null;
            return;
        }
        Statics.field3744 = arg0;
        Statics.field3745 = new int[arg0.length];
        Statics.field3742 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field3744.length; var2++) {
            Statics.field3742[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("kg.k(IZB)[B")
    public static synchronized byte[] method5469(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3743 > 0) {
            byte[] var2 = field3741[--field3743];
            field3741[field3743] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3746 > 0) {
            byte[] var3 = field3738[--field3746];
            field3738[field3746] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3740 > 0) {
            byte[] var4 = field3747[--field3740];
            field3747[field3740] = null;
            return var4;
        } else {
            if (Statics.field3742 != null) {
                for (int var5 = 0; var5 < Statics.field3744.length; var5++) {
                    if ((Statics.field3744[var5] == arg0 || arg0 < Statics.field3744[var5] && arg1) && Statics.field3745[var5] > 0) {
                        byte[] var6 = Statics.field3742[var5][--Statics.field3745[var5]];
                        Statics.field3742[var5][Statics.field3745[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field3744 != null) {
                for (int var7 = 0; var7 < Statics.field3744.length; var7++) {
                    if (arg0 <= Statics.field3744[var7] && Statics.field3745[var7] < Statics.field3742[var7].length) {
                        return new byte[Statics.field3744[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("ks.s(II)[B")
    public static synchronized byte[] method4966(int arg0) {
        return method5469(arg0, false);
    }

    @ObfuscatedName("bi.t([BI)V")
    public static synchronized void method762(byte[] arg0) {
        if (arg0.length == 100 && field3743 < 1000) {
            field3741[++field3743 - 1] = arg0;
        } else if (arg0.length == 5000 && field3746 < 250) {
            field3738[++field3746 - 1] = arg0;
        } else if (arg0.length == 30000 && field3740 < 50) {
            field3747[++field3740 - 1] = arg0;
        } else if (Statics.field3742 != null) {
            for (int var1 = 0; var1 < Statics.field3744.length; var1++) {
                if (Statics.field3744[var1] == arg0.length && Statics.field3745[var1] < Statics.field3742[var1].length) {
                    Statics.field3742[var1][Statics.field3745[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
