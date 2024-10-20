package deob;

import java.util.Locale;

@ObfuscatedName("lo")
public class class331 implements class329 {

    @ObfuscatedName("lo.v")
    public static final class331 field4055 = new class331("EN", "en", "English", class332.field4070, 0, "GB");

    @ObfuscatedName("lo.c")
    public static final class331 field4049 = new class331("DE", "de", "German", class332.field4070, 1, "DE");

    @ObfuscatedName("lo.i")
    public static final class331 field4050 = new class331("FR", "fr", "French", class332.field4070, 2, "FR");

    @ObfuscatedName("lo.f")
    public static final class331 field4051 = new class331("PT", "pt", "Portuguese", class332.field4070, 3, "BR");

    @ObfuscatedName("lo.b")
    public static final class331 field4058 = new class331("NL", "nl", "Dutch", class332.field4066, 4, "NL");

    @ObfuscatedName("lo.n")
    public static final class331 field4053 = new class331("ES", "es", "Spanish", class332.field4066, 5, "ES");

    @ObfuscatedName("lo.s")
    public static final class331 field4054 = new class331("ES_MX", "es-mx", "Spanish (Latin American)", class332.field4070, 6, "MX");

    @ObfuscatedName("lo.l")
    public final String field4048;

    @ObfuscatedName("lo.q")
    public final String field4056;

    @ObfuscatedName("lo.o")
    public final int field4057;

    @ObfuscatedName("lo.r")
    public static final class331[] field4060;

    static {
        class331[] var0 = new class331[] { field4054, field4050, field4053, field4058, field4055, field4051, field4049 };
        field4060 = new class331[var0.length];
        class331[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class331 var4 = var2[var3];
            if (field4060[var4.field4057] != null) {
                throw new IllegalStateException();
            }
            field4060[var4.field4057] = var4;
        }
    }

    public class331(String arg0, String arg1, String arg2, class332 arg3, int arg4, String arg5) {
        this.field4048 = arg0;
        this.field4056 = arg1;
        this.field4057 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("lo.f(I)Ljava/lang/String;")
    public String method5495() {
        return this.field4056;
    }

    @ObfuscatedName("lo.v(B)I")
    public int method38() {
        return this.field4057;
    }

    @ObfuscatedName("lo.b(IB)Llo;")
    public static class331 method5496(int arg0) {
        return arg0 >= 0 && arg0 < field4060.length ? field4060[arg0] : null;
    }

    public String toString() {
        return this.method5495().toLowerCase(Locale.ENGLISH);
    }
}
