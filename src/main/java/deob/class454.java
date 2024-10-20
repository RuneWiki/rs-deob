package deob;

import java.util.ArrayList;
import java.util.HashMap;

@ObfuscatedName("ru")
public class class454 {

    @ObfuscatedName("ru.ai")
    public static final Object field4902 = new Object();

    @ObfuscatedName("ru.ay")
    public static int field4899 = 0;

    @ObfuscatedName("ru.as")
    public static int field4904 = 0;

    @ObfuscatedName("ru.ae")
    public static int field4905 = 0;

    @ObfuscatedName("ru.am")
    public static int field4906 = 0;

    @ObfuscatedName("ru.at")
    public static int field4907 = 1000;

    @ObfuscatedName("ru.au")
    public static int field4912 = 250;

    @ObfuscatedName("ru.an")
    public static int field4914 = 100;

    @ObfuscatedName("ru.ao")
    public static int field4908 = 50;

    @ObfuscatedName("ru.af")
    public static byte[][] field4916 = new byte[1000][];

    @ObfuscatedName("ru.ar")
    public static byte[][] field4911 = new byte[250][];

    @ObfuscatedName("ru.ab")
    public static byte[][] field4913 = new byte[100][];

    @ObfuscatedName("ru.az")
    public static byte[][] field4910 = new byte[50][];

    @ObfuscatedName("ru.av")
    public static ArrayList field4903 = new ArrayList();

    static {
        method5967();
        new HashMap();
    }

    public class454() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mv.ap(I)V")
    public static void method5967() {
        field4903.clear();
        field4903.add(100);
        field4903.add(5000);
        field4903.add(10000);
        field4903.add(30000);
    }

    @ObfuscatedName("rt.aw(IZI)[B")
    public static byte[] method8061(int arg0, boolean arg1) {
        Object var2 = field4902;
        synchronized (field4902) {
            if ((arg0 == 100 || arg0 < 100 && arg1) && field4899 > 0) {
                byte[] var3 = field4916[--field4899];
                field4916[field4899] = null;
                return var3;
            }
            if ((arg0 == 5000 || arg0 < 5000 && arg1) && field4904 > 0) {
                byte[] var4 = field4911[--field4904];
                field4911[field4904] = null;
                return var4;
            }
            if ((arg0 == 10000 || arg0 < 10000 && arg1) && field4905 > 0) {
                byte[] var5 = field4913[--field4905];
                field4913[field4905] = null;
                return var5;
            }
            if ((arg0 == 30000 || arg0 < 30000 && arg1) && field4906 > 0) {
                byte[] var6 = field4910[--field4906];
                field4910[field4906] = null;
                return var6;
            }
            if (Statics.field4915 != null) {
                for (int var7 = 0; var7 < Statics.field5398.length; var7++) {
                    if ((Statics.field5398[var7] == arg0 || arg0 < Statics.field5398[var7] && arg1) && Statics.field82[var7] > 0) {
                        byte[] var8 = Statics.field4915[var7][--Statics.field82[var7]];
                        Statics.field4915[var7][Statics.field82[var7]] = null;
                        return var8;
                    }
                }
            }
            if (arg1 && Statics.field5398 != null) {
                for (int var9 = 0; var9 < Statics.field5398.length; var9++) {
                    if (arg0 <= Statics.field5398[var9] && Statics.field82[var9] < Statics.field4915[var9].length) {
                        return new byte[Statics.field5398[var9]];
                    }
                }
            }
        }
        return new byte[arg0];
    }

    @ObfuscatedName("op.ak([BI)V")
    public static void method6932(byte[] arg0) {
        Object var1 = field4902;
        synchronized (field4902) {
            if (arg0.length == 100 && field4899 < field4907) {
                field4916[++field4899 - 1] = arg0;
            } else if (arg0.length == 5000 && field4904 < field4912) {
                field4911[++field4904 - 1] = arg0;
            } else if (arg0.length == 10000 && field4905 < field4914) {
                field4913[++field4905 - 1] = arg0;
            } else if (arg0.length == 30000 && field4906 < field4908) {
                field4910[++field4906 - 1] = arg0;
            } else if (Statics.field4915 != null) {
                for (int var2 = 0; var2 < Statics.field5398.length; var2++) {
                    if (Statics.field5398[var2] == arg0.length && Statics.field82[var2] < Statics.field4915[var2].length) {
                        Statics.field4915[var2][Statics.field82[var2]++] = arg0;
                        return;
                    }
                }
            }
        }
    }
}
