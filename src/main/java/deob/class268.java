package deob;

import java.util.Locale;

@ObfuscatedName("jh")
public class class268 implements class266 {

    @ObfuscatedName("jh.f")
    public static final class268 field3357 = new class268("EN", "en", "English", class269.field3374, 0, "GB");

    @ObfuscatedName("jh.o")
    public static final class268 field3354 = new class268("DE", "de", "German", class269.field3374, 1, "DE");

    @ObfuscatedName("jh.u")
    public static final class268 field3347 = new class268("FR", "fr", "French", class269.field3374, 2, "FR");

    @ObfuscatedName("jh.p")
    public static final class268 field3350 = new class268("PT", "pt", "Portuguese", class269.field3374, 3, "BR");

    @ObfuscatedName("jh.b")
    public static final class268 field3348 = new class268("NL", "nl", "Dutch", class269.field3364, 4, "NL");

    @ObfuscatedName("jh.e")
    public static final class268 field3352 = new class268("ES", "es", "Spanish", class269.field3364, 5, "ES");

    @ObfuscatedName("jh.k")
    public static final class268 field3351 = new class268("ES_MX", "es-mx", "Spanish (Latin American)", class269.field3374, 6, "MX");

    @ObfuscatedName("jh.g")
    public final String field3353;

    @ObfuscatedName("jh.h")
    public final String field3355;

    @ObfuscatedName("jh.n")
    public final int field3349;

    @ObfuscatedName("jh.l")
    public static final class268[] field3356;

    static {
        class268[] var0 = method4134();
        field3356 = new class268[var0.length];
        class268[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class268 var3 = var1[var2];
            if (field3356[var3.field3349] != null) {
                throw new IllegalStateException();
            }
            field3356[var3.field3349] = var3;
        }
    }

    @ObfuscatedName("jh.b(B)[Ljh;")
    public static class268[] method4134() {
        return new class268[] { field3357, field3350, field3354, field3351, field3348, field3347, field3352 };
    }

    public class268(String arg0, String arg1, String arg2, class269 arg3, int arg4, String arg5) {
        this.field3353 = arg0;
        this.field3355 = arg1;
        this.field3349 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("jh.e(I)Ljava/lang/String;")
    public String method4131() {
        return this.field3355;
    }

    @ObfuscatedName("jh.f(I)I")
    public int method240() {
        return this.field3349;
    }

    @ObfuscatedName("jh.k(IB)Ljh;")
    public static class268 method4132(int arg0) {
        return arg0 >= 0 && arg0 < field3356.length ? field3356[arg0] : null;
    }

    public String toString() {
        return this.method4131().toLowerCase(Locale.ENGLISH);
    }
}
