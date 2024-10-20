package deob;

@ObfuscatedName("ic")
public class class246 {

    @ObfuscatedName("ic.y")
    public static final class246 field3180 = new class246("LIVE", 0);

    @ObfuscatedName("ic.c")
    public static final class246 field3177 = new class246("BUILDLIVE", 3);

    @ObfuscatedName("ic.n")
    public static final class246 field3178 = new class246("RC", 1);

    @ObfuscatedName("ic.u")
    public static final class246 field3176 = new class246("WIP", 2);

    @ObfuscatedName("ic.i")
    public final String field3184;

    @ObfuscatedName("ic.r")
    public final int field3181;

    public class246(String arg0, int arg1) {
        this.field3184 = arg0;
        this.field3181 = arg1;
    }

    @ObfuscatedName("bg.y(II)Lic;")
    public static class246 method1094(int arg0) {
        class246[] var1 = new class246[] { field3178, field3177, field3180, field3176 };
        class246[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class246 var4 = var2[var3];
            if (var4.field3181 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
