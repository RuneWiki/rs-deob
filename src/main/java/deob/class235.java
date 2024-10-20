package deob;

@ObfuscatedName("io")
public class class235 {

    @ObfuscatedName("io.s")
    public static final class235 field3208 = new class235("LIVE", 0);

    @ObfuscatedName("io.c")
    public static final class235 field3206 = new class235("BUILDLIVE", 3);

    @ObfuscatedName("io.f")
    public static final class235 field3205 = new class235("RC", 1);

    @ObfuscatedName("io.m")
    public static final class235 field3203 = new class235("WIP", 2);

    @ObfuscatedName("io.h")
    public final String field3207;

    @ObfuscatedName("io.t")
    public final int field3204;

    @ObfuscatedName("fc.s(I)[Lio;")
    public static class235[] method3186() {
        return new class235[] { field3206, field3203, field3205, field3208 };
    }

    public class235(String arg0, int arg1) {
        this.field3207 = arg0;
        this.field3204 = arg1;
    }

    @ObfuscatedName("a.c(IB)Lio;")
    public static class235 method151(int arg0) {
        class235[] var1 = method3186();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class235 var3 = var1[var2];
            if (var3.field3204 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
