package deob;

@ObfuscatedName("eb")
public class class153 {

    @ObfuscatedName("eb.i")
    public static final class153 field2266 = new class153("LIVE", 0);

    @ObfuscatedName("eb.v")
    public static final class153 field2263 = new class153("BUILDLIVE", 3);

    @ObfuscatedName("eb.r")
    public static final class153 field2265 = new class153("RC", 1);

    @ObfuscatedName("eb.n")
    public static final class153 field2267 = new class153("WIP", 2);

    @ObfuscatedName("eb.x")
    public final String field2264;

    @ObfuscatedName("eb.q")
    public final int field2268;

    @ObfuscatedName("er.i(I)[Leb;")
    public static class153[] method2834() {
        return new class153[] { field2266, field2263, field2267, field2265 };
    }

    public class153(String arg0, int arg1) {
        this.field2264 = arg0;
        this.field2268 = arg1;
    }

    @ObfuscatedName("fx.v(II)Leb;")
    public static class153 method3221(int arg0) {
        class153[] var1 = method2834();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class153 var3 = var1[var2];
            if (var3.field2268 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
