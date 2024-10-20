package deob;

import java.util.ArrayList;
import java.util.HashMap;

@ObfuscatedName("pk")
public class class413 {

    @ObfuscatedName("pk.as")
    public static int field4544 = 0;

    @ObfuscatedName("pk.aj")
    public static int field4546 = 0;

    @ObfuscatedName("pk.ag")
    public static int field4547 = 0;

    @ObfuscatedName("pk.az")
    public static int field4548 = 0;

    @ObfuscatedName("pk.av")
    public static int field4549 = 1000;

    @ObfuscatedName("pk.ap")
    public static int field4550 = 250;

    @ObfuscatedName("pk.aq")
    public static int field4545 = 100;

    @ObfuscatedName("pk.at")
    public static int field4556 = 50;

    @ObfuscatedName("pk.ah")
    public static byte[][] field4553 = new byte[1000][];

    @ObfuscatedName("pk.ax")
    public static byte[][] field4554 = new byte[250][];

    @ObfuscatedName("pk.aa")
    public static byte[][] field4551 = new byte[100][];

    @ObfuscatedName("pk.au")
    public static byte[][] field4552 = new byte[50][];

    @ObfuscatedName("pk.ao")
    public static ArrayList field4558 = new ArrayList();

    static {
        field4558.clear();
        field4558.add(100);
        field4558.add(5000);
        field4558.add(10000);
        field4558.add(30000);
        new HashMap();
    }

    public class413() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("pk.aw(IZI)[B")
    public static synchronized byte[] method7015(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field4544 > 0) {
            byte[] var2 = field4553[--field4544];
            field4553[field4544] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4546 > 0) {
            byte[] var3 = field4554[--field4546];
            field4554[field4546] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4547 > 0) {
            byte[] var4 = field4551[--field4547];
            field4551[field4547] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4548 > 0) {
            byte[] var5 = field4552[--field4548];
            field4552[field4548] = null;
            return var5;
        } else {
            if (Statics.field1697 != null) {
                for (int var6 = 0; var6 < Statics.field4557.length; var6++) {
                    if ((Statics.field4557[var6] == arg0 || arg0 < Statics.field4557[var6] && arg1) && Statics.field1491[var6] > 0) {
                        byte[] var7 = Statics.field1697[var6][--Statics.field1491[var6]];
                        Statics.field1697[var6][Statics.field1491[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field4557 != null) {
                for (int var8 = 0; var8 < Statics.field4557.length; var8++) {
                    if (arg0 <= Statics.field4557[var8] && Statics.field1491[var8] < Statics.field1697[var8].length) {
                        return new byte[Statics.field4557[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("ov.ar([BI)V")
    public static synchronized void method6316(byte[] arg0) {
        if (arg0.length == 100 && field4544 < field4549) {
            field4553[++field4544 - 1] = arg0;
        } else if (arg0.length == 5000 && field4546 < field4550) {
            field4554[++field4546 - 1] = arg0;
        } else if (arg0.length == 10000 && field4547 < field4545) {
            field4551[++field4547 - 1] = arg0;
        } else if (arg0.length == 30000 && field4548 < field4556) {
            field4552[++field4548 - 1] = arg0;
        } else if (Statics.field1697 != null) {
            for (int var1 = 0; var1 < Statics.field4557.length; var1++) {
                if (Statics.field4557[var1] == arg0.length && Statics.field1491[var1] < Statics.field1697[var1].length) {
                    Statics.field1697[var1][Statics.field1491[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
