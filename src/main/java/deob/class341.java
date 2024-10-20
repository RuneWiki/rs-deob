package deob;

import java.util.ArrayList;
import java.util.HashMap;

@ObfuscatedName("mq")
public class class341 {

    @ObfuscatedName("mq.r")
    public static int field4070 = 0;

    @ObfuscatedName("mq.o")
    public static int field4071 = 0;

    @ObfuscatedName("mq.i")
    public static int field4080 = 0;

    @ObfuscatedName("mq.w")
    public static int field4073 = 0;

    @ObfuscatedName("mq.v")
    public static int field4074 = 1000;

    @ObfuscatedName("mq.a")
    public static int field4075 = 250;

    @ObfuscatedName("mq.y")
    public static int field4072 = 100;

    @ObfuscatedName("mq.u")
    public static int field4077 = 50;

    @ObfuscatedName("mq.h")
    public static byte[][] field4076 = new byte[1000][];

    @ObfuscatedName("mq.q")
    public static byte[][] field4079 = new byte[250][];

    @ObfuscatedName("mq.x")
    public static byte[][] field4078 = new byte[100][];

    @ObfuscatedName("mq.p")
    public static byte[][] field4081 = new byte[50][];

    @ObfuscatedName("mq.j")
    public static ArrayList field4084 = new ArrayList();

    static {
        method5119();
        new HashMap();
    }

    public class341() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kk.c(I)V")
    public static void method5119() {
        field4084.clear();
        field4084.add(100);
        field4084.add(5000);
        field4084.add(10000);
        field4084.add(30000);
    }

    @ObfuscatedName("mq.l(IZB)[B")
    public static synchronized byte[] method5642(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field4070 > 0) {
            byte[] var2 = field4076[--field4070];
            field4076[field4070] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4071 > 0) {
            byte[] var3 = field4079[--field4071];
            field4079[field4071] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4080 > 0) {
            byte[] var4 = field4078[--field4080];
            field4078[field4080] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4073 > 0) {
            byte[] var5 = field4081[--field4073];
            field4081[field4073] = null;
            return var5;
        } else {
            if (Statics.field1394 != null) {
                for (int var6 = 0; var6 < Statics.field4082.length; var6++) {
                    if ((Statics.field4082[var6] == arg0 || arg0 < Statics.field4082[var6] && arg1) && Statics.field3873[var6] > 0) {
                        byte[] var7 = Statics.field1394[var6][--Statics.field3873[var6]];
                        Statics.field1394[var6][Statics.field3873[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && Statics.field4082 != null) {
                for (int var8 = 0; var8 < Statics.field4082.length; var8++) {
                    if (arg0 <= Statics.field4082[var8] && Statics.field3873[var8] < Statics.field1394[var8].length) {
                        return new byte[Statics.field4082[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("cf.s(II)[B")
    public static synchronized byte[] method1986(int arg0) {
        return method5642(arg0, false);
    }

    @ObfuscatedName("cg.e([BB)V")
    public static synchronized void method1989(byte[] arg0) {
        if (arg0.length == 100 && field4070 < field4074) {
            field4076[++field4070 - 1] = arg0;
        } else if (arg0.length == 5000 && field4071 < field4075) {
            field4079[++field4071 - 1] = arg0;
        } else if (arg0.length == 10000 && field4080 < field4072) {
            field4078[++field4080 - 1] = arg0;
        } else if (arg0.length == 30000 && field4073 < field4077) {
            field4081[++field4073 - 1] = arg0;
        } else if (Statics.field1394 != null) {
            for (int var1 = 0; var1 < Statics.field4082.length; var1++) {
                if (Statics.field4082[var1] == arg0.length && Statics.field3873[var1] < Statics.field1394[var1].length) {
                    Statics.field1394[var1][Statics.field3873[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
