package deob;

@ObfuscatedName("it")
public class class243 {

    @ObfuscatedName("it.s")
    public static final class243 field3280 = new class243("LIVE", 0);

    @ObfuscatedName("it.g")
    public static final class243 field3282 = new class243("BUILDLIVE", 3);

    @ObfuscatedName("it.m")
    public static final class243 field3278 = new class243("RC", 1);

    @ObfuscatedName("it.h")
    public static final class243 field3279 = new class243("WIP", 2);

    @ObfuscatedName("it.i")
    public final String field3276;

    @ObfuscatedName("it.w")
    public final int field3281;

    public class243(String arg0, int arg1) {
        this.field3276 = arg0;
        this.field3281 = arg1;
    }

    @ObfuscatedName("ao.s(IB)Lit;")
    public static class243 method531(int arg0) {
        class243[] var1 = new class243[] { field3280, field3278, field3282, field3279 };
        class243[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class243 var4 = var2[var3];
            if (var4.field3281 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
