package deob;

import java.util.Locale;

@ObfuscatedName("gz")
public class class200 implements class204 {

    @ObfuscatedName("gz.m")
    public static final class200 field2386 = new class200("EN", "en", "English", class202.field2413, 0, "GB");

    @ObfuscatedName("gz.o")
    public static final class200 field2387 = new class200("DE", "de", "German", class202.field2413, 1, "DE");

    @ObfuscatedName("gz.q")
    public static final class200 field2388 = new class200("FR", "fr", "French", class202.field2413, 2, "FR");

    @ObfuscatedName("gz.j")
    public static final class200 field2389 = new class200("PT", "pt", "Portuguese", class202.field2413, 3, "BR");

    @ObfuscatedName("gz.p")
    public static final class200 field2393 = new class200("NL", "nl", "Dutch", class202.field2406, 4, "NL");

    @ObfuscatedName("gz.g")
    public static final class200 field2391 = new class200("ES", "es", "Spanish", class202.field2406, 5, "ES");

    @ObfuscatedName("gz.n")
    public static final class200 field2392 = new class200("ES_MX", "es-mx", "Spanish (Latin American)", class202.field2413, 6, "MX");

    @ObfuscatedName("gz.u")
    public final String field2397;

    @ObfuscatedName("gz.a")
    public final String field2394;

    @ObfuscatedName("gz.z")
    public final int field2395;

    @ObfuscatedName("gz.w")
    public static final class200[] field2390;

    static {
        class200[] var0 = method3435();
        field2390 = new class200[var0.length];
        class200[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class200 var3 = var1[var2];
            if (field2390[var3.field2395] != null) {
                throw new IllegalStateException();
            }
            field2390[var3.field2395] = var3;
        }
    }

    @ObfuscatedName("gz.o(I)[Lgz;")
    public static class200[] method3435() {
        return new class200[] { field2386, field2387, field2391, field2392, field2389, field2388, field2393 };
    }

    public class200(String arg0, String arg1, String arg2, class202 arg3, int arg4, String arg5) {
        this.field2397 = arg0;
        this.field2394 = arg1;
        this.field2395 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("gz.n(B)Ljava/lang/String;")
    public String method3436() {
        return this.field2394;
    }

    @ObfuscatedName("gz.m(I)I")
    public int method21() {
        return this.field2395;
    }

    @ObfuscatedName("gz.u(IB)Lgz;")
    public static class200 method3445(int arg0) {
        return arg0 >= 0 && arg0 < field2390.length ? field2390[arg0] : null;
    }

    public String toString() {
        return this.method3436().toLowerCase(Locale.ENGLISH);
    }
}
