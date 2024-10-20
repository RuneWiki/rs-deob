package deob;

import java.util.ArrayList;
import java.util.HashMap;

@ObfuscatedName("nn")
public class class373 {

    @ObfuscatedName("nn.h")
    public static int field4382 = 0;

    @ObfuscatedName("nn.j")
    public static int field4389 = 0;

    @ObfuscatedName("nn.y")
    public static int field4384 = 0;

    @ObfuscatedName("nn.d")
    public static int field4385 = 0;

    @ObfuscatedName("nn.n")
    public static int field4386 = 1000;

    @ObfuscatedName("nn.r")
    public static int field4387 = 250;

    @ObfuscatedName("nn.l")
    public static int field4388 = 100;

    @ObfuscatedName("nn.s")
    public static int field4393 = 50;

    @ObfuscatedName("nn.p")
    public static byte[][] field4390 = new byte[1000][];

    @ObfuscatedName("nn.b")
    public static byte[][] field4380 = new byte[250][];

    @ObfuscatedName("nn.o")
    public static byte[][] field4395 = new byte[100][];

    @ObfuscatedName("nn.u")
    public static byte[][] field4391 = new byte[50][];

    @ObfuscatedName("nn.m")
    public static ArrayList field4394 = new ArrayList();

    static {
        method5688();
        new HashMap();
    }

    public class373() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("li.a(B)V")
    public static void method5688() {
        field4394.clear();
        field4394.add(100);
        field4394.add(5000);
        field4394.add(10000);
        field4394.add(30000);
    }

    @ObfuscatedName("nn.f(IZI)[B")
    public static synchronized byte[] method6567(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field4382 > 0) {
            byte[] var2 = field4390[--field4382];
            field4390[field4382] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4389 > 0) {
            byte[] var3 = field4380[--field4389];
            field4380[field4389] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4384 > 0) {
            byte[] var4 = field4395[--field4384];
            field4395[field4384] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4385 > 0) {
            byte[] var5 = field4391[--field4385];
            field4391[field4385] = null;
            return var5;
        } else {
            if (Statics.field4301 != null) {
                for (int var6 = 0; var6 < Statics.field2711.length; var6++) {
                    if ((Statics.field2711[var6] == arg0 || arg0 < Statics.field2711[var6] && arg1) && Statics.field2847[var6] > 0) {
                        byte[] var7 = Statics.field4301[var6][--Statics.field2847[var6]];
                        Statics.field4301[var6][Statics.field2847[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field2711 != null) {
                for (int var8 = 0; var8 < Statics.field2711.length; var8++) {
                    if (arg0 <= Statics.field2711[var8] && Statics.field2847[var8] < Statics.field4301[var8].length) {
                        return new byte[Statics.field2711[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("ao.c(II)[B")
    public static synchronized byte[] method442(int arg0) {
        return method6567(arg0, false);
    }

    @ObfuscatedName("gw.x([BI)V")
    public static synchronized void method3658(byte[] arg0) {
        if (arg0.length == 100 && field4382 < field4386) {
            field4390[++field4382 - 1] = arg0;
        } else if (arg0.length == 5000 && field4389 < field4387) {
            field4380[++field4389 - 1] = arg0;
        } else if (arg0.length == 10000 && field4384 < field4388) {
            field4395[++field4384 - 1] = arg0;
        } else if (arg0.length == 30000 && field4385 < field4393) {
            field4391[++field4385 - 1] = arg0;
        } else if (Statics.field4301 != null) {
            for (int var1 = 0; var1 < Statics.field2711.length; var1++) {
                if (Statics.field2711[var1] == arg0.length && Statics.field2847[var1] < Statics.field4301[var1].length) {
                    Statics.field4301[var1][Statics.field2847[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
