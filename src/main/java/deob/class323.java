package deob;

@ObfuscatedName("ld")
public class class323 {

    @ObfuscatedName("ld.n")
    public static int field3868 = 0;

    @ObfuscatedName("ld.c")
    public static int field3871 = 0;

    @ObfuscatedName("ld.m")
    public static int field3869 = 0;

    @ObfuscatedName("ld.k")
    public static byte[][] field3874 = new byte[1000][];

    @ObfuscatedName("ld.o")
    public static byte[][] field3870 = new byte[250][];

    @ObfuscatedName("ld.g")
    public static byte[][] field3872 = new byte[50][];

    public class323() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ld.n(IZB)[B")
    public static synchronized byte[] method5336(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3868 > 0) {
            byte[] var2 = field3874[--field3868];
            field3874[field3868] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3871 > 0) {
            byte[] var3 = field3870[--field3871];
            field3870[field3871] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3869 > 0) {
            byte[] var4 = field3872[--field3869];
            field3872[field3869] = null;
            return var4;
        } else {
            if (Statics.field3867 != null) {
                for (int var5 = 0; var5 < Statics.field3873.length; var5++) {
                    if ((Statics.field3873[var5] == arg0 || arg0 < Statics.field3873[var5] && arg1) && Statics.field1240[var5] > 0) {
                        byte[] var6 = Statics.field3867[var5][--Statics.field1240[var5]];
                        Statics.field3867[var5][Statics.field1240[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field3873 != null) {
                for (int var7 = 0; var7 < Statics.field3873.length; var7++) {
                    if (arg0 <= Statics.field3873[var7] && Statics.field1240[var7] < Statics.field3867[var7].length) {
                        return new byte[Statics.field3873[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("a.c(II)[B")
    public static synchronized byte[] method63(int arg0) {
        return method5336(arg0, false);
    }

    @ObfuscatedName("gm.m([BI)V")
    public static synchronized void method3526(byte[] arg0) {
        if (arg0.length == 100 && field3868 < 1000) {
            field3874[++field3868 - 1] = arg0;
        } else if (arg0.length == 5000 && field3871 < 250) {
            field3870[++field3871 - 1] = arg0;
        } else if (arg0.length == 30000 && field3869 < 50) {
            field3872[++field3869 - 1] = arg0;
        } else if (Statics.field3867 != null) {
            for (int var1 = 0; var1 < Statics.field3873.length; var1++) {
                if (Statics.field3873[var1] == arg0.length && Statics.field1240[var1] < Statics.field3867[var1].length) {
                    Statics.field3867[var1][Statics.field1240[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
