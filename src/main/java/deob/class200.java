package deob;

import java.util.Locale;

@ObfuscatedName("gp")
public class class200 implements class204 {

    @ObfuscatedName("gp.n")
    public static final class200 field2387 = new class200("EN", "en", "English", class202.field2421, 0, "GB");

    @ObfuscatedName("gp.v")
    public static final class200 field2383 = new class200("DE", "de", "German", class202.field2421, 1, "DE");

    @ObfuscatedName("gp.d")
    public static final class200 field2384 = new class200("FR", "fr", "French", class202.field2421, 2, "FR");

    @ObfuscatedName("gp.c")
    public static final class200 field2385 = new class200("PT", "pt", "Portuguese", class202.field2421, 3, "BR");

    @ObfuscatedName("gp.y")
    public static final class200 field2382 = new class200("NL", "nl", "Dutch", class202.field2406, 4, "NL");

    @ObfuscatedName("gp.h")
    public static final class200 field2386 = new class200("ES", "es", "Spanish", class202.field2406, 5, "ES");

    @ObfuscatedName("gp.z")
    public static final class200 field2394 = new class200("ES_MX", "es-mx", "Spanish (Latin American)", class202.field2421, 6, "MX");

    @ObfuscatedName("gp.e")
    public final String field2388;

    @ObfuscatedName("gp.q")
    public final String field2390;

    @ObfuscatedName("gp.l")
    public final int field2391;

    @ObfuscatedName("gp.s")
    public static final class200[] field2392;

    static {
        class200[] var0 = new class200[] { field2384, field2383, field2386, field2382, field2385, field2387, field2394 };
        field2392 = new class200[var0.length];
        class200[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class200 var4 = var2[var3];
            if (field2392[var4.field2391] != null) {
                throw new IllegalStateException();
            }
            field2392[var4.field2391] = var4;
        }
    }

    public class200(String arg0, String arg1, String arg2, class202 arg3, int arg4, String arg5) {
        this.field2388 = arg0;
        this.field2390 = arg1;
        this.field2391 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("gp.n(B)Ljava/lang/String;")
    public String method3537() {
        return this.field2390;
    }

    @ObfuscatedName("gp.v(B)I")
    public int method30() {
        return this.field2391;
    }

    @ObfuscatedName("gp.d(IB)Lgp;")
    public static class200 method3538(int arg0) {
        return arg0 >= 0 && arg0 < field2392.length ? field2392[arg0] : null;
    }

    public String toString() {
        return this.method3537().toLowerCase(Locale.ENGLISH);
    }
}
