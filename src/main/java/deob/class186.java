package deob;

@ObfuscatedName("gg")
public class class186 {

    @ObfuscatedName("gg.n")
    public static int field2539 = 0;

    @ObfuscatedName("gg.v")
    public static int field2536 = 0;

    @ObfuscatedName("gg.y")
    public static int field2538 = 0;

    @ObfuscatedName("gg.r")
    public static byte[][] field2537 = new byte[1000][];

    @ObfuscatedName("gg.h")
    public static byte[][] field2540 = new byte[250][];

    @ObfuscatedName("gg.d")
    public static byte[][] field2543 = new byte[50][];

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gg.n(IZI)[B")
    public static synchronized byte[] method3242(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2539 > 0) {
            byte[] var2 = field2537[--field2539];
            field2537[field2539] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2536 > 0) {
            byte[] var3 = field2540[--field2536];
            field2540[field2536] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2538 > 0) {
            byte[] var4 = field2543[--field2538];
            field2543[field2538] = null;
            return var4;
        } else {
            if (Statics.field3405 != null) {
                for (int var5 = 0; var5 < Statics.field2043.length; var5++) {
                    if ((Statics.field2043[var5] == arg0 || arg0 < Statics.field2043[var5] && arg1) && Statics.field2542[var5] > 0) {
                        byte[] var6 = Statics.field3405[var5][--Statics.field2542[var5]];
                        Statics.field3405[var5][Statics.field2542[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field2043 != null) {
                for (int var7 = 0; var7 < Statics.field2043.length; var7++) {
                    if (arg0 <= Statics.field2043[var7] && Statics.field2542[var7] < Statics.field3405[var7].length) {
                        return new byte[Statics.field2043[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("fg.v(II)[B")
    public static synchronized byte[] method2991(int arg0) {
        return method3242(arg0, false);
    }

    @ObfuscatedName("be.y([BI)V")
    public static synchronized void method1004(byte[] arg0) {
        if (arg0.length == 100 && field2539 < 1000) {
            field2537[++field2539 - 1] = arg0;
        } else if (arg0.length == 5000 && field2536 < 250) {
            field2540[++field2536 - 1] = arg0;
        } else if (arg0.length == 30000 && field2538 < 50) {
            field2543[++field2538 - 1] = arg0;
        } else if (Statics.field3405 != null) {
            for (int var1 = 0; var1 < Statics.field2043.length; var1++) {
                if (Statics.field2043[var1] == arg0.length && Statics.field2542[var1] < Statics.field3405[var1].length) {
                    Statics.field3405[var1][Statics.field2542[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
