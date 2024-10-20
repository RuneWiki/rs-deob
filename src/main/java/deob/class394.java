package deob;

import java.util.Locale;

@class396
@class336
@ObfuscatedName("pv")
public class class394 implements class392 {

    @ObfuscatedName("pv.az")
    public static final class394 field4520 = new class394("EN", "en", "English", class395.field4532, 0, "GB");

    @ObfuscatedName("pv.ah")
    public static final class394 field4511 = new class394("DE", "de", "German", class395.field4532, 1, "DE");

    @ObfuscatedName("pv.af")
    public static final class394 field4512 = new class394("FR", "fr", "French", class395.field4532, 2, "FR");

    @ObfuscatedName("pv.at")
    public static final class394 field4513 = new class394("PT", "pt", "Portuguese", class395.field4532, 3, "BR");

    @ObfuscatedName("pv.an")
    public static final class394 field4514 = new class394("NL", "nl", "Dutch", class395.field4523, 4, "NL");

    @ObfuscatedName("pv.ao")
    public static final class394 field4515 = new class394("ES", "es", "Spanish", class395.field4523, 5, "ES");

    @ObfuscatedName("pv.ab")
    public static final class394 field4519 = new class394("ES_MX", "es-mx", "Spanish (Latin American)", class395.field4532, 6, "MX");

    @ObfuscatedName("pv.aw")
    public final String field4517;

    @ObfuscatedName("pv.ad")
    public final String field4510;

    @ObfuscatedName("pv.al")
    public final int field4516;

    @ObfuscatedName("pv.as")
    public static final class394[] field4518;

    static {
        class394[] var0 = new class394[] { field4511, field4519, field4512, field4520, field4513, field4515, field4514 };
        field4518 = new class394[var0.length];
        class394[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class394 var4 = var2[var3];
            if (field4518[var4.field4516] != null) {
                throw new IllegalStateException();
            }
            field4518[var4.field4516] = var4;
        }
    }

    public class394(String arg0, String arg1, String arg2, class395 arg3, int arg4, String arg5) {
        this.field4517 = arg0;
        this.field4510 = arg1;
        this.field4516 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("pv.at(I)Ljava/lang/String;")
    public String method6549() {
        return this.field4510;
    }

    @ObfuscatedName("pv.az(I)I")
    public int method38() {
        return this.field4516;
    }

    public String toString() {
        return this.method6549().toLowerCase(Locale.ENGLISH);
    }
}
