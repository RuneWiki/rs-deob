package deob;

@ObfuscatedName("in")
public class class235 {

    @ObfuscatedName("in.w")
    public static final class235 field3186 = new class235("LIVE", 0);

    @ObfuscatedName("in.o")
    public static final class235 field3183 = new class235("BUILDLIVE", 3);

    @ObfuscatedName("in.x")
    public static final class235 field3184 = new class235("RC", 1);

    @ObfuscatedName("in.k")
    public static final class235 field3185 = new class235("WIP", 2);

    @ObfuscatedName("in.f")
    public final String field3182;

    @ObfuscatedName("in.i")
    public final int field3188;

    public class235(String arg0, int arg1) {
        this.field3182 = arg0;
        this.field3188 = arg1;
    }

    @ObfuscatedName("ew.w(II)Lin;")
    public static class235 method2674(int arg0) {
        class235[] var1 = new class235[] { field3184, field3183, field3186, field3185 };
        class235[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class235 var4 = var2[var3];
            if (var4.field3188 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
