package deob;

import java.util.ArrayList;
import java.util.HashMap;

@ObfuscatedName("lj")
public class class336 {

    @ObfuscatedName("lj.t")
    public static int field4037 = 0;

    @ObfuscatedName("lj.s")
    public static int field4025 = 0;

    @ObfuscatedName("lj.j")
    public static int field4023 = 0;

    @ObfuscatedName("lj.w")
    public static int field4027 = 0;

    @ObfuscatedName("lj.n")
    public static int field4024 = 1000;

    @ObfuscatedName("lj.r")
    public static int field4029 = 250;

    @ObfuscatedName("lj.o")
    public static int field4022 = 100;

    @ObfuscatedName("lj.v")
    public static int field4031 = 50;

    @ObfuscatedName("lj.d")
    public static byte[][] field4028 = new byte[1000][];

    @ObfuscatedName("lj.h")
    public static byte[][] field4033 = new byte[250][];

    @ObfuscatedName("lj.g")
    public static byte[][] field4034 = new byte[100][];

    @ObfuscatedName("lj.e")
    public static byte[][] field4035 = new byte[50][];

    @ObfuscatedName("lj.f")
    public static ArrayList field4036 = new ArrayList();

    static {
        field4036.clear();
        field4036.add(100);
        field4036.add(5000);
        field4036.add(10000);
        field4036.add(30000);
        new HashMap();
    }

    public class336() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lj.c(IZS)[B")
    public static synchronized byte[] method5650(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field4037 > 0) {
            byte[] var2 = field4028[--field4037];
            field4028[field4037] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4025 > 0) {
            byte[] var3 = field4033[--field4025];
            field4033[field4025] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4023 > 0) {
            byte[] var4 = field4034[--field4023];
            field4034[field4023] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4027 > 0) {
            byte[] var5 = field4035[--field4027];
            field4035[field4027] = null;
            return var5;
        } else {
            if (Statics.field776 != null) {
                for (int var6 = 0; var6 < Statics.field320.length; var6++) {
                    if ((Statics.field320[var6] == arg0 || arg0 < Statics.field320[var6] && arg1) && Statics.field463[var6] > 0) {
                        byte[] var7 = Statics.field776[var6][--Statics.field463[var6]];
                        Statics.field776[var6][Statics.field463[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field320 != null) {
                for (int var8 = 0; var8 < Statics.field320.length; var8++) {
                    if (arg0 <= Statics.field320[var8] && Statics.field463[var8] < Statics.field776[var8].length) {
                        return new byte[Statics.field320[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("js.b(II)[B")
    public static synchronized byte[] method4964(int arg0) {
        return method5650(arg0, false);
    }

    @ObfuscatedName("ez.p([BI)V")
    public static synchronized void method2729(byte[] arg0) {
        if (arg0.length == 100 && field4037 < field4024) {
            field4028[++field4037 - 1] = arg0;
        } else if (arg0.length == 5000 && field4025 < field4029) {
            field4033[++field4025 - 1] = arg0;
        } else if (arg0.length == 10000 && field4023 < field4022) {
            field4034[++field4023 - 1] = arg0;
        } else if (arg0.length == 30000 && field4027 < field4031) {
            field4035[++field4027 - 1] = arg0;
        } else if (Statics.field776 != null) {
            for (int var1 = 0; var1 < Statics.field320.length; var1++) {
                if (Statics.field320[var1] == arg0.length && Statics.field463[var1] < Statics.field776[var1].length) {
                    Statics.field776[var1][Statics.field463[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
