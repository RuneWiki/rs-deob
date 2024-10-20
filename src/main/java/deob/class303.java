package deob;

@ObfuscatedName("kr")
public class class303 {

    @ObfuscatedName("kr.q")
    public static int field3735 = 0;

    @ObfuscatedName("kr.w")
    public static int field3736 = 0;

    @ObfuscatedName("kr.e")
    public static int field3738 = 0;

    @ObfuscatedName("kr.p")
    public static byte[][] field3740 = new byte[1000][];

    @ObfuscatedName("kr.k")
    public static byte[][] field3739 = new byte[250][];

    @ObfuscatedName("kr.l")
    public static byte[][] field3737 = new byte[50][];

    public class303() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kr.q(IZB)[B")
    public static synchronized byte[] method5334(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3735 > 0) {
            byte[] var2 = field3740[--field3735];
            field3740[field3735] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3736 > 0) {
            byte[] var3 = field3739[--field3736];
            field3739[field3736] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3738 > 0) {
            byte[] var4 = field3737[--field3738];
            field3737[field3738] = null;
            return var4;
        } else {
            if (Statics.field2344 != null) {
                for (int var5 = 0; var5 < Statics.field3741.length; var5++) {
                    if ((Statics.field3741[var5] == arg0 || arg0 < Statics.field3741[var5] && arg1) && Statics.field382[var5] > 0) {
                        byte[] var6 = Statics.field2344[var5][--Statics.field382[var5]];
                        Statics.field2344[var5][Statics.field382[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field3741 != null) {
                for (int var7 = 0; var7 < Statics.field3741.length; var7++) {
                    if (arg0 <= Statics.field3741[var7] && Statics.field382[var7] < Statics.field2344[var7].length) {
                        return new byte[Statics.field3741[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("do.w(II)[B")
    public static synchronized byte[] method2472(int arg0) {
        return method5334(arg0, false);
    }

    @ObfuscatedName("dg.e([BB)V")
    public static synchronized void method2259(byte[] arg0) {
        if (arg0.length == 100 && field3735 < 1000) {
            field3740[++field3735 - 1] = arg0;
        } else if (arg0.length == 5000 && field3736 < 250) {
            field3739[++field3736 - 1] = arg0;
        } else if (arg0.length == 30000 && field3738 < 50) {
            field3737[++field3738 - 1] = arg0;
        } else if (Statics.field2344 != null) {
            for (int var1 = 0; var1 < Statics.field3741.length; var1++) {
                if (Statics.field3741[var1] == arg0.length && Statics.field382[var1] < Statics.field2344[var1].length) {
                    Statics.field2344[var1][Statics.field382[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
