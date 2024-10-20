package deob;

import java.util.Locale;

@class350
@class294
@ObfuscatedName("mb")
public class class348 implements class346 {

    @ObfuscatedName("mb.h")
    public static final class348 field4294 = new class348("EN", "en", "English", class349.field4328, 0, "GB");

    @ObfuscatedName("mb.e")
    public static final class348 field4303 = new class348("DE", "de", "German", class349.field4328, 1, "DE");

    @ObfuscatedName("mb.v")
    public static final class348 field4296 = new class348("FR", "fr", "French", class349.field4328, 2, "FR");

    @ObfuscatedName("mb.x")
    public static final class348 field4297 = new class348("PT", "pt", "Portuguese", class349.field4328, 3, "BR");

    @ObfuscatedName("mb.m")
    public static final class348 field4298 = new class348("NL", "nl", "Dutch", class349.field4311, 4, "NL");

    @ObfuscatedName("mb.q")
    public static final class348 field4299 = new class348("ES", "es", "Spanish", class349.field4311, 5, "ES");

    @ObfuscatedName("mb.f")
    public static final class348 field4295 = new class348("ES_MX", "es-mx", "Spanish (Latin American)", class349.field4328, 6, "MX");

    @ObfuscatedName("mb.r")
    public final String field4301;

    @ObfuscatedName("mb.u")
    public final String field4302;

    @ObfuscatedName("mb.b")
    public final int field4304;

    @ObfuscatedName("mb.j")
    public static final class348[] field4305;

    static {
        class348[] var0 = new class348[] { field4303, field4299, field4296, field4298, field4295, field4297, field4294 };
        field4305 = new class348[var0.length];
        class348[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class348 var4 = var2[var3];
            if (field4305[var4.field4304] != null) {
                throw new IllegalStateException();
            }
            field4305[var4.field4304] = var4;
        }
    }

    public class348(String arg0, String arg1, String arg2, class349 arg3, int arg4, String arg5) {
        this.field4301 = arg0;
        this.field4302 = arg1;
        this.field4304 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("mb.h(B)Ljava/lang/String;")
    public String method6058() {
        return this.field4302;
    }

    @ObfuscatedName("mb.e(B)I")
    public int method32() {
        return this.field4304;
    }

    public String toString() {
        return this.method6058().toLowerCase(Locale.ENGLISH);
    }
}
