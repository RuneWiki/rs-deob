package deob;

@ObfuscatedName("kp")
public class class307 {

    @ObfuscatedName("kp.f")
    public static int field3769 = 0;

    @ObfuscatedName("kp.o")
    public static int field3763 = 0;

    @ObfuscatedName("kp.u")
    public static int field3765 = 0;

    @ObfuscatedName("kp.p")
    public static byte[][] field3766 = new byte[1000][];

    @ObfuscatedName("kp.b")
    public static byte[][] field3767 = new byte[250][];

    @ObfuscatedName("kp.e")
    public static byte[][] field3768 = new byte[50][];

    public class307() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.f([I[II)V")
    public static void method13(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field1432 = null;
            Statics.field2594 = null;
            Statics.field573 = (byte[][][]) null;
            return;
        }
        Statics.field1432 = arg0;
        Statics.field2594 = new int[arg0.length];
        Statics.field573 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field1432.length; var2++) {
            Statics.field573[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("eq.u(IB)[B")
    public static synchronized byte[] method2489(int arg0) {
        return Statics.method4988(arg0, false);
    }

    @ObfuscatedName("j.p([BI)V")
    public static synchronized void method158(byte[] arg0) {
        if (arg0.length == 100 && field3769 < 1000) {
            field3766[++field3769 - 1] = arg0;
        } else if (arg0.length == 5000 && field3763 < 250) {
            field3767[++field3763 - 1] = arg0;
        } else if (arg0.length == 30000 && field3765 < 50) {
            field3768[++field3765 - 1] = arg0;
        } else if (Statics.field573 != null) {
            for (int var1 = 0; var1 < Statics.field1432.length; var1++) {
                if (Statics.field1432[var1] == arg0.length && Statics.field2594[var1] < Statics.field573[var1].length) {
                    Statics.field573[var1][Statics.field2594[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
