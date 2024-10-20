package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@ObfuscatedName("mk")
public class class354 {

    @ObfuscatedName("mk.a")
    public static int field4215 = 0;

    @ObfuscatedName("mk.m")
    public static int field4217 = 0;

    @ObfuscatedName("mk.p")
    public static int field4227 = 0;

    @ObfuscatedName("mk.s")
    public static int field4218 = 0;

    @ObfuscatedName("mk.r")
    public static int field4211 = 1000;

    @ObfuscatedName("mk.v")
    public static int field4220 = 250;

    @ObfuscatedName("mk.y")
    public static int field4221 = 100;

    @ObfuscatedName("mk.c")
    public static int field4222 = 50;

    @ObfuscatedName("mk.w")
    public static byte[][] field4223 = new byte[1000][];

    @ObfuscatedName("mk.b")
    public static byte[][] field4224 = new byte[250][];

    @ObfuscatedName("mk.t")
    public static byte[][] field4225 = new byte[100][];

    @ObfuscatedName("mk.g")
    public static byte[][] field4226 = new byte[50][];

    @ObfuscatedName("mk.h")
    public static ArrayList field4213 = new ArrayList();

    static {
        method2098();
        new HashMap();
    }

    public class354() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("be.o([I[II)V")
    public static void method1771(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field1778 = null;
            Statics.field4068 = null;
            Statics.field1596 = (byte[][][]) null;
            method2098();
            return;
        }
        Statics.field1778 = arg0;
        Statics.field4068 = new int[arg0.length];
        Statics.field1596 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field1778.length; var2++) {
            Statics.field1596[var2] = new byte[arg1[var2]][];
            field4213.add(arg0[var2]);
        }
        Collections.sort(field4213);
    }

    @ObfuscatedName("cc.q(S)V")
    public static void method2098() {
        field4213.clear();
        field4213.add(100);
        field4213.add(5000);
        field4213.add(10000);
        field4213.add(30000);
    }

    @ObfuscatedName("mk.l(IZI)[B")
    public static synchronized byte[] method5864(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field4215 > 0) {
            byte[] var2 = field4223[--field4215];
            field4223[field4215] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4217 > 0) {
            byte[] var3 = field4224[--field4217];
            field4224[field4217] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4227 > 0) {
            byte[] var4 = field4225[--field4227];
            field4225[field4227] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4218 > 0) {
            byte[] var5 = field4226[--field4218];
            field4226[field4218] = null;
            return var5;
        } else {
            if (Statics.field1596 != null) {
                for (int var6 = 0; var6 < Statics.field1778.length; var6++) {
                    if ((Statics.field1778[var6] == arg0 || arg0 < Statics.field1778[var6] && arg1) && Statics.field4068[var6] > 0) {
                        byte[] var7 = Statics.field1596[var6][--Statics.field4068[var6]];
                        Statics.field1596[var6][Statics.field4068[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field1778 != null) {
                for (int var8 = 0; var8 < Statics.field1778.length; var8++) {
                    if (arg0 <= Statics.field1778[var8] && Statics.field4068[var8] < Statics.field1596[var8].length) {
                        return new byte[Statics.field1778[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("dn.k(IB)[B")
    public static synchronized byte[] method2542(int arg0) {
        return method5864(arg0, false);
    }
}
