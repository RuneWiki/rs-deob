package deob;

@ObfuscatedName("ey")
public class class153 {

    @ObfuscatedName("ey.h")
    public static final class153 field2262 = new class153("LIVE", 0);

    @ObfuscatedName("ey.m")
    public static final class153 field2266 = new class153("BUILDLIVE", 3);

    @ObfuscatedName("ey.i")
    public static final class153 field2263 = new class153("RC", 1);

    @ObfuscatedName("ey.q")
    public static final class153 field2265 = new class153("WIP", 2);

    @ObfuscatedName("ey.p")
    public final String field2261;

    @ObfuscatedName("ey.c")
    public final int field2264;

    public class153(String arg0, int arg1) {
        this.field2261 = arg0;
        this.field2264 = arg1;
    }

    @ObfuscatedName("dt.h(IS)Ley;")
    public static class153 method2199(int arg0) {
        class153[] var1 = new class153[] { field2265, field2266, field2262, field2263 };
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
