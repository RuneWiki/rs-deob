package deob;

@ObfuscatedName("io")
public class class246 {

    @ObfuscatedName("io.f")
    public static final class246 field3203 = new class246("LIVE", 0);

    @ObfuscatedName("io.l")
    public static final class246 field3199 = new class246("BUILDLIVE", 3);

    @ObfuscatedName("io.w")
    public static final class246 field3197 = new class246("RC", 1);

    @ObfuscatedName("io.s")
    public static final class246 field3200 = new class246("WIP", 2);

    @ObfuscatedName("io.e")
    public final String field3201;

    @ObfuscatedName("io.a")
    public final int field3202;

    public class246(String arg0, int arg1) {
        this.field3201 = arg0;
        this.field3202 = arg1;
    }

    @ObfuscatedName("in.f(II)Lio;")
    public static class246 method4272(int arg0) {
        class246[] var1 = new class246[] { field3203, field3200, field3197, field3199 };
        class246[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class246 var4 = var2[var3];
            if (var4.field3202 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
