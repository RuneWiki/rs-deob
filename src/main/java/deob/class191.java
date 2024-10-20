package deob;

import java.util.Locale;

@ObfuscatedName("gw")
public class class191 implements class195 {

    @ObfuscatedName("gw.a")
    public static final class191 field2332 = new class191("EN", "en", "English", class193.field2346, 0, "GB");

    @ObfuscatedName("gw.t")
    public static final class191 field2320 = new class191("DE", "de", "German", class193.field2346, 1, "DE");

    @ObfuscatedName("gw.n")
    public static final class191 field2319 = new class191("FR", "fr", "French", class193.field2346, 2, "FR");

    @ObfuscatedName("gw.q")
    public static final class191 field2321 = new class191("PT", "pt", "Portuguese", class193.field2346, 3, "BR");

    @ObfuscatedName("gw.v")
    public static final class191 field2323 = new class191("NL", "nl", "Dutch", class193.field2342, 4, "NL");

    @ObfuscatedName("gw.l")
    public static final class191 field2324 = new class191("ES", "es", "Spanish", class193.field2342, 5, "ES");

    @ObfuscatedName("gw.c")
    public static final class191 field2325 = new class191("ES_MX", "es-mx", "Spanish (Latin American)", class193.field2346, 6, "MX");

    @ObfuscatedName("gw.o")
    public final String field2326;

    @ObfuscatedName("gw.i")
    public final String field2327;

    @ObfuscatedName("gw.d")
    public final int field2328;

    @ObfuscatedName("gw.m")
    public static final class191[] field2330;

    static {
        class191[] var0 = method3443();
        field2330 = new class191[var0.length];
        class191[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class191 var3 = var1[var2];
            if (field2330[var3.field2328] != null) {
                throw new IllegalStateException();
            }
            field2330[var3.field2328] = var3;
        }
    }

    @ObfuscatedName("gw.a(I)[Lgw;")
    public static class191[] method3443() {
        return new class191[] { field2323, field2324, field2321, field2320, field2325, field2319, field2332 };
    }

    public class191(String arg0, String arg1, String arg2, class193 arg3, int arg4, String arg5) {
        this.field2326 = arg0;
        this.field2327 = arg1;
        this.field2328 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("gw.t(I)Ljava/lang/String;")
    public String method3437() {
        return this.field2327;
    }

    @ObfuscatedName("gw.q(I)I")
    public int method33() {
        return this.field2328;
    }

    public String toString() {
        return this.method3437().toLowerCase(Locale.ENGLISH);
    }
}
