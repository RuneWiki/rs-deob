package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@ObfuscatedName("oj")
public class class387 {

    @ObfuscatedName("oj.au")
    public static int field4466 = 0;

    @ObfuscatedName("oj.ab")
    public static int field4478 = 0;

    @ObfuscatedName("oj.aq")
    public static int field4468 = 0;

    @ObfuscatedName("oj.al")
    public static int field4477 = 0;

    @ObfuscatedName("oj.at")
    public static int field4470 = 1000;

    @ObfuscatedName("oj.aa")
    public static int field4471 = 250;

    @ObfuscatedName("oj.ay")
    public static int field4472 = 100;

    @ObfuscatedName("oj.ao")
    public static int field4464 = 50;

    @ObfuscatedName("oj.ax")
    public static byte[][] field4474 = new byte[1000][];

    @ObfuscatedName("oj.ai")
    public static byte[][] field4467 = new byte[250][];

    @ObfuscatedName("oj.ag")
    public static byte[][] field4476 = new byte[100][];

    @ObfuscatedName("oj.ah")
    public static byte[][] field4475 = new byte[50][];

    @ObfuscatedName("oj.as")
    public static ArrayList field4473 = new ArrayList();

    static {
        method5076();
        new HashMap();
    }

    public class387() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fl.af([I[II)V")
    public static void method3017(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field1777 = null;
            Statics.field1626 = null;
            Statics.field1433 = (byte[][][]) null;
            method5076();
            return;
        }
        Statics.field1777 = arg0;
        Statics.field1626 = new int[arg0.length];
        Statics.field1433 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field1777.length; var2++) {
            Statics.field1433[var2] = new byte[arg1[var2]][];
            field4473.add(arg0[var2]);
        }
        Collections.sort(field4473);
    }

    @ObfuscatedName("kr.an(I)V")
    public static void method5076() {
        field4473.clear();
        field4473.add(100);
        field4473.add(5000);
        field4473.add(10000);
        field4473.add(30000);
    }

    @ObfuscatedName("oj.aw(IZB)[B")
    public static synchronized byte[] method6948(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field4466 > 0) {
            byte[] var2 = field4474[--field4466];
            field4474[field4466] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4478 > 0) {
            byte[] var3 = field4467[--field4478];
            field4467[field4478] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4468 > 0) {
            byte[] var4 = field4476[--field4468];
            field4476[field4468] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4477 > 0) {
            byte[] var5 = field4475[--field4477];
            field4475[field4477] = null;
            return var5;
        } else {
            if (Statics.field1433 != null) {
                for (int var6 = 0; var6 < Statics.field1777.length; var6++) {
                    if ((Statics.field1777[var6] == arg0 || arg0 < Statics.field1777[var6] && arg1) && Statics.field1626[var6] > 0) {
                        byte[] var7 = Statics.field1433[var6][--Statics.field1626[var6]];
                        Statics.field1433[var6][Statics.field1626[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field1777 != null) {
                for (int var8 = 0; var8 < Statics.field1777.length; var8++) {
                    if (arg0 <= Statics.field1777[var8] && Statics.field1626[var8] < Statics.field1433[var8].length) {
                        return new byte[Statics.field1777[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("di.au([BB)V")
    public static synchronized void method2145(byte[] arg0) {
        if (arg0.length == 100 && field4466 < field4470) {
            field4474[++field4466 - 1] = arg0;
        } else if (arg0.length == 5000 && field4478 < field4471) {
            field4467[++field4478 - 1] = arg0;
        } else if (arg0.length == 10000 && field4468 < field4472) {
            field4476[++field4468 - 1] = arg0;
        } else if (arg0.length == 30000 && field4477 < field4464) {
            field4475[++field4477 - 1] = arg0;
        } else if (Statics.field1433 != null) {
            for (int var1 = 0; var1 < Statics.field1777.length; var1++) {
                if (Statics.field1777[var1] == arg0.length && Statics.field1626[var1] < Statics.field1433[var1].length) {
                    Statics.field1433[var1][Statics.field1626[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
