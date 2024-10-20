package deob;

@ObfuscatedName("ez")
public class class153 {

    @ObfuscatedName("ez.k")
    public static final class153 field2247 = new class153("LIVE", 0);

    @ObfuscatedName("ez.h")
    public static final class153 field2248 = new class153("BUILDLIVE", 3);

    @ObfuscatedName("ez.o")
    public static final class153 field2249 = new class153("RC", 1);

    @ObfuscatedName("ez.z")
    public static final class153 field2250 = new class153("WIP", 2);

    @ObfuscatedName("ez.c")
    public final String field2255;

    @ObfuscatedName("ez.d")
    public final int field2251;

    @ObfuscatedName("ea.k(I)[Lez;")
    public static class153[] method2948() {
        return new class153[] { field2248, field2247, field2249, field2250 };
    }

    public class153(String arg0, int arg1) {
        this.field2255 = arg0;
        this.field2251 = arg1;
    }

    @ObfuscatedName("cu.h(II)Lez;")
    public static class153 method2044(int arg0) {
        class153[] var1 = method2948();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class153 var3 = var1[var2];
            if (var3.field2251 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
