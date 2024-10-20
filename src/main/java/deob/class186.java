package deob;

@ObfuscatedName("gw")
public class class186 {

    @ObfuscatedName("gw.f")
    public static int field2430 = 0;

    @ObfuscatedName("gw.l")
    public static int field2429 = 0;

    @ObfuscatedName("gw.w")
    public static int field2423 = 0;

    @ObfuscatedName("gw.s")
    public static byte[][] field2424 = new byte[1000][];

    @ObfuscatedName("gw.e")
    public static byte[][] field2422 = new byte[250][];

    @ObfuscatedName("gw.a")
    public static byte[][] field2426 = new byte[50][];

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gw.f(IZI)[B")
    public static synchronized byte[] method3569(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2430 > 0) {
            byte[] var2 = field2424[--field2430];
            field2424[field2430] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2429 > 0) {
            byte[] var3 = field2422[--field2429];
            field2422[field2429] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2423 > 0) {
            byte[] var4 = field2426[--field2423];
            field2426[field2423] = null;
            return var4;
        } else {
            if (Statics.field1982 != null) {
                for (int var5 = 0; var5 < Statics.field2427.length; var5++) {
                    if ((Statics.field2427[var5] == arg0 || arg0 < Statics.field2427[var5] && arg1) && Statics.field2425[var5] > 0) {
                        byte[] var6 = Statics.field1982[var5][--Statics.field2425[var5]];
                        Statics.field1982[var5][Statics.field2425[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field2427 != null) {
                for (int var7 = 0; var7 < Statics.field2427.length; var7++) {
                    if (arg0 <= Statics.field2427[var7] && Statics.field2425[var7] < Statics.field1982[var7].length) {
                        return new byte[Statics.field2427[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("fj.l(II)[B")
    public static synchronized byte[] method3141(int arg0) {
        return method3569(arg0, false);
    }

    @ObfuscatedName("bb.w([BI)V")
    public static synchronized void method1634(byte[] arg0) {
        if (arg0.length == 100 && field2430 < 1000) {
            field2424[++field2430 - 1] = arg0;
        } else if (arg0.length == 5000 && field2429 < 250) {
            field2422[++field2429 - 1] = arg0;
        } else if (arg0.length == 30000 && field2423 < 50) {
            field2426[++field2423 - 1] = arg0;
        } else if (Statics.field1982 != null) {
            for (int var1 = 0; var1 < Statics.field2427.length; var1++) {
                if (Statics.field2427[var1] == arg0.length && Statics.field2425[var1] < Statics.field1982[var1].length) {
                    Statics.field1982[var1][Statics.field2425[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
