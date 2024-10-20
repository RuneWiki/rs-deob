package deob;

@ObfuscatedName("gb")
public class class186 {

    @ObfuscatedName("gb.f")
    public static int field2409 = 0;

    @ObfuscatedName("gb.h")
    public static int field2406 = 0;

    @ObfuscatedName("gb.e")
    public static int field2407 = 0;

    @ObfuscatedName("gb.b")
    public static byte[][] field2408 = new byte[1000][];

    @ObfuscatedName("gb.l")
    public static byte[][] field2410 = new byte[250][];

    @ObfuscatedName("gb.w")
    public static byte[][] field2405 = new byte[50][];

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gb.f(IZB)[B")
    public static synchronized byte[] method3548(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2409 > 0) {
            byte[] var2 = field2408[--field2409];
            field2408[field2409] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2406 > 0) {
            byte[] var3 = field2410[--field2406];
            field2410[field2406] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2407 > 0) {
            byte[] var4 = field2405[--field2407];
            field2405[field2407] = null;
            return var4;
        } else {
            if (Statics.field2412 != null) {
                for (int var5 = 0; var5 < Statics.field2411.length; var5++) {
                    if ((Statics.field2411[var5] == arg0 || arg0 < Statics.field2411[var5] && arg1) && Statics.field178[var5] > 0) {
                        byte[] var6 = Statics.field2412[var5][--Statics.field178[var5]];
                        Statics.field2412[var5][Statics.field178[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field2411 != null) {
                for (int var7 = 0; var7 < Statics.field2411.length; var7++) {
                    if (arg0 <= Statics.field2411[var7] && Statics.field178[var7] < Statics.field2412[var7].length) {
                        return new byte[Statics.field2411[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("kh.e([BS)V")
    public static synchronized void method5076(byte[] arg0) {
        if (arg0.length == 100 && field2409 < 1000) {
            field2408[++field2409 - 1] = arg0;
        } else if (arg0.length == 5000 && field2406 < 250) {
            field2410[++field2406 - 1] = arg0;
        } else if (arg0.length == 30000 && field2407 < 50) {
            field2405[++field2407 - 1] = arg0;
        } else if (Statics.field2412 != null) {
            for (int var1 = 0; var1 < Statics.field2411.length; var1++) {
                if (Statics.field2411[var1] == arg0.length && Statics.field178[var1] < Statics.field2412[var1].length) {
                    Statics.field2412[var1][Statics.field178[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
