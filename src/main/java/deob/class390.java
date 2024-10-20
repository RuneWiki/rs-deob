package deob;

import java.util.Locale;

@class392
@class334
@ObfuscatedName("ol")
public class class390 implements class388 {

    @ObfuscatedName("ol.am")
    public static final class390 field4458 = new class390("EN", "en", "English", class391.field4472, 0, "GB");

    @ObfuscatedName("ol.ap")
    public static final class390 field4446 = new class390("DE", "de", "German", class391.field4472, 1, "DE");

    @ObfuscatedName("ol.af")
    public static final class390 field4447 = new class390("FR", "fr", "French", class391.field4472, 2, "FR");

    @ObfuscatedName("ol.aj")
    public static final class390 field4448 = new class390("PT", "pt", "Portuguese", class391.field4472, 3, "BR");

    @ObfuscatedName("ol.aq")
    public static final class390 field4449 = new class390("NL", "nl", "Dutch", class391.field4462, 4, "NL");

    @ObfuscatedName("ol.ar")
    public static final class390 field4445 = new class390("ES", "es", "Spanish", class391.field4462, 5, "ES");

    @ObfuscatedName("ol.ag")
    public static final class390 field4456 = new class390("ES_MX", "es-mx", "Spanish (Latin American)", class391.field4472, 6, "MX");

    @ObfuscatedName("ol.ao")
    public final String field4453;

    @ObfuscatedName("ol.ae")
    public final String field4450;

    @ObfuscatedName("ol.aa")
    public final int field4454;

    @ObfuscatedName("ol.au")
    public static final class390[] field4455;

    static {
        class390[] var0 = new class390[] { field4448, field4456, field4446, field4447, field4445, field4449, field4458 };
        field4455 = new class390[var0.length];
        class390[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class390 var4 = var2[var3];
            if (field4455[var4.field4454] != null) {
                throw new IllegalStateException();
            }
            field4455[var4.field4454] = var4;
        }
    }

    public class390(String arg0, String arg1, String arg2, class391 arg3, int arg4, String arg5) {
        this.field4453 = arg0;
        this.field4450 = arg1;
        this.field4454 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("ol.am(I)Ljava/lang/String;")
    public String method6639() {
        return this.field4450;
    }

    @ObfuscatedName("ol.ap(I)I")
    public int method34() {
        return this.field4454;
    }

    public String toString() {
        return this.method6639().toLowerCase(Locale.ENGLISH);
    }
}
