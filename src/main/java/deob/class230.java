package deob;

@ObfuscatedName("hs")
public class class230 {

    @ObfuscatedName("hs.z")
    public static final class230 field3077 = new class230("LIVE", 0);

    @ObfuscatedName("hs.n")
    public static final class230 field3076 = new class230("BUILDLIVE", 3);

    @ObfuscatedName("hs.v")
    public static final class230 field3082 = new class230("RC", 1);

    @ObfuscatedName("hs.u")
    public static final class230 field3078 = new class230("WIP", 2);

    @ObfuscatedName("hs.r")
    public final String field3079;

    @ObfuscatedName("hs.p")
    public final int field3080;

    public class230(String arg0, int arg1) {
        this.field3079 = arg0;
        this.field3080 = arg1;
    }

    @ObfuscatedName("dj.z(II)Lhs;")
    public static class230 method2576(int arg0) {
        class230[] var1 = new class230[] { field3076, field3077, field3082, field3078 };
        class230[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class230 var4 = var2[var3];
            if (var4.field3080 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
