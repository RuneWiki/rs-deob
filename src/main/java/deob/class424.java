package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@ObfuscatedName("qq")
public class class424 {

    @ObfuscatedName("qq.ab")
    public static final Object field4578 = new Object();

    @ObfuscatedName("qq.au")
    public static int field4585 = 0;

    @ObfuscatedName("qq.aa")
    public static int field4580 = 0;

    @ObfuscatedName("qq.ac")
    public static int field4581 = 0;

    @ObfuscatedName("qq.al")
    public static int field4574 = 0;

    @ObfuscatedName("qq.az")
    public static int field4575 = 1000;

    @ObfuscatedName("qq.ap")
    public static int field4584 = 250;

    @ObfuscatedName("qq.av")
    public static int field4579 = 100;

    @ObfuscatedName("qq.ax")
    public static int field4586 = 50;

    @ObfuscatedName("qq.as")
    public static byte[][] field4587 = new byte[1000][];

    @ObfuscatedName("qq.ay")
    public static byte[][] field4588 = new byte[250][];

    @ObfuscatedName("qq.ak")
    public static byte[][] field4583 = new byte[100][];

    @ObfuscatedName("qq.aj")
    public static byte[][] field4590 = new byte[50][];

    @ObfuscatedName("qq.aw")
    public static ArrayList field4591 = new ArrayList();

    static {
        method4976();
        new HashMap();
    }

    public class424() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.at([I[II)V")
    public static void method16(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field2339 = null;
            Statics.field2777 = null;
            Statics.field1 = (byte[][][]) null;
            method4976();
            return;
        }
        Statics.field2339 = arg0;
        Statics.field2777 = new int[arg0.length];
        Statics.field1 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field2339.length; var2++) {
            Statics.field1[var2] = new byte[arg1[var2]][];
            field4591.add(arg0[var2]);
        }
        Collections.sort(field4591);
    }

    @ObfuscatedName("kt.ah(I)V")
    public static void method4976() {
        field4591.clear();
        field4591.add(100);
        field4591.add(5000);
        field4591.add(10000);
        field4591.add(30000);
    }

    @ObfuscatedName("lu.ar(IZI)[B")
    public static byte[] method5332(int arg0, boolean arg1) {
        Object var2 = field4578;
        synchronized (field4578) {
            if ((arg0 == 100 || arg0 < 100 && arg1) && field4585 > 0) {
                byte[] var3 = field4587[--field4585];
                field4587[field4585] = null;
                return var3;
            }
            if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4580 > 0) {
                byte[] var4 = field4588[--field4580];
                field4588[field4580] = null;
                return var4;
            }
            if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4581 > 0) {
                byte[] var5 = field4583[--field4581];
                field4583[field4581] = null;
                return var5;
            }
            if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4574 > 0) {
                byte[] var6 = field4590[--field4574];
                field4590[field4574] = null;
                return var6;
            }
            if (Statics.field1 != null) {
                for (int var7 = 0; var7 < Statics.field2339.length; var7++) {
                    if ((Statics.field2339[var7] == arg0 || arg0 < Statics.field2339[var7] && arg1) && Statics.field2777[var7] > 0) {
                        byte[] var8 = Statics.field1[var7][--Statics.field2777[var7]];
                        Statics.field1[var7][Statics.field2777[var7]] = null;
                        return var8;
                    }
                }
            }
            if (arg1 && Statics.field2339 != null) {
                for (int var9 = 0; var9 < Statics.field2339.length; var9++) {
                    if (arg0 <= Statics.field2339[var9] && Statics.field2777[var9] < Statics.field1[var9].length) {
                        return new byte[Statics.field2339[var9]];
                    }
                }
            }
        }
        return new byte[arg0];
    }

    @ObfuscatedName("nl.ao(IB)[B")
    public static byte[] method6208(int arg0) {
        return method5332(arg0, false);
    }
}
