package deob;

import java.util.Locale;

@ObfuscatedName("ka")
public class class305 implements class303 {

    @ObfuscatedName("ka.n")
    public static final class305 field3797 = new class305("EN", "en", "English", class306.field3812, 0, "GB");

    @ObfuscatedName("ka.c")
    public static final class305 field3795 = new class305("DE", "de", "German", class306.field3812, 1, "DE");

    @ObfuscatedName("ka.m")
    public static final class305 field3790 = new class305("FR", "fr", "French", class306.field3812, 2, "FR");

    @ObfuscatedName("ka.k")
    public static final class305 field3791 = new class305("PT", "pt", "Portuguese", class306.field3812, 3, "BR");

    @ObfuscatedName("ka.o")
    public static final class305 field3789 = new class305("NL", "nl", "Dutch", class306.field3810, 4, "NL");

    @ObfuscatedName("ka.g")
    public static final class305 field3793 = new class305("ES", "es", "Spanish", class306.field3810, 5, "ES");

    @ObfuscatedName("ka.z")
    public static final class305 field3788 = new class305("ES_MX", "es-mx", "Spanish (Latin American)", class306.field3812, 6, "MX");

    @ObfuscatedName("ka.a")
    public final String field3794;

    @ObfuscatedName("ka.u")
    public final String field3796;

    @ObfuscatedName("ka.e")
    public final int field3792;

    @ObfuscatedName("ka.l")
    public static final class305[] field3798;

    static {
        class305[] var0 = new class305[] { field3789, field3790, field3788, field3797, field3793, field3795, field3791 };
        field3798 = new class305[var0.length];
        class305[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class305 var4 = var2[var3];
            if (field3798[var4.field3792] != null) {
                throw new IllegalStateException();
            }
            field3798[var4.field3792] = var4;
        }
    }

    public class305(String arg0, String arg1, String arg2, class306 arg3, int arg4, String arg5) {
        this.field3794 = arg0;
        this.field3796 = arg1;
        this.field3792 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("ka.n(B)Ljava/lang/String;")
    public String method4933() {
        return this.field3796;
    }

    @ObfuscatedName("ka.c(I)I")
    public int method42() {
        return this.field3792;
    }

    public String toString() {
        return this.method4933().toLowerCase(Locale.ENGLISH);
    }
}
