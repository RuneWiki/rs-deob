package deob;

@ObfuscatedName("ky")
public class class309 {

    @ObfuscatedName("ky.f")
    public static int field3765 = 0;

    @ObfuscatedName("ky.e")
    public static int field3760 = 0;

    @ObfuscatedName("ky.v")
    public static int field3762 = 0;

    @ObfuscatedName("ky.y")
    public static byte[][] field3761 = new byte[1000][];

    @ObfuscatedName("ky.j")
    public static byte[][] field3758 = new byte[250][];

    @ObfuscatedName("ky.o")
    public static byte[][] field3763 = new byte[50][];

    public class309() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ky.f(IZB)[B")
    public static synchronized byte[] method5070(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3765 > 0) {
            byte[] var2 = field3761[--field3765];
            field3761[field3765] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3760 > 0) {
            byte[] var3 = field3758[--field3760];
            field3758[field3760] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3762 > 0) {
            byte[] var4 = field3763[--field3762];
            field3763[field3762] = null;
            return var4;
        } else {
            if (Statics.field1113 != null) {
                for (int var5 = 0; var5 < Statics.field4126.length; var5++) {
                    if ((Statics.field4126[var5] == arg0 || arg0 < Statics.field4126[var5] && arg1) && Statics.field2146[var5] > 0) {
                        byte[] var6 = Statics.field1113[var5][--Statics.field2146[var5]];
                        Statics.field1113[var5][Statics.field2146[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field4126 != null) {
                for (int var7 = 0; var7 < Statics.field4126.length; var7++) {
                    if (arg0 <= Statics.field4126[var7] && Statics.field2146[var7] < Statics.field1113[var7].length) {
                        return new byte[Statics.field4126[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("gc.e(IB)[B")
    public static synchronized byte[] method3799(int arg0) {
        return method5070(arg0, false);
    }

    @ObfuscatedName("fm.v([BB)V")
    public static synchronized void method2892(byte[] arg0) {
        if (arg0.length == 100 && field3765 < 1000) {
            field3761[++field3765 - 1] = arg0;
        } else if (arg0.length == 5000 && field3760 < 250) {
            field3758[++field3760 - 1] = arg0;
        } else if (arg0.length == 30000 && field3762 < 50) {
            field3763[++field3762 - 1] = arg0;
        } else if (Statics.field1113 != null) {
            for (int var1 = 0; var1 < Statics.field4126.length; var1++) {
                if (Statics.field4126[var1] == arg0.length && Statics.field2146[var1] < Statics.field1113[var1].length) {
                    Statics.field1113[var1][Statics.field2146[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
