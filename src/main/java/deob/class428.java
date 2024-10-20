package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@ObfuscatedName("qh")
public class class428 {

    @ObfuscatedName("qh.aq")
    public static final Object field4615 = new Object();

    @ObfuscatedName("qh.ar")
    public static int field4616 = 0;

    @ObfuscatedName("qh.ag")
    public static int field4617 = 0;

    @ObfuscatedName("qh.ao")
    public static int field4618 = 0;

    @ObfuscatedName("qh.ae")
    public static int field4619 = 0;

    @ObfuscatedName("qh.aa")
    public static int field4612 = 1000;

    @ObfuscatedName("qh.au")
    public static int field4621 = 250;

    @ObfuscatedName("qh.an")
    public static int field4622 = 100;

    @ObfuscatedName("qh.ad")
    public static int field4623 = 50;

    @ObfuscatedName("qh.ax")
    public static byte[][] field4624 = new byte[1000][];

    @ObfuscatedName("qh.aw")
    public static byte[][] field4620 = new byte[250][];

    @ObfuscatedName("qh.az")
    public static byte[][] field4626 = new byte[100][];

    @ObfuscatedName("qh.av")
    public static byte[][] field4627 = new byte[50][];

    @ObfuscatedName("qh.ab")
    public static ArrayList field4628 = new ArrayList();

    static {
        method5669();
        new HashMap();
    }

    public class428() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eu.am([I[II)V")
    public static void method2868(int[] arg0, int[] arg1) {
        if (arg0 != null && arg1 != null) {
            Statics.field2275 = arg0;
            Statics.field2317 = new int[arg0.length];
            Statics.field1724 = new byte[arg0.length][][];
            for (int var2 = 0; var2 < Statics.field2275.length; var2++) {
                Statics.field1724[var2] = new byte[arg1[var2]][];
                field4628.add(arg0[var2]);
            }
            Collections.sort(field4628);
            return;
        }
        Statics.field2275 = null;
        Statics.field2317 = null;
        Statics.field1724 = (byte[][][]) null;
        field4628.clear();
        field4628.add(100);
        field4628.add(5000);
        field4628.add(10000);
        field4628.add(30000);
    }

    @ObfuscatedName("mp.ap(I)V")
    public static void method5669() {
        field4628.clear();
        field4628.add(100);
        field4628.add(5000);
        field4628.add(10000);
        field4628.add(30000);
    }

    @ObfuscatedName("kq.af(IZI)[B")
    public static byte[] method4648(int arg0, boolean arg1) {
        Object var2 = field4615;
        synchronized (field4615) {
            if ((arg0 == 100 || arg0 < 100 && arg1) && field4616 > 0) {
                byte[] var3 = field4624[--field4616];
                field4624[field4616] = null;
                return var3;
            }
            if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4617 > 0) {
                byte[] var4 = field4620[--field4617];
                field4620[field4617] = null;
                return var4;
            }
            if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4618 > 0) {
                byte[] var5 = field4626[--field4618];
                field4626[field4618] = null;
                return var5;
            }
            if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4619 > 0) {
                byte[] var6 = field4627[--field4619];
                field4627[field4619] = null;
                return var6;
            }
            if (Statics.field1724 != null) {
                for (int var7 = 0; var7 < Statics.field2275.length; var7++) {
                    if ((Statics.field2275[var7] == arg0 || arg0 < Statics.field2275[var7] && arg1) && Statics.field2317[var7] > 0) {
                        byte[] var8 = Statics.field1724[var7][--Statics.field2317[var7]];
                        Statics.field1724[var7][Statics.field2317[var7]] = null;
                        return var8;
                    }
                }
            }
            if (arg1 && Statics.field2275 != null) {
                for (int var9 = 0; var9 < Statics.field2275.length; var9++) {
                    if (arg0 <= Statics.field2275[var9] && Statics.field2317[var9] < Statics.field1724[var9].length) {
                        return new byte[Statics.field2275[var9]];
                    }
                }
            }
        }
        return new byte[arg0];
    }

    @ObfuscatedName("fv.aj(II)[B")
    public static byte[] method3007(int arg0) {
        return method4648(arg0, false);
    }

    @ObfuscatedName("fd.aq([BI)V")
    public static void method3077(byte[] arg0) {
        Object var1 = field4615;
        synchronized (field4615) {
            if (arg0.length == 100 && field4616 < field4612) {
                field4624[++field4616 - 1] = arg0;
            } else if (arg0.length == 5000 && field4617 < field4621) {
                field4620[++field4617 - 1] = arg0;
            } else if (arg0.length == 10000 && field4618 < field4622) {
                field4626[++field4618 - 1] = arg0;
            } else if (arg0.length == 30000 && field4619 < field4623) {
                field4627[++field4619 - 1] = arg0;
            } else if (Statics.field1724 != null) {
                for (int var2 = 0; var2 < Statics.field2275.length; var2++) {
                    if (Statics.field2275[var2] == arg0.length && Statics.field2317[var2] < Statics.field1724[var2].length) {
                        Statics.field1724[var2][Statics.field2317[var2]++] = arg0;
                        return;
                    }
                }
            }
        }
    }
}
