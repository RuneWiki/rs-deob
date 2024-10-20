package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@ObfuscatedName("pb")
public class class412 {

    @ObfuscatedName("pb.ac")
    public static int field4557 = 0;

    @ObfuscatedName("pb.ai")
    public static int field4546 = 0;

    @ObfuscatedName("pb.az")
    public static int field4547 = 0;

    @ObfuscatedName("pb.ap")
    public static int field4548 = 0;

    @ObfuscatedName("pb.aa")
    public static int field4543 = 1000;

    @ObfuscatedName("pb.af")
    public static int field4550 = 250;

    @ObfuscatedName("pb.ad")
    public static int field4544 = 100;

    @ObfuscatedName("pb.aq")
    public static int field4552 = 50;

    @ObfuscatedName("pb.al")
    public static byte[][] field4553 = new byte[1000][];

    @ObfuscatedName("pb.an")
    public static byte[][] field4554 = new byte[250][];

    @ObfuscatedName("pb.ar")
    public static byte[][] field4555 = new byte[100][];

    @ObfuscatedName("pb.ab")
    public static byte[][] field4556 = new byte[50][];

    @ObfuscatedName("pb.ah")
    public static ArrayList field4551 = new ArrayList();

    static {
        method2528();
        new HashMap();
    }

    public class412() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ly.au([I[II)V")
    public static void method5201(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field4588 = null;
            Statics.field2141 = null;
            Statics.field4534 = (byte[][][]) null;
            method2528();
            return;
        }
        Statics.field4588 = arg0;
        Statics.field2141 = new int[arg0.length];
        Statics.field4534 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field4588.length; var2++) {
            Statics.field4534[var2] = new byte[arg1[var2]][];
            field4551.add(arg0[var2]);
        }
        Collections.sort(field4551);
    }

    @ObfuscatedName("dq.ae(I)V")
    public static void method2528() {
        field4551.clear();
        field4551.add(100);
        field4551.add(5000);
        field4551.add(10000);
        field4551.add(30000);
    }

    @ObfuscatedName("pb.ao(IZI)[B")
    public static synchronized byte[] method7053(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field4557 > 0) {
            byte[] var2 = field4553[--field4557];
            field4553[field4557] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4546 > 0) {
            byte[] var3 = field4554[--field4546];
            field4554[field4546] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4547 > 0) {
            byte[] var4 = field4555[--field4547];
            field4555[field4547] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4548 > 0) {
            byte[] var5 = field4556[--field4548];
            field4556[field4548] = null;
            return var5;
        } else {
            if (Statics.field4534 != null) {
                for (int var6 = 0; var6 < Statics.field4588.length; var6++) {
                    if ((Statics.field4588[var6] == arg0 || arg0 < Statics.field4588[var6] && arg1) && Statics.field2141[var6] > 0) {
                        byte[] var7 = Statics.field4534[var6][--Statics.field2141[var6]];
                        Statics.field4534[var6][Statics.field2141[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field4588 != null) {
                for (int var8 = 0; var8 < Statics.field4588.length; var8++) {
                    if (arg0 <= Statics.field4588[var8] && Statics.field2141[var8] < Statics.field4534[var8].length) {
                        return new byte[Statics.field4588[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("eg.at(IB)[B")
    public static synchronized byte[] method2801(int arg0) {
        return method7053(arg0, false);
    }

    @ObfuscatedName("nn.ac([BI)V")
    public static synchronized void method6064(byte[] arg0) {
        if (arg0.length == 100 && field4557 < field4543) {
            field4553[++field4557 - 1] = arg0;
        } else if (arg0.length == 5000 && field4546 < field4550) {
            field4554[++field4546 - 1] = arg0;
        } else if (arg0.length == 10000 && field4547 < field4544) {
            field4555[++field4547 - 1] = arg0;
        } else if (arg0.length == 30000 && field4548 < field4552) {
            field4556[++field4548 - 1] = arg0;
        } else if (Statics.field4534 != null) {
            for (int var1 = 0; var1 < Statics.field4588.length; var1++) {
                if (Statics.field4588[var1] == arg0.length && Statics.field2141[var1] < Statics.field4534[var1].length) {
                    Statics.field4534[var1][Statics.field2141[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
