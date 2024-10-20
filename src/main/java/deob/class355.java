package deob;

import java.util.Locale;

@class357
@class301
@ObfuscatedName("nq")
public class class355 implements class353 {

    @ObfuscatedName("nq.aj")
    public static final class355 field4294 = new class355("EN", "en", "English", class356.field4307, 0, "GB");

    @ObfuscatedName("nq.al")
    public static final class355 field4288 = new class355("DE", "de", "German", class356.field4307, 1, "DE");

    @ObfuscatedName("nq.ac")
    public static final class355 field4300 = new class355("FR", "fr", "French", class356.field4307, 2, "FR");

    @ObfuscatedName("nq.ab")
    public static final class355 field4290 = new class355("PT", "pt", "Portuguese", class356.field4307, 3, "BR");

    @ObfuscatedName("nq.an")
    public static final class355 field4291 = new class355("NL", "nl", "Dutch", class356.field4314, 4, "NL");

    @ObfuscatedName("nq.ao")
    public static final class355 field4292 = new class355("ES", "es", "Spanish", class356.field4314, 5, "ES");

    @ObfuscatedName("nq.av")
    public static final class355 field4293 = new class355("ES_MX", "es-mx", "Spanish (Latin American)", class356.field4307, 6, "MX");

    @ObfuscatedName("nq.aq")
    public final String field4287;

    @ObfuscatedName("nq.ap")
    public final String field4298;

    @ObfuscatedName("nq.ar")
    public final int field4296;

    @ObfuscatedName("nq.ak")
    public static final class355[] field4289;

    static {
        class355[] var0 = method6066();
        field4289 = new class355[var0.length];
        class355[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class355 var3 = var1[var2];
            if (field4289[var3.field4296] != null) {
                throw new IllegalStateException();
            }
            field4289[var3.field4296] = var3;
        }
    }

    @ObfuscatedName("nq.ab(I)[Lnq;")
    public static class355[] method6066() {
        return new class355[] { field4294, field4293, field4290, field4291, field4288, field4292, field4300 };
    }

    public class355(String arg0, String arg1, String arg2, class356 arg3, int arg4, String arg5) {
        this.field4287 = arg0;
        this.field4298 = arg1;
        this.field4296 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("nq.an(I)Ljava/lang/String;")
    public String method6061() {
        return this.field4298;
    }

    @ObfuscatedName("nq.aj(I)I")
    public int method33() {
        return this.field4296;
    }

    public String toString() {
        return this.method6061().toLowerCase(Locale.ENGLISH);
    }
}
