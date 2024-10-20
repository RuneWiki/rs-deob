package deob;

import java.util.Locale;

@class377
@class321
@ObfuscatedName("ot")
public class class375 implements class373 {

    @ObfuscatedName("ot.aw")
    public static final class375 field4384 = new class375("EN", "en", "English", class376.field4408, 0, "GB");

    @ObfuscatedName("ot.ay")
    public static final class375 field4379 = new class375("DE", "de", "German", class376.field4408, 1, "DE");

    @ObfuscatedName("ot.ar")
    public static final class375 field4391 = new class375("FR", "fr", "French", class376.field4408, 2, "FR");

    @ObfuscatedName("ot.am")
    public static final class375 field4381 = new class375("PT", "pt", "Portuguese", class376.field4408, 3, "BR");

    @ObfuscatedName("ot.as")
    public static final class375 field4382 = new class375("NL", "nl", "Dutch", class376.field4395, 4, "NL");

    @ObfuscatedName("ot.aj")
    public static final class375 field4383 = new class375("ES", "es", "Spanish", class376.field4395, 5, "ES");

    @ObfuscatedName("ot.ag")
    public static final class375 field4380 = new class375("ES_MX", "es-mx", "Spanish (Latin American)", class376.field4408, 6, "MX");

    @ObfuscatedName("ot.az")
    public final String field4385;

    @ObfuscatedName("ot.av")
    public final String field4386;

    @ObfuscatedName("ot.ap")
    public final int field4378;

    @ObfuscatedName("ot.aq")
    public static final class375[] field4387;

    static {
        class375[] var0 = method6348();
        field4387 = new class375[var0.length];
        class375[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class375 var3 = var1[var2];
            if (field4387[var3.field4378] != null) {
                throw new IllegalStateException();
            }
            field4387[var3.field4378] = var3;
        }
    }

    @ObfuscatedName("ot.aw(I)[Lot;")
    public static class375[] method6348() {
        return new class375[] { field4380, field4384, field4383, field4381, field4391, field4379, field4382 };
    }

    public class375(String arg0, String arg1, String arg2, class376 arg3, int arg4, String arg5) {
        this.field4385 = arg0;
        this.field4386 = arg1;
        this.field4378 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("ot.ar(B)Ljava/lang/String;")
    public String method6343() {
        return this.field4386;
    }

    @ObfuscatedName("ot.ay(I)I")
    public int method36() {
        return this.field4378;
    }

    public String toString() {
        return this.method6343().toLowerCase(Locale.ENGLISH);
    }
}
