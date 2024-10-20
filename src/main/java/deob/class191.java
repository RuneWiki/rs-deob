package deob;

@ObfuscatedName("go")
public class class191 {

    @ObfuscatedName("go.a")
    public static int field2429 = 0;

    @ObfuscatedName("go.s")
    public static int field2426 = 0;

    @ObfuscatedName("go.g")
    public static int field2428 = 0;

    @ObfuscatedName("go.x")
    public static byte[][] field2434 = new byte[1000][];

    @ObfuscatedName("go.h")
    public static byte[][] field2430 = new byte[250][];

    @ObfuscatedName("go.f")
    public static byte[][] field2431 = new byte[50][];

    public class191() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("go.a(IZI)[B")
    public static synchronized byte[] method3693(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field2429 > 0) {
            byte[] var2 = field2434[--field2429];
            field2434[field2429] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field2426 > 0) {
            byte[] var3 = field2430[--field2426];
            field2430[field2426] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field2428 > 0) {
            byte[] var4 = field2431[--field2428];
            field2431[field2428] = null;
            return var4;
        } else {
            if (Statics.field2433 != null) {
                for (int var5 = 0; var5 < Statics.field2432.length; var5++) {
                    if ((Statics.field2432[var5] == arg0 || arg0 < Statics.field2432[var5] && arg1) && Statics.field1965[var5] > 0) {
                        byte[] var6 = Statics.field2433[var5][--Statics.field1965[var5]];
                        Statics.field2433[var5][Statics.field1965[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field2432 != null) {
                for (int var7 = 0; var7 < Statics.field2432.length; var7++) {
                    if (arg0 <= Statics.field2432[var7] && Statics.field1965[var7] < Statics.field2433[var7].length) {
                        return new byte[Statics.field2432[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("ef.s(II)[B")
    public static synchronized byte[] method3075(int arg0) {
        return method3693(arg0, false);
    }

    @ObfuscatedName("de.g([BB)V")
    public static synchronized void method2672(byte[] arg0) {
        if (arg0.length == 100 && field2429 < 1000) {
            field2434[++field2429 - 1] = arg0;
        } else if (arg0.length == 5000 && field2426 < 250) {
            field2430[++field2426 - 1] = arg0;
        } else if (arg0.length == 30000 && field2428 < 50) {
            field2431[++field2428 - 1] = arg0;
        } else if (Statics.field2433 != null) {
            for (int var1 = 0; var1 < Statics.field2432.length; var1++) {
                if (Statics.field2432[var1] == arg0.length && Statics.field1965[var1] < Statics.field2433[var1].length) {
                    Statics.field2433[var1][Statics.field1965[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
