package deob;

import java.util.Locale;

@class319
@class268
@ObfuscatedName("lf")
public class class317 implements class315 {

    @ObfuscatedName("lf.c")
    public static final class317 field3933 = new class317("EN", "en", "English", class318.field3949, 0, "GB");

    @ObfuscatedName("lf.b")
    public static final class317 field3923 = new class317("DE", "de", "German", class318.field3949, 1, "DE");

    @ObfuscatedName("lf.p")
    public static final class317 field3924 = new class317("FR", "fr", "French", class318.field3949, 2, "FR");

    @ObfuscatedName("lf.m")
    public static final class317 field3925 = new class317("PT", "pt", "Portuguese", class318.field3949, 3, "BR");

    @ObfuscatedName("lf.t")
    public static final class317 field3931 = new class317("NL", "nl", "Dutch", class318.field3940, 4, "NL");

    @ObfuscatedName("lf.s")
    public static final class317 field3926 = new class317("ES", "es", "Spanish", class318.field3940, 5, "ES");

    @ObfuscatedName("lf.j")
    public static final class317 field3922 = new class317("ES_MX", "es-mx", "Spanish (Latin American)", class318.field3949, 6, "MX");

    @ObfuscatedName("lf.w")
    public final String field3929;

    @ObfuscatedName("lf.n")
    public final String field3930;

    @ObfuscatedName("lf.r")
    public final int field3932;

    @ObfuscatedName("lf.o")
    public static final class317[] field3928;

    static {
        class317[] var0 = new class317[] { field3922, field3933, field3931, field3925, field3926, field3923, field3924 };
        field3928 = new class317[var0.length];
        class317[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class317 var4 = var2[var3];
            if (field3928[var4.field3932] != null) {
                throw new IllegalStateException();
            }
            field3928[var4.field3932] = var4;
        }
    }

    public class317(String arg0, String arg1, String arg2, class318 arg3, int arg4, String arg5) {
        this.field3929 = arg0;
        this.field3930 = arg1;
        this.field3932 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("lf.c(I)Ljava/lang/String;")
    public String method5276() {
        return this.field3930;
    }

    @ObfuscatedName("lf.b(B)I")
    public int method46() {
        return this.field3932;
    }

    @ObfuscatedName("lf.p(IB)Llf;")
    public static class317 method5273(int arg0) {
        return arg0 >= 0 && arg0 < field3928.length ? field3928[arg0] : null;
    }

    public String toString() {
        return this.method5276().toLowerCase(Locale.ENGLISH);
    }
}
