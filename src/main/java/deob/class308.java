package deob;

@ObfuscatedName("ke")
public class class308 {

    @ObfuscatedName("ke.v")
    public static int field3760 = 0;

    @ObfuscatedName("ke.n")
    public static int field3755 = 0;

    @ObfuscatedName("ke.f")
    public static int field3756 = 0;

    @ObfuscatedName("ke.y")
    public static byte[][] field3757 = new byte[1000][];

    @ObfuscatedName("ke.p")
    public static byte[][] field3758 = new byte[250][];

    @ObfuscatedName("ke.j")
    public static byte[][] field3759 = new byte[50][];

    public class308() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cr.v([I[II)V")
    public static void method1794(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field3754 = null;
            Statics.field3761 = null;
            Statics.field184 = (byte[][][]) null;
            return;
        }
        Statics.field3754 = arg0;
        Statics.field3761 = new int[arg0.length];
        Statics.field184 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field3754.length; var2++) {
            Statics.field184[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("ke.n(IZB)[B")
    public static synchronized byte[] method5101(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3760 > 0) {
            byte[] var2 = field3757[--field3760];
            field3757[field3760] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3755 > 0) {
            byte[] var3 = field3758[--field3755];
            field3758[field3755] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3756 > 0) {
            byte[] var4 = field3759[--field3756];
            field3759[field3756] = null;
            return var4;
        } else {
            if (Statics.field184 != null) {
                for (int var5 = 0; var5 < Statics.field3754.length; var5++) {
                    if ((Statics.field3754[var5] == arg0 || arg0 < Statics.field3754[var5] && arg1) && Statics.field3761[var5] > 0) {
                        byte[] var6 = Statics.field184[var5][--Statics.field3761[var5]];
                        Statics.field184[var5][Statics.field3761[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field3754 != null) {
                for (int var7 = 0; var7 < Statics.field3754.length; var7++) {
                    if (arg0 <= Statics.field3754[var7] && Statics.field3761[var7] < Statics.field184[var7].length) {
                        return new byte[Statics.field3754[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("j.f(IS)[B")
    public static synchronized byte[] method43(int arg0) {
        return method5101(arg0, false);
    }

    @ObfuscatedName("gv.y([BI)V")
    public static synchronized void method3398(byte[] arg0) {
        if (arg0.length == 100 && field3760 < 1000) {
            field3757[++field3760 - 1] = arg0;
        } else if (arg0.length == 5000 && field3755 < 250) {
            field3758[++field3755 - 1] = arg0;
        } else if (arg0.length == 30000 && field3756 < 50) {
            field3759[++field3756 - 1] = arg0;
        } else if (Statics.field184 != null) {
            for (int var1 = 0; var1 < Statics.field3754.length; var1++) {
                if (Statics.field3754[var1] == arg0.length && Statics.field3761[var1] < Statics.field184[var1].length) {
                    Statics.field184[var1][Statics.field3761[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
