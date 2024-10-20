package deob;

import java.util.ArrayList;
import java.util.HashMap;

@ObfuscatedName("no")
public class class380 {

    @ObfuscatedName("no.z")
    public static int field4447 = 0;

    @ObfuscatedName("no.j")
    public static int field4448 = 0;

    @ObfuscatedName("no.i")
    public static int field4449 = 0;

    @ObfuscatedName("no.n")
    public static int field4450 = 0;

    @ObfuscatedName("no.l")
    public static int field4451 = 1000;

    @ObfuscatedName("no.k")
    public static int field4456 = 250;

    @ObfuscatedName("no.c")
    public static int field4457 = 100;

    @ObfuscatedName("no.r")
    public static int field4453 = 50;

    @ObfuscatedName("no.b")
    public static byte[][] field4455 = new byte[1000][];

    @ObfuscatedName("no.m")
    public static byte[][] field4458 = new byte[250][];

    @ObfuscatedName("no.t")
    public static byte[][] field4459 = new byte[100][];

    @ObfuscatedName("no.h")
    public static byte[][] field4454 = new byte[50][];

    @ObfuscatedName("no.x")
    public static ArrayList field4444 = new ArrayList();

    static {
        method687();
        new HashMap();
    }

    public class380() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("az.f(I)V")
    public static void method687() {
        field4444.clear();
        field4444.add(100);
        field4444.add(5000);
        field4444.add(10000);
        field4444.add(30000);
    }

    @ObfuscatedName("no.w(IZI)[B")
    public static synchronized byte[] method6789(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field4447 > 0) {
            byte[] var2 = field4455[--field4447];
            field4455[field4447] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4448 > 0) {
            byte[] var3 = field4458[--field4448];
            field4458[field4448] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4449 > 0) {
            byte[] var4 = field4459[--field4449];
            field4459[field4449] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4450 > 0) {
            byte[] var5 = field4454[--field4450];
            field4454[field4450] = null;
            return var5;
        } else {
            if (Statics.field41 != null) {
                for (int var6 = 0; var6 < Statics.field1873.length; var6++) {
                    if ((Statics.field1873[var6] == arg0 || arg0 < Statics.field1873[var6] && arg1) && Statics.field1595[var6] > 0) {
                        byte[] var7 = Statics.field41[var6][--Statics.field1595[var6]];
                        Statics.field41[var6][Statics.field1595[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field1873 != null) {
                for (int var8 = 0; var8 < Statics.field1873.length; var8++) {
                    if (arg0 <= Statics.field1873[var8] && Statics.field1595[var8] < Statics.field41[var8].length) {
                        return new byte[Statics.field1873[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("jv.v(IS)[B")
    public static synchronized byte[] method5045(int arg0) {
        return method6789(arg0, false);
    }

    @ObfuscatedName("jq.s([BB)V")
    public static synchronized void method5041(byte[] arg0) {
        if (arg0.length == 100 && field4447 < field4451) {
            field4455[++field4447 - 1] = arg0;
        } else if (arg0.length == 5000 && field4448 < field4456) {
            field4458[++field4448 - 1] = arg0;
        } else if (arg0.length == 10000 && field4449 < field4457) {
            field4459[++field4449 - 1] = arg0;
        } else if (arg0.length == 30000 && field4450 < field4453) {
            field4454[++field4450 - 1] = arg0;
        } else if (Statics.field41 != null) {
            for (int var1 = 0; var1 < Statics.field1873.length; var1++) {
                if (Statics.field1873[var1] == arg0.length && Statics.field1595[var1] < Statics.field41[var1].length) {
                    Statics.field41[var1][Statics.field1595[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
