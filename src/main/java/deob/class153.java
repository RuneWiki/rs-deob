package deob;

@ObfuscatedName("eu")
public class class153 {

    @ObfuscatedName("eu.v")
    public static final class153 field2284 = new class153("LIVE", 0);

    @ObfuscatedName("eu.f")
    public static final class153 field2288 = new class153("BUILDLIVE", 3);

    @ObfuscatedName("eu.i")
    public static final class153 field2289 = new class153("RC", 1);

    @ObfuscatedName("eu.d")
    public static final class153 field2286 = new class153("WIP", 2);

    @ObfuscatedName("eu.o")
    public final String field2287;

    @ObfuscatedName("eu.c")
    public final int field2285;

    public class153(String arg0, int arg1) {
        this.field2287 = arg0;
        this.field2285 = arg1;
    }

    @ObfuscatedName("ew.v(II)Leu;")
    public static class153 method2798(int arg0) {
        class153[] var1 = new class153[] { field2288, field2284, field2286, field2289 };
        class153[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class153 var4 = var2[var3];
            if (var4.field2285 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
