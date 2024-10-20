package deob;

@ObfuscatedName("ka")
public class class303 {

    @ObfuscatedName("ka.c")
    public static int field3717 = 0;

    @ObfuscatedName("ka.t")
    public static int field3711 = 0;

    @ObfuscatedName("ka.o")
    public static int field3712 = 0;

    @ObfuscatedName("ka.e")
    public static byte[][] field3713 = new byte[1000][];

    @ObfuscatedName("ka.i")
    public static byte[][] field3710 = new byte[250][];

    @ObfuscatedName("ka.g")
    public static byte[][] field3714 = new byte[50][];

    public class303() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("he.c([I[IB)V")
    public static void method3832(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field3716 = null;
            Statics.field3196 = null;
            Statics.field3715 = (byte[][][]) null;
            return;
        }
        Statics.field3716 = arg0;
        Statics.field3196 = new int[arg0.length];
        Statics.field3715 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field3716.length; var2++) {
            Statics.field3715[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("ka.t(IZI)[B")
    public static synchronized byte[] method5379(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3717 > 0) {
            byte[] var2 = field3713[--field3717];
            field3713[field3717] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3711 > 0) {
            byte[] var3 = field3710[--field3711];
            field3710[field3711] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3712 > 0) {
            byte[] var4 = field3714[--field3712];
            field3714[field3712] = null;
            return var4;
        } else {
            if (Statics.field3715 != null) {
                for (int var5 = 0; var5 < Statics.field3716.length; var5++) {
                    if ((Statics.field3716[var5] == arg0 || arg0 < Statics.field3716[var5] && arg1) && Statics.field3196[var5] > 0) {
                        byte[] var6 = Statics.field3715[var5][--Statics.field3196[var5]];
                        Statics.field3715[var5][Statics.field3196[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field3716 != null) {
                for (int var7 = 0; var7 < Statics.field3716.length; var7++) {
                    if (arg0 <= Statics.field3716[var7] && Statics.field3196[var7] < Statics.field3715[var7].length) {
                        return new byte[Statics.field3716[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("j.o(II)[B")
    public static synchronized byte[] method87(int arg0) {
        return method5379(arg0, false);
    }
}
