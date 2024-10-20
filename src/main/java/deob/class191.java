package deob;

import java.util.Locale;

@ObfuscatedName("gu")
public class class191 implements class195 {

    @ObfuscatedName("gu.q")
    public static final class191 field2349 = new class191("EN", "en", "English", class193.field2376, 0, "GB");

    @ObfuscatedName("gu.w")
    public static final class191 field2352 = new class191("DE", "de", "German", class193.field2376, 1, "DE");

    @ObfuscatedName("gu.e")
    public static final class191 field2348 = new class191("FR", "fr", "French", class193.field2376, 2, "FR");

    @ObfuscatedName("gu.p")
    public static final class191 field2353 = new class191("PT", "pt", "Portuguese", class193.field2376, 3, "BR");

    @ObfuscatedName("gu.k")
    public static final class191 field2350 = new class191("NL", "nl", "Dutch", class193.field2382, 4, "NL");

    @ObfuscatedName("gu.l")
    public static final class191 field2351 = new class191("ES", "es", "Spanish", class193.field2382, 5, "ES");

    @ObfuscatedName("gu.b")
    public static final class191 field2361 = new class191("ES_MX", "es-mx", "Spanish (Latin American)", class193.field2376, 6, "MX");

    @ObfuscatedName("gu.i")
    public final String field2347;

    @ObfuscatedName("gu.c")
    public final String field2354;

    @ObfuscatedName("gu.f")
    public final int field2355;

    @ObfuscatedName("gu.m")
    public static final class191[] field2356;

    static {
        class191[] var0 = method3341();
        field2356 = new class191[var0.length];
        class191[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class191 var3 = var1[var2];
            if (field2356[var3.field2355] != null) {
                throw new IllegalStateException();
            }
            field2356[var3.field2355] = var3;
        }
    }

    @ObfuscatedName("gu.q(B)[Lgu;")
    public static class191[] method3341() {
        return new class191[] { field2352, field2350, field2348, field2351, field2349, field2361, field2353 };
    }

    public class191(String arg0, String arg1, String arg2, class193 arg3, int arg4, String arg5) {
        this.field2347 = arg0;
        this.field2354 = arg1;
        this.field2355 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("gu.w(I)Ljava/lang/String;")
    public String method3334() {
        return this.field2354;
    }

    @ObfuscatedName("gu.e(I)I")
    public int method30() {
        return this.field2355;
    }

    public String toString() {
        return this.method3334().toLowerCase(Locale.ENGLISH);
    }
}
