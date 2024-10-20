package deob;

import java.util.ArrayList;
import java.util.HashMap;

@ObfuscatedName("ot")
public class class383 {

    @ObfuscatedName("ot.an")
    public static int field4417 = 0;

    @ObfuscatedName("ot.ao")
    public static int field4426 = 0;

    @ObfuscatedName("ot.av")
    public static int field4419 = 0;

    @ObfuscatedName("ot.aq")
    public static int field4418 = 0;

    @ObfuscatedName("ot.ap")
    public static int field4421 = 1000;

    @ObfuscatedName("ot.ar")
    public static int field4422 = 250;

    @ObfuscatedName("ot.ak")
    public static int field4423 = 100;

    @ObfuscatedName("ot.ax")
    public static int field4414 = 50;

    @ObfuscatedName("ot.as")
    public static byte[][] field4420 = new byte[1000][];

    @ObfuscatedName("ot.ay")
    public static byte[][] field4429 = new byte[250][];

    @ObfuscatedName("ot.am")
    public static byte[][] field4427 = new byte[100][];

    @ObfuscatedName("ot.az")
    public static byte[][] field4428 = new byte[50][];

    @ObfuscatedName("ot.at")
    public static ArrayList field4425 = new ArrayList();

    static {
        method5194();
        new HashMap();
    }

    public class383() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lx.aj(I)V")
    public static void method5194() {
        field4425.clear();
        field4425.add(100);
        field4425.add(5000);
        field4425.add(10000);
        field4425.add(30000);
    }

    @ObfuscatedName("ot.al(IZI)[B")
    public static synchronized byte[] method6715(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field4417 > 0) {
            byte[] var2 = field4420[--field4417];
            field4420[field4417] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4426 > 0) {
            byte[] var3 = field4429[--field4426];
            field4429[field4426] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4419 > 0) {
            byte[] var4 = field4427[--field4419];
            field4427[field4419] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4418 > 0) {
            byte[] var5 = field4428[--field4418];
            field4428[field4418] = null;
            return var5;
        } else {
            if (Statics.field1041 != null) {
                for (int var6 = 0; var6 < Statics.field2341.length; var6++) {
                    if ((Statics.field2341[var6] == arg0 || arg0 < Statics.field2341[var6] && arg1) && Statics.field318[var6] > 0) {
                        byte[] var7 = Statics.field1041[var6][--Statics.field318[var6]];
                        Statics.field1041[var6][Statics.field318[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field2341 != null) {
                for (int var8 = 0; var8 < Statics.field2341.length; var8++) {
                    if (arg0 <= Statics.field2341[var8] && Statics.field318[var8] < Statics.field1041[var8].length) {
                        return new byte[Statics.field2341[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("co.ac(II)[B")
    public static synchronized byte[] method1055(int arg0) {
        return method6715(arg0, false);
    }

    @ObfuscatedName("ok.ab([BI)V")
    public static synchronized void method6280(byte[] arg0) {
        if (arg0.length == 100 && field4417 < field4421) {
            field4420[++field4417 - 1] = arg0;
        } else if (arg0.length == 5000 && field4426 < field4422) {
            field4429[++field4426 - 1] = arg0;
        } else if (arg0.length == 10000 && field4419 < field4423) {
            field4427[++field4419 - 1] = arg0;
        } else if (arg0.length == 30000 && field4418 < field4414) {
            field4428[++field4418 - 1] = arg0;
        } else if (Statics.field1041 != null) {
            for (int var1 = 0; var1 < Statics.field2341.length; var1++) {
                if (Statics.field2341[var1] == arg0.length && Statics.field318[var1] < Statics.field1041[var1].length) {
                    Statics.field1041[var1][Statics.field318[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
