package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@ObfuscatedName("ri")
public class class449 {

    @ObfuscatedName("ri.af")
    public static final Object field4817 = new Object();

    @ObfuscatedName("ri.aa")
    public static int field4816 = 0;

    @ObfuscatedName("ri.at")
    public static int field4815 = 0;

    @ObfuscatedName("ri.ab")
    public static int field4812 = 0;

    @ObfuscatedName("ri.ac")
    public static int field4819 = 0;

    @ObfuscatedName("ri.ao")
    public static int field4820 = 1000;

    @ObfuscatedName("ri.ah")
    public static int field4826 = 250;

    @ObfuscatedName("ri.av")
    public static int field4821 = 100;

    @ObfuscatedName("ri.aq")
    public static int field4823 = 50;

    @ObfuscatedName("ri.ap")
    public static byte[][] field4824 = new byte[1000][];

    @ObfuscatedName("ri.ae")
    public static byte[][] field4825 = new byte[250][];

    @ObfuscatedName("ri.ax")
    public static byte[][] field4822 = new byte[100][];

    @ObfuscatedName("ri.ay")
    public static byte[][] field4827 = new byte[50][];

    @ObfuscatedName("ri.ad")
    public static ArrayList field4829 = new ArrayList();

    static {
        field4829.clear();
        field4829.add(100);
        field4829.add(5000);
        field4829.add(10000);
        field4829.add(30000);
        new HashMap();
    }

    public class449() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("np.ak([I[IB)V")
    public static void method6273(int[] arg0, int[] arg1) {
        if (arg0 != null && arg1 != null) {
            Statics.field329 = arg0;
            Statics.field4828 = new int[arg0.length];
            Statics.field2078 = new byte[arg0.length][][];
            for (int var2 = 0; var2 < Statics.field329.length; var2++) {
                Statics.field2078[var2] = new byte[arg1[var2]][];
                field4829.add(arg0[var2]);
            }
            Collections.sort(field4829);
            return;
        }
        Statics.field329 = null;
        Statics.field4828 = null;
        Statics.field2078 = (byte[][][]) null;
        field4829.clear();
        field4829.add(100);
        field4829.add(5000);
        field4829.add(10000);
        field4829.add(30000);
    }

    @ObfuscatedName("db.al(IZB)[B")
    public static byte[] method2142(int arg0, boolean arg1) {
        Object var2 = field4817;
        synchronized (field4817) {
            if ((arg0 == 100 || arg0 < 100 && arg1) && field4816 > 0) {
                byte[] var3 = field4824[--field4816];
                field4824[field4816] = null;
                return var3;
            }
            if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4815 > 0) {
                byte[] var4 = field4825[--field4815];
                field4825[field4815] = null;
                return var4;
            }
            if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4812 > 0) {
                byte[] var5 = field4822[--field4812];
                field4822[field4812] = null;
                return var5;
            }
            if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4819 > 0) {
                byte[] var6 = field4827[--field4819];
                field4827[field4819] = null;
                return var6;
            }
            if (Statics.field2078 != null) {
                for (int var7 = 0; var7 < Statics.field329.length; var7++) {
                    if ((Statics.field329[var7] == arg0 || arg0 < Statics.field329[var7] && arg1) && Statics.field4828[var7] > 0) {
                        byte[] var8 = Statics.field2078[var7][--Statics.field4828[var7]];
                        Statics.field2078[var7][Statics.field4828[var7]] = null;
                        return var8;
                    }
                }
            }
            if (arg1 && Statics.field329 != null) {
                for (int var9 = 0; var9 < Statics.field329.length; var9++) {
                    if (arg0 <= Statics.field329[var9] && Statics.field4828[var9] < Statics.field2078[var9].length) {
                        return new byte[Statics.field329[var9]];
                    }
                }
            }
        }
        return new byte[arg0];
    }

    @ObfuscatedName("ce.aj(IB)[B")
    public static byte[] method1145(int arg0) {
        return method2142(arg0, false);
    }

    @ObfuscatedName("hm.az([BB)V")
    public static void method3367(byte[] arg0) {
        Object var1 = field4817;
        synchronized (field4817) {
            if (arg0.length == 100 && field4816 < field4820) {
                field4824[++field4816 - 1] = arg0;
            } else if (arg0.length == 5000 && field4815 < field4826) {
                field4825[++field4815 - 1] = arg0;
            } else if (arg0.length == 10000 && field4812 < field4821) {
                field4822[++field4812 - 1] = arg0;
            } else if (arg0.length == 30000 && field4819 < field4823) {
                field4827[++field4819 - 1] = arg0;
            } else if (Statics.field2078 != null) {
                for (int var2 = 0; var2 < Statics.field329.length; var2++) {
                    if (Statics.field329[var2] == arg0.length && Statics.field4828[var2] < Statics.field2078[var2].length) {
                        Statics.field2078[var2][Statics.field4828[var2]++] = arg0;
                        return;
                    }
                }
            }
        }
    }
}
