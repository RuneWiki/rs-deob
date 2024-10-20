package deob;

@ObfuscatedName("ln")
public class class313 {

    @ObfuscatedName("ln.f")
    public static int field3746 = 0;

    @ObfuscatedName("ln.b")
    public static int field3747 = 0;

    @ObfuscatedName("ln.l")
    public static int field3748 = 0;

    @ObfuscatedName("ln.m")
    public static byte[][] field3749 = new byte[1000][];

    @ObfuscatedName("ln.z")
    public static byte[][] field3750 = new byte[250][];

    @ObfuscatedName("ln.q")
    public static byte[][] field3751 = new byte[50][];

    public class313() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eb.f([I[II)V")
    public static void method3120(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field2553 = null;
            Statics.field1643 = null;
            Statics.field3752 = (byte[][][]) null;
            return;
        }
        Statics.field2553 = arg0;
        Statics.field1643 = new int[arg0.length];
        Statics.field3752 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field2553.length; var2++) {
            Statics.field3752[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("ln.b(IZI)[B")
    public static synchronized byte[] method5442(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3746 > 0) {
            byte[] var2 = field3749[--field3746];
            field3749[field3746] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3747 > 0) {
            byte[] var3 = field3750[--field3747];
            field3750[field3747] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3748 > 0) {
            byte[] var4 = field3751[--field3748];
            field3751[field3748] = null;
            return var4;
        } else {
            if (Statics.field3752 != null) {
                for (int var5 = 0; var5 < Statics.field2553.length; var5++) {
                    if ((Statics.field2553[var5] == arg0 || arg0 < Statics.field2553[var5] && arg1) && Statics.field1643[var5] > 0) {
                        byte[] var6 = Statics.field3752[var5][--Statics.field1643[var5]];
                        Statics.field3752[var5][Statics.field1643[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field2553 != null) {
                for (int var7 = 0; var7 < Statics.field2553.length; var7++) {
                    if (arg0 <= Statics.field2553[var7] && Statics.field1643[var7] < Statics.field3752[var7].length) {
                        return new byte[Statics.field2553[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("iz.l(II)[B")
    public static synchronized byte[] method3901(int arg0) {
        return method5442(arg0, false);
    }

    @ObfuscatedName("af.m([BI)V")
    public static synchronized void method298(byte[] arg0) {
        if (arg0.length == 100 && field3746 < 1000) {
            field3749[++field3746 - 1] = arg0;
        } else if (arg0.length == 5000 && field3747 < 250) {
            field3750[++field3747 - 1] = arg0;
        } else if (arg0.length == 30000 && field3748 < 50) {
            field3751[++field3748 - 1] = arg0;
        } else if (Statics.field3752 != null) {
            for (int var1 = 0; var1 < Statics.field2553.length; var1++) {
                if (Statics.field2553[var1] == arg0.length && Statics.field1643[var1] < Statics.field3752[var1].length) {
                    Statics.field3752[var1][Statics.field1643[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
