package deob;

@ObfuscatedName("gj")
public class class186 {

    @ObfuscatedName("gj.y")
    public static int field2388 = 0;

    @ObfuscatedName("gj.c")
    public static int field2379 = 0;

    @ObfuscatedName("gj.n")
    public static int field2381 = 0;

    @ObfuscatedName("gj.u")
    public static byte[][] field2385 = new byte[1000][];

    @ObfuscatedName("gj.i")
    public static byte[][] field2383 = new byte[250][];

    @ObfuscatedName("gj.r")
    public static byte[][] field2384 = new byte[50][];

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.y([I[IB)V")
    public static void method2582(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field2389 = null;
            Statics.field1266 = null;
            Statics.field2386 = (byte[][][]) null;
            return;
        }
        Statics.field2389 = arg0;
        Statics.field1266 = new int[arg0.length];
        Statics.field2386 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field2389.length; var2++) {
            Statics.field2386[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("gj.c(IZB)[B")
    public static synchronized byte[] method3505(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2388 > 0) {
            byte[] var2 = field2385[--field2388];
            field2385[field2388] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2379 > 0) {
            byte[] var3 = field2383[--field2379];
            field2383[field2379] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2381 > 0) {
            byte[] var4 = field2384[--field2381];
            field2384[field2381] = null;
            return var4;
        } else {
            if (Statics.field2386 != null) {
                for (int var5 = 0; var5 < Statics.field2389.length; var5++) {
                    if ((Statics.field2389[var5] == arg0 || arg0 < Statics.field2389[var5] && arg1) && Statics.field1266[var5] > 0) {
                        byte[] var6 = Statics.field2386[var5][--Statics.field1266[var5]];
                        Statics.field2386[var5][Statics.field1266[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field2389 != null) {
                for (int var7 = 0; var7 < Statics.field2389.length; var7++) {
                    if (arg0 <= Statics.field2389[var7] && Statics.field1266[var7] < Statics.field2386[var7].length) {
                        return new byte[Statics.field2389[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("eo.n(II)[B")
    public static synchronized byte[] method2941(int arg0) {
        return method3505(arg0, false);
    }

    @ObfuscatedName("dn.u([BI)V")
    public static synchronized void method2845(byte[] arg0) {
        if (arg0.length == 100 && field2388 < 1000) {
            field2385[++field2388 - 1] = arg0;
        } else if (arg0.length == 5000 && field2379 < 250) {
            field2383[++field2379 - 1] = arg0;
        } else if (arg0.length == 30000 && field2381 < 50) {
            field2384[++field2381 - 1] = arg0;
        } else if (Statics.field2386 != null) {
            for (int var1 = 0; var1 < Statics.field2389.length; var1++) {
                if (Statics.field2389[var1] == arg0.length && Statics.field1266[var1] < Statics.field2386[var1].length) {
                    Statics.field2386[var1][Statics.field1266[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
