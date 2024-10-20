package deob;

@ObfuscatedName("km")
public class class302 {

    @ObfuscatedName("km.s")
    public static int field3715 = 0;

    @ObfuscatedName("km.j")
    public static int field3710 = 0;

    @ObfuscatedName("km.i")
    public static int field3713 = 0;

    @ObfuscatedName("km.k")
    public static byte[][] field3712 = new byte[1000][];

    @ObfuscatedName("km.u")
    public static byte[][] field3716 = new byte[250][];

    @ObfuscatedName("km.n")
    public static byte[][] field3711 = new byte[50][];

    public class302() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("km.s(IZB)[B")
    public static synchronized byte[] method5301(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3715 > 0) {
            byte[] var2 = field3712[--field3715];
            field3712[field3715] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3710 > 0) {
            byte[] var3 = field3716[--field3710];
            field3716[field3710] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3713 > 0) {
            byte[] var4 = field3711[--field3713];
            field3711[field3713] = null;
            return var4;
        } else {
            if (Statics.field1867 != null) {
                for (int var5 = 0; var5 < Statics.field1951.length; var5++) {
                    if ((Statics.field1951[var5] == arg0 || arg0 < Statics.field1951[var5] && arg1) && Statics.field3714[var5] > 0) {
                        byte[] var6 = Statics.field1867[var5][--Statics.field3714[var5]];
                        Statics.field1867[var5][Statics.field3714[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field1951 != null) {
                for (int var7 = 0; var7 < Statics.field1951.length; var7++) {
                    if (arg0 <= Statics.field1951[var7] && Statics.field3714[var7] < Statics.field1867[var7].length) {
                        return new byte[Statics.field1951[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("bj.j(IB)[B")
    public static synchronized byte[] method1000(int arg0) {
        return method5301(arg0, false);
    }

    @ObfuscatedName("iq.i([BB)V")
    public static synchronized void method3978(byte[] arg0) {
        if (arg0.length == 100 && field3715 < 1000) {
            field3712[++field3715 - 1] = arg0;
        } else if (arg0.length == 5000 && field3710 < 250) {
            field3716[++field3710 - 1] = arg0;
        } else if (arg0.length == 30000 && field3713 < 50) {
            field3711[++field3713 - 1] = arg0;
        } else if (Statics.field1867 != null) {
            for (int var1 = 0; var1 < Statics.field1951.length; var1++) {
                if (Statics.field1951[var1] == arg0.length && Statics.field3714[var1] < Statics.field1867[var1].length) {
                    Statics.field1867[var1][Statics.field3714[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
