package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@ObfuscatedName("mj")
public class class355 {

    @ObfuscatedName("mj.k")
    public static int field4248 = 0;

    @ObfuscatedName("mj.w")
    public static int field4249 = 0;

    @ObfuscatedName("mj.s")
    public static int field4250 = 0;

    @ObfuscatedName("mj.q")
    public static int field4251 = 0;

    @ObfuscatedName("mj.m")
    public static int field4252 = 1000;

    @ObfuscatedName("mj.x")
    public static int field4253 = 250;

    @ObfuscatedName("mj.j")
    public static int field4254 = 100;

    @ObfuscatedName("mj.v")
    public static int field4255 = 50;

    @ObfuscatedName("mj.h")
    public static byte[][] field4256 = new byte[1000][];

    @ObfuscatedName("mj.t")
    public static byte[][] field4245 = new byte[250][];

    @ObfuscatedName("mj.u")
    public static byte[][] field4258 = new byte[100][];

    @ObfuscatedName("mj.d")
    public static byte[][] field4246 = new byte[50][];

    @ObfuscatedName("mj.e")
    public static ArrayList field4260 = new ArrayList();

    static {
        method1718();
        new HashMap();
    }

    public class355() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kt.c([I[IB)V")
    public static void method5342(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field4016 = null;
            Statics.field1616 = null;
            Statics.field1360 = (byte[][][]) null;
            method1718();
            return;
        }
        Statics.field4016 = arg0;
        Statics.field1616 = new int[arg0.length];
        Statics.field1360 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field4016.length; var2++) {
            Statics.field1360[var2] = new byte[arg1[var2]][];
            field4260.add(arg0[var2]);
        }
        Collections.sort(field4260);
    }

    @ObfuscatedName("br.p(S)V")
    public static void method1718() {
        field4260.clear();
        field4260.add(100);
        field4260.add(5000);
        field4260.add(10000);
        field4260.add(30000);
    }

    @ObfuscatedName("mj.f(IZI)[B")
    public static synchronized byte[] method6077(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field4248 > 0) {
            byte[] var2 = field4256[--field4248];
            field4256[field4248] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4249 > 0) {
            byte[] var3 = field4245[--field4249];
            field4245[field4249] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4250 > 0) {
            byte[] var4 = field4258[--field4250];
            field4258[field4250] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4251 > 0) {
            byte[] var5 = field4246[--field4251];
            field4246[field4251] = null;
            return var5;
        } else {
            if (Statics.field1360 != null) {
                for (int var6 = 0; var6 < Statics.field4016.length; var6++) {
                    if ((Statics.field4016[var6] == arg0 || arg0 < Statics.field4016[var6] && arg1) && Statics.field1616[var6] > 0) {
                        byte[] var7 = Statics.field1360[var6][--Statics.field1616[var6]];
                        Statics.field1360[var6][Statics.field1616[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field4016 != null) {
                for (int var8 = 0; var8 < Statics.field4016.length; var8++) {
                    if (arg0 <= Statics.field4016[var8] && Statics.field1616[var8] < Statics.field1360[var8].length) {
                        return new byte[Statics.field4016[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("fr.n(II)[B")
    public static synchronized byte[] method3113(int arg0) {
        return method6077(arg0, false);
    }

    @ObfuscatedName("hk.k([BI)V")
    public static synchronized void method4288(byte[] arg0) {
        if (arg0.length == 100 && field4248 < field4252) {
            field4256[++field4248 - 1] = arg0;
        } else if (arg0.length == 5000 && field4249 < field4253) {
            field4245[++field4249 - 1] = arg0;
        } else if (arg0.length == 10000 && field4250 < field4254) {
            field4258[++field4250 - 1] = arg0;
        } else if (arg0.length == 30000 && field4251 < field4255) {
            field4246[++field4251 - 1] = arg0;
        } else if (Statics.field1360 != null) {
            for (int var1 = 0; var1 < Statics.field4016.length; var1++) {
                if (Statics.field4016[var1] == arg0.length && Statics.field1616[var1] < Statics.field1360[var1].length) {
                    Statics.field1360[var1][Statics.field1616[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
