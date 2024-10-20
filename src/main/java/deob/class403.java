package deob;

import java.util.Locale;

@class405
@class345
@ObfuscatedName("pe")
public class class403 implements class401 {

    @ObfuscatedName("pe.aq")
    public static final class403 field4627 = new class403("EN", "en", "English", class404.field4634, 0, "GB");

    @ObfuscatedName("pe.ad")
    public static final class403 field4621 = new class403("DE", "de", "German", class404.field4634, 1, "DE");

    @ObfuscatedName("pe.ag")
    public static final class403 field4632 = new class403("FR", "fr", "French", class404.field4634, 2, "FR");

    @ObfuscatedName("pe.ak")
    public static final class403 field4623 = new class403("PT", "pt", "Portuguese", class404.field4634, 3, "BR");

    @ObfuscatedName("pe.ap")
    public static final class403 field4624 = new class403("NL", "nl", "Dutch", class404.field4636, 4, "NL");

    @ObfuscatedName("pe.an")
    public static final class403 field4620 = new class403("ES", "es", "Spanish", class404.field4636, 5, "ES");

    @ObfuscatedName("pe.aj")
    public static final class403 field4622 = new class403("ES_MX", "es-mx", "Spanish (Latin American)", class404.field4634, 6, "MX");

    @ObfuscatedName("pe.av")
    public final String field4626;

    @ObfuscatedName("pe.ab")
    public final String field4625;

    @ObfuscatedName("pe.ai")
    public final int field4629;

    @ObfuscatedName("pe.ae")
    public static final class403[] field4630;

    static {
        class403[] var0 = method6772();
        field4630 = new class403[var0.length];
        class403[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class403 var3 = var1[var2];
            if (field4630[var3.field4629] != null) {
                throw new IllegalStateException();
            }
            field4630[var3.field4629] = var3;
        }
    }

    @ObfuscatedName("pe.ag(I)[Lpe;")
    public static class403[] method6772() {
        return new class403[] { field4632, field4620, field4621, field4623, field4624, field4622, field4627 };
    }

    public class403(String arg0, String arg1, String arg2, class404 arg3, int arg4, String arg5) {
        this.field4626 = arg0;
        this.field4625 = arg1;
        this.field4629 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("pe.ak(I)Ljava/lang/String;")
    public String method6761() {
        return this.field4625;
    }

    @ObfuscatedName("pe.aq(I)I")
    public int method32() {
        return this.field4629;
    }

    @ObfuscatedName("pe.ap(II)Lpe;")
    public static class403 method6762(int arg0) {
        return arg0 >= 0 && arg0 < field4630.length ? field4630[arg0] : null;
    }

    public String toString() {
        return this.method6761().toLowerCase(Locale.ENGLISH);
    }
}
