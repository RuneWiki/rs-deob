package deob;

@ObfuscatedName("ex")
public class class153 {

    @ObfuscatedName("ex.y")
    public static final class153 field2254 = new class153("LIVE", 0);

    @ObfuscatedName("ex.d")
    public static final class153 field2256 = new class153("BUILDLIVE", 3);

    @ObfuscatedName("ex.g")
    public static final class153 field2253 = new class153("RC", 1);

    @ObfuscatedName("ex.w")
    public static final class153 field2251 = new class153("WIP", 2);

    @ObfuscatedName("ex.e")
    public final String field2255;

    @ObfuscatedName("ex.c")
    public final int field2261;

    public class153(String arg0, int arg1) {
        this.field2255 = arg0;
        this.field2261 = arg1;
    }

    @ObfuscatedName("ap.y(IB)Lex;")
    public static class153 method956(int arg0) {
        class153[] var1 = new class153[] { field2253, field2254, field2256, field2251 };
        class153[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class153 var4 = var2[var3];
            if (var4.field2261 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
