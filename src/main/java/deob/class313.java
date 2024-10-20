package deob;

@ObfuscatedName("lt")
public class class313 {

    @ObfuscatedName("lt.h")
    public static int field3755 = 0;

    @ObfuscatedName("lt.v")
    public static int field3756 = 0;

    @ObfuscatedName("lt.x")
    public static int field3757 = 0;

    @ObfuscatedName("lt.w")
    public static byte[][] field3758 = new byte[1000][];

    @ObfuscatedName("lt.t")
    public static byte[][] field3759 = new byte[250][];

    @ObfuscatedName("lt.j")
    public static byte[][] field3760 = new byte[50][];

    public class313() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lt.h(IZB)[B")
    public static synchronized byte[] method5388(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3755 > 0) {
            byte[] var2 = field3758[--field3755];
            field3758[field3755] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3756 > 0) {
            byte[] var3 = field3759[--field3756];
            field3759[field3756] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3757 > 0) {
            byte[] var4 = field3760[--field3757];
            field3760[field3757] = null;
            return var4;
        } else {
            if (Statics.field110 != null) {
                for (int var5 = 0; var5 < Statics.field1461.length; var5++) {
                    if ((Statics.field1461[var5] == arg0 || arg0 < Statics.field1461[var5] && arg1) && Statics.field2070[var5] > 0) {
                        byte[] var6 = Statics.field110[var5][--Statics.field2070[var5]];
                        Statics.field110[var5][Statics.field2070[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field1461 != null) {
                for (int var7 = 0; var7 < Statics.field1461.length; var7++) {
                    if (arg0 <= Statics.field1461[var7] && Statics.field2070[var7] < Statics.field110[var7].length) {
                        return new byte[Statics.field1461[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("d.v(II)[B")
    public static synchronized byte[] method231(int arg0) {
        return method5388(arg0, false);
    }

    @ObfuscatedName("ec.x([BI)V")
    public static synchronized void method2715(byte[] arg0) {
        if (arg0.length == 100 && field3755 < 1000) {
            field3758[++field3755 - 1] = arg0;
        } else if (arg0.length == 5000 && field3756 < 250) {
            field3759[++field3756 - 1] = arg0;
        } else if (arg0.length == 30000 && field3757 < 50) {
            field3760[++field3757 - 1] = arg0;
        } else if (Statics.field110 != null) {
            for (int var1 = 0; var1 < Statics.field1461.length; var1++) {
                if (Statics.field1461[var1] == arg0.length && Statics.field2070[var1] < Statics.field110[var1].length) {
                    Statics.field110[var1][Statics.field2070[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
