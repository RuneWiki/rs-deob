package deob;

import java.util.Locale;

@class347
@class291
@ObfuscatedName("mo")
public class class345 implements class343 {

    @ObfuscatedName("mo.a")
    public static final class345 field4253 = new class345("EN", "en", "English", class346.field4263, 0, "GB");

    @ObfuscatedName("mo.f")
    public static final class345 field4238 = new class345("DE", "de", "German", class346.field4263, 1, "DE");

    @ObfuscatedName("mo.c")
    public static final class345 field4244 = new class345("FR", "fr", "French", class346.field4263, 2, "FR");

    @ObfuscatedName("mo.x")
    public static final class345 field4240 = new class345("PT", "pt", "Portuguese", class346.field4263, 3, "BR");

    @ObfuscatedName("mo.h")
    public static final class345 field4241 = new class345("NL", "nl", "Dutch", class346.field4257, 4, "NL");

    @ObfuscatedName("mo.j")
    public static final class345 field4242 = new class345("ES", "es", "Spanish", class346.field4257, 5, "ES");

    @ObfuscatedName("mo.y")
    public static final class345 field4243 = new class345("ES_MX", "es-mx", "Spanish (Latin American)", class346.field4263, 6, "MX");

    @ObfuscatedName("mo.d")
    public final String field4237;

    @ObfuscatedName("mo.n")
    public final String field4246;

    @ObfuscatedName("mo.r")
    public final int field4249;

    @ObfuscatedName("mo.l")
    public static final class345[] field4247;

    static {
        class345[] var0 = method5992();
        field4247 = new class345[var0.length];
        class345[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class345 var3 = var1[var2];
            if (field4247[var3.field4249] != null) {
                throw new IllegalStateException();
            }
            field4247[var3.field4249] = var3;
        }
    }

    @ObfuscatedName("mo.c(B)[Lmo;")
    public static class345[] method5992() {
        return new class345[] { field4244, field4253, field4240, field4241, field4243, field4242, field4238 };
    }

    public class345(String arg0, String arg1, String arg2, class346 arg3, int arg4, String arg5) {
        this.field4237 = arg0;
        this.field4246 = arg1;
        this.field4249 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("mo.x(B)Ljava/lang/String;")
    public String method5991() {
        return this.field4246;
    }

    @ObfuscatedName("mo.a(B)I")
    public int method24() {
        return this.field4249;
    }

    @ObfuscatedName("mo.h(II)Lmo;")
    public static class345 method6002(int arg0) {
        return arg0 >= 0 && arg0 < field4247.length ? field4247[arg0] : null;
    }

    public String toString() {
        return this.method5991().toLowerCase(Locale.ENGLISH);
    }
}
