package deob;

import java.util.Locale;

@ObfuscatedName("gc")
public class class191 implements class195 {

    @ObfuscatedName("gc.u")
    public static final class191 field2360 = new class191("EN", "en", "English", class193.field2382, 0, "GB");

    @ObfuscatedName("gc.f")
    public static final class191 field2367 = new class191("DE", "de", "German", class193.field2382, 1, "DE");

    @ObfuscatedName("gc.b")
    public static final class191 field2362 = new class191("FR", "fr", "French", class193.field2382, 2, "FR");

    @ObfuscatedName("gc.g")
    public static final class191 field2361 = new class191("PT", "pt", "Portuguese", class193.field2382, 3, "BR");

    @ObfuscatedName("gc.z")
    public static final class191 field2366 = new class191("NL", "nl", "Dutch", class193.field2393, 4, "NL");

    @ObfuscatedName("gc.p")
    public static final class191 field2363 = new class191("ES", "es", "Spanish", class193.field2393, 5, "ES");

    @ObfuscatedName("gc.h")
    public static final class191 field2359 = new class191("ES_MX", "es-mx", "Spanish (Latin American)", class193.field2382, 6, "MX");

    @ObfuscatedName("gc.y")
    public final String field2365;

    @ObfuscatedName("gc.w")
    public final String field2364;

    @ObfuscatedName("gc.i")
    public final int field2358;

    @ObfuscatedName("gc.k")
    public static final class191[] field2368;

    static {
        class191[] var0 = Statics.method3377();
        field2368 = new class191[var0.length];
        class191[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class191 var3 = var1[var2];
            if (field2368[var3.field2358] != null) {
                throw new IllegalStateException();
            }
            field2368[var3.field2358] = var3;
        }
    }

    public class191(String arg0, String arg1, String arg2, class193 arg3, int arg4, String arg5) {
        this.field2365 = arg0;
        this.field2364 = arg1;
        this.field2358 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("gc.f(I)Ljava/lang/String;")
    public String method3376() {
        return this.field2364;
    }

    @ObfuscatedName("gc.g(B)I")
    public int method26() {
        return this.field2358;
    }

    public String toString() {
        return this.method3376().toLowerCase(Locale.ENGLISH);
    }
}
