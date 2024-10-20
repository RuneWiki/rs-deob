package deob;

import java.util.Locale;

@ObfuscatedName("gl")
public class class200 implements class204 {

    @ObfuscatedName("gl.x")
    public static final class200 field2359 = new class200("EN", "en", "English", class202.field2376, 0, "GB");

    @ObfuscatedName("gl.m")
    public static final class200 field2364 = new class200("DE", "de", "German", class202.field2376, 1, "DE");

    @ObfuscatedName("gl.k")
    public static final class200 field2368 = new class200("FR", "fr", "French", class202.field2376, 2, "FR");

    @ObfuscatedName("gl.d")
    public static final class200 field2361 = new class200("PT", "pt", "Portuguese", class202.field2376, 3, "BR");

    @ObfuscatedName("gl.w")
    public static final class200 field2360 = new class200("NL", "nl", "Dutch", class202.field2377, 4, "NL");

    @ObfuscatedName("gl.v")
    public static final class200 field2363 = new class200("ES", "es", "Spanish", class202.field2377, 5, "ES");

    @ObfuscatedName("gl.q")
    public static final class200 field2367 = new class200("ES_MX", "es-mx", "Spanish (Latin American)", class202.field2376, 6, "MX");

    @ObfuscatedName("gl.z")
    public final String field2365;

    @ObfuscatedName("gl.t")
    public final String field2366;

    @ObfuscatedName("gl.e")
    public final int field2358;

    @ObfuscatedName("gl.s")
    public static final class200[] field2362;

    static {
        class200[] var0 = method3413();
        field2362 = new class200[var0.length];
        class200[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class200 var3 = var1[var2];
            if (field2362[var3.field2358] != null) {
                throw new IllegalStateException();
            }
            field2362[var3.field2358] = var3;
        }
    }

    @ObfuscatedName("gl.x(B)[Lgl;")
    public static class200[] method3413() {
        return new class200[] { field2368, field2359, field2363, field2360, field2361, field2364, field2367 };
    }

    public class200(String arg0, String arg1, String arg2, class202 arg3, int arg4, String arg5) {
        this.field2365 = arg0;
        this.field2366 = arg1;
        this.field2358 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("gl.m(I)Ljava/lang/String;")
    public String method3424() {
        return this.field2366;
    }

    @ObfuscatedName("gl.d(B)I")
    public int method26() {
        return this.field2358;
    }

    @ObfuscatedName("gl.k(II)Lgl;")
    public static class200 method3415(int arg0) {
        return arg0 >= 0 && arg0 < field2362.length ? field2362[arg0] : null;
    }

    public String toString() {
        return this.method3424().toLowerCase(Locale.ENGLISH);
    }
}
