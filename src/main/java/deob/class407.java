package deob;

import java.util.Locale;

@class409
@class348
@ObfuscatedName("pn")
public class class407 implements class405 {

    @ObfuscatedName("pn.ap")
    public static final class407 field4696 = new class407("EN", "en", "English", class408.field4722, 0, "GB");

    @ObfuscatedName("pn.aw")
    public static final class407 field4699 = new class407("DE", "de", "German", class408.field4722, 1, "DE");

    @ObfuscatedName("pn.ak")
    public static final class407 field4693 = new class407("FR", "fr", "French", class408.field4722, 2, "FR");

    @ObfuscatedName("pn.aj")
    public static final class407 field4694 = new class407("PT", "pt", "Portuguese", class408.field4722, 3, "BR");

    @ObfuscatedName("pn.ai")
    public static final class407 field4700 = new class407("NL", "nl", "Dutch", class408.field4708, 4, "NL");

    @ObfuscatedName("pn.ay")
    public static final class407 field4692 = new class407("ES", "es", "Spanish", class408.field4708, 5, "ES");

    @ObfuscatedName("pn.as")
    public static final class407 field4703 = new class407("ES_MX", "es-mx", "Spanish (Latin American)", class408.field4722, 6, "MX");

    @ObfuscatedName("pn.ae")
    public final String field4691;

    @ObfuscatedName("pn.am")
    public final String field4695;

    @ObfuscatedName("pn.at")
    public final int field4697;

    @ObfuscatedName("pn.au")
    public static final class407[] field4701;

    static {
        class407[] var0 = Statics.method7226();
        field4701 = new class407[var0.length];
        class407[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class407 var3 = var1[var2];
            if (field4701[var3.field4697] != null) {
                throw new IllegalStateException();
            }
            field4701[var3.field4697] = var3;
        }
    }

    public class407(String arg0, String arg1, String arg2, class408 arg3, int arg4, String arg5) {
        this.field4691 = arg0;
        this.field4695 = arg1;
        this.field4697 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("pn.ak(I)Ljava/lang/String;")
    public String method7219() {
        return this.field4695;
    }

    @ObfuscatedName("pn.aw(I)I")
    public int method37() {
        return this.field4697;
    }

    @ObfuscatedName("pn.aj(IB)Lpn;")
    public static class407 method7217(int arg0) {
        return arg0 >= 0 && arg0 < field4701.length ? field4701[arg0] : null;
    }

    public String toString() {
        return this.method7219().toLowerCase(Locale.ENGLISH);
    }
}
