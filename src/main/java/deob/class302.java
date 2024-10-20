package deob;

@ObfuscatedName("kj")
public class class302 {

    @ObfuscatedName("kj.f")
    public static int field3708 = 0;

    @ObfuscatedName("kj.i")
    public static int field3709 = 0;

    @ObfuscatedName("kj.y")
    public static int field3711 = 0;

    @ObfuscatedName("kj.w")
    public static byte[][] field3710 = new byte[1000][];

    @ObfuscatedName("kj.p")
    public static byte[][] field3712 = new byte[250][];

    @ObfuscatedName("kj.b")
    public static byte[][] field3707 = new byte[50][];

    public class302() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cx.f([I[II)V")
    public static void method1974(int[] arg0, int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Statics.field3713 = null;
            Statics.field1068 = null;
            Statics.field3714 = (byte[][][]) null;
            return;
        }
        Statics.field3713 = arg0;
        Statics.field1068 = new int[arg0.length];
        Statics.field3714 = new byte[arg0.length][][];
        for (int var2 = 0; var2 < Statics.field3713.length; var2++) {
            Statics.field3714[var2] = new byte[arg1[var2]][];
        }
    }

    @ObfuscatedName("hg.y(IB)[B")
    public static synchronized byte[] method3717(int arg0) {
        return Statics.method5370(arg0, false);
    }

    @ObfuscatedName("kc.w([BB)V")
    public static synchronized void method5449(byte[] arg0) {
        if (arg0.length == 100 && field3708 < 1000) {
            field3710[++field3708 - 1] = arg0;
        } else if (arg0.length == 5000 && field3709 < 250) {
            field3712[++field3709 - 1] = arg0;
        } else if (arg0.length == 30000 && field3711 < 50) {
            field3707[++field3711 - 1] = arg0;
        } else if (Statics.field3714 != null) {
            for (int var1 = 0; var1 < Statics.field3713.length; var1++) {
                if (Statics.field3713[var1] == arg0.length && Statics.field1068[var1] < Statics.field3714[var1].length) {
                    Statics.field3714[var1][Statics.field1068[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
