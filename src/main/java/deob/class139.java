package deob;

@ObfuscatedName("ed")
public class class139 {

    @ObfuscatedName("ed.g")
    public static final class139 field2113 = new class139("LIVE", 0);

    @ObfuscatedName("ed.s")
    public static final class139 field2114 = new class139("BUILDLIVE", 3);

    @ObfuscatedName("ed.h")
    public static final class139 field2107 = new class139("RC", 1);

    @ObfuscatedName("ed.m")
    public static final class139 field2108 = new class139("WIP", 2);

    @ObfuscatedName("ed.u")
    public final String field2109;

    @ObfuscatedName("ed.j")
    public final int field2111;

    @ObfuscatedName("di.g(I)[Led;")
    public static class139[] method2285() {
        return new class139[] { field2107, field2113, field2108, field2114 };
    }

    public class139(String arg0, int arg1) {
        this.field2109 = arg0;
        this.field2111 = arg1;
    }

    @ObfuscatedName("ad.s(IB)Led;")
    public static class139 method755(int arg0) {
        class139[] var1 = method2285();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class139 var3 = var1[var2];
            if (var3.field2111 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
