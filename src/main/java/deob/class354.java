package deob;

import java.util.ArrayList;
import java.util.HashMap;

@ObfuscatedName("mm")
public class class354 {

    @ObfuscatedName("mm.c")
    public static int field4206 = 0;

    @ObfuscatedName("mm.q")
    public static int field4207 = 0;

    @ObfuscatedName("mm.i")
    public static int field4208 = 0;

    @ObfuscatedName("mm.k")
    public static int field4210 = 0;

    @ObfuscatedName("mm.o")
    public static int field4211 = 1000;

    @ObfuscatedName("mm.n")
    public static int field4202 = 250;

    @ObfuscatedName("mm.d")
    public static int field4212 = 100;

    @ObfuscatedName("mm.a")
    public static int field4213 = 50;

    @ObfuscatedName("mm.m")
    public static byte[][] field4214 = new byte[1000][];

    @ObfuscatedName("mm.u")
    public static byte[][] field4215 = new byte[250][];

    @ObfuscatedName("mm.l")
    public static byte[][] field4216 = new byte[100][];

    @ObfuscatedName("mm.z")
    public static byte[][] field4217 = new byte[50][];

    @ObfuscatedName("mm.e")
    public static ArrayList field4219 = new ArrayList();

    static {
        method5394();
        new HashMap();
    }

    public class354() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lb.s(I)V")
    public static void method5394() {
        field4219.clear();
        field4219.add(100);
        field4219.add(5000);
        field4219.add(10000);
        field4219.add(30000);
    }

    @ObfuscatedName("mm.h(IZI)[B")
    public static synchronized byte[] method5840(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field4206 > 0) {
            byte[] var2 = field4214[--field4206];
            field4214[field4206] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4207 > 0) {
            byte[] var3 = field4215[--field4207];
            field4215[field4207] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4208 > 0) {
            byte[] var4 = field4216[--field4208];
            field4216[field4208] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4210 > 0) {
            byte[] var5 = field4217[--field4210];
            field4217[field4210] = null;
            return var5;
        } else {
            if (Statics.field3296 != null) {
                for (int var6 = 0; var6 < Statics.field1363.length; var6++) {
                    if ((Statics.field1363[var6] == arg0 || arg0 < Statics.field1363[var6] && arg1) && Statics.field4218[var6] > 0) {
                        byte[] var7 = Statics.field3296[var6][--Statics.field4218[var6]];
                        Statics.field3296[var6][Statics.field4218[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field1363 != null) {
                for (int var8 = 0; var8 < Statics.field1363.length; var8++) {
                    if (arg0 <= Statics.field1363[var8] && Statics.field4218[var8] < Statics.field3296[var8].length) {
                        return new byte[Statics.field1363[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("lk.w(II)[B")
    public static synchronized byte[] method5132(int arg0) {
        return method5840(arg0, false);
    }

    @ObfuscatedName("hz.v([BI)V")
    public static synchronized void method4398(byte[] arg0) {
        if (arg0.length == 100 && field4206 < field4211) {
            field4214[++field4206 - 1] = arg0;
        } else if (arg0.length == 5000 && field4207 < field4202) {
            field4215[++field4207 - 1] = arg0;
        } else if (arg0.length == 10000 && field4208 < field4212) {
            field4216[++field4208 - 1] = arg0;
        } else if (arg0.length == 30000 && field4210 < field4213) {
            field4217[++field4210 - 1] = arg0;
        } else if (Statics.field3296 != null) {
            for (int var1 = 0; var1 < Statics.field1363.length; var1++) {
                if (Statics.field1363[var1] == arg0.length && Statics.field4218[var1] < Statics.field3296[var1].length) {
                    Statics.field3296[var1][Statics.field4218[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
