package deob;

@ObfuscatedName("kt")
public class class302 {

    @ObfuscatedName("kt.z")
    public static int field3713 = 0;

    @ObfuscatedName("kt.n")
    public static int field3707 = 0;

    @ObfuscatedName("kt.v")
    public static int field3708 = 0;

    @ObfuscatedName("kt.u")
    public static byte[][] field3706 = new byte[1000][];

    @ObfuscatedName("kt.r")
    public static byte[][] field3705 = new byte[250][];

    @ObfuscatedName("kt.p")
    public static byte[][] field3709 = new byte[50][];

    public class302() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kt.z(IZB)[B")
    public static synchronized byte[] method5244(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3713 > 0) {
            byte[] var2 = field3706[--field3713];
            field3706[field3713] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3707 > 0) {
            byte[] var3 = field3705[--field3707];
            field3705[field3707] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3708 > 0) {
            byte[] var4 = field3709[--field3708];
            field3709[field3708] = null;
            return var4;
        } else {
            if (Statics.field1138 != null) {
                for (int var5 = 0; var5 < Statics.field3710.length; var5++) {
                    if ((Statics.field3710[var5] == arg0 || arg0 < Statics.field3710[var5] && arg1) && Statics.field3711[var5] > 0) {
                        byte[] var6 = Statics.field1138[var5][--Statics.field3711[var5]];
                        Statics.field1138[var5][Statics.field3711[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field3710 != null) {
                for (int var7 = 0; var7 < Statics.field3710.length; var7++) {
                    if (arg0 <= Statics.field3710[var7] && Statics.field3711[var7] < Statics.field1138[var7].length) {
                        return new byte[Statics.field3710[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("ap.n(II)[B")
    public static synchronized byte[] method501(int arg0) {
        return method5244(arg0, false);
    }

    @ObfuscatedName("cv.v([BI)V")
    public static synchronized void method1863(byte[] arg0) {
        if (arg0.length == 100 && field3713 < 1000) {
            field3706[++field3713 - 1] = arg0;
        } else if (arg0.length == 5000 && field3707 < 250) {
            field3705[++field3707 - 1] = arg0;
        } else if (arg0.length == 30000 && field3708 < 50) {
            field3709[++field3708 - 1] = arg0;
        } else if (Statics.field1138 != null) {
            for (int var1 = 0; var1 < Statics.field3710.length; var1++) {
                if (Statics.field3710[var1] == arg0.length && Statics.field3711[var1] < Statics.field1138[var1].length) {
                    Statics.field1138[var1][Statics.field3711[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
