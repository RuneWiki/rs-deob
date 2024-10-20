package deob;

import java.util.Locale;

@class333
@class281
@ObfuscatedName("lq")
public class class331 implements class329 {

    @ObfuscatedName("lq.o")
    public static final class331 field4120 = new class331("EN", "en", "English", class332.field4126, 0, "GB");

    @ObfuscatedName("lq.q")
    public static final class331 field4118 = new class331("DE", "de", "German", class332.field4126, 1, "DE");

    @ObfuscatedName("lq.l")
    public static final class331 field4116 = new class331("FR", "fr", "French", class332.field4126, 2, "FR");

    @ObfuscatedName("lq.k")
    public static final class331 field4117 = new class331("PT", "pt", "Portuguese", class332.field4126, 3, "BR");

    @ObfuscatedName("lq.a")
    public static final class331 field4114 = new class331("NL", "nl", "Dutch", class332.field4131, 4, "NL");

    @ObfuscatedName("lq.m")
    public static final class331 field4119 = new class331("ES", "es", "Spanish", class332.field4131, 5, "ES");

    @ObfuscatedName("lq.p")
    public static final class331 field4125 = new class331("ES_MX", "es-mx", "Spanish (Latin American)", class332.field4126, 6, "MX");

    @ObfuscatedName("lq.s")
    public final String field4121;

    @ObfuscatedName("lq.r")
    public final String field4115;

    @ObfuscatedName("lq.v")
    public final int field4123;

    @ObfuscatedName("lq.y")
    public static final class331[] field4124;

    static {
        class331[] var0 = new class331[] { field4116, field4114, field4118, field4119, field4125, field4120, field4117 };
        field4124 = new class331[var0.length];
        class331[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class331 var4 = var2[var3];
            if (field4124[var4.field4123] != null) {
                throw new IllegalStateException();
            }
            field4124[var4.field4123] = var4;
        }
    }

    public class331(String arg0, String arg1, String arg2, class332 arg3, int arg4, String arg5) {
        this.field4121 = arg0;
        this.field4115 = arg1;
        this.field4123 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("lq.k(B)Ljava/lang/String;")
    public String method5391() {
        return this.field4115;
    }

    @ObfuscatedName("lq.o(B)I")
    public int method40() {
        return this.field4123;
    }

    public String toString() {
        return this.method5391().toLowerCase(Locale.ENGLISH);
    }
}
