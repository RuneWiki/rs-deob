package deob;

@ObfuscatedName("eh")
public class class153 {

    @ObfuscatedName("eh.o")
    public static final class153 field2267 = new class153("LIVE", 0);

    @ObfuscatedName("eh.f")
    public static final class153 field2264 = new class153("BUILDLIVE", 3);

    @ObfuscatedName("eh.i")
    public static final class153 field2270 = new class153("RC", 1);

    @ObfuscatedName("eh.h")
    public static final class153 field2266 = new class153("WIP", 2);

    @ObfuscatedName("eh.q")
    public final String field2269;

    @ObfuscatedName("eh.u")
    public final int field2268;

    @ObfuscatedName("bk.o(I)[Leh;")
    public static class153[] method1523() {
        return new class153[] { field2264, field2266, field2267, field2270 };
    }

    public class153(String arg0, int arg1) {
        this.field2269 = arg0;
        this.field2268 = arg1;
    }

    @ObfuscatedName("de.f(IB)Leh;")
    public static class153 method2237(int arg0) {
        class153[] var1 = method1523();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class153 var3 = var1[var2];
            if (var3.field2268 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
