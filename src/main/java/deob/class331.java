package deob;

import java.util.Locale;

@class333
@class281
@ObfuscatedName("lv")
public class class331 implements class329 {

    @ObfuscatedName("lv.s")
    public static final class331 field4099 = new class331("EN", "en", "English", class332.field4122, 0, "GB");

    @ObfuscatedName("lv.h")
    public static final class331 field4095 = new class331("DE", "de", "German", class332.field4122, 1, "DE");

    @ObfuscatedName("lv.w")
    public static final class331 field4096 = new class331("FR", "fr", "French", class332.field4122, 2, "FR");

    @ObfuscatedName("lv.v")
    public static final class331 field4094 = new class331("PT", "pt", "Portuguese", class332.field4122, 3, "BR");

    @ObfuscatedName("lv.c")
    public static final class331 field4098 = new class331("NL", "nl", "Dutch", class332.field4111, 4, "NL");

    @ObfuscatedName("lv.q")
    public static final class331 field4097 = new class331("ES", "es", "Spanish", class332.field4111, 5, "ES");

    @ObfuscatedName("lv.i")
    public static final class331 field4105 = new class331("ES_MX", "es-mx", "Spanish (Latin American)", class332.field4122, 6, "MX");

    @ObfuscatedName("lv.k")
    public final String field4101;

    @ObfuscatedName("lv.o")
    public final String field4100;

    @ObfuscatedName("lv.n")
    public final int field4103;

    @ObfuscatedName("lv.d")
    public static final class331[] field4104;

    static {
        class331[] var0 = new class331[] { field4096, field4094, field4095, field4098, field4099, field4105, field4097 };
        field4104 = new class331[var0.length];
        class331[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class331 var4 = var2[var3];
            if (field4104[var4.field4103] != null) {
                throw new IllegalStateException();
            }
            field4104[var4.field4103] = var4;
        }
    }

    public class331(String arg0, String arg1, String arg2, class332 arg3, int arg4, String arg5) {
        this.field4101 = arg0;
        this.field4100 = arg1;
        this.field4103 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("lv.s(I)Ljava/lang/String;")
    public String method5401() {
        return this.field4100;
    }

    @ObfuscatedName("lv.h(B)I")
    public int method39() {
        return this.field4103;
    }

    public String toString() {
        return this.method5401().toLowerCase(Locale.ENGLISH);
    }
}
