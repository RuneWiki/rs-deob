package deob;

@ObfuscatedName("es")
public class class153 {

    @ObfuscatedName("es.n")
    public static final class153 field2257 = new class153("LIVE", 0);

    @ObfuscatedName("es.d")
    public static final class153 field2255 = new class153("BUILDLIVE", 3);

    @ObfuscatedName("es.s")
    public static final class153 field2256 = new class153("RC", 1);

    @ObfuscatedName("es.q")
    public static final class153 field2258 = new class153("WIP", 2);

    @ObfuscatedName("es.j")
    public final String field2259;

    @ObfuscatedName("es.k")
    public final int field2260;

    public class153(String arg0, int arg1) {
        this.field2259 = arg0;
        this.field2260 = arg1;
    }

    @ObfuscatedName("an.n(II)Les;")
    public static class153 method1035(int arg0) {
        class153[] var1 = new class153[] { field2258, field2257, field2256, field2255 };
        class153[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class153 var4 = var2[var3];
            if (var4.field2260 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
