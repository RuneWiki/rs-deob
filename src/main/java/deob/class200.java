package deob;

import java.util.Locale;

@ObfuscatedName("gi")
public class class200 implements class204 {

    @ObfuscatedName("gi.h")
    public static final class200 field2383 = new class200("EN", "en", "English", class202.field2403, 0, "GB");

    @ObfuscatedName("gi.v")
    public static final class200 field2375 = new class200("DE", "de", "German", class202.field2403, 1, "DE");

    @ObfuscatedName("gi.x")
    public static final class200 field2376 = new class200("FR", "fr", "French", class202.field2403, 2, "FR");

    @ObfuscatedName("gi.w")
    public static final class200 field2384 = new class200("PT", "pt", "Portuguese", class202.field2403, 3, "BR");

    @ObfuscatedName("gi.t")
    public static final class200 field2378 = new class200("NL", "nl", "Dutch", class202.field2398, 4, "NL");

    @ObfuscatedName("gi.j")
    public static final class200 field2379 = new class200("ES", "es", "Spanish", class202.field2398, 5, "ES");

    @ObfuscatedName("gi.n")
    public static final class200 field2380 = new class200("ES_MX", "es-mx", "Spanish (Latin American)", class202.field2403, 6, "MX");

    @ObfuscatedName("gi.p")
    public final String field2381;

    @ObfuscatedName("gi.l")
    public final String field2382;

    @ObfuscatedName("gi.z")
    public final int field2374;

    @ObfuscatedName("gi.u")
    public static final class200[] field2377;

    static {
        class200[] var0 = method3408();
        field2377 = new class200[var0.length];
        class200[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class200 var3 = var1[var2];
            if (field2377[var3.field2374] != null) {
                throw new IllegalStateException();
            }
            field2377[var3.field2374] = var3;
        }
    }

    @ObfuscatedName("gi.h(I)[Lgi;")
    public static class200[] method3408() {
        return new class200[] { field2384, field2378, field2379, field2375, field2383, field2376, field2380 };
    }

    public class200(String arg0, String arg1, String arg2, class202 arg3, int arg4, String arg5) {
        this.field2381 = arg0;
        this.field2382 = arg1;
        this.field2374 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("gi.v(I)Ljava/lang/String;")
    public String method3401() {
        return this.field2382;
    }

    @ObfuscatedName("gi.x(I)I")
    public int method18() {
        return this.field2374;
    }

    @ObfuscatedName("gi.w(IB)Lgi;")
    public static class200 method3402(int arg0) {
        return arg0 >= 0 && arg0 < field2377.length ? field2377[arg0] : null;
    }

    public String toString() {
        return this.method3401().toLowerCase(Locale.ENGLISH);
    }
}
