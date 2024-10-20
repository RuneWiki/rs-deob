package deob;

import java.util.ArrayList;
import java.util.HashMap;

@ObfuscatedName("lr")
public class class324 {

    @ObfuscatedName("lr.m")
    public static int field3888 = 0;

    @ObfuscatedName("lr.k")
    public static int field3889 = 0;

    @ObfuscatedName("lr.t")
    public static int field3890 = 0;

    @ObfuscatedName("lr.a")
    public static int field3891 = 0;

    @ObfuscatedName("lr.e")
    public static int field3892 = 1000;

    @ObfuscatedName("lr.i")
    public static int field3893 = 250;

    @ObfuscatedName("lr.y")
    public static int field3900 = 100;

    @ObfuscatedName("lr.w")
    public static int field3898 = 50;

    @ObfuscatedName("lr.g")
    public static byte[][] field3896 = new byte[1000][];

    @ObfuscatedName("lr.v")
    public static byte[][] field3895 = new byte[250][];

    @ObfuscatedName("lr.s")
    public static byte[][] field3886 = new byte[100][];

    @ObfuscatedName("lr.c")
    public static byte[][] field3899 = new byte[50][];

    @ObfuscatedName("lr.z")
    public static ArrayList field3894 = new ArrayList();

    static {
        field3894.clear();
        field3894.add(100);
        field3894.add(5000);
        field3894.add(10000);
        field3894.add(30000);
        new HashMap();
    }

    public class324() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lr.l(IZB)[B")
    public static synchronized byte[] method5402(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3888 > 0) {
            byte[] var2 = field3896[--field3888];
            field3896[field3888] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3889 > 0) {
            byte[] var3 = field3895[--field3889];
            field3895[field3889] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field3890 > 0) {
            byte[] var4 = field3886[--field3890];
            field3886[field3890] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3891 > 0) {
            byte[] var5 = field3899[--field3891];
            field3899[field3891] = null;
            return var5;
        } else {
            if (Statics.field1388 != null) {
                for (int var6 = 0; var6 < Statics.field3769.length; var6++) {
                    if ((Statics.field3769[var6] == arg0 || arg0 < Statics.field3769[var6] && arg1) && Statics.field470[var6] > 0) {
                        byte[] var7 = Statics.field1388[var6][--Statics.field470[var6]];
                        Statics.field1388[var6][Statics.field470[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field3769 != null) {
                for (int var8 = 0; var8 < Statics.field3769.length; var8++) {
                    if (arg0 <= Statics.field3769[var8] && Statics.field470[var8] < Statics.field1388[var8].length) {
                        return new byte[Statics.field3769[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("iv.q(IB)[B")
    public static synchronized byte[] method4490(int arg0) {
        return method5402(arg0, false);
    }

    @ObfuscatedName("jw.f([BI)V")
    public static synchronized void method4680(byte[] arg0) {
        if (arg0.length == 100 && field3888 < field3892) {
            field3896[++field3888 - 1] = arg0;
        } else if (arg0.length == 5000 && field3889 < field3893) {
            field3895[++field3889 - 1] = arg0;
        } else if (arg0.length == 10000 && field3890 < field3900) {
            field3886[++field3890 - 1] = arg0;
        } else if (arg0.length == 30000 && field3891 < field3898) {
            field3899[++field3891 - 1] = arg0;
        } else if (Statics.field1388 != null) {
            for (int var1 = 0; var1 < Statics.field3769.length; var1++) {
                if (Statics.field3769[var1] == arg0.length && Statics.field470[var1] < Statics.field1388[var1].length) {
                    Statics.field1388[var1][Statics.field470[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
