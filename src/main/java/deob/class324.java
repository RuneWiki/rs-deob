package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@ObfuscatedName("lb")
public class class324 {

    @ObfuscatedName("lb.o")
    public static int field3878 = 0;

    @ObfuscatedName("lb.g")
    public static int field3888 = 0;

    @ObfuscatedName("lb.e")
    public static int field3886 = 0;

    @ObfuscatedName("lb.p")
    public static int field3892 = 0;

    @ObfuscatedName("lb.j")
    public static int field3882 = 1000;

    @ObfuscatedName("lb.b")
    public static int field3883 = 250;

    @ObfuscatedName("lb.x")
    public static int field3884 = 100;

    @ObfuscatedName("lb.y")
    public static int field3885 = 50;

    @ObfuscatedName("lb.k")
    public static byte[][] field3879 = new byte[1000][];

    @ObfuscatedName("lb.t")
    public static byte[][] field3887 = new byte[250][];

    @ObfuscatedName("lb.l")
    public static byte[][] field3876 = new byte[100][];

    @ObfuscatedName("lb.u")
    public static byte[][] field3889 = new byte[50][];

    @ObfuscatedName("lb.d")
    public static ArrayList field3891 = new ArrayList();

    static {
        method4939();
        new HashMap();
    }

    public class324() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ff.i([I[II)V")
    public static void method3090(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field2004 = null;
            Statics.field3890 = null;
            Statics.field3035 = (byte[][][]) null;
            method4939();
            return;
        }
        Statics.field2004 = arg0;
        Statics.field3890 = new int[arg0.length];
        Statics.field3035 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field2004.length; var2++) {
            Statics.field3035[var2] = new byte[arg1[var2]][];
            field3891.add(arg0[var2]);
        }
        Collections.sort(field3891);
    }

    @ObfuscatedName("kq.w(I)V")
    public static void method4939() {
        field3891.clear();
        field3891.add(100);
        field3891.add(5000);
        field3891.add(10000);
        field3891.add(30000);
    }

    @ObfuscatedName("lb.s(IZB)[B")
    public static synchronized byte[] method5369(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3878 > 0) {
            byte[] var2 = field3879[--field3878];
            field3879[field3878] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3888 > 0) {
            byte[] var3 = field3887[--field3888];
            field3887[field3888] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field3886 > 0) {
            byte[] var4 = field3876[--field3886];
            field3876[field3886] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3892 > 0) {
            byte[] var5 = field3889[--field3892];
            field3889[field3892] = null;
            return var5;
        } else {
            if (Statics.field3035 != null) {
                for (int var6 = 0; var6 < Statics.field2004.length; var6++) {
                    if ((Statics.field2004[var6] == arg0 || arg0 < Statics.field2004[var6] && arg1) && Statics.field3890[var6] > 0) {
                        byte[] var7 = Statics.field3035[var6][--Statics.field3890[var6]];
                        Statics.field3035[var6][Statics.field3890[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field2004 != null) {
                for (int var8 = 0; var8 < Statics.field2004.length; var8++) {
                    if (arg0 <= Statics.field2004[var8] && Statics.field3890[var8] < Statics.field3035[var8].length) {
                        return new byte[Statics.field2004[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("gs.a(II)[B")
    public static synchronized byte[] method3578(int arg0) {
        return method5369(arg0, false);
    }

    @ObfuscatedName("ei.o([BI)V")
    public static synchronized void method2675(byte[] arg0) {
        if (arg0.length == 100 && field3878 < field3882) {
            field3879[++field3878 - 1] = arg0;
        } else if (arg0.length == 5000 && field3888 < field3883) {
            field3887[++field3888 - 1] = arg0;
        } else if (arg0.length == 10000 && field3886 < field3884) {
            field3876[++field3886 - 1] = arg0;
        } else if (arg0.length == 30000 && field3892 < field3885) {
            field3889[++field3892 - 1] = arg0;
        } else if (Statics.field3035 != null) {
            for (int var1 = 0; var1 < Statics.field2004.length; var1++) {
                if (Statics.field2004[var1] == arg0.length && Statics.field3890[var1] < Statics.field3035[var1].length) {
                    Statics.field3035[var1][Statics.field3890[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
