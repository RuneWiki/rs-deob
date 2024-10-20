package deob;

@ObfuscatedName("ip")
public class class246 {

    @ObfuscatedName("ip.c")
    public static final class246 field3167 = new class246("LIVE", 0);

    @ObfuscatedName("ip.q")
    public static final class246 field3163 = new class246("BUILDLIVE", 3);

    @ObfuscatedName("ip.m")
    public static final class246 field3162 = new class246("RC", 1);

    @ObfuscatedName("ip.j")
    public static final class246 field3165 = new class246("WIP", 2);

    @ObfuscatedName("ip.g")
    public final String field3166;

    @ObfuscatedName("ip.i")
    public final int field3169;

    public class246(String arg0, int arg1) {
        this.field3166 = arg0;
        this.field3169 = arg1;
    }

    @ObfuscatedName("gl.c(II)Lip;")
    public static class246 method3478(int arg0) {
        class246[] var1 = new class246[] { field3165, field3163, field3167, field3162 };
        class246[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class246 var4 = var2[var3];
            if (var4.field3169 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
