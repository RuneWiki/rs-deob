package deob;

import java.util.ArrayList;
import java.util.HashMap;

@ObfuscatedName("rv")
public class class453 {

    @ObfuscatedName("rv.ax")
    public static final Object field4861 = new Object();

    @ObfuscatedName("rv.aq")
    public static int field4862 = 0;

    @ObfuscatedName("rv.af")
    public static int field4863 = 0;

    @ObfuscatedName("rv.at")
    public static int field4870 = 0;

    @ObfuscatedName("rv.au")
    public static int field4864 = 0;

    @ObfuscatedName("rv.ar")
    public static int field4866 = 1000;

    @ObfuscatedName("rv.al")
    public static int field4865 = 250;

    @ObfuscatedName("rv.ad")
    public static int field4867 = 100;

    @ObfuscatedName("rv.ah")
    public static int field4869 = 50;

    @ObfuscatedName("rv.ap")
    public static byte[][] field4868 = new byte[1000][];

    @ObfuscatedName("rv.ab")
    public static byte[][] field4871 = new byte[250][];

    @ObfuscatedName("rv.az")
    public static byte[][] field4872 = new byte[100][];

    @ObfuscatedName("rv.aa")
    public static byte[][] field4873 = new byte[50][];

    @ObfuscatedName("rv.ay")
    public static ArrayList field4874 = new ArrayList();

    static {
        field4874.clear();
        field4874.add(100);
        field4874.add(5000);
        field4874.add(10000);
        field4874.add(30000);
        new HashMap();
    }

    public class453() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gm.ac(IZI)[B")
    public static byte[] method3393(int arg0, boolean arg1) {
        Object var2 = field4861;
        synchronized (field4861) {
            if ((arg0 == 100 || arg0 < 100 && arg1) && field4862 > 0) {
                byte[] var3 = field4868[--field4862];
                field4868[field4862] = null;
                return var3;
            }
            if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4863 > 0) {
                byte[] var4 = field4871[--field4863];
                field4871[field4863] = null;
                return var4;
            }
            if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4870 > 0) {
                byte[] var5 = field4872[--field4870];
                field4872[field4870] = null;
                return var5;
            }
            if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4864 > 0) {
                byte[] var6 = field4873[--field4864];
                field4873[field4864] = null;
                return var6;
            }
            if (Statics.field4692 != null) {
                for (int var7 = 0; var7 < Statics.field3737.length; var7++) {
                    if ((Statics.field3737[var7] == arg0 || arg0 < Statics.field3737[var7] && arg1) && Statics.field1757[var7] > 0) {
                        byte[] var8 = Statics.field4692[var7][--Statics.field1757[var7]];
                        Statics.field4692[var7][Statics.field1757[var7]] = null;
                        return var8;
                    }
                }
            }
            if (arg1 && Statics.field3737 != null) {
                for (int var9 = 0; var9 < Statics.field3737.length; var9++) {
                    if (arg0 <= Statics.field3737[var9] && Statics.field1757[var9] < Statics.field4692[var9].length) {
                        return new byte[Statics.field3737[var9]];
                    }
                }
            }
        }
        return new byte[arg0];
    }

    @ObfuscatedName("pd.ae(II)[B")
    public static byte[] method6934(int arg0) {
        return method3393(arg0, false);
    }

    @ObfuscatedName("dq.ag([BI)V")
    public static void method2426(byte[] arg0) {
        Object var1 = field4861;
        synchronized (field4861) {
            if (arg0.length == 100 && field4862 < field4866) {
                field4868[++field4862 - 1] = arg0;
            } else if (arg0.length == 5000 && field4863 < field4865) {
                field4871[++field4863 - 1] = arg0;
            } else if (arg0.length == 10000 && field4870 < field4867) {
                field4872[++field4870 - 1] = arg0;
            } else if (arg0.length == 30000 && field4864 < field4869) {
                field4873[++field4864 - 1] = arg0;
            } else if (Statics.field4692 != null) {
                for (int var2 = 0; var2 < Statics.field3737.length; var2++) {
                    if (Statics.field3737[var2] == arg0.length && Statics.field1757[var2] < Statics.field4692[var2].length) {
                        Statics.field4692[var2][Statics.field1757[var2]++] = arg0;
                        return;
                    }
                }
            }
        }
    }
}
