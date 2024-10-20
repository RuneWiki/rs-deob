package deob;

import java.util.ArrayList;
import java.util.HashMap;

@ObfuscatedName("qo")
public class class427 {

    @ObfuscatedName("qo.ao")
    public static int field4599 = 0;

    @ObfuscatedName("qo.ah")
    public static int field4608 = 0;

    @ObfuscatedName("qo.ar")
    public static int field4597 = 0;

    @ObfuscatedName("qo.ab")
    public static int field4596 = 0;

    @ObfuscatedName("qo.am")
    public static int field4607 = 1000;

    @ObfuscatedName("qo.av")
    public static int field4600 = 250;

    @ObfuscatedName("qo.ag")
    public static int field4601 = 100;

    @ObfuscatedName("qo.aa")
    public static int field4604 = 50;

    @ObfuscatedName("qo.ap")
    public static byte[][] field4603 = new byte[1000][];

    @ObfuscatedName("qo.ay")
    public static byte[][] field4595 = new byte[250][];

    @ObfuscatedName("qo.as")
    public static byte[][] field4605 = new byte[100][];

    @ObfuscatedName("qo.aj")
    public static byte[][] field4606 = new byte[50][];

    @ObfuscatedName("qo.ae")
    public static ArrayList field4592 = new ArrayList();

    static {
        field4592.clear();
        field4592.add(100);
        field4592.add(5000);
        field4592.add(10000);
        field4592.add(30000);
        new HashMap();
    }

    public class427() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("qo.ac(IZI)[B")
    public static synchronized byte[] method7122(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field4599 > 0) {
            byte[] var2 = field4603[--field4599];
            field4603[field4599] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4608 > 0) {
            byte[] var3 = field4595[--field4608];
            field4595[field4608] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4597 > 0) {
            byte[] var4 = field4605[--field4597];
            field4605[field4597] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4596 > 0) {
            byte[] var5 = field4606[--field4596];
            field4606[field4596] = null;
            return var5;
        } else {
            if (Statics.field165 != null) {
                for (int var6 = 0; var6 < Statics.field4598.length; var6++) {
                    if ((Statics.field4598[var6] == arg0 || arg0 < Statics.field4598[var6] && arg1) && Statics.field4591[var6] > 0) {
                        byte[] var7 = Statics.field165[var6][--Statics.field4591[var6]];
                        Statics.field165[var6][Statics.field4591[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field4598 != null) {
                for (int var8 = 0; var8 < Statics.field4598.length; var8++) {
                    if (arg0 <= Statics.field4598[var8] && Statics.field4591[var8] < Statics.field165[var8].length) {
                        return new byte[Statics.field4598[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("ff.al(II)[B")
    public static synchronized byte[] method2993(int arg0) {
        return method7122(arg0, false);
    }

    @ObfuscatedName("cf.ak([BB)V")
    public static synchronized void method2026(byte[] arg0) {
        if (arg0.length == 100 && field4599 < field4607) {
            field4603[++field4599 - 1] = arg0;
        } else if (arg0.length == 5000 && field4608 < field4600) {
            field4595[++field4608 - 1] = arg0;
        } else if (arg0.length == 10000 && field4597 < field4601) {
            field4605[++field4597 - 1] = arg0;
        } else if (arg0.length == 30000 && field4596 < field4604) {
            field4606[++field4596 - 1] = arg0;
        } else if (Statics.field165 != null) {
            for (int var1 = 0; var1 < Statics.field4598.length; var1++) {
                if (Statics.field4598[var1] == arg0.length && Statics.field4591[var1] < Statics.field165[var1].length) {
                    Statics.field165[var1][Statics.field4591[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
