package deob;

@ObfuscatedName("gv")
public class class191 {

    @ObfuscatedName("gv.n")
    public static int field2430 = 0;

    @ObfuscatedName("gv.h")
    public static int field2426 = 0;

    @ObfuscatedName("gv.l")
    public static int field2425 = 0;

    @ObfuscatedName("gv.g")
    public static byte[][] field2428 = new byte[1000][];

    @ObfuscatedName("gv.b")
    public static byte[][] field2432 = new byte[250][];

    @ObfuscatedName("gv.a")
    public static byte[][] field2429 = new byte[50][];

    public class191() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gv.n(IZI)[B")
    public static synchronized byte[] method3722(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2430 > 0) {
            byte[] var2 = field2428[--field2430];
            field2428[field2430] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2426 > 0) {
            byte[] var3 = field2432[--field2426];
            field2432[field2426] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2425 > 0) {
            byte[] var4 = field2429[--field2425];
            field2429[field2425] = null;
            return var4;
        } else {
            if (Statics.field45 != null) {
                for (int var5 = 0; var5 < Statics.field1877.length; var5++) {
                    if ((Statics.field1877[var5] == arg0 || arg0 < Statics.field1877[var5] && arg1) && Statics.field1857[var5] > 0) {
                        byte[] var6 = Statics.field45[var5][--Statics.field1857[var5]];
                        Statics.field45[var5][Statics.field1857[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field1877 != null) {
                for (int var7 = 0; var7 < Statics.field1877.length; var7++) {
                    if (arg0 <= Statics.field1877[var7] && Statics.field1857[var7] < Statics.field45[var7].length) {
                        return new byte[Statics.field1877[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("be.h(II)[B")
    public static synchronized byte[] method994(int arg0) {
        return method3722(arg0, false);
    }

    @ObfuscatedName("dt.l([BI)V")
    public static synchronized void method2514(byte[] arg0) {
        if (arg0.length == 100 && field2430 < 1000) {
            field2428[++field2430 - 1] = arg0;
        } else if (arg0.length == 5000 && field2426 < 250) {
            field2432[++field2426 - 1] = arg0;
        } else if (arg0.length == 30000 && field2425 < 50) {
            field2429[++field2425 - 1] = arg0;
        } else if (Statics.field45 != null) {
            for (int var1 = 0; var1 < Statics.field1877.length; var1++) {
                if (Statics.field1877[var1] == arg0.length && Statics.field1857[var1] < Statics.field45[var1].length) {
                    Statics.field45[var1][Statics.field1857[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
