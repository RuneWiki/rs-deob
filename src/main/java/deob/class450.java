package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@ObfuscatedName("rc")
public class class450 {

    @ObfuscatedName("rc.ap")
    public static final Object field4831 = new Object();

    @ObfuscatedName("rc.an")
    public static int field4833 = 0;

    @ObfuscatedName("rc.aj")
    public static int field4834 = 0;

    @ObfuscatedName("rc.av")
    public static int field4835 = 0;

    @ObfuscatedName("rc.ab")
    public static int field4836 = 0;

    @ObfuscatedName("rc.ai")
    public static int field4845 = 1000;

    @ObfuscatedName("rc.ae")
    public static int field4838 = 250;

    @ObfuscatedName("rc.au")
    public static int field4829 = 100;

    @ObfuscatedName("rc.ah")
    public static int field4840 = 50;

    @ObfuscatedName("rc.az")
    public static byte[][] field4841 = new byte[1000][];

    @ObfuscatedName("rc.ax")
    public static byte[][] field4842 = new byte[250][];

    @ObfuscatedName("rc.ac")
    public static byte[][] field4832 = new byte[100][];

    @ObfuscatedName("rc.al")
    public static byte[][] field4844 = new byte[50][];

    @ObfuscatedName("rc.as")
    public static ArrayList field4843 = new ArrayList();

    static {
        method5533();
        new HashMap();
    }

    public class450() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.aq([I[II)V")
    public static void method2240(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field1734 = null;
            Statics.field4848 = null;
            Statics.field84 = (byte[][][]) null;
            method5533();
            return;
        }
        Statics.field1734 = arg0;
        Statics.field4848 = new int[arg0.length];
        Statics.field84 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field1734.length; var2++) {
            Statics.field84[var2] = new byte[arg1[var2]][];
            field4843.add(arg0[var2]);
        }
        Collections.sort(field4843);
    }

    @ObfuscatedName("ma.ad(B)V")
    public static void method5533() {
        field4843.clear();
        field4843.add(100);
        field4843.add(5000);
        field4843.add(10000);
        field4843.add(30000);
    }

    @ObfuscatedName("ku.ag(IZI)[B")
    public static byte[] method4665(int arg0, boolean arg1) {
        Object var2 = field4831;
        synchronized (field4831) {
            if ((arg0 == 100 || arg0 < 100 && arg1) && field4833 > 0) {
                byte[] var3 = field4841[--field4833];
                field4841[field4833] = null;
                return var3;
            }
            if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4834 > 0) {
                byte[] var4 = field4842[--field4834];
                field4842[field4834] = null;
                return var4;
            }
            if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4835 > 0) {
                byte[] var5 = field4832[--field4835];
                field4832[field4835] = null;
                return var5;
            }
            if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4836 > 0) {
                byte[] var6 = field4844[--field4836];
                field4844[field4836] = null;
                return var6;
            }
            if (Statics.field84 != null) {
                for (int var7 = 0; var7 < Statics.field1734.length; var7++) {
                    if ((Statics.field1734[var7] == arg0 || arg0 < Statics.field1734[var7] && arg1) && Statics.field4848[var7] > 0) {
                        byte[] var8 = Statics.field84[var7][--Statics.field4848[var7]];
                        Statics.field84[var7][Statics.field4848[var7]] = null;
                        return var8;
                    }
                }
            }
            if (arg1 && Statics.field1734 != null) {
                for (int var9 = 0; var9 < Statics.field1734.length; var9++) {
                    if (arg0 <= Statics.field1734[var9] && Statics.field4848[var9] < Statics.field84[var9].length) {
                        return new byte[Statics.field1734[var9]];
                    }
                }
            }
        }
        return new byte[arg0];
    }

    @ObfuscatedName("db.ak([BB)V")
    public static void method2333(byte[] arg0) {
        Object var1 = field4831;
        synchronized (field4831) {
            if (arg0.length == 100 && field4833 < field4845) {
                field4841[++field4833 - 1] = arg0;
            } else if (arg0.length == 5000 && field4834 < field4838) {
                field4842[++field4834 - 1] = arg0;
            } else if (arg0.length == 10000 && field4835 < field4829) {
                field4832[++field4835 - 1] = arg0;
            } else if (arg0.length == 30000 && field4836 < field4840) {
                field4844[++field4836 - 1] = arg0;
            } else if (Statics.field84 != null) {
                for (int var2 = 0; var2 < Statics.field1734.length; var2++) {
                    if (Statics.field1734[var2] == arg0.length && Statics.field4848[var2] < Statics.field84[var2].length) {
                        Statics.field84[var2][Statics.field4848[var2]++] = arg0;
                        return;
                    }
                }
            }
        }
    }
}
