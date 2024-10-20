package deob;

import java.util.Locale;

@class408
@class349
@ObfuscatedName("px")
public class class406 implements class404 {

    @ObfuscatedName("px.ac")
    public static final class406 field4647 = new class406("EN", "en", "English", class407.field4662, 0, "GB");

    @ObfuscatedName("px.ae")
    public static final class406 field4645 = new class406("DE", "de", "German", class407.field4662, 1, "DE");

    @ObfuscatedName("px.ag")
    public static final class406 field4646 = new class406("FR", "fr", "French", class407.field4662, 2, "FR");

    @ObfuscatedName("px.am")
    public static final class406 field4650 = new class406("PT", "pt", "Portuguese", class407.field4662, 3, "BR");

    @ObfuscatedName("px.ax")
    public static final class406 field4648 = new class406("NL", "nl", "Dutch", class407.field4659, 4, "NL");

    @ObfuscatedName("px.aq")
    public static final class406 field4649 = new class406("ES", "es", "Spanish", class407.field4659, 5, "ES");

    @ObfuscatedName("px.af")
    public static final class406 field4644 = new class406("ES_MX", "es-mx", "Spanish (Latin American)", class407.field4662, 6, "MX");

    @ObfuscatedName("px.at")
    public final String field4656;

    @ObfuscatedName("px.au")
    public final String field4653;

    @ObfuscatedName("px.ar")
    public final int field4652;

    @ObfuscatedName("px.al")
    public static final class406[] field4654;

    static {
        class406[] var0 = method6999();
        field4654 = new class406[var0.length];
        class406[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class406 var3 = var1[var2];
            if (field4654[var3.field4652] != null) {
                throw new IllegalStateException();
            }
            field4654[var3.field4652] = var3;
        }
    }

    @ObfuscatedName("px.ax(I)[Lpx;")
    public static class406[] method6999() {
        return new class406[] { field4644, field4647, field4646, field4649, field4650, field4648, field4645 };
    }

    public class406(String arg0, String arg1, String arg2, class407 arg3, int arg4, String arg5) {
        this.field4656 = arg0;
        this.field4653 = arg1;
        this.field4652 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("px.aq(I)Ljava/lang/String;")
    public String method6995() {
        return this.field4653;
    }

    @ObfuscatedName("px.ac(I)I")
    public int method32() {
        return this.field4652;
    }

    @ObfuscatedName("px.af(II)Lpx;")
    public static class406 method6996(int arg0) {
        return arg0 >= 0 && arg0 < field4654.length ? field4654[arg0] : null;
    }

    public String toString() {
        return this.method6995().toLowerCase(Locale.ENGLISH);
    }
}
