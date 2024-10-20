package deob;

import java.util.Locale;

@class354
@class298
@ObfuscatedName("mn")
public class class352 implements class350 {

    @ObfuscatedName("mn.f")
    public static final class352 field4316 = new class352("EN", "en", "English", class353.field4335, 0, "GB");

    @ObfuscatedName("mn.w")
    public static final class352 field4317 = new class352("DE", "de", "German", class353.field4335, 1, "DE");

    @ObfuscatedName("mn.v")
    public static final class352 field4325 = new class352("FR", "fr", "French", class353.field4335, 2, "FR");

    @ObfuscatedName("mn.s")
    public static final class352 field4324 = new class352("PT", "pt", "Portuguese", class353.field4335, 3, "BR");

    @ObfuscatedName("mn.z")
    public static final class352 field4318 = new class352("NL", "nl", "Dutch", class353.field4329, 4, "NL");

    @ObfuscatedName("mn.j")
    public static final class352 field4319 = new class352("ES", "es", "Spanish", class353.field4329, 5, "ES");

    @ObfuscatedName("mn.i")
    public static final class352 field4314 = new class352("ES_MX", "es-mx", "Spanish (Latin American)", class353.field4335, 6, "MX");

    @ObfuscatedName("mn.n")
    public final String field4315;

    @ObfuscatedName("mn.l")
    public final String field4322;

    @ObfuscatedName("mn.k")
    public final int field4323;

    @ObfuscatedName("mn.c")
    public static final class352[] field4320;

    static {
        class352[] var0 = new class352[] { field4319, field4317, field4316, field4314, field4325, field4324, field4318 };
        field4320 = new class352[var0.length];
        class352[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class352 var4 = var2[var3];
            if (field4320[var4.field4323] != null) {
                throw new IllegalStateException();
            }
            field4320[var4.field4323] = var4;
        }
    }

    public class352(String arg0, String arg1, String arg2, class353 arg3, int arg4, String arg5) {
        this.field4315 = arg0;
        this.field4322 = arg1;
        this.field4323 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("mn.v(I)Ljava/lang/String;")
    public String method6211() {
        return this.field4322;
    }

    @ObfuscatedName("mn.f(B)I")
    public int method46() {
        return this.field4323;
    }

    public String toString() {
        return this.method6211().toLowerCase(Locale.ENGLISH);
    }
}
