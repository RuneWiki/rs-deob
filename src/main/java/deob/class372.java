package deob;

import java.util.Locale;

@class374
@class318
@ObfuscatedName("oj")
public class class372 implements class370 {

    @ObfuscatedName("oj.at")
    public static final class372 field4341 = new class372("EN", "en", "English", class373.field4357, 0, "GB");

    @ObfuscatedName("oj.an")
    public static final class372 field4350 = new class372("DE", "de", "German", class373.field4357, 1, "DE");

    @ObfuscatedName("oj.av")
    public static final class372 field4342 = new class372("FR", "fr", "French", class373.field4357, 2, "FR");

    @ObfuscatedName("oj.as")
    public static final class372 field4343 = new class372("PT", "pt", "Portuguese", class373.field4357, 3, "BR");

    @ObfuscatedName("oj.ax")
    public static final class372 field4344 = new class372("NL", "nl", "Dutch", class373.field4373, 4, "NL");

    @ObfuscatedName("oj.ap")
    public static final class372 field4345 = new class372("ES", "es", "Spanish", class373.field4373, 5, "ES");

    @ObfuscatedName("oj.ab")
    public static final class372 field4346 = new class372("ES_MX", "es-mx", "Spanish (Latin American)", class373.field4357, 6, "MX");

    @ObfuscatedName("oj.ak")
    public final String field4347;

    @ObfuscatedName("oj.ae")
    public final String field4340;

    @ObfuscatedName("oj.af")
    public final int field4349;

    @ObfuscatedName("oj.ao")
    public static final class372[] field4351;

    static {
        class372[] var0 = new class372[] { field4345, field4350, field4342, field4346, field4344, field4343, field4341 };
        field4351 = new class372[var0.length];
        class372[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class372 var4 = var2[var3];
            if (field4351[var4.field4349] != null) {
                throw new IllegalStateException();
            }
            field4351[var4.field4349] = var4;
        }
    }

    public class372(String arg0, String arg1, String arg2, class373 arg3, int arg4, String arg5) {
        this.field4347 = arg0;
        this.field4340 = arg1;
        this.field4349 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("oj.ab(I)Ljava/lang/String;")
    public String method6271() {
        return this.field4340;
    }

    @ObfuscatedName("oj.at(B)I")
    public int method33() {
        return this.field4349;
    }

    public String toString() {
        return this.method6271().toLowerCase(Locale.ENGLISH);
    }
}
