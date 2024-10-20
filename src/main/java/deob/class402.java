package deob;

import java.util.Locale;

@class404
@class344
@ObfuscatedName("pl")
public class class402 implements class400 {

    @ObfuscatedName("pl.ak")
    public static final class402 field4605 = new class402("EN", "en", "English", class403.field4609, 0, "GB");

    @ObfuscatedName("pl.al")
    public static final class402 field4597 = new class402("DE", "de", "German", class403.field4609, 1, "DE");

    @ObfuscatedName("pl.aj")
    public static final class402 field4599 = new class402("FR", "fr", "French", class403.field4609, 2, "FR");

    @ObfuscatedName("pl.az")
    public static final class402 field4600 = new class402("PT", "pt", "Portuguese", class403.field4609, 3, "BR");

    @ObfuscatedName("pl.af")
    public static final class402 field4601 = new class402("NL", "nl", "Dutch", class403.field4612, 4, "NL");

    @ObfuscatedName("pl.aa")
    public static final class402 field4598 = new class402("ES", "es", "Spanish", class403.field4612, 5, "ES");

    @ObfuscatedName("pl.at")
    public static final class402 field4602 = new class402("ES_MX", "es-mx", "Spanish (Latin American)", class403.field4609, 6, "MX");

    @ObfuscatedName("pl.ab")
    public final String field4603;

    @ObfuscatedName("pl.ac")
    public final String field4604;

    @ObfuscatedName("pl.ao")
    public final int field4607;

    @ObfuscatedName("pl.ah")
    public static final class402[] field4606;

    static {
        class402[] var0 = method6806();
        field4606 = new class402[var0.length];
        class402[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class402 var3 = var1[var2];
            if (field4606[var3.field4607] != null) {
                throw new IllegalStateException();
            }
            field4606[var3.field4607] = var3;
        }
    }

    @ObfuscatedName("pl.az(B)[Lpl;")
    public static class402[] method6806() {
        return new class402[] { field4597, field4602, field4600, field4605, field4601, field4598, field4599 };
    }

    public class402(String arg0, String arg1, String arg2, class403 arg3, int arg4, String arg5) {
        this.field4603 = arg0;
        this.field4604 = arg1;
        this.field4607 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("pl.af(I)Ljava/lang/String;")
    public String method6799() {
        return this.field4604;
    }

    @ObfuscatedName("pl.ak(I)I")
    public int method34() {
        return this.field4607;
    }

    public String toString() {
        return this.method6799().toLowerCase(Locale.ENGLISH);
    }
}
