package deob;

import java.util.ArrayList;
import java.util.HashMap;

@ObfuscatedName("nf")
public class class376 {

    @ObfuscatedName("nf.m")
    public static int field4445 = 0;

    @ObfuscatedName("nf.q")
    public static int field4436 = 0;

    @ObfuscatedName("nf.f")
    public static int field4437 = 0;

    @ObfuscatedName("nf.r")
    public static int field4438 = 0;

    @ObfuscatedName("nf.u")
    public static int field4439 = 1000;

    @ObfuscatedName("nf.b")
    public static int field4432 = 250;

    @ObfuscatedName("nf.j")
    public static int field4441 = 100;

    @ObfuscatedName("nf.g")
    public static int field4440 = 50;

    @ObfuscatedName("nf.i")
    public static byte[][] field4443 = new byte[1000][];

    @ObfuscatedName("nf.o")
    public static byte[][] field4444 = new byte[250][];

    @ObfuscatedName("nf.n")
    public static byte[][] field4433 = new byte[100][];

    @ObfuscatedName("nf.k")
    public static byte[][] field4446 = new byte[50][];

    @ObfuscatedName("nf.t")
    public static ArrayList field4447 = new ArrayList();

    static {
        field4447.clear();
        field4447.add(100);
        field4447.add(5000);
        field4447.add(10000);
        field4447.add(30000);
        new HashMap();
    }

    public class376() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("nf.h(IZB)[B")
    public static synchronized byte[] method6680(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field4445 > 0) {
            byte[] var2 = field4443[--field4445];
            field4443[field4445] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4436 > 0) {
            byte[] var3 = field4444[--field4436];
            field4444[field4436] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4437 > 0) {
            byte[] var4 = field4433[--field4437];
            field4433[field4437] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4438 > 0) {
            byte[] var5 = field4446[--field4438];
            field4446[field4438] = null;
            return var5;
        } else {
            if (Statics.field2765 != null) {
                for (int var6 = 0; var6 < Statics.field2611.length; var6++) {
                    if ((Statics.field2611[var6] == arg0 || arg0 < Statics.field2611[var6] && arg1) && Statics.field2778[var6] > 0) {
                        byte[] var7 = Statics.field2765[var6][--Statics.field2778[var6]];
                        Statics.field2765[var6][Statics.field2778[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field2611 != null) {
                for (int var8 = 0; var8 < Statics.field2611.length; var8++) {
                    if (arg0 <= Statics.field2611[var8] && Statics.field2778[var8] < Statics.field2765[var8].length) {
                        return new byte[Statics.field2611[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("cc.e(II)[B")
    public static synchronized byte[] method2120(int arg0) {
        return method6680(arg0, false);
    }

    @ObfuscatedName("gt.v([BI)V")
    public static synchronized void method3729(byte[] arg0) {
        if (arg0.length == 100 && field4445 < field4439) {
            field4443[++field4445 - 1] = arg0;
        } else if (arg0.length == 5000 && field4436 < field4432) {
            field4444[++field4436 - 1] = arg0;
        } else if (arg0.length == 10000 && field4437 < field4441) {
            field4433[++field4437 - 1] = arg0;
        } else if (arg0.length == 30000 && field4438 < field4440) {
            field4446[++field4438 - 1] = arg0;
        } else if (Statics.field2765 != null) {
            for (int var1 = 0; var1 < Statics.field2611.length; var1++) {
                if (Statics.field2611[var1] == arg0.length && Statics.field2778[var1] < Statics.field2765[var1].length) {
                    Statics.field2765[var1][Statics.field2778[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
