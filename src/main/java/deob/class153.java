package deob;

@ObfuscatedName("ep")
public class class153 {

    @ObfuscatedName("ep.g")
    public static final class153 field2267 = new class153("LIVE", 0);

    @ObfuscatedName("ep.b")
    public static final class153 field2265 = new class153("BUILDLIVE", 3);

    @ObfuscatedName("ep.w")
    public static final class153 field2271 = new class153("RC", 1);

    @ObfuscatedName("ep.d")
    public static final class153 field2264 = new class153("WIP", 2);

    @ObfuscatedName("ep.z")
    public final String field2268;

    @ObfuscatedName("ep.l")
    public final int field2269;

    @ObfuscatedName("d.g(I)[Lep;")
    public static class153[] method47() {
        return new class153[] { field2267, field2271, field2265, field2264 };
    }

    public class153(String arg0, int arg1) {
        this.field2268 = arg0;
        this.field2269 = arg1;
    }

    @ObfuscatedName("ap.b(II)Lep;")
    public static class153 method959(int arg0) {
        class153[] var1 = method47();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class153 var3 = var1[var2];
            if (var3.field2269 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
