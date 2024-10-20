package deob;

import java.util.Locale;

@ObfuscatedName("gt")
public class class191 implements class195 {

    @ObfuscatedName("gt.z")
    public static final class191 field2338 = new class191("EN", "en", "English", class193.field2363, 0, "GB");

    @ObfuscatedName("gt.n")
    public static final class191 field2335 = new class191("DE", "de", "German", class193.field2363, 1, "DE");

    @ObfuscatedName("gt.v")
    public static final class191 field2332 = new class191("FR", "fr", "French", class193.field2363, 2, "FR");

    @ObfuscatedName("gt.u")
    public static final class191 field2333 = new class191("PT", "pt", "Portuguese", class193.field2363, 3, "BR");

    @ObfuscatedName("gt.r")
    public static final class191 field2331 = new class191("NL", "nl", "Dutch", class193.field2354, 4, "NL");

    @ObfuscatedName("gt.p")
    public static final class191 field2337 = new class191("ES", "es", "Spanish", class193.field2354, 5, "ES");

    @ObfuscatedName("gt.q")
    public static final class191 field2336 = new class191("ES_MX", "es-mx", "Spanish (Latin American)", class193.field2363, 6, "MX");

    @ObfuscatedName("gt.m")
    public final String field2339;

    @ObfuscatedName("gt.y")
    public final String field2330;

    @ObfuscatedName("gt.i")
    public final int field2340;

    @ObfuscatedName("gt.c")
    public static final class191[] field2334;

    static {
        class191[] var0 = method3311();
        field2334 = new class191[var0.length];
        class191[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class191 var3 = var1[var2];
            if (field2334[var3.field2340] != null) {
                throw new IllegalStateException();
            }
            field2334[var3.field2340] = var3;
        }
    }

    @ObfuscatedName("gt.z(I)[Lgt;")
    public static class191[] method3311() {
        return new class191[] { field2333, field2338, field2331, field2337, field2332, field2336, field2335 };
    }

    public class191(String arg0, String arg1, String arg2, class193 arg3, int arg4, String arg5) {
        this.field2339 = arg0;
        this.field2330 = arg1;
        this.field2340 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("gt.n(I)Ljava/lang/String;")
    public String method3294() {
        return this.field2330;
    }

    @ObfuscatedName("gt.v(S)I")
    public int method25() {
        return this.field2340;
    }

    @ObfuscatedName("gt.u(II)Lgt;")
    public static class191 method3295(int arg0) {
        return arg0 >= 0 && arg0 < field2334.length ? field2334[arg0] : null;
    }

    public String toString() {
        return this.method3294().toLowerCase(Locale.ENGLISH);
    }
}
