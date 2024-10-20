package deob;

import java.util.ArrayList;
import java.util.HashMap;

@ObfuscatedName("qr")
public class class431 {

    @ObfuscatedName("qr.ar")
    public static final Object field4644 = new Object();

    @ObfuscatedName("qr.as")
    public static int field4648 = 0;

    @ObfuscatedName("qr.aa")
    public static int field4649 = 0;

    @ObfuscatedName("qr.az")
    public static int field4650 = 0;

    @ObfuscatedName("qr.ao")
    public static int field4651 = 0;

    @ObfuscatedName("qr.au")
    public static int field4652 = 1000;

    @ObfuscatedName("qr.ak")
    public static int field4653 = 250;

    @ObfuscatedName("qr.ah")
    public static int field4654 = 100;

    @ObfuscatedName("qr.aj")
    public static int field4655 = 50;

    @ObfuscatedName("qr.af")
    public static byte[][] field4661 = new byte[1000][];

    @ObfuscatedName("qr.ax")
    public static byte[][] field4656 = new byte[250][];

    @ObfuscatedName("qr.an")
    public static byte[][] field4657 = new byte[100][];

    @ObfuscatedName("qr.ag")
    public static byte[][] field4659 = new byte[50][];

    @ObfuscatedName("qr.ay")
    public static ArrayList field4647 = new ArrayList();

    static {
        method1114();
        new HashMap();
    }

    public class431() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cy.aq(I)V")
    public static void method1114() {
        field4647.clear();
        field4647.add(100);
        field4647.add(5000);
        field4647.add(10000);
        field4647.add(30000);
    }

    @ObfuscatedName("fe.aw(IZI)[B")
    public static byte[] method3045(int arg0, boolean arg1) {
        Object var2 = field4644;
        synchronized (field4644) {
            if ((arg0 == 100 || arg0 < 100 && arg1) && field4648 > 0) {
                byte[] var3 = field4661[--field4648];
                field4661[field4648] = null;
                return var3;
            }
            if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4649 > 0) {
                byte[] var4 = field4656[--field4649];
                field4656[field4649] = null;
                return var4;
            }
            if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4650 > 0) {
                byte[] var5 = field4657[--field4650];
                field4657[field4650] = null;
                return var5;
            }
            if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4651 > 0) {
                byte[] var6 = field4659[--field4651];
                field4659[field4651] = null;
                return var6;
            }
            if (Statics.field1416 != null) {
                for (int var7 = 0; var7 < Statics.field4660.length; var7++) {
                    if ((Statics.field4660[var7] == arg0 || arg0 < Statics.field4660[var7] && arg1) && Statics.field1539[var7] > 0) {
                        byte[] var8 = Statics.field1416[var7][--Statics.field1539[var7]];
                        Statics.field1416[var7][Statics.field1539[var7]] = null;
                        return var8;
                    }
                }
            }
            if (arg1 && Statics.field4660 != null) {
                for (int var9 = 0; var9 < Statics.field4660.length; var9++) {
                    if (arg0 <= Statics.field4660[var9] && Statics.field1539[var9] < Statics.field1416[var9].length) {
                        return new byte[Statics.field4660[var9]];
                    }
                }
            }
        }
        return new byte[arg0];
    }

    @ObfuscatedName("nb.al(II)[B")
    public static byte[] method5800(int arg0) {
        return method3045(arg0, false);
    }

    @ObfuscatedName("fe.ai([BI)V")
    public static void method3046(byte[] arg0) {
        Object var1 = field4644;
        synchronized (field4644) {
            if (arg0.length == 100 && field4648 < field4652) {
                field4661[++field4648 - 1] = arg0;
            } else if (arg0.length == 5000 && field4649 < field4653) {
                field4656[++field4649 - 1] = arg0;
            } else if (arg0.length == 10000 && field4650 < field4654) {
                field4657[++field4650 - 1] = arg0;
            } else if (arg0.length == 30000 && field4651 < field4655) {
                field4659[++field4651 - 1] = arg0;
            } else if (Statics.field1416 != null) {
                for (int var2 = 0; var2 < Statics.field4660.length; var2++) {
                    if (Statics.field4660[var2] == arg0.length && Statics.field1539[var2] < Statics.field1416[var2].length) {
                        Statics.field1416[var2][Statics.field1539[var2]++] = arg0;
                        return;
                    }
                }
            }
        }
    }
}
