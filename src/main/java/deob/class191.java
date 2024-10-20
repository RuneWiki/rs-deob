package deob;

import java.util.Locale;

@ObfuscatedName("gl")
public class class191 implements class195 {

    @ObfuscatedName("gl.c")
    public static final class191 field2364 = new class191("EN", "en", "English", class193.field2381, 0, "GB");

    @ObfuscatedName("gl.t")
    public static final class191 field2356 = new class191("DE", "de", "German", class193.field2381, 1, "DE");

    @ObfuscatedName("gl.o")
    public static final class191 field2357 = new class191("FR", "fr", "French", class193.field2381, 2, "FR");

    @ObfuscatedName("gl.e")
    public static final class191 field2365 = new class191("PT", "pt", "Portuguese", class193.field2381, 3, "BR");

    @ObfuscatedName("gl.i")
    public static final class191 field2359 = new class191("NL", "nl", "Dutch", class193.field2383, 4, "NL");

    @ObfuscatedName("gl.g")
    public static final class191 field2355 = new class191("ES", "es", "Spanish", class193.field2383, 5, "ES");

    @ObfuscatedName("gl.d")
    public static final class191 field2361 = new class191("ES_MX", "es-mx", "Spanish (Latin American)", class193.field2381, 6, "MX");

    @ObfuscatedName("gl.l")
    public final String field2362;

    @ObfuscatedName("gl.j")
    public final String field2363;

    @ObfuscatedName("gl.m")
    public final int field2368;

    @ObfuscatedName("gl.p")
    public static final class191[] field2358;

    static {
        class191[] var0 = method3393();
        field2358 = new class191[var0.length];
        class191[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class191 var3 = var1[var2];
            if (field2358[var3.field2368] != null) {
                throw new IllegalStateException();
            }
            field2358[var3.field2368] = var3;
        }
    }

    @ObfuscatedName("gl.c(I)[Lgl;")
    public static class191[] method3393() {
        return new class191[] { field2365, field2359, field2356, field2364, field2361, field2355, field2357 };
    }

    public class191(String arg0, String arg1, String arg2, class193 arg3, int arg4, String arg5) {
        this.field2362 = arg0;
        this.field2363 = arg1;
        this.field2368 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("gl.t(B)Ljava/lang/String;")
    public String method3392() {
        return this.field2363;
    }

    @ObfuscatedName("gl.e(B)I")
    public int method33() {
        return this.field2368;
    }

    @ObfuscatedName("gl.o(II)Lgl;")
    public static class191 method3390(int arg0) {
        return arg0 >= 0 && arg0 < field2358.length ? field2358[arg0] : null;
    }

    public String toString() {
        return this.method3392().toLowerCase(Locale.ENGLISH);
    }
}
