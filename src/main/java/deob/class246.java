package deob;

@ObfuscatedName("id")
public class class246 {

    @ObfuscatedName("id.v")
    public static final class246 field3167 = new class246("LIVE", 0);

    @ObfuscatedName("id.s")
    public static final class246 field3164 = new class246("BUILDLIVE", 3);

    @ObfuscatedName("id.o")
    public static final class246 field3163 = new class246("RC", 1);

    @ObfuscatedName("id.k")
    public static final class246 field3166 = new class246("WIP", 2);

    @ObfuscatedName("id.u")
    public final String field3165;

    @ObfuscatedName("id.i")
    public final int field3168;

    public class246(String arg0, int arg1) {
        this.field3165 = arg0;
        this.field3168 = arg1;
    }

    @ObfuscatedName("fa.s(II)Lid;")
    public static class246 method3162(int arg0) {
        class246[] var1 = Statics.method1671();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class246 var3 = var1[var2];
            if (var3.field3168 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
