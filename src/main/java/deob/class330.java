package deob;

import java.util.Locale;

@class332
@class280
@ObfuscatedName("lb")
public class class330 implements class328 {

    @ObfuscatedName("lb.c")
    public static final class330 field4093 = new class330("EN", "en", "English", class331.field4107, 0, "GB");

    @ObfuscatedName("lb.v")
    public static final class330 field4087 = new class330("DE", "de", "German", class331.field4107, 1, "DE");

    @ObfuscatedName("lb.q")
    public static final class330 field4102 = new class330("FR", "fr", "French", class331.field4107, 2, "FR");

    @ObfuscatedName("lb.f")
    public static final class330 field4089 = new class330("PT", "pt", "Portuguese", class331.field4107, 3, "BR");

    @ObfuscatedName("lb.j")
    public static final class330 field4090 = new class330("NL", "nl", "Dutch", class331.field4106, 4, "NL");

    @ObfuscatedName("lb.e")
    public static final class330 field4091 = new class330("ES", "es", "Spanish", class331.field4106, 5, "ES");

    @ObfuscatedName("lb.g")
    public static final class330 field4092 = new class330("ES_MX", "es-mx", "Spanish (Latin American)", class331.field4107, 6, "MX");

    @ObfuscatedName("lb.w")
    public final String field4100;

    @ObfuscatedName("lb.y")
    public final String field4094;

    @ObfuscatedName("lb.i")
    public final int field4095;

    @ObfuscatedName("lb.s")
    public static final class330[] field4096;

    static {
        class330[] var0 = method5506();
        field4096 = new class330[var0.length];
        class330[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class330 var3 = var1[var2];
            if (field4096[var3.field4095] != null) {
                throw new IllegalStateException();
            }
            field4096[var3.field4095] = var3;
        }
    }

    @ObfuscatedName("lb.f(B)[Llb;")
    public static class330[] method5506() {
        return new class330[] { field4090, field4091, field4092, field4087, field4102, field4093, field4089 };
    }

    public class330(String arg0, String arg1, String arg2, class331 arg3, int arg4, String arg5) {
        this.field4100 = arg0;
        this.field4094 = arg1;
        this.field4095 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("lb.j(I)Ljava/lang/String;")
    public String method5497() {
        return this.field4094;
    }

    @ObfuscatedName("lb.c(B)I")
    public int method33() {
        return this.field4095;
    }

    public String toString() {
        return this.method5497().toLowerCase(Locale.ENGLISH);
    }
}
