package deob;

@ObfuscatedName("ky")
public class class302 {

    @ObfuscatedName("ky.c")
    public static int field3709 = 0;

    @ObfuscatedName("ky.x")
    public static int field3704 = 0;

    @ObfuscatedName("ky.t")
    public static int field3702 = 0;

    @ObfuscatedName("ky.g")
    public static byte[][] field3706 = new byte[1000][];

    @ObfuscatedName("ky.l")
    public static byte[][] field3703 = new byte[250][];

    @ObfuscatedName("ky.u")
    public static byte[][] field3705 = new byte[50][];

    public class302() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ba.c([I[IB)V")
    public static void method1671(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field3701 = null;
            Statics.field1155 = null;
            Statics.field344 = (byte[][][]) null;
            return;
        }
        Statics.field3701 = arg0;
        Statics.field1155 = new int[arg0.length];
        Statics.field344 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field3701.length; var2++) {
            Statics.field344[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("ky.x(IZI)[B")
    public static synchronized byte[] method5376(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3709 > 0) {
            byte[] var2 = field3706[--field3709];
            field3706[field3709] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3704 > 0) {
            byte[] var3 = field3703[--field3704];
            field3703[field3704] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3702 > 0) {
            byte[] var4 = field3705[--field3702];
            field3705[field3702] = null;
            return var4;
        } else {
            if (Statics.field344 != null) {
                for (int var5 = 0; var5 < Statics.field3701.length; var5++) {
                    if ((Statics.field3701[var5] == arg0 || arg0 < Statics.field3701[var5] && arg1) && Statics.field1155[var5] > 0) {
                        byte[] var6 = Statics.field344[var5][--Statics.field1155[var5]];
                        Statics.field344[var5][Statics.field1155[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field3701 != null) {
                for (int var7 = 0; var7 < Statics.field3701.length; var7++) {
                    if (arg0 <= Statics.field3701[var7] && Statics.field1155[var7] < Statics.field344[var7].length) {
                        return new byte[Statics.field3701[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("an.t(II)[B")
    public static synchronized byte[] method461(int arg0) {
        return method5376(arg0, false);
    }

    @ObfuscatedName("ft.g([BI)V")
    public static synchronized void method3152(byte[] arg0) {
        if (arg0.length == 100 && field3709 < 1000) {
            field3706[++field3709 - 1] = arg0;
        } else if (arg0.length == 5000 && field3704 < 250) {
            field3703[++field3704 - 1] = arg0;
        } else if (arg0.length == 30000 && field3702 < 50) {
            field3705[++field3702 - 1] = arg0;
        } else if (Statics.field344 != null) {
            for (int var1 = 0; var1 < Statics.field3701.length; var1++) {
                if (Statics.field3701[var1] == arg0.length && Statics.field1155[var1] < Statics.field344[var1].length) {
                    Statics.field344[var1][Statics.field1155[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
