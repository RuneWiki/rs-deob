package deob;

import java.util.ArrayList;
import java.util.HashMap;

@ObfuscatedName("mm")
public class class353 {

    @ObfuscatedName("mm.j")
    public static int field4204 = 0;

    @ObfuscatedName("mm.e")
    public static int field4205 = 0;

    @ObfuscatedName("mm.g")
    public static int field4207 = 0;

    @ObfuscatedName("mm.w")
    public static int field4217 = 0;

    @ObfuscatedName("mm.y")
    public static int field4208 = 1000;

    @ObfuscatedName("mm.i")
    public static int field4209 = 250;

    @ObfuscatedName("mm.s")
    public static int field4210 = 100;

    @ObfuscatedName("mm.t")
    public static int field4211 = 50;

    @ObfuscatedName("mm.z")
    public static byte[][] field4212 = new byte[1000][];

    @ObfuscatedName("mm.r")
    public static byte[][] field4213 = new byte[250][];

    @ObfuscatedName("mm.u")
    public static byte[][] field4216 = new byte[100][];

    @ObfuscatedName("mm.k")
    public static byte[][] field4215 = new byte[50][];

    @ObfuscatedName("mm.a")
    public static ArrayList field4203 = new ArrayList();

    static {
        method4525();
        new HashMap();
    }

    public class353() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hf.c(B)V")
    public static void method4525() {
        field4203.clear();
        field4203.add(100);
        field4203.add(5000);
        field4203.add(10000);
        field4203.add(30000);
    }

    @ObfuscatedName("mm.v(IZB)[B")
    public static synchronized byte[] method5925(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field4204 > 0) {
            byte[] var2 = field4212[--field4204];
            field4212[field4204] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4205 > 0) {
            byte[] var3 = field4213[--field4205];
            field4213[field4205] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4207 > 0) {
            byte[] var4 = field4216[--field4207];
            field4216[field4207] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4217 > 0) {
            byte[] var5 = field4215[--field4217];
            field4215[field4217] = null;
            return var5;
        } else {
            if (Statics.field4833 != null) {
                for (int var6 = 0; var6 < Statics.field159.length; var6++) {
                    if ((Statics.field159[var6] == arg0 || arg0 < Statics.field159[var6] && arg1) && Statics.field99[var6] > 0) {
                        byte[] var7 = Statics.field4833[var6][--Statics.field99[var6]];
                        Statics.field4833[var6][Statics.field99[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field159 != null) {
                for (int var8 = 0; var8 < Statics.field159.length; var8++) {
                    if (arg0 <= Statics.field159[var8] && Statics.field99[var8] < Statics.field4833[var8].length) {
                        return new byte[Statics.field159[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("kk.q(II)[B")
    public static synchronized byte[] method5071(int arg0) {
        return method5925(arg0, false);
    }

    @ObfuscatedName("cu.f([BB)V")
    public static synchronized void method2287(byte[] arg0) {
        if (arg0.length == 100 && field4204 < field4208) {
            field4212[++field4204 - 1] = arg0;
        } else if (arg0.length == 5000 && field4205 < field4209) {
            field4213[++field4205 - 1] = arg0;
        } else if (arg0.length == 10000 && field4207 < field4210) {
            field4216[++field4207 - 1] = arg0;
        } else if (arg0.length == 30000 && field4217 < field4211) {
            field4215[++field4217 - 1] = arg0;
        } else if (Statics.field4833 != null) {
            for (int var1 = 0; var1 < Statics.field159.length; var1++) {
                if (Statics.field159[var1] == arg0.length && Statics.field99[var1] < Statics.field4833[var1].length) {
                    Statics.field4833[var1][Statics.field99[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
