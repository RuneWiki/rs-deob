package deob;

import java.util.Locale;

@class395
@class336
@ObfuscatedName("pe")
public class class393 implements class391 {

    @ObfuscatedName("pe.aq")
    public static final class393 field4493 = new class393("EN", "en", "English", class394.field4506, 0, "GB");

    @ObfuscatedName("pe.aw")
    public static final class393 field4492 = new class393("DE", "de", "German", class394.field4506, 1, "DE");

    @ObfuscatedName("pe.al")
    public static final class393 field4488 = new class393("FR", "fr", "French", class394.field4506, 2, "FR");

    @ObfuscatedName("pe.ai")
    public static final class393 field4489 = new class393("PT", "pt", "Portuguese", class394.field4506, 3, "BR");

    @ObfuscatedName("pe.ar")
    public static final class393 field4490 = new class393("NL", "nl", "Dutch", class394.field4499, 4, "NL");

    @ObfuscatedName("pe.as")
    public static final class393 field4498 = new class393("ES", "es", "Spanish", class394.field4499, 5, "ES");

    @ObfuscatedName("pe.aa")
    public static final class393 field4486 = new class393("ES_MX", "es-mx", "Spanish (Latin American)", class394.field4506, 6, "MX");

    @ObfuscatedName("pe.az")
    public final String field4491;

    @ObfuscatedName("pe.ao")
    public final String field4494;

    @ObfuscatedName("pe.au")
    public final int field4495;

    @ObfuscatedName("pe.ak")
    public static final class393[] field4496;

    static {
        class393[] var0 = new class393[] { field4486, field4498, field4489, field4488, field4493, field4490, field4492 };
        field4496 = new class393[var0.length];
        class393[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class393 var4 = var2[var3];
            if (field4496[var4.field4495] != null) {
                throw new IllegalStateException();
            }
            field4496[var4.field4495] = var4;
        }
    }

    public class393(String arg0, String arg1, String arg2, class394 arg3, int arg4, String arg5) {
        this.field4491 = arg0;
        this.field4494 = arg1;
        this.field4495 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("pe.ar(I)Ljava/lang/String;")
    public String method6651() {
        return this.field4494;
    }

    @ObfuscatedName("pe.aq(I)I")
    public int method35() {
        return this.field4495;
    }

    public String toString() {
        return this.method6651().toLowerCase(Locale.ENGLISH);
    }
}
