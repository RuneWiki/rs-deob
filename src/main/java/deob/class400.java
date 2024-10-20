package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@ObfuscatedName("pv")
public class class400 {

    @ObfuscatedName("pv.ax")
    public static int field4483 = 0;

    @ObfuscatedName("pv.ap")
    public static int field4491 = 0;

    @ObfuscatedName("pv.ab")
    public static int field4482 = 0;

    @ObfuscatedName("pv.ak")
    public static int field4480 = 0;

    @ObfuscatedName("pv.ae")
    public static int field4484 = 1000;

    @ObfuscatedName("pv.af")
    public static int field4485 = 250;

    @ObfuscatedName("pv.ao")
    public static int field4486 = 100;

    @ObfuscatedName("pv.aa")
    public static int field4487 = 50;

    @ObfuscatedName("pv.aj")
    public static byte[][] field4488 = new byte[1000][];

    @ObfuscatedName("pv.ad")
    public static byte[][] field4489 = new byte[250][];

    @ObfuscatedName("pv.ac")
    public static byte[][] field4493 = new byte[100][];

    @ObfuscatedName("pv.ag")
    public static byte[][] field4495 = new byte[50][];

    @ObfuscatedName("pv.au")
    public static ArrayList field4492 = new ArrayList();

    static {
        field4492.clear();
        field4492.add(100);
        field4492.add(5000);
        field4492.add(10000);
        field4492.add(30000);
        new HashMap();
    }

    public class400() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gg.at([I[IB)V")
    public static void method3111(int[] arg0, int[] arg1) {
        if (arg0 != null && arg1 != null) {
            Statics.field1686 = arg0;
            Statics.field1150 = new int[arg0.length];
            Statics.field1837 = new byte[arg0.length][][];
            for (int var2 = 0; var2 < Statics.field1686.length; var2++) {
                Statics.field1837[var2] = new byte[arg1[var2]][];
                field4492.add(arg0[var2]);
            }
            Collections.sort(field4492);
            return;
        }
        Statics.field1686 = null;
        Statics.field1150 = null;
        Statics.field1837 = (byte[][][]) null;
        field4492.clear();
        field4492.add(100);
        field4492.add(5000);
        field4492.add(10000);
        field4492.add(30000);
    }

    @ObfuscatedName("kr.av(IB)[B")
    public static synchronized byte[] method5014(int arg0) {
        return Statics.method6944(arg0, false);
    }

    @ObfuscatedName("mi.as([BB)V")
    public static synchronized void method5365(byte[] arg0) {
        if (arg0.length == 100 && field4483 < field4484) {
            field4488[++field4483 - 1] = arg0;
        } else if (arg0.length == 5000 && field4491 < field4485) {
            field4489[++field4491 - 1] = arg0;
        } else if (arg0.length == 10000 && field4482 < field4486) {
            field4493[++field4482 - 1] = arg0;
        } else if (arg0.length == 30000 && field4480 < field4487) {
            field4495[++field4480 - 1] = arg0;
        } else if (Statics.field1837 != null) {
            for (int var1 = 0; var1 < Statics.field1686.length; var1++) {
                if (Statics.field1686[var1] == arg0.length && Statics.field1150[var1] < Statics.field1837[var1].length) {
                    Statics.field1837[var1][Statics.field1150[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
