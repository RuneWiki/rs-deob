package deob;

import java.util.Locale;

@ObfuscatedName("gn")
public class class200 implements class204 {

    @ObfuscatedName("gn.z")
    public static final class200 field2386 = new class200("EN", "en", "English", class202.field2414, 0, "GB");

    @ObfuscatedName("gn.k")
    public static final class200 field2391 = new class200("DE", "de", "German", class202.field2414, 1, "DE");

    @ObfuscatedName("gn.s")
    public static final class200 field2395 = new class200("FR", "fr", "French", class202.field2414, 2, "FR");

    @ObfuscatedName("gn.t")
    public static final class200 field2389 = new class200("PT", "pt", "Portuguese", class202.field2414, 3, "BR");

    @ObfuscatedName("gn.i")
    public static final class200 field2390 = new class200("NL", "nl", "Dutch", class202.field2408, 4, "NL");

    @ObfuscatedName("gn.o")
    public static final class200 field2393 = new class200("ES", "es", "Spanish", class202.field2408, 5, "ES");

    @ObfuscatedName("gn.x")
    public static final class200 field2392 = new class200("ES_MX", "es-mx", "Spanish (Latin American)", class202.field2414, 6, "MX");

    @ObfuscatedName("gn.w")
    public final String field2388;

    @ObfuscatedName("gn.g")
    public final String field2394;

    @ObfuscatedName("gn.m")
    public final int field2387;

    @ObfuscatedName("gn.n")
    public static final class200[] field2396;

    static {
        class200[] var0 = new class200[] { field2390, field2389, field2395, field2392, field2393, field2391, field2386 };
        field2396 = new class200[var0.length];
        class200[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class200 var4 = var2[var3];
            if (field2396[var4.field2387] != null) {
                throw new IllegalStateException();
            }
            field2396[var4.field2387] = var4;
        }
    }

    public class200(String arg0, String arg1, String arg2, class202 arg3, int arg4, String arg5) {
        this.field2388 = arg0;
        this.field2394 = arg1;
        this.field2387 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("gn.z(I)Ljava/lang/String;")
    public String method3455() {
        return this.field2394;
    }

    @ObfuscatedName("gn.s(I)I")
    public int method28() {
        return this.field2387;
    }

    public String toString() {
        return this.method3455().toLowerCase(Locale.ENGLISH);
    }
}
