package deob;

@ObfuscatedName("ei")
public class class153 {

    @ObfuscatedName("ei.h")
    public static final class153 field2261 = new class153("LIVE", 0);

    @ObfuscatedName("ei.q")
    public static final class153 field2260 = new class153("BUILDLIVE", 3);

    @ObfuscatedName("ei.v")
    public static final class153 field2262 = new class153("RC", 1);

    @ObfuscatedName("ei.n")
    public static final class153 field2269 = new class153("WIP", 2);

    @ObfuscatedName("ei.f")
    public final String field2259;

    @ObfuscatedName("ei.g")
    public final int field2264;

    public class153(String arg0, int arg1) {
        this.field2259 = arg0;
        this.field2264 = arg1;
    }

    @ObfuscatedName("ej.h(IB)Lei;")
    public static class153 method2990(int arg0) {
        class153[] var1 = new class153[] { field2269, field2260, field2261, field2262 };
        class153[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class153 var4 = var2[var3];
            if (var4.field2264 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
