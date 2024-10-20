package deob;

@ObfuscatedName("kz")
public class class302 {

    @ObfuscatedName("kz.a")
    public static int field3704 = 0;

    @ObfuscatedName("kz.t")
    public static int field3707 = 0;

    @ObfuscatedName("kz.n")
    public static int field3702 = 0;

    @ObfuscatedName("kz.q")
    public static byte[][] field3703 = new byte[1000][];

    @ObfuscatedName("kz.v")
    public static byte[][] field3701 = new byte[250][];

    @ObfuscatedName("kz.l")
    public static byte[][] field3705 = new byte[50][];

    public class302() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hx.a([I[II)V")
    public static void method3687(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field3706 = null;
            Statics.field2734 = null;
            Statics.field3453 = (byte[][][]) null;
            return;
        }
        Statics.field3706 = arg0;
        Statics.field2734 = new int[arg0.length];
        Statics.field3453 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field3706.length; var2++) {
            Statics.field3453[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("kz.t(IZI)[B")
    public static synchronized byte[] method5391(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3704 > 0) {
            byte[] var2 = field3703[--field3704];
            field3703[field3704] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3707 > 0) {
            byte[] var3 = field3701[--field3707];
            field3701[field3707] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3702 > 0) {
            byte[] var4 = field3705[--field3702];
            field3705[field3702] = null;
            return var4;
        } else {
            if (Statics.field3453 != null) {
                for (int var5 = 0; var5 < Statics.field3706.length; var5++) {
                    if ((Statics.field3706[var5] == arg0 || arg0 < Statics.field3706[var5] && arg1) && Statics.field2734[var5] > 0) {
                        byte[] var6 = Statics.field3453[var5][--Statics.field2734[var5]];
                        Statics.field3453[var5][Statics.field2734[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field3706 != null) {
                for (int var7 = 0; var7 < Statics.field3706.length; var7++) {
                    if (arg0 <= Statics.field3706[var7] && Statics.field2734[var7] < Statics.field3453[var7].length) {
                        return new byte[Statics.field3706[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("gt.q([BI)V")
    public static synchronized void method3446(byte[] arg0) {
        if (arg0.length == 100 && field3704 < 1000) {
            field3703[++field3704 - 1] = arg0;
        } else if (arg0.length == 5000 && field3707 < 250) {
            field3701[++field3707 - 1] = arg0;
        } else if (arg0.length == 30000 && field3702 < 50) {
            field3705[++field3702 - 1] = arg0;
        } else if (Statics.field3453 != null) {
            for (int var1 = 0; var1 < Statics.field3706.length; var1++) {
                if (Statics.field3706[var1] == arg0.length && Statics.field2734[var1] < Statics.field3453[var1].length) {
                    Statics.field3453[var1][Statics.field2734[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
