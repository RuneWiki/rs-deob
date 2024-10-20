package deob;

@ObfuscatedName("kp")
public class class310 {

    @ObfuscatedName("kp.s")
    public static int field3768 = 0;

    @ObfuscatedName("kp.t")
    public static int field3773 = 0;

    @ObfuscatedName("kp.v")
    public static int field3769 = 0;

    @ObfuscatedName("kp.j")
    public static byte[][] field3771 = new byte[1000][];

    @ObfuscatedName("kp.l")
    public static byte[][] field3772 = new byte[250][];

    @ObfuscatedName("kp.n")
    public static byte[][] field3770 = new byte[50][];

    public class310() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kp.s(IZB)[B")
    public static synchronized byte[] method5078(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && field3768 > 0) {
            byte[] var2 = field3771[--field3768];
            field3771[field3768] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && field3773 > 0) {
            byte[] var3 = field3772[--field3773];
            field3772[field3773] = null;
            return var3;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && field3769 > 0) {
            byte[] var4 = field3770[--field3769];
            field3770[field3769] = null;
            return var4;
        } else {
            if (Statics.field3775 != null) {
                for (int var5 = 0; var5 < Statics.field3774.length; var5++) {
                    if ((Statics.field3774[var5] == arg0 || arg0 < Statics.field3774[var5] && arg1) && Statics.field1460[var5] > 0) {
                        byte[] var6 = Statics.field3775[var5][--Statics.field1460[var5]];
                        Statics.field3775[var5][Statics.field1460[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1 && Statics.field3774 != null) {
                for (int var7 = 0; var7 < Statics.field3774.length; var7++) {
                    if (arg0 <= Statics.field3774[var7] && Statics.field1460[var7] < Statics.field3775[var7].length) {
                        return new byte[Statics.field3774[var7]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("br.t(II)[B")
    public static synchronized byte[] method1568(int arg0) {
        return method5078(arg0, false);
    }

    @ObfuscatedName("fq.v([BI)V")
    public static synchronized void method2942(byte[] arg0) {
        if (arg0.length == 100 && field3768 < 1000) {
            field3771[++field3768 - 1] = arg0;
        } else if (arg0.length == 5000 && field3773 < 250) {
            field3772[++field3773 - 1] = arg0;
        } else if (arg0.length == 30000 && field3769 < 50) {
            field3770[++field3769 - 1] = arg0;
        } else if (Statics.field3775 != null) {
            for (int var1 = 0; var1 < Statics.field3774.length; var1++) {
                if (Statics.field3774[var1] == arg0.length && Statics.field1460[var1] < Statics.field3775[var1].length) {
                    Statics.field3775[var1][Statics.field1460[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
