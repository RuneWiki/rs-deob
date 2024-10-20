package deob;

import java.util.Locale;

@ObfuscatedName("gb")
public class class200 implements class204 {

    @ObfuscatedName("gb.f")
    public static final class200 field2384 = new class200("EN", "en", "English", class202.field2401, 0, "GB");

    @ObfuscatedName("gb.b")
    public static final class200 field2388 = new class200("DE", "de", "German", class202.field2401, 1, "DE");

    @ObfuscatedName("gb.l")
    public static final class200 field2379 = new class200("FR", "fr", "French", class202.field2401, 2, "FR");

    @ObfuscatedName("gb.m")
    public static final class200 field2377 = new class200("PT", "pt", "Portuguese", class202.field2401, 3, "BR");

    @ObfuscatedName("gb.z")
    public static final class200 field2381 = new class200("NL", "nl", "Dutch", class202.field2399, 4, "NL");

    @ObfuscatedName("gb.q")
    public static final class200 field2382 = new class200("ES", "es", "Spanish", class202.field2399, 5, "ES");

    @ObfuscatedName("gb.k")
    public static final class200 field2383 = new class200("ES_MX", "es-mx", "Spanish (Latin American)", class202.field2401, 6, "MX");

    @ObfuscatedName("gb.c")
    public final String field2387;

    @ObfuscatedName("gb.u")
    public final String field2380;

    @ObfuscatedName("gb.t")
    public final int field2386;

    @ObfuscatedName("gb.e")
    public static final class200[] field2385;

    static {
        class200[] var0 = new class200[] { field2383, field2377, field2379, field2384, field2381, field2382, field2388 };
        field2385 = new class200[var0.length];
        class200[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class200 var4 = var2[var3];
            if (field2385[var4.field2386] != null) {
                throw new IllegalStateException();
            }
            field2385[var4.field2386] = var4;
        }
    }

    public class200(String arg0, String arg1, String arg2, class202 arg3, int arg4, String arg5) {
        this.field2387 = arg0;
        this.field2380 = arg1;
        this.field2386 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("gb.f(I)Ljava/lang/String;")
    public String method3465() {
        return this.field2380;
    }

    @ObfuscatedName("gb.m(B)I")
    public int method31() {
        return this.field2386;
    }

    @ObfuscatedName("gb.b(IB)Lgb;")
    public static class200 method3472(int arg0) {
        return arg0 >= 0 && arg0 < field2385.length ? field2385[arg0] : null;
    }

    public String toString() {
        return this.method3465().toLowerCase(Locale.ENGLISH);
    }
}
