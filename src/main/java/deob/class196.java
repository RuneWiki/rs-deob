package deob;

@ObfuscatedName("gx")
public class class196 {

    @ObfuscatedName("gx.c")
    public static int field2573 = 0;

    @ObfuscatedName("gx.i")
    public static int field2578 = 0;

    @ObfuscatedName("gx.o")
    public static int field2575 = 0;

    @ObfuscatedName("gx.j")
    public static byte[][] field2576 = new byte[1000][];

    @ObfuscatedName("gx.k")
    public static byte[][] field2577 = new byte[250][];

    @ObfuscatedName("gx.x")
    public static byte[][] field2574 = new byte[50][];

    public class196() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gx.c(IZB)[B")
    public static synchronized byte[] method3448(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2573 > 0) {
            byte[] var2 = field2576[--field2573];
            field2576[field2573] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2578 > 0) {
            byte[] var3 = field2577[--field2578];
            field2577[field2578] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2575 > 0) {
            byte[] var4 = field2574[--field2575];
            field2574[field2575] = null;
            return var4;
        } else {
            if (Statics.field2579 != null) {
                for (int var5 = 0; var5 < Statics.field2492.length; var5++) {
                    if ((Statics.field2492[var5] == arg0 || arg0 < Statics.field2492[var5] && arg1) && Statics.field266[var5] > 0) {
                        byte[] var6 = Statics.field2579[var5][--Statics.field266[var5]];
                        Statics.field2579[var5][Statics.field266[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field2492 != null) {
                for (int var7 = 0; var7 < Statics.field2492.length; var7++) {
                    if (arg0 <= Statics.field2492[var7] && Statics.field266[var7] < Statics.field2579[var7].length) {
                        return new byte[Statics.field2492[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("ai.i(IB)[B")
    public static synchronized byte[] method258(int arg0) {
        return method3448(arg0, false);
    }

    @ObfuscatedName("ae.o([BI)V")
    public static synchronized void method495(byte[] arg0) {
        if (arg0.length == 100 && field2573 < 1000) {
            field2576[++field2573 - 1] = arg0;
        } else if (arg0.length == 5000 && field2578 < 250) {
            field2577[++field2578 - 1] = arg0;
        } else if (arg0.length == 30000 && field2575 < 50) {
            field2574[++field2575 - 1] = arg0;
        } else if (Statics.field2579 != null) {
            for (int var1 = 0; var1 < Statics.field2492.length; var1++) {
                if (Statics.field2492[var1] == arg0.length && Statics.field266[var1] < Statics.field2579[var1].length) {
                    Statics.field2579[var1][Statics.field266[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
