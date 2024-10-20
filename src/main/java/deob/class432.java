package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@ObfuscatedName("qi")
public class class432 {

    @ObfuscatedName("qi.an")
    public static final Object field4674 = new Object();

    @ObfuscatedName("qi.ao")
    public static int field4675 = 0;

    @ObfuscatedName("qi.ab")
    public static int field4688 = 0;

    @ObfuscatedName("qi.aw")
    public static int field4676 = 0;

    @ObfuscatedName("qi.ad")
    public static int field4678 = 0;

    @ObfuscatedName("qi.al")
    public static int field4679 = 1000;

    @ObfuscatedName("qi.as")
    public static int field4680 = 250;

    @ObfuscatedName("qi.ag")
    public static int field4681 = 100;

    @ObfuscatedName("qi.ai")
    public static int field4682 = 50;

    @ObfuscatedName("qi.ax")
    public static byte[][] field4671 = new byte[1000][];

    @ObfuscatedName("qi.ar")
    public static byte[][] field4683 = new byte[250][];

    @ObfuscatedName("qi.aj")
    public static byte[][] field4685 = new byte[100][];

    @ObfuscatedName("qi.au")
    public static byte[][] field4686 = new byte[50][];

    @ObfuscatedName("qi.aa")
    public static ArrayList field4687 = new ArrayList();

    static {
        field4687.clear();
        field4687.add(100);
        field4687.add(5000);
        field4687.add(10000);
        field4687.add(30000);
        new HashMap();
    }

    public class432() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hy.az([I[IB)V")
    public static void method3415(int[] arg0, int[] arg1) {
        if (arg0 != null && arg1 != null) {
            Statics.field3474 = arg0;
            Statics.field3136 = new int[arg0.length];
            Statics.field4911 = new byte[arg0.length][][];
            for (int var2 = 0; var2 < Statics.field3474.length; var2++) {
                Statics.field4911[var2] = new byte[arg1[var2]][];
                field4687.add(arg0[var2]);
            }
            Collections.sort(field4687);
            return;
        }
        Statics.field3474 = null;
        Statics.field3136 = null;
        Statics.field4911 = (byte[][][]) null;
        field4687.clear();
        field4687.add(100);
        field4687.add(5000);
        field4687.add(10000);
        field4687.add(30000);
    }

    @ObfuscatedName("hy.af(II)[B")
    public static byte[] method3418(int arg0) {
        return Statics.method4113(arg0, false);
    }

    @ObfuscatedName("kq.at([BI)V")
    public static void method5159(byte[] arg0) {
        Object var1 = field4674;
        synchronized (field4674) {
            if (arg0.length == 100 && field4675 < field4679) {
                field4671[++field4675 - 1] = arg0;
            } else if (arg0.length == 5000 && field4688 < field4680) {
                field4683[++field4688 - 1] = arg0;
            } else if (arg0.length == 10000 && field4676 < field4681) {
                field4685[++field4676 - 1] = arg0;
            } else if (arg0.length == 30000 && field4678 < field4682) {
                field4686[++field4678 - 1] = arg0;
            } else if (Statics.field4911 != null) {
                for (int var2 = 0; var2 < Statics.field3474.length; var2++) {
                    if (Statics.field3474[var2] == arg0.length && Statics.field3136[var2] < Statics.field4911[var2].length) {
                        Statics.field4911[var2][Statics.field3136[var2]++] = arg0;
                        return;
                    }
                }
            }
        }
    }
}
