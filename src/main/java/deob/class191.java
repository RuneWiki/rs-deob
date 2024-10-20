package deob;

import java.util.Locale;

@ObfuscatedName("gk")
public class class191 implements class195 {

    @ObfuscatedName("gk.s")
    public static final class191 field2337 = new class191("EN", "en", "English", class193.field2361, 0, "GB");

    @ObfuscatedName("gk.j")
    public static final class191 field2332 = new class191("DE", "de", "German", class193.field2361, 1, "DE");

    @ObfuscatedName("gk.i")
    public static final class191 field2333 = new class191("FR", "fr", "French", class193.field2361, 2, "FR");

    @ObfuscatedName("gk.k")
    public static final class191 field2334 = new class191("PT", "pt", "Portuguese", class193.field2361, 3, "BR");

    @ObfuscatedName("gk.u")
    public static final class191 field2335 = new class191("NL", "nl", "Dutch", class193.field2362, 4, "NL");

    @ObfuscatedName("gk.n")
    public static final class191 field2336 = new class191("ES", "es", "Spanish", class193.field2362, 5, "ES");

    @ObfuscatedName("gk.t")
    public static final class191 field2343 = new class191("ES_MX", "es-mx", "Spanish (Latin American)", class193.field2361, 6, "MX");

    @ObfuscatedName("gk.q")
    public final String field2331;

    @ObfuscatedName("gk.x")
    public final String field2342;

    @ObfuscatedName("gk.d")
    public final int field2340;

    @ObfuscatedName("gk.f")
    public static final class191[] field2341;

    static {
        class191[] var0 = new class191[] { field2343, field2332, field2333, field2337, field2334, field2336, field2335 };
        field2341 = new class191[var0.length];
        class191[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class191 var4 = var2[var3];
            if (field2341[var4.field2340] != null) {
                throw new IllegalStateException();
            }
            field2341[var4.field2340] = var4;
        }
    }

    public class191(String arg0, String arg1, String arg2, class193 arg3, int arg4, String arg5) {
        this.field2331 = arg0;
        this.field2342 = arg1;
        this.field2340 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("gk.s(B)Ljava/lang/String;")
    public String method3360() {
        return this.field2342;
    }

    @ObfuscatedName("gk.j(B)I")
    public int method34() {
        return this.field2340;
    }

    @ObfuscatedName("gk.i(II)Lgk;")
    public static class191 method3362(int arg0) {
        return arg0 >= 0 && arg0 < field2341.length ? field2341[arg0] : null;
    }

    public String toString() {
        return this.method3360().toLowerCase(Locale.ENGLISH);
    }
}
