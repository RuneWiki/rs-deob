package deob;

@ObfuscatedName("kl")
public class class312 {

    @ObfuscatedName("kl.x")
    public static int field3719 = 0;

    @ObfuscatedName("kl.m")
    public static int field3717 = 0;

    @ObfuscatedName("kl.k")
    public static int field3721 = 0;

    @ObfuscatedName("kl.d")
    public static byte[][] field3724 = new byte[1000][];

    @ObfuscatedName("kl.w")
    public static byte[][] field3720 = new byte[250][];

    @ObfuscatedName("kl.v")
    public static byte[][] field3722 = new byte[50][];

    public class312() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kl.x(IZI)[B")
    public static synchronized byte[] method5395(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3719 > 0) {
            byte[] var2 = field3724[--field3719];
            field3724[field3719] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3717 > 0) {
            byte[] var3 = field3720[--field3717];
            field3720[field3717] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3721 > 0) {
            byte[] var4 = field3722[--field3721];
            field3722[field3721] = null;
            return var4;
        } else {
            if (Statics.field3723 != null) {
                for (int var5 = 0; var5 < Statics.field4068.length; var5++) {
                    if ((Statics.field4068[var5] == arg0 || arg0 < Statics.field4068[var5] && arg1) && Statics.field3716[var5] > 0) {
                        byte[] var6 = Statics.field3723[var5][--Statics.field3716[var5]];
                        Statics.field3723[var5][Statics.field3716[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field4068 != null) {
                for (int var7 = 0; var7 < Statics.field4068.length; var7++) {
                    if (arg0 <= Statics.field4068[var7] && Statics.field3716[var7] < Statics.field3723[var7].length) {
                        return new byte[Statics.field4068[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("gg.m(II)[B")
    public static synchronized byte[] method3347(int arg0) {
        return method5395(arg0, false);
    }

    @ObfuscatedName("aw.k([BI)V")
    public static synchronized void method743(byte[] arg0) {
        if (arg0.length == 100 && field3719 < 1000) {
            field3724[++field3719 - 1] = arg0;
        } else if (arg0.length == 5000 && field3717 < 250) {
            field3720[++field3717 - 1] = arg0;
        } else if (arg0.length == 30000 && field3721 < 50) {
            field3722[++field3721 - 1] = arg0;
        } else if (Statics.field3723 != null) {
            for (int var1 = 0; var1 < Statics.field4068.length; var1++) {
                if (Statics.field4068[var1] == arg0.length && Statics.field3716[var1] < Statics.field3723[var1].length) {
                    Statics.field3723[var1][Statics.field3716[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
