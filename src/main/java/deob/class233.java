package deob;

@ObfuscatedName("hj")
public class class233 {

    @ObfuscatedName("hj.i")
    public static final class233 field3188 = new class233("LIVE", 0);

    @ObfuscatedName("hj.j")
    public static final class233 field3185 = new class233("BUILDLIVE", 3);

    @ObfuscatedName("hj.a")
    public static final class233 field3187 = new class233("RC", 1);

    @ObfuscatedName("hj.r")
    public static final class233 field3186 = new class233("WIP", 2);

    @ObfuscatedName("hj.o")
    public final String field3189;

    @ObfuscatedName("hj.n")
    public final int field3190;

    public class233(String arg0, int arg1) {
        this.field3189 = arg0;
        this.field3190 = arg1;
    }

    @ObfuscatedName("hr.i(IB)Lhj;")
    public static class233 method3808(int arg0) {
        class233[] var1 = new class233[] { field3187, field3185, field3188, field3186 };
        class233[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class233 var4 = var2[var3];
            if (var4.field3190 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
