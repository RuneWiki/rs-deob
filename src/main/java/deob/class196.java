package deob;

@ObfuscatedName("gc")
public class class196 {

    @ObfuscatedName("gc.t")
    public static int field2558 = 0;

    @ObfuscatedName("gc.q")
    public static int field2561 = 0;

    @ObfuscatedName("gc.i")
    public static int field2555 = 0;

    @ObfuscatedName("gc.a")
    public static byte[][] field2556 = new byte[1000][];

    @ObfuscatedName("gc.l")
    public static byte[][] field2553 = new byte[250][];

    @ObfuscatedName("gc.b")
    public static byte[][] field2554 = new byte[50][];

    public class196() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gc.t(IZI)[B")
    public static synchronized byte[] method3463(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2558 > 0) {
            byte[] var2 = field2556[--field2558];
            field2556[field2558] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2561 > 0) {
            byte[] var3 = field2553[--field2561];
            field2553[field2561] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2555 > 0) {
            byte[] var4 = field2554[--field2555];
            field2554[field2555] = null;
            return var4;
        } else {
            if (Statics.field2560 != null) {
                for (int var5 = 0; var5 < Statics.field1203.length; var5++) {
                    if ((Statics.field1203[var5] == arg0 || arg0 < Statics.field1203[var5] && arg1) && Statics.field2559[var5] > 0) {
                        byte[] var6 = Statics.field2560[var5][--Statics.field2559[var5]];
                        Statics.field2560[var5][Statics.field2559[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field1203 != null) {
                for (int var7 = 0; var7 < Statics.field1203.length; var7++) {
                    if (arg0 <= Statics.field1203[var7] && Statics.field2559[var7] < Statics.field2560[var7].length) {
                        return new byte[Statics.field1203[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("ft.q(II)[B")
    public static synchronized byte[] method2970(int arg0) {
        return method3463(arg0, false);
    }

    @ObfuscatedName("cm.i([BI)V")
    public static synchronized void method1583(byte[] arg0) {
        if (arg0.length == 100 && field2558 < 1000) {
            field2556[++field2558 - 1] = arg0;
        } else if (arg0.length == 5000 && field2561 < 250) {
            field2553[++field2561 - 1] = arg0;
        } else if (arg0.length == 30000 && field2555 < 50) {
            field2554[++field2555 - 1] = arg0;
        } else if (Statics.field2560 != null) {
            for (int var1 = 0; var1 < Statics.field1203.length; var1++) {
                if (Statics.field1203[var1] == arg0.length && Statics.field2559[var1] < Statics.field2560[var1].length) {
                    Statics.field2560[var1][Statics.field2559[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
