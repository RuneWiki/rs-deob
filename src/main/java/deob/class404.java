package deob;

import java.util.Locale;

@class406
@class347
@ObfuscatedName("pg")
public class class404 implements class402 {

    @ObfuscatedName("pg.ab")
    public static final class404 field4594 = new class404("EN", "en", "English", class405.field4608, 0, "GB");

    @ObfuscatedName("pg.ay")
    public static final class404 field4600 = new class404("DE", "de", "German", class405.field4608, 1, "DE");

    @ObfuscatedName("pg.an")
    public static final class404 field4595 = new class404("FR", "fr", "French", class405.field4608, 2, "FR");

    @ObfuscatedName("pg.au")
    public static final class404 field4596 = new class404("PT", "pt", "Portuguese", class405.field4608, 3, "BR");

    @ObfuscatedName("pg.ax")
    public static final class404 field4597 = new class404("NL", "nl", "Dutch", class405.field4610, 4, "NL");

    @ObfuscatedName("pg.ao")
    public static final class404 field4598 = new class404("ES", "es", "Spanish", class405.field4610, 5, "ES");

    @ObfuscatedName("pg.am")
    public static final class404 field4599 = new class404("ES_MX", "es-mx", "Spanish (Latin American)", class405.field4608, 6, "MX");

    @ObfuscatedName("pg.ac")
    public final String field4605;

    @ObfuscatedName("pg.ae")
    public final String field4601;

    @ObfuscatedName("pg.ad")
    public final int field4593;

    @ObfuscatedName("pg.aq")
    public static final class404[] field4602;

    static {
        class404[] var0 = new class404[] { field4596, field4600, field4598, field4597, field4599, field4594, field4595 };
        field4602 = new class404[var0.length];
        class404[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class404 var4 = var2[var3];
            if (field4602[var4.field4593] != null) {
                throw new IllegalStateException();
            }
            field4602[var4.field4593] = var4;
        }
    }

    public class404(String arg0, String arg1, String arg2, class405 arg3, int arg4, String arg5) {
        this.field4605 = arg0;
        this.field4601 = arg1;
        this.field4593 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("pg.au(I)Ljava/lang/String;")
    public String method6868() {
        return this.field4601;
    }

    @ObfuscatedName("pg.ab(B)I")
    public int method33() {
        return this.field4593;
    }

    @ObfuscatedName("pg.ax(II)Lpg;")
    public static class404 method6870(int arg0) {
        return arg0 >= 0 && arg0 < field4602.length ? field4602[arg0] : null;
    }

    public String toString() {
        return this.method6868().toLowerCase(Locale.ENGLISH);
    }
}
