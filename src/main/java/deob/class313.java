package deob;

@ObfuscatedName("lk")
public class class313 {

    @ObfuscatedName("lk.n")
    public static int field3752 = 0;

    @ObfuscatedName("lk.v")
    public static int field3756 = 0;

    @ObfuscatedName("lk.d")
    public static int field3753 = 0;

    @ObfuscatedName("lk.c")
    public static byte[][] field3754 = new byte[1000][];

    @ObfuscatedName("lk.y")
    public static byte[][] field3755 = new byte[250][];

    @ObfuscatedName("lk.h")
    public static byte[][] field3751 = new byte[50][];

    public class313() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hi.n([I[II)V")
    public static void method3959(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field3649 = null;
            Statics.field2582 = null;
            Statics.field3757 = (byte[][][]) null;
            return;
        }
        Statics.field3649 = arg0;
        Statics.field2582 = new int[arg0.length];
        Statics.field3757 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field3649.length; var2++) {
            Statics.field3757[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("lk.v(IZI)[B")
    public static synchronized byte[] method5536(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3752 > 0) {
            byte[] var2 = field3754[--field3752];
            field3754[field3752] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3756 > 0) {
            byte[] var3 = field3755[--field3756];
            field3755[field3756] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3753 > 0) {
            byte[] var4 = field3751[--field3753];
            field3751[field3753] = null;
            return var4;
        } else {
            if (Statics.field3757 != null) {
                for (int var5 = 0; var5 < Statics.field3649.length; var5++) {
                    if ((Statics.field3649[var5] == arg0 || arg0 < Statics.field3649[var5] && arg1) && Statics.field2582[var5] > 0) {
                        byte[] var6 = Statics.field3757[var5][--Statics.field2582[var5]];
                        Statics.field3757[var5][Statics.field2582[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field3649 != null) {
                for (int var7 = 0; var7 < Statics.field3649.length; var7++) {
                    if (arg0 <= Statics.field3649[var7] && Statics.field2582[var7] < Statics.field3757[var7].length) {
                        return new byte[Statics.field3649[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("r.d(II)[B")
    public static synchronized byte[] method207(int arg0) {
        return method5536(arg0, false);
    }
}
