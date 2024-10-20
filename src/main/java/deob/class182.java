package deob;

@ObfuscatedName("fm")
public class class182 {

    @ObfuscatedName("fm.b")
    public static int field2501 = 0;

    @ObfuscatedName("fm.s")
    public static int field2500 = 0;

    @ObfuscatedName("fm.r")
    public static int field2499 = 0;

    @ObfuscatedName("fm.g")
    public static byte[][] field2502 = new byte[1000][];

    @ObfuscatedName("fm.x")
    public static byte[][] field2503 = new byte[250][];

    @ObfuscatedName("fm.f")
    public static byte[][] field2504 = new byte[50][];

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fm.b(IZI)[B")
    public static synchronized byte[] method3165(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2501 > 0) {
            byte[] var2 = field2502[--field2501];
            field2502[field2501] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2500 > 0) {
            byte[] var3 = field2503[--field2500];
            field2503[field2500] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2499 > 0) {
            byte[] var4 = field2504[--field2499];
            field2504[field2499] = null;
            return var4;
        } else {
            if (Statics.field1324 != null) {
                for (int var5 = 0; var5 < Statics.field1955.length; var5++) {
                    if ((Statics.field1955[var5] == arg0 || arg0 < Statics.field1955[var5] && arg1) && Statics.field2505[var5] > 0) {
                        byte[] var6 = Statics.field1324[var5][--Statics.field2505[var5]];
                        Statics.field1324[var5][Statics.field2505[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field1955 != null) {
                for (int var7 = 0; var7 < Statics.field1955.length; var7++) {
                    if (arg0 <= Statics.field1955[var7] && Statics.field2505[var7] < Statics.field1324[var7].length) {
                        return new byte[Statics.field1955[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("bh.s(IB)[B")
    public static synchronized byte[] method937(int arg0) {
        return method3165(arg0, false);
    }

    @ObfuscatedName("fp.r([BS)V")
    public static synchronized void method2846(byte[] arg0) {
        if (arg0.length == 100 && field2501 < 1000) {
            field2502[++field2501 - 1] = arg0;
        } else if (arg0.length == 5000 && field2500 < 250) {
            field2503[++field2500 - 1] = arg0;
        } else if (arg0.length == 30000 && field2499 < 50) {
            field2504[++field2499 - 1] = arg0;
        } else if (Statics.field1324 != null) {
            for (int var1 = 0; var1 < Statics.field1955.length; var1++) {
                if (Statics.field1955[var1] == arg0.length && Statics.field2505[var1] < Statics.field1324[var1].length) {
                    Statics.field1324[var1][Statics.field2505[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
