package deob;

import java.util.Locale;

@ObfuscatedName("kn")
public class class305 implements class303 {

    @ObfuscatedName("kn.l")
    public static final class305 field3789 = new class305("EN", "en", "English", class306.field3820, 0, "GB");

    @ObfuscatedName("kn.q")
    public static final class305 field3792 = new class305("DE", "de", "German", class306.field3820, 1, "DE");

    @ObfuscatedName("kn.f")
    public static final class305 field3802 = new class305("FR", "fr", "French", class306.field3820, 2, "FR");

    @ObfuscatedName("kn.j")
    public static final class305 field3791 = new class305("PT", "pt", "Portuguese", class306.field3820, 3, "BR");

    @ObfuscatedName("kn.m")
    public static final class305 field3793 = new class305("NL", "nl", "Dutch", class306.field3807, 4, "NL");

    @ObfuscatedName("kn.k")
    public static final class305 field3795 = new class305("ES", "es", "Spanish", class306.field3807, 5, "ES");

    @ObfuscatedName("kn.t")
    public static final class305 field3794 = new class305("ES_MX", "es-mx", "Spanish (Latin American)", class306.field3820, 6, "MX");

    @ObfuscatedName("kn.a")
    public final String field3796;

    @ObfuscatedName("kn.e")
    public final String field3790;

    @ObfuscatedName("kn.i")
    public final int field3797;

    @ObfuscatedName("kn.y")
    public static final class305[] field3798;

    static {
        class305[] var0 = Statics.method4998();
        field3798 = new class305[var0.length];
        class305[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class305 var3 = var1[var2];
            if (field3798[var3.field3797] != null) {
                throw new IllegalStateException();
            }
            field3798[var3.field3797] = var3;
        }
    }

    public class305(String arg0, String arg1, String arg2, class306 arg3, int arg4, String arg5) {
        this.field3796 = arg0;
        this.field3790 = arg1;
        this.field3797 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("kn.k(I)Ljava/lang/String;")
    public String method4988() {
        return this.field3790;
    }

    @ObfuscatedName("kn.l(I)I")
    public int method36() {
        return this.field3797;
    }

    public String toString() {
        return this.method4988().toLowerCase(Locale.ENGLISH);
    }
}
