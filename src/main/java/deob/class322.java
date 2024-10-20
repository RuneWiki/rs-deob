package deob;

import java.util.Locale;

@class324
@class273
@ObfuscatedName("lu")
public class class322 implements class320 {

    @ObfuscatedName("lu.c")
    public static final class322 field3989 = new class322("EN", "en", "English", class323.field3996, 0, "GB");

    @ObfuscatedName("lu.l")
    public static final class322 field3979 = new class322("DE", "de", "German", class323.field3996, 1, "DE");

    @ObfuscatedName("lu.s")
    public static final class322 field3990 = new class322("FR", "fr", "French", class323.field3996, 2, "FR");

    @ObfuscatedName("lu.e")
    public static final class322 field3982 = new class322("PT", "pt", "Portuguese", class323.field3996, 3, "BR");

    @ObfuscatedName("lu.r")
    public static final class322 field3981 = new class322("NL", "nl", "Dutch", class323.field3995, 4, "NL");

    @ObfuscatedName("lu.o")
    public static final class322 field3984 = new class322("ES", "es", "Spanish", class323.field3995, 5, "ES");

    @ObfuscatedName("lu.i")
    public static final class322 field3985 = new class322("ES_MX", "es-mx", "Spanish (Latin American)", class323.field3996, 6, "MX");

    @ObfuscatedName("lu.w")
    public final String field3986;

    @ObfuscatedName("lu.v")
    public final String field3987;

    @ObfuscatedName("lu.a")
    public final int field3988;

    @ObfuscatedName("lu.y")
    public static final class322[] field3980;

    static {
        class322[] var0 = method5244();
        field3980 = new class322[var0.length];
        class322[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class322 var3 = var1[var2];
            if (field3980[var3.field3988] != null) {
                throw new IllegalStateException();
            }
            field3980[var3.field3988] = var3;
        }
    }

    @ObfuscatedName("lu.e(I)[Llu;")
    public static class322[] method5244() {
        return new class322[] { field3985, field3989, field3990, field3979, field3981, field3984, field3982 };
    }

    public class322(String arg0, String arg1, String arg2, class323 arg3, int arg4, String arg5) {
        this.field3986 = arg0;
        this.field3987 = arg1;
        this.field3988 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("lu.r(I)Ljava/lang/String;")
    public String method5235() {
        return this.field3987;
    }

    @ObfuscatedName("lu.c(I)I")
    public int method38() {
        return this.field3988;
    }

    public String toString() {
        return this.method5235().toLowerCase(Locale.ENGLISH);
    }
}
