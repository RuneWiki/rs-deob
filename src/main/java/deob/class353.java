package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@ObfuscatedName("my")
public class class353 {

    @ObfuscatedName("my.b")
    public static int field4155 = 0;

    @ObfuscatedName("my.n")
    public static int field4157 = 0;

    @ObfuscatedName("my.s")
    public static int field4169 = 0;

    @ObfuscatedName("my.l")
    public static int field4164 = 0;

    @ObfuscatedName("my.q")
    public static int field4160 = 1000;

    @ObfuscatedName("my.o")
    public static int field4161 = 250;

    @ObfuscatedName("my.r")
    public static int field4162 = 100;

    @ObfuscatedName("my.p")
    public static int field4153 = 50;

    @ObfuscatedName("my.w")
    public static byte[][] field4158 = new byte[1000][];

    @ObfuscatedName("my.k")
    public static byte[][] field4159 = new byte[250][];

    @ObfuscatedName("my.d")
    public static byte[][] field4166 = new byte[100][];

    @ObfuscatedName("my.m")
    public static byte[][] field4163 = new byte[50][];

    @ObfuscatedName("my.x")
    public static ArrayList field4168 = new ArrayList();

    static {
        method1876();
        new HashMap();
    }

    public class353() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.v([I[II)V")
    public static void method1969(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field2137 = null;
            Statics.field1521 = null;
            Statics.field2841 = (byte[][][]) null;
            method1876();
            return;
        }
        Statics.field2137 = arg0;
        Statics.field1521 = new int[arg0.length];
        Statics.field2841 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field2137.length; var2++) {
            Statics.field2841[var2] = new byte[arg1[var2]][];
            field4168.add(arg0[var2]);
        }
        Collections.sort(field4168);
    }

    @ObfuscatedName("bs.c(I)V")
    public static void method1876() {
        field4168.clear();
        field4168.add(100);
        field4168.add(5000);
        field4168.add(10000);
        field4168.add(30000);
    }

    @ObfuscatedName("my.i(IZB)[B")
    public static synchronized byte[] method5953(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field4155 > 0) {
            byte[] var2 = field4158[--field4155];
            field4158[field4155] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4157 > 0) {
            byte[] var3 = field4159[--field4157];
            field4159[field4157] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4169 > 0) {
            byte[] var4 = field4166[--field4169];
            field4166[field4169] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4164 > 0) {
            byte[] var5 = field4163[--field4164];
            field4163[field4164] = null;
            return var5;
        } else {
            if (Statics.field2841 != null) {
                for (int var6 = 0; var6 < Statics.field2137.length; var6++) {
                    if ((Statics.field2137[var6] == arg0 || arg0 < Statics.field2137[var6] && arg1) && Statics.field1521[var6] > 0) {
                        byte[] var7 = Statics.field2841[var6][--Statics.field1521[var6]];
                        Statics.field2841[var6][Statics.field1521[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field2137 != null) {
                for (int var8 = 0; var8 < Statics.field2137.length; var8++) {
                    if (arg0 <= Statics.field2137[var8] && Statics.field1521[var8] < Statics.field2841[var8].length) {
                        return new byte[Statics.field2137[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("lg.f(II)[B")
    public static synchronized byte[] method5239(int arg0) {
        return method5953(arg0, false);
    }

    @ObfuscatedName("dp.b([BI)V")
    public static synchronized void method2506(byte[] arg0) {
        if (arg0.length == 100 && field4155 < field4160) {
            field4158[++field4155 - 1] = arg0;
        } else if (arg0.length == 5000 && field4157 < field4161) {
            field4159[++field4157 - 1] = arg0;
        } else if (arg0.length == 10000 && field4169 < field4162) {
            field4166[++field4169 - 1] = arg0;
        } else if (arg0.length == 30000 && field4164 < field4153) {
            field4163[++field4164 - 1] = arg0;
        } else if (Statics.field2841 != null) {
            for (int var1 = 0; var1 < Statics.field2137.length; var1++) {
                if (Statics.field2137[var1] == arg0.length && Statics.field1521[var1] < Statics.field2841[var1].length) {
                    Statics.field2841[var1][Statics.field1521[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
