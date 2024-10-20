package deob;

@ObfuscatedName("hb")
public class class233 {

    @ObfuscatedName("hb.e")
    public static final class233 field3170 = new class233("LIVE", 0);

    @ObfuscatedName("hb.n")
    public static final class233 field3167 = new class233("BUILDLIVE", 3);

    @ObfuscatedName("hb.g")
    public static final class233 field3166 = new class233("RC", 1);

    @ObfuscatedName("hb.y")
    public static final class233 field3169 = new class233("WIP", 2);

    @ObfuscatedName("hb.w")
    public final String field3168;

    @ObfuscatedName("hb.k")
    public final int field3171;

    @ObfuscatedName("em.e(I)[Lhb;")
    public static class233[] method2708() {
        return new class233[] { field3166, field3170, field3167, field3169 };
    }

    public class233(String arg0, int arg1) {
        this.field3168 = arg0;
        this.field3171 = arg1;
    }

    @ObfuscatedName("fg.n(II)Lhb;")
    public static class233 method2849(int arg0) {
        class233[] var1 = method2708();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class233 var3 = var1[var2];
            if (var3.field3171 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
