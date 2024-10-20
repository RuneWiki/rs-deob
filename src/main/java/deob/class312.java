package deob;

@ObfuscatedName("kh")
public class class312 {

    @ObfuscatedName("kh.m")
    public static int field3746 = 0;

    @ObfuscatedName("kh.o")
    public static int field3743 = 0;

    @ObfuscatedName("kh.q")
    public static int field3744 = 0;

    @ObfuscatedName("kh.j")
    public static byte[][] field3745 = new byte[1000][];

    @ObfuscatedName("kh.p")
    public static byte[][] field3742 = new byte[250][];

    @ObfuscatedName("kh.g")
    public static byte[][] field3747 = new byte[50][];

    public class312() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jv.m([I[II)V")
    public static void method4721(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field3336 = null;
            Statics.field3335 = null;
            Statics.field3692 = (byte[][][]) null;
            return;
        }
        Statics.field3336 = arg0;
        Statics.field3335 = new int[arg0.length];
        Statics.field3692 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field3336.length; var2++) {
            Statics.field3692[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("kh.o(IZI)[B")
    public static synchronized byte[] method5500(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3746 > 0) {
            byte[] var2 = field3745[--field3746];
            field3745[field3746] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3743 > 0) {
            byte[] var3 = field3742[--field3743];
            field3742[field3743] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3744 > 0) {
            byte[] var4 = field3747[--field3744];
            field3747[field3744] = null;
            return var4;
        } else {
            if (Statics.field3692 != null) {
                for (int var5 = 0; var5 < Statics.field3336.length; var5++) {
                    if ((Statics.field3336[var5] == arg0 || arg0 < Statics.field3336[var5] && arg1) && Statics.field3335[var5] > 0) {
                        byte[] var6 = Statics.field3692[var5][--Statics.field3335[var5]];
                        Statics.field3692[var5][Statics.field3335[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field3336 != null) {
                for (int var7 = 0; var7 < Statics.field3336.length; var7++) {
                    if (arg0 <= Statics.field3336[var7] && Statics.field3335[var7] < Statics.field3692[var7].length) {
                        return new byte[Statics.field3336[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("ai.q(II)[B")
    public static synchronized byte[] method238(int arg0) {
        return method5500(arg0, false);
    }

    @ObfuscatedName("jf.j([BI)V")
    public static synchronized void method4795(byte[] arg0) {
        if (arg0.length == 100 && field3746 < 1000) {
            field3745[++field3746 - 1] = arg0;
        } else if (arg0.length == 5000 && field3743 < 250) {
            field3742[++field3743 - 1] = arg0;
        } else if (arg0.length == 30000 && field3744 < 50) {
            field3747[++field3744 - 1] = arg0;
        } else if (Statics.field3692 != null) {
            for (int var1 = 0; var1 < Statics.field3336.length; var1++) {
                if (Statics.field3336[var1] == arg0.length && Statics.field3335[var1] < Statics.field3692[var1].length) {
                    Statics.field3692[var1][Statics.field3335[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
