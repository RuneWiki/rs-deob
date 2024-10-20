package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@ObfuscatedName("ru")
public class class451 {

    @ObfuscatedName("ru.ax")
    public static final Object field4823 = new Object();

    @ObfuscatedName("ru.ao")
    public static int field4820 = 0;

    @ObfuscatedName("ru.am")
    public static int field4821 = 0;

    @ObfuscatedName("ru.ac")
    public static int field4822 = 0;

    @ObfuscatedName("ru.ae")
    public static int field4831 = 0;

    @ObfuscatedName("ru.ad")
    public static int field4818 = 1000;

    @ObfuscatedName("ru.aq")
    public static int field4825 = 250;

    @ObfuscatedName("ru.al")
    public static int field4826 = 100;

    @ObfuscatedName("ru.aj")
    public static int field4824 = 50;

    @ObfuscatedName("ru.as")
    public static byte[][] field4828 = new byte[1000][];

    @ObfuscatedName("ru.aw")
    public static byte[][] field4819 = new byte[250][];

    @ObfuscatedName("ru.af")
    public static byte[][] field4830 = new byte[100][];

    @ObfuscatedName("ru.aa")
    public static byte[][] field4815 = new byte[50][];

    @ObfuscatedName("ru.ar")
    public static ArrayList field4833 = new ArrayList();

    static {
        field4833.clear();
        field4833.add(100);
        field4833.add(5000);
        field4833.add(10000);
        field4833.add(30000);
        new HashMap();
    }

    public class451() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ej.ab([I[IB)V")
    public static void method2914(int[] arg0, int[] arg1) {
        if (arg0 != null && arg1 != null) {
            Statics.field2507 = arg0;
            Statics.field4832 = new int[arg0.length];
            Statics.field2996 = new byte[arg0.length][][];
            for (int var2 = 0; var2 < Statics.field2507.length; var2++) {
                Statics.field2996[var2] = new byte[arg1[var2]][];
                field4833.add(arg0[var2]);
            }
            Collections.sort(field4833);
            return;
        }
        Statics.field2507 = null;
        Statics.field4832 = null;
        Statics.field2996 = (byte[][][]) null;
        field4833.clear();
        field4833.add(100);
        field4833.add(5000);
        field4833.add(10000);
        field4833.add(30000);
    }

    @ObfuscatedName("pd.ay(IZS)[B")
    public static byte[] method6784(int arg0, boolean arg1) {
        Object var2 = field4823;
        synchronized (field4823) {
            if ((arg0 == 100 || arg0 < 100 && arg1) && field4820 > 0) {
                byte[] var3 = field4828[--field4820];
                field4828[field4820] = null;
                return var3;
            }
            if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4821 > 0) {
                byte[] var4 = field4819[--field4821];
                field4819[field4821] = null;
                return var4;
            }
            if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4822 > 0) {
                byte[] var5 = field4830[--field4822];
                field4830[field4822] = null;
                return var5;
            }
            if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4831 > 0) {
                byte[] var6 = field4815[--field4831];
                field4815[field4831] = null;
                return var6;
            }
            if (Statics.field2996 != null) {
                for (int var7 = 0; var7 < Statics.field2507.length; var7++) {
                    if ((Statics.field2507[var7] == arg0 || arg0 < Statics.field2507[var7] && arg1) && Statics.field4832[var7] > 0) {
                        byte[] var8 = Statics.field2996[var7][--Statics.field4832[var7]];
                        Statics.field2996[var7][Statics.field4832[var7]] = null;
                        return var8;
                    }
                }
            }
            if (arg1 && Statics.field2507 != null) {
                for (int var9 = 0; var9 < Statics.field2507.length; var9++) {
                    if (arg0 <= Statics.field2507[var9] && Statics.field4832[var9] < Statics.field2996[var9].length) {
                        return new byte[Statics.field2507[var9]];
                    }
                }
            }
        }
        return new byte[arg0];
    }

    @ObfuscatedName("ai.an([BI)V")
    public static void method292(byte[] arg0) {
        Object var1 = field4823;
        synchronized (field4823) {
            if (arg0.length == 100 && field4820 < field4818) {
                field4828[++field4820 - 1] = arg0;
            } else if (arg0.length == 5000 && field4821 < field4825) {
                field4819[++field4821 - 1] = arg0;
            } else if (arg0.length == 10000 && field4822 < field4826) {
                field4830[++field4822 - 1] = arg0;
            } else if (arg0.length == 30000 && field4831 < field4824) {
                field4815[++field4831 - 1] = arg0;
            } else if (Statics.field2996 != null) {
                for (int var2 = 0; var2 < Statics.field2507.length; var2++) {
                    if (Statics.field2507[var2] == arg0.length && Statics.field4832[var2] < Statics.field2996[var2].length) {
                        Statics.field2996[var2][Statics.field4832[var2]++] = arg0;
                        return;
                    }
                }
            }
        }
    }
}
