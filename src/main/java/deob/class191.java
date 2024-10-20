package deob;

import java.util.Locale;

@ObfuscatedName("gf")
public class class191 implements class195 {

    @ObfuscatedName("gf.c")
    public static final class191 field2327 = new class191("EN", "en", "English", class193.field2346, 0, "GB");

    @ObfuscatedName("gf.x")
    public static final class191 field2320 = new class191("DE", "de", "German", class193.field2346, 1, "DE");

    @ObfuscatedName("gf.t")
    public static final class191 field2321 = new class191("FR", "fr", "French", class193.field2346, 2, "FR");

    @ObfuscatedName("gf.g")
    public static final class191 field2319 = new class191("PT", "pt", "Portuguese", class193.field2346, 3, "BR");

    @ObfuscatedName("gf.l")
    public static final class191 field2325 = new class191("NL", "nl", "Dutch", class193.field2341, 4, "NL");

    @ObfuscatedName("gf.u")
    public static final class191 field2324 = new class191("ES", "es", "Spanish", class193.field2341, 5, "ES");

    @ObfuscatedName("gf.j")
    public static final class191 field2328 = new class191("ES_MX", "es-mx", "Spanish (Latin American)", class193.field2346, 6, "MX");

    @ObfuscatedName("gf.v")
    public final String field2326;

    @ObfuscatedName("gf.d")
    public final String field2322;

    @ObfuscatedName("gf.z")
    public final int field2329;

    @ObfuscatedName("gf.n")
    public static final class191[] field2323;

    static {
        class191[] var0 = new class191[] { field2328, field2319, field2325, field2327, field2321, field2320, field2324 };
        field2323 = new class191[var0.length];
        class191[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class191 var4 = var2[var3];
            if (field2323[var4.field2329] != null) {
                throw new IllegalStateException();
            }
            field2323[var4.field2329] = var4;
        }
    }

    public class191(String arg0, String arg1, String arg2, class193 arg3, int arg4, String arg5) {
        this.field2326 = arg0;
        this.field2322 = arg1;
        this.field2329 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("gf.x(B)Ljava/lang/String;")
    public String method3367() {
        return this.field2322;
    }

    @ObfuscatedName("gf.c(I)I")
    public int method22() {
        return this.field2329;
    }

    public String toString() {
        return this.method3367().toLowerCase(Locale.ENGLISH);
    }
}
