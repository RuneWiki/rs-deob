package deob;

@ObfuscatedName("md")
public class class332 {

    @ObfuscatedName("md.af")
    public static final class332 field3806 = new class332("LIVE", 0);

    @ObfuscatedName("md.an")
    public static final class332 field3801 = new class332("BUILDLIVE", 3);

    @ObfuscatedName("md.aw")
    public static final class332 field3802 = new class332("RC", 1);

    @ObfuscatedName("md.ac")
    public static final class332 field3805 = new class332("WIP", 2);

    @ObfuscatedName("md.au")
    public final String field3803;

    @ObfuscatedName("md.ab")
    public final int field3800;

    public class332(String arg0, int arg1) {
        this.field3803 = arg0;
        this.field3800 = arg1;
    }

    @ObfuscatedName("fv.af(II)Lmd;")
    public static class332 method3068(int arg0) {
        class332[] var1 = new class332[] { field3806, field3801, field3802, field3805 };
        class332[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class332 var4 = var2[var3];
            if (var4.field3800 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
