package deob;

@ObfuscatedName("il")
public class class243 {

    @ObfuscatedName("il.a")
    public static final class243 field3286 = new class243("LIVE", 0);

    @ObfuscatedName("il.w")
    public static final class243 field3284 = new class243("BUILDLIVE", 3);

    @ObfuscatedName("il.e")
    public static final class243 field3285 = new class243("RC", 1);

    @ObfuscatedName("il.k")
    public static final class243 field3283 = new class243("WIP", 2);

    @ObfuscatedName("il.u")
    public final String field3288;

    @ObfuscatedName("il.z")
    public final int field3287;

    public class243(String arg0, int arg1) {
        this.field3288 = arg0;
        this.field3287 = arg1;
    }

    @ObfuscatedName("ap.w(II)Lil;")
    public static class243 method434(int arg0) {
        class243[] var1 = Statics.method44();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class243 var3 = var1[var2];
            if (var3.field3287 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
